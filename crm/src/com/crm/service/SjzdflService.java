package com.crm.service;

import java.util.List;

import com.crm.po.Sjzdfl;

public interface SjzdflService {
	//查询所有的数据字典分类
	public List<Sjzdfl> getAllSjzdfl();
	//更新数据字典分类
	public void updateSjzdfl(Sjzdfl sjzdfl);
	//更新删除字典分类
	public void delSjzdfl(Sjzdfl sjzdfl);
}
