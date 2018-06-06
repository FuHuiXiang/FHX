package com.aaa.dao;

import java.util.List;
import java.util.Map;

import com.aaa.entity.Chuku;
import com.aaa.entity.Chukuming;
import com.aaa.entity.Fanginventory;
import com.aaa.entity.Kuinventory;

public interface ChukumingDao {
	//查询出待审核的全部药品
	public List<Map> selectChuku();
	//查询出指定待审核的药品信息
	public List<Map> selectChukuming(int ckm);
	//通过药品出库明细表修改库存
	public Chuku selectCKM(int cid);
	
	public void updateFang(Fanginventory f);
	//修改状态
	public void updateAudit(int cid);
	public void updateKu(Kuinventory ku);
}
