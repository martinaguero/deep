package org.trimatek.deep.gui;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.Set;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import org.apache.commons.collections4.MultiMap;
import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.primefaces.model.UploadedFile;
import org.trimatek.deep.model.ClassProfile;
import org.trimatek.deep.model.TargetProfile;
import org.trimatek.deep.model.TreeNode;
import org.trimatek.deep.service.CalculatorService;
import org.trimatek.deep.service.DeepService;
import org.trimatek.deep.service.TargetService;
import org.trimatek.deep.utils.Constants;
import org.trimatek.deep.utils.FileUtils;
import org.trimatek.deep.utils.TreeUtils;
import org.trimatek.deep.utils.Utils;

@ManagedBean
public class DeepView {
	private UploadedFile fileSource;
	public File source;
	private UploadedFile fileTarget;
	public File target;
	private String output;
	
	public String getOutput() {
		return output;
	}

	public void setOutput(String output) {
		this.output = output;
	}

	public UploadedFile getFileSource() {
		return fileSource;
	}

	public void setFileSource(UploadedFile file) {
		this.fileSource = file;
	}

	public UploadedFile getFileTarget() {
		return fileTarget;
	}

	public void setFileTarget(UploadedFile fileTarget) {
		this.fileTarget = fileTarget;
	}

	public File getSource() {
		return source;
	}

	public void setSource(File source) {
		this.source = source;
	}

	public File getTarget() {
		return target;
	}

	public void setTarget(File target) {
		this.target = target;
	}

	public void uploadSource() throws NoSuchFieldException, SecurityException,
			IllegalArgumentException, IllegalAccessException, IOException {
		Field[] f = this.getClass().getFields();
		checkUpload(getFileSource(), this.getClass().getField("source"));
	}

	public void uploadTarget() throws IllegalArgumentException,
			IllegalAccessException, NoSuchFieldException, SecurityException,
			IOException {
		checkUpload(getFileTarget(), this.getClass().getField("target"));
	}

	public void checkUpload(UploadedFile file, Field field)
			throws IllegalArgumentException, IllegalAccessException,
			IOException {
		FacesMessage message = null;
		if (file != null) {
			long size = file.getSize();
			if (FileUtils.hasExtension(file, Constants.file_extensions)) {
				if (size <= Constants.file_max_size) {
					toFile(file, field);
					message = new FacesMessage("Succesful", file.getFileName()
							+ " is uploaded");
				} else {
					message = new FacesMessage("Error",
							"File size exceeds maximum of "
									+ Constants.file_max_size + " bytes");
				}
			} else {
				message = new FacesMessage("Error",
						"File extension is not JAR o ZIP");
			}
		}
		FacesContext.getCurrentInstance().addMessage(null, message);
	}

	public void start(ActionEvent actionEvent) throws Exception {
		StringBuffer sb = new StringBuffer();
		/* Target */
		TargetService targetService = new TargetService();
		TargetProfile target = targetService.loadTargetProfile(
				this.target.getAbsolutePath(), "org.trimatek");
		sb.append(target.toString());
		/* Source -> Target */
		sb.append("\nStart of [" + this.source.getName() + " -> " + target.getJarName()
				+ "] analysis");
		sb.append("\nPlease wait");
		MultiMap<String, ClassProfile> depMap = Utils.findRelations(
				this.source.getAbsolutePath(), target);
		Set<ClassProfile> uniques = Utils.toUniquesClassProfiles(depMap);
		sb.append("\n**Quick survey result:**");
		sb.append("Total of referenced classes(concrete,abstract,interfaces) by "
						+ this.source.getName() + ": " + uniques.size() + "\n");
		/* Tree build */
		sb.append("Building dependencies tree\nPlease wait");
		TreeNode<?> depTree = Utils.buildDepTree(depMap, this.source.getAbsolutePath());
		sb.append("\n\n**Deep survey:**");
		sb.append(TreeUtils.printTree(depTree));
		/* Calculate result */
		CalculatorService cs = new CalculatorService();
		sb.append(cs.calcDepFactor(target, depTree, uniques.size()).toString());
		output = sb.toString();
	}

	public void toFile(UploadedFile uploaded, Field field)
			throws IllegalArgumentException, IllegalAccessException,
			IOException {
		File file = new File(Constants.temp_dir, uploaded.getFileName());
		FileOutputStream output = new FileOutputStream(file);
		InputStream input = uploaded.getInputstream();
		try {
			IOUtils.copy(input, output);
		} finally {
			IOUtils.closeQuietly(input);
			IOUtils.closeQuietly(output);
		}
		field.set(this, file);
	}
}
