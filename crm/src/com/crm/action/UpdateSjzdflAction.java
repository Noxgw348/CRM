package com.crm.action;


import com.crm.po.Sjzdfl;
import com.crm.service.SjzdflService;
import com.opensymphony.xwork2.ActionSupport;

public class UpdateSjzdflAction extends ActionSupport{
	private Integer[] sjzdflids;
	private String[] sjzdflmcs;
	private SjzdflService sjzdflService;
	//更新sjzdfl数据
	@Override
	public String execute() throws Exception {
		Sjzdfl datapo=new Sjzdfl();
		for(int i=0;i<sjzdflids.length;i++){
			datapo.setSjzdflid(sjzdflids[i]);
			datapo.setSjzdflmc(sjzdflmcs[i]);
			sjzdflService.updateSjzdfl(datapo);
		}
		return this.SUCCESS;
	}
	public Integer[] getSjzdflids() {
		return sjzdflids;
	}
	public void setSjzdflids(Integer[] sjzdflids) {
		this.sjzdflids = sjzdflids;
	}
	public String[] getSjzdflmcs() {
		return sjzdflmcs;
	}
	public void setSjzdflmcs(String[] sjzdflmcs) {
		this.sjzdflmcs = sjzdflmcs;
	}
	public SjzdflService getSjzdflService() {
		return sjzdflService;
	}
	public void setSjzdflService(SjzdflService sjzdflService) {
		this.sjzdflService = sjzdflService;
	}
	
	
}
