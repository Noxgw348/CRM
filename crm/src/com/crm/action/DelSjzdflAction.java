package com.crm.action;

import com.crm.po.Sjzdfl;
import com.crm.service.SjzdflService;
import com.opensymphony.xwork2.ActionSupport;

public class DelSjzdflAction  extends ActionSupport{
	private int id;
	private SjzdflService sjzdflService;
	public String execute(){
		Sjzdfl sjzdfl=new Sjzdfl();
		sjzdfl.setSjzdflid(id);
		sjzdflService.delSjzdfl(sjzdfl);
		return this.SUCCESS;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	

}
