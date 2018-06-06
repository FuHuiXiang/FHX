
package com.aaa.dao;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.aaa.entity.Charge;
import com.aaa.entity.Fanginventory;
import com.aaa.entity.Lop;
import com.aaa.entity.Particulars;
import com.aaa.entity.Prescribe;
@Repository
public class PatientsDaoImpl implements PatientsDao{
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	
	//查询全部未划价的患者信息
	@Override
	public List<Map> allPatients() {
		String hql="select new Map(p.id as id,p.patientname as patientname,p.age as age,c1.iphone as iphone,c1.presentTime as presentTime,r2.name as name,o.officeName as officeName) from Patients as p join p.clinicregisters as c1 join c1.registeredtypes as r2 join c1.offices o join p.prescribes as pr where pr.tcmname=1";
		List<Map> list=this.hibernateTemplate.find(hql);
		return list;
	}


	//通过id确认一个未划价的患者信息
	@Override
	public Map selects(int oid) {
		// TODO Auto-generated method stub
		String hql="select new Map(p.id as id,p.patientname as patientname,p.age as age,pr.chinesePrescribeId as chinesePrescribeId,ss1.stuffname as stuffname,pr.money as money) from Patients as p join p.clinicregisters as c1 join c1.stuffs as ss1 join c1.registeredtypes as r2 join c1.offices o join p.prescribes as pr where p.id='"+oid+"' ";
		return (Map) this.hibernateTemplate.find(hql).get(0);
	}


	//查询该患者药品
	@Override
	public List<Map> alls(int rid) {
		// TODO Auto-generated method stub
		String hql="select new Map(p.drug.dname as lname,p.gg as gg,p.dw as dw,p.sl as sl,p.dj as dj,p.je as je) from Lop as p where p.prescribe.chinesePrescribeId="+rid;
		List<Map> list=(List<Map>) this.hibernateTemplate.find(hql);
		return list;
	}


	//修改状态
	@Override
	public void updates(int sid) {	
		Prescribe p1=(Prescribe) this.hibernateTemplate.find("from Prescribe where chinesePrescribeId="+sid).get(0);
		p1.setTcmname("2");
		this.hibernateTemplate.update(p1);
	}


	//查询已划价全部信息
	@Override
	public List<Map> selectPrescribe() {
		// TODO Auto-generated method stub
		String hql="select new Map(p.patientname as patientname,p.age as age,c1.iphone as iphone,c1.serialNumber as serialNumber,r2.name as name,o.officeName as officeName,pr.chinesePrescribeId as chinesePrescribeId) from Patients as p join p.clinicregisters as c1 join c1.stuffs as ss1 join c1.registeredtypes as r2 join c1.offices o join p.prescribes as pr where pr.tcmname=2";
		List<Map> list=this.hibernateTemplate.find(hql);
		return list;
	}
	//通过处方id查询药品
	@Override
	public List<Map> selectLop(int lpid) {
		// TODO Auto-generated method stub
		String hql="select new Map(p.lid as lid,p.drug.dname as lname,p.gg as gg,p.dw as dw,p.sl as sl,p.dj as dj,p.je as je) from Lop as p where p.prescribe.chinesePrescribeId="+lpid;
		List<Map> list=this.hibernateTemplate.find(hql);
		return list;
	}
	//模糊查询已划价的全部信息
	@Override
	public List<Map> mselect(int seria) {
		// TODO Auto-generated method stub
		
		String hql="select new Map(p.patientname as patientname,p.age as age,c1.iphone as iphone,c1.serialNumber as serialNumber,r2.name as name,o.officeName as officeName,pr.chinesePrescribeId as chinesePrescribeId) from Patients as p join p.clinicregisters as c1 join c1.stuffs as ss1 join c1.registeredtypes as r2 join c1.offices o join p.prescribes as pr where pr.tcmname=2 and c1.serialNumber like '"+seria+"%'";
		List<Map> list=this.hibernateTemplate.find(hql);
		return list;
	}
	//修改状态
	@Override
	public void updatess(int sid) {
		// TODO Auto-generated method stub
		Prescribe p1=(Prescribe) this.hibernateTemplate.find("from Prescribe where chinesePrescribeId="+sid).get(0);
		p1.setTcmname("3");
		this.hibernateTemplate.update(p1);
	}


