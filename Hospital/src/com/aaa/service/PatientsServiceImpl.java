package com.aaa.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.aaa.dao.PatientsDao;
import com.aaa.entity.Charge;
import com.aaa.entity.Fanginventory;
import com.aaa.entity.Lop;
import com.aaa.entity.Particulars;
import com.aaa.entity.Prescribe;
@Service
public class PatientsServiceImpl implements PatientsService{
	@Autowired
	private PatientsDao dao;
	
	public PatientsDao getDao() {
		return dao;
	}

	public void setDao(PatientsDao dao) {
		this.dao = dao;
	}

	@Override
	public List<Map> allPatients() {
		// TODO Auto-generated method stub
		System.out.println(dao.allPatients());
		return dao.allPatients();	
	}

	@Override
	public Map selects(int oid) {
		// TODO Auto-generated method stub
		return dao.selects(oid);
	}

	@Override
	public List<Map> alls(int rid) {
		// TODO Auto-generated method stub
		return dao.alls(rid);
	}
	//修改状态 和添加消费和消费明细表
	@Transactional
	@Override
	public void updates(int sid,Charge ch,List<Particulars> part) {
		// TODO Auto-generated method stub
		dao.updates(sid);
		dao.saveCh(ch);
		for (int i = 0; i < part.size(); i++) {
			Particulars p=part.get(i);
			p.setCharge(ch);
			dao.savePart(p);
		}
	}
	@Override
	public List<Map> selectPrescribe() {
		// TODO Auto-generated method stub
		return dao.selectPrescribe();
	}

	@Override
	public List<Map> selectLop(int lpid) {
		// TODO Auto-generated method stub
		return dao.selectLop(lpid);
	}

	@Override
	public List<Map> mselect(int seria) {
		// TODO Auto-generated method stub
		return dao.mselect(seria);
	}
	/*@Transactional
	@Override
	public void updatess(int sid) {
		// TODO Auto-generated method stub
		dao.updatess(sid);
		dao.selectPrescribe();
	}*/

	@Override
	public List<Map> chuselect() {
		// TODO Auto-generated method stub
		return dao.chuselect();
	}

	@Override
	public List<Map> mohuselect(String pname) {
		// TODO Auto-generated method stub
		return dao.mohuselect(pname);
	}

	@Override
	public List<Map> yaoselect(int yid) {
		// TODO Auto-generated method stub
		return dao.yaoselect(yid);
	}

	@Override
	public List<Map> dateSelect(String dtime, String dtime1) {
		// TODO Auto-generated method stub
		
		return dao.dateSelect(dtime, dtime1);
	}
	//修改库存和修改状态
	@Transactional
	@Override
	public void fangService(int chineseid) {
		System.out.println(chineseid);
		dao.updatess(chineseid);
		Prescribe p=dao.fangSelect(chineseid);
		Set<Lop> l=p.getLops();
		for(Lop lp:l){
			int dqg=lp.getSl();//要减去的个数
			List<Fanginventory> list=new ArrayList<Fanginventory>(lp.getDrug().getFanginventories());//
			System.out.println(list.size());
			Fanginventory k1=list.get(0);
			int zong=k1.getTotalNum4();
			k1.setTotalNum4(zong-dqg);
			dao.fangUpdate(k1);
		}
	}

}
