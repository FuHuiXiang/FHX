package com.aaa.dao;

import java.util.List;
import java.util.Map;

import com.aaa.entity.Chuku;
import com.aaa.entity.Chukuming;
import com.aaa.entity.Fanginventory;
import com.aaa.entity.Kuinventory;

public interface ChukumingDao {
	//��ѯ������˵�ȫ��ҩƷ
	public List<Map> selectChuku();
	//��ѯ��ָ������˵�ҩƷ��Ϣ
	public List<Map> selectChukuming(int ckm);
	//ͨ��ҩƷ������ϸ���޸Ŀ��
	public Chuku selectCKM(int cid);
	
	public void updateFang(Fanginventory f);
	//�޸�״̬
	public void updateAudit(int cid);
	public void updateKu(Kuinventory ku);
}
