package com.afbdev.actions;

import java.text.SimpleDateFormat;

import com.afbdev.dao.UserDAO;
import com.afbdev.utils.Utils;
import com.opensymphony.xwork2.ActionSupport;

public class IndexAction extends ActionSupport {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -8914000039472878481L;
	
	private UserDAO userDAO;

	public String execute() {
		return SUCCESS;
	}

	public String getDate() {
		SimpleDateFormat sdf = new SimpleDateFormat(Utils.DATE_FORMAT);
		return sdf.format(Utils.getDateNow());
	}

	public String getId() {
		return this.toString();
	}

	public UserDAO getUserDAO() {
		return userDAO;
	}

	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

}
