package com.aaa.service;

import java.util.List;
import java.util.Map;

public interface ChukumingService {
	//查询出待审核的全部药品
	public List<Map> selectChuku();
	//查询出指定待审核的药品信息
	public List<Map> selectChukuming(int ckm);
	//
	public void selectCHU(int cid);
	
}
