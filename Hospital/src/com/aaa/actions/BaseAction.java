package com.aaa.actions;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class BaseAction extends ActionSupport {
	
	/**
	 * 获取Request对象
	 * @return
	 */
	public Map getRequest(){
		return (Map) ActionContext.getContext().get("request");
	}
	
	public Map getApplication(){
		return  ActionContext.getContext().getApplication();
	}
	
	public Map getSession(){
		return ActionContext.getContext().getSession();
	}
	
	public HttpServletResponse getResponse(){
		HttpServletResponse response=ServletActionContext.getResponse();
		response.setContentType("text/html;charset=utf-8");
		return response;
	}
	
	public PrintWriter getPrintWriter() {
		HttpServletResponse response=ServletActionContext.getResponse();
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out;
		try {
			out = response.getWriter();
			return out;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
}
