package com.crm.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.crm.po.Sjzdfl;
import com.crm.service.SjzdflService;
import com.opensymphony.xwork2.ActionSupport;

public class GetSjzdflAction extends ActionSupport{

	private SjzdflService sjzdflService; 
	@Override
	public String execute() throws Exception {
		List<Sjzdfl> allSjzdfl= sjzdflService.getAllSjzdfl();
		HttpServletRequest request=ServletActionContext.getRequest();
		request.setAttribute("allSjzdfl", allSjzdfl);
		return this.SUCCESS;
	}
	public SjzdflService getSjzdflService() {
		return sjzdflService;
	}
	public void setSjzdflService(SjzdflService sjzdflService) {
		this.sjzdflService = sjzdflService;
	}

    
	
}
