package com.crm.service;

import java.util.List;

import com.crm.po.Sjzdfl;

public interface SjzdflService {
	//��ѯ���е������ֵ����
	public List<Sjzdfl> getAllSjzdfl();
	//���������ֵ����
	public void updateSjzdfl(Sjzdfl sjzdfl);
	//����ɾ���ֵ����
	public void delSjzdfl(Sjzdfl sjzdfl);
}
