package com.aaa.action;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.aaa.actions.BaseAction;
import com.aaa.entity.Charge;
import com.aaa.entity.Chinesedetails;
import com.aaa.entity.Clinicregister;
import com.aaa.entity.Lop;
import com.aaa.entity.Particulars;
import com.aaa.entity.Patients;
import com.aaa.entity.Prescribe;
import com.aaa.service.PatientsService;


import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

@Controller
public class PatientsAction extends BaseAction{
	@Autowired
	private PatientsService ps;
	private Patients pa;
	private Lop lo;
	private Prescribe pr;
	private Charge ch;
	private Clinicregister cl;
	private List<Particulars> list;
	private String dtime;
	private String dtime1;
	
	
	public String getDtime() {
		return dtime;
	}

	public void setDtime(String dtime) {
		this.dtime = dtime;
	}

	public String getDtime1() {
		return dtime1;
	}

	public void setDtime1(String dtime1) {
		this.dtime1 = dtime1;
	}

	public List<Particulars> getList() {
		return list;
	}

	public void setList(List<Particulars> list) {
		this.list = list;
	}

	public Charge getCh() {
		return ch;
	}

	public void setCh(Charge ch) {
		this.ch = ch;
	}

	public Clinicregister getCl() {
		return cl;
	}

	public void setCl(Clinicregister cl) {
		this.cl = cl;
	}

	public Prescribe getPr() {
		return pr;
	}

	public void setPr(Prescribe pr) {
		this.pr = pr;
	}

	public Lop getLo() {
		return lo;
	}

	public void setLo(Lop lo) {
		this.lo = lo;
	}

	public Patients getPa() {
		return pa;
	}

	public void setPa(Patients pa) {
		this.pa = pa;
	}

	public PatientsService getPs() {
		return ps;
	}

	public void setPs(PatientsService ps) {
		this.ps = ps;
	}
	//查询全部未划价的患者信息
	public void allPatients(){
		List<Map> list=ps.allPatients();
		this.getPrintWriter().print(JSONArray.fromObject(list));
	
	}
	//通过id确认一个未划价的患者信息
	public void selects(){
		int oid=pa.getId();
		Map	map=ps.selects(oid);
		this.getPrintWriter().print(JSONObject.fromObject(map));
	}
	
	public void allselect(){
		int rid=pr.getChinesePrescribeId();
		List<Map> list=ps.alls(rid);
		
		this.getPrintWriter().print(JSONArray.fromObject(list));
	}
	//添加收费和收费明细表 和 修改库存
	public void updates(){
		int sid=pr.getChinesePrescribeId();
		int ss=1;
		ps.updates(sid,ch,list);
		this.getPrintWriter().print(JSONArray.fromObject(ss));
		
	}
	
	public void selectPrescribe(){
		List<Map> list=ps.selectPrescribe();
		this.getPrintWriter().print(JSONArray.fromObject(list));
		
	}
	
	public void selectLop(){
		int lpid=2;
		List<Map> list=ps.selectLop(lpid);
		
		this.getPrintWriter().print(JSONArray.fromObject(list));
	}
	
	public void mselect(){
		int seria=cl.getSerialNumber();
		List<Map> list=ps.mselect(seria);
		
		this.getPrintWriter().print(JSONArray.fromObject(list));
	}
	

	//药房出库查询
	public void chuselect(){
		List<Map> list=ps.chuselect();
		this.getPrintWriter().print(JSONArray.fromObject(list));
	}
	//药房出库模糊查询
	public void mohuselect(){
		String pname=pa.getPatientname();
		List<Map> list=ps.mohuselect(pname);
		this.getPrintWriter().print(JSONArray.fromObject(list));
		System.out.println(list);
	}
	//模糊查询该患者药品
	public void yaoselect(){
		int yid=cl.getSerialNumber();
		List<Map> list=ps.yaoselect(yid);
		System.out.println(list);
		this.getPrintWriter().print(JSONArray.fromObject(list));
	}
	//通过日期查询药房发药
	public void dateSelect(){
		
		List<Map> list=ps.dateSelect(dtime, dtime1);
		this.getPrintWriter().print(JSONArray.fromObject(list));
		System.out.println(list);
	}
	
	public void fangUpdate(){
		int chineseid=pr.getChinesePrescribeId();
		ps.fangService(chineseid);
		
	}
}
