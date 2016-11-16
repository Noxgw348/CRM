package com.crm.test;

import com.crm.dao.SjzdflDAO;
import com.crm.dao.SjzdflDAOImpl;
import com.crm.dao.SjzdxxDAO;
import com.crm.po.Sjzdfl;

public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SjzdflDAO sjzdflDAO=new SjzdflDAOImpl();
		Sjzdfl sjzdfl=sjzdflDAO.findById(2);
		System.out.println(sjzdfl.getSjzdflid());

		
	}

}
