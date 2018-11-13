package edu.poly.action;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.interceptor.ServletRequestAware;
import com.opensymphony.xwork2.ActionSupport;

public class Hello extends ActionSupport implements ServletRequestAware {
	private String username;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String sayHello() {
		if (username == null || username.equals("")) {
			return ERROR;
		}
		String age = request.getParameter("age");
		
		request.setAttribute("age", age);
		
		return SUCCESS;
	}

	private HttpServletRequest request;
	public void setServletRequest(HttpServletRequest request) {
		this.request = request;
	}
}
