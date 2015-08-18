package org.trimatek.deep.gui;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.primefaces.model.TreeNode;
import org.primefaces.model.UploadedFile;
import org.trimatek.deep.model.AllResults;
import org.trimatek.deep.service.DeepService;
import org.trimatek.deep.utils.Constants;
import org.trimatek.deep.utils.FileUtils;
import org.trimatek.deep.utils.TreeUtils;

@ManagedBean
public class DeepView {
	private UploadedFile fileSource;
	public File source;
	private UploadedFile fileTarget;
	public File target;
	public DeepService ds = new DeepService();
	private AllResults allResults;
	private TreeNode targetTree;
	private Boolean showModal = Boolean.FALSE;
	private TreeNode selectedDir;

	public DeepView() {
		displayWelcome();
	}
	
	private void displayWelcome(){
		FacesContext.getCurrentInstance().addMessage(
				null,
				new FacesMessage(FacesMessage.SEVERITY_INFO, "Welcome",
						"Please load JAR files (max file size 5MB)."));
	}

	public TreeNode getSelectedDir() {
		return selectedDir;
	}

	public void setSelectedDir(TreeNode selectedDir) {
		this.selectedDir = selectedDir;
	}

	public String getShowModal() {
		return showModal.toString();
	}

	public void setShowModal(Boolean showModal) {
		this.showModal = showModal;
	}

	public TreeNode getTargetTree() {
		return targetTree;
	}

	public void setTargetTree(TreeNode targetTree) {
		this.targetTree = targetTree;
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

	public AllResults getAllResults() {
		return allResults;
	}

	public void setAllResults(AllResults allResults) {
		this.allResults = allResults;
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
		if (target != null) {
			targetTree = TreeUtils.buildTree(target);
			setShowModal(Boolean.TRUE);
		}
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
					message = new FacesMessage("Successful", file.getFileName()
							+ " is uploaded");
				} else {
					message = new FacesMessage(FacesMessage.SEVERITY_WARN,
							"Warning:", "File size exceeds maximum of "
									+ Constants.file_max_size + " bytes");
				}
			} else {
				message = new FacesMessage(FacesMessage.SEVERITY_WARN,
						"Warning:", "File extension is not JAR o ZIP");
			}
		}
		FacesContext.getCurrentInstance().addMessage(null, message);
	}

	public void start(ActionEvent actionEvent) throws Exception {
		try {
			String threshold = getSelectedDir().getData().toString().replaceAll("/", "\\.");
			allResults = ds.start(source, target, threshold);
			deleteFiles();
			FacesContext.getCurrentInstance().addMessage(
					null,
					new FacesMessage(FacesMessage.SEVERITY_INFO,
							"Analysis completed", ""));
		} catch (FileNotFoundException e) {
			FacesContext.getCurrentInstance().addMessage(
					null,
					new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error:",
							"Files are not available, please reload both"));
		} catch (NullPointerException e) {
			FacesContext.getCurrentInstance().addMessage(
					null,
					new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error:",
							"Files are not available, please reload both"));
		}

	}

	public void reset(ActionEvent actionEvent) {
		allResults = null;
		deleteFiles();
		setSelectedDir(null);
		setShowModal(Boolean.FALSE);
		displayWelcome();
	}

	private void deleteFiles() {
		if (source != null && source.exists())
			source.delete();
		source = null;
		if (target != null && target.exists())
			target.delete();
		target = null;
		fileSource = null;
		fileTarget = null;
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

	public String getAppVersion() {
		return Constants.version + "";
	}
}
