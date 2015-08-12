package org.trimatek.deep.gui;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import org.primefaces.model.UploadedFile;

@ManagedBean
public class DeepView {
	private UploadedFile fileSource;
	private UploadedFile fileTarget;

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

	public void uploadSource() {
		checkUpload(getFileSource());
	}

	public void uploadTarget() {
		checkUpload(getFileTarget());
	}
	
	public void checkUpload(UploadedFile file){
		if (file != null) {
			FacesMessage message = new FacesMessage("Succesful",
					file.getFileName() + " is uploaded.");
			FacesContext.getCurrentInstance().addMessage(null, message);
		}
	}
}
