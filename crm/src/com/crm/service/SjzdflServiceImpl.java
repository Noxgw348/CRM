package com.crm.service;

import java.util.List;

import com.crm.dao.SjzdflDAO;
import com.crm.po.Sjzdfl;

public class SjzdflServiceImpl implements SjzdflService {
	private SjzdflDAO sjzdflDAO;

	public List<Sjzdfl> getAllSjzdfl() {
		return sjzdflDAO.findAll();
	}

	public SjzdflDAO getSjzdflDAO() {
		return sjzdflDAO;
	}

	public void setSjzdflDAO(SjzdflDAO sjzdflDAO) {
		this.sjzdflDAO = sjzdflDAO;
	}

	public void updateSjzdfl(Sjzdfl sjzdfl) {
		sjzdflDAO.attachDirty(sjzdfl);
	}

	public void delSjzdfl(Sjzdfl sjzdfl) {
		sjzdflDAO.delete(sjzdfl);
		
	}
	

}
