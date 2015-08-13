package org.trimatek.deep.gui;

import java.lang.reflect.Field;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import org.trimatek.deep.utils.FileUtils;
import org.primefaces.model.UploadedFile;
import org.trimatek.deep.utils.Constants;

@ManagedBean
public class DeepView {
	private UploadedFile fileSource;
	public UploadedFile source;
	private UploadedFile fileTarget;
	public UploadedFile target;

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

	public UploadedFile getSource() {
		return source;
	}

	public void setSource(UploadedFile source) {
		this.source = source;
	}

	public UploadedFile getTarget() {
		return target;
	}

	public void setTarget(UploadedFile target) {
		this.target = target;
	}

	public void uploadSource() throws NoSuchFieldException, SecurityException,
			IllegalArgumentException, IllegalAccessException {
		Field[] f = this.getClass().getFields();
		checkUpload(getFileSource(), this.getClass().getField("source"));
	}

	public void uploadTarget() throws IllegalArgumentException,
			IllegalAccessException, NoSuchFieldException, SecurityException {
		checkUpload(getFileTarget(), this.getClass().getField("target"));
	}

	public void checkUpload(UploadedFile file, Field field)
			throws IllegalArgumentException, IllegalAccessException {
		FacesMessage message = null;
		if (file != null) {
			long size = file.getSize();
			if (FileUtils.hasExtension(file, Constants.file_extensions)) {
				if (size <= Constants.file_max_size) {
					field.set(this, file);
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
}
