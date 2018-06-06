package com.aaa.service;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.aaa.entity.Charge;
import com.aaa.entity.Particulars;

public interface PatientsService {
	public List<Map> allPatients();
	public Map selects(int oid);
	public List<Map> alls(int rid);
	public void updates(int sid,Charge ch,List<Particulars> part);
	public List<Map> selectPrescribe();
	public List<Map> selectLop(int lpid);
	public List<Map> mselect(int seria);
	public List<Map> chuselect();
	public List<Map> mohuselect(String pname);
	public List<Map> yaoselect(int yid);
	public List<Map> dateSelect(String dtime,String dtime1);
	public void fangService(int chineseid);
}
