package com.aaa.service;

import java.util.List;
import java.util.Map;

public interface ChukumingService {
	//��ѯ������˵�ȫ��ҩƷ
	public List<Map> selectChuku();
	//��ѯ��ָ������˵�ҩƷ��Ϣ
	public List<Map> selectChukuming(int ckm);
	//
	public void selectCHU(int cid);
	
}