	//出库查询
	@Override
	public List<Map> chuselect() {
		// TODO Auto-generated method stub
		String hql="select new Map(c.serialNumber as serialNumber,c.presentTime as presentTime,p.patientname as patientname,st.stuffname as stuffname,pr.money as money) from Clinicregister c join c.stuffs as st join c.patients as p join p.prescribes as pr where pr.tcmname=3";
		List<Map> list=this.hibernateTemplate.find(hql);
		return list;
	}


	//出库模糊查询
	@Override
	public List<Map> mohuselect(String pname) {
		// TODO Auto-generated method stub
		System.out.println(pname);
		String hql="select new Map(c.serialNumber as serialNumber,c.presentTime as presentTime,p.patientname as patientname,st.stuffname as stuffname,pr.money as money) from Clinicregister c join c.stuffs st join c.patients as p join p.prescribes as pr where pr.tcmname=3 and p.patientname like '"+pname+"%'";
		List<Map> list=this.hibernateTemplate.find(hql);
		return list;
	}


	//模糊查询该患者商品join
	@Override
	public List<Map> yaoselect(int yid) {
		// TODO Auto-generated method stub
		//String hql="select new Map(p.lname as lname,p.gg as gg,p.dw as dw,p.sl as sl,p.dj as dj,p.je as je,p.prescribe.tcmname as tcmname,p.prescribe.patients.patientname as patientname,p.prescribe.patients.age as age,st.stuffname as stuffname,p.prescribe.chinesePrescribeId as chinesePrescribeId) from Lop as p join p.prescribe as pr join pr.patients as pa join pa.clinicregisters as c1 join c1.stuffs as st where p.prescribe.tcmname=1 and c1.serialNumber like '"+yid+"%'";
		String hql="select new Map(p.id as id,p.patientname as patientname,p.age as age,c1.iphone as iphone,c1.presentTime as presentTime,r2.name as name,o.officeName as officeName) from Patients as p join p.clinicregisters as c1 join c1.registeredtypes as r2 join c1.offices o join p.prescribes as pr where pr.tcmname=1 and c1.serialNumber like '"+yid+"%'";
		List<Map> list=this.hibernateTemplate.find(hql);
		return list;
	}
	
	//添加收费表
	@Override
	public void saveCh(Charge ch) {
		// TODO Auto-generated method stub
		hibernateTemplate.save(ch);
	}


	//添加收费明细表
	@Override
	public void savePart(Particulars part) {
		// TODO Auto-generated method stub
		hibernateTemplate.save(part);
	}
	//通过日期查询药房出库
	@Override
	public List<Map> dateSelect(String dtime, String dtime1) {
		// TODO Auto-generated method stub
		System.out.println(dtime);
		String hql="select new Map(c.serialNumber as serialNumber,c.presentTime as presentTime,p.patientname as patientname,st.stuffname as stuffname,pr.money as money) from Clinicregister c join c.stuffs as st join c.patients as p join p.prescribes as pr where pr.tcmname=3 and c.presentTime between '"+dtime+"' and '"+dtime1+"' ";
		List<Map> list=this.hibernateTemplate.find(hql);
		return list;
	}

	//通过id查询处方表
	@Override
	public Prescribe fangSelect(int chinese) {
		// TODO Auto-generated method stub
		return this.hibernateTemplate.get(Prescribe.class,chinese);
	}

	//修改状态
	@Override
	public void fangUpdate(Fanginventory f) {
		// TODO Auto-generated method stub
		this.hibernateTemplate.update(f);
	}
	
}
