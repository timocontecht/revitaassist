package org.visico.revitaplan.revitaassist.client.gui.service;

import java.util.ArrayList;

import org.visico.revitaplan.revitaassist.shared.gui.data.LoginData;
import org.visico.revitaplan.revitaassist.shared.gui.data.ProjectData;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface ProjectListServiceAsync {
	void addProject(ProjectData data, AsyncCallback<String> callback)
			throws IllegalArgumentException;
	 void getProjectList(int userid, AsyncCallback<ArrayList<ProjectData>> callback) 
			 throws IllegalArgumentException;
}