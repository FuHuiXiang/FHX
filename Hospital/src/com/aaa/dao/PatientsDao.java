package com.aaa.dao;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.aaa.entity.Charge;
import com.aaa.entity.Fanginventory;
import com.aaa.entity.Lop;
import com.aaa.entity.Particulars;
import com.aaa.entity.Prescribe;

public interface PatientsDao {
	//查询全部未划价的患者信息
	public List<Map> allPatients();
	//通过id确认一个未划价的患者信息
	public Map selects(int oid);
	//查询该患者药品
	public List<Map> alls(int rid);
	//模糊查询该患者药品
	public List<Map> yaoselect(int yid);
	//修改状态
	public void updates(int sid);
	//查询已划价全部信息
	public List<Map> selectPrescribe();
	//通过处方id查询药品
	public List<Map> selectLop(int lpid);
	//模糊查询已划价的全部信息
	public List<Map> mselect(int seria);
	//修改状态
	public void updatess(int sid);
	//药房出库查询
	public List<Map> chuselect();
	//药房出库模糊查询
	public List<Map> mohuselect(String pname);
	//添加收费表
	public void saveCh(Charge ch);
	//添加收费明细表
	public void savePart(Particulars part);
	//通过日期查询药房出库
	public List<Map> dateSelect(String dtime,String dtime1);
	//通过药品id修改库存
	public Prescribe fangSelect(int chineseid);
	public void fangUpdate(Fanginventory f);
	//查询出待审核的全部药品
	
}
