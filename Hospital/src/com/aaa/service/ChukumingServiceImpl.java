package com.aaa.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.aaa.dao.ChukumingDao;
import com.aaa.entity.Chuku;
import com.aaa.entity.Chukuming;
import com.aaa.entity.Fanginventory;
import com.aaa.entity.Kuinventory;
@Service
public class ChukumingServiceImpl implements ChukumingService{
	@Autowired
	private ChukumingDao dao;
	
	public ChukumingDao getDao() {
		return dao;
	}

	public void setDao(ChukumingDao dao) {
		this.dao = dao;
	}

	@Override
	public List<Map> selectChuku() {
		// TODO Auto-generated method stub
		return dao.selectChuku();
	}
	
	@Override
	public List<Map> selectChukuming(int ckm) {
		// TODO Auto-generated method stub
		return dao.selectChukuming(ckm);
	}
	//ÐÞ¸Ä¿â´æºÍÐÞ¸Ä×´Ì¬
	@Transactional
	@Override
	public void selectCHU(int cid) {
		// TODO Auto-generated method stub
		dao.updateAudit(cid);
		
		Chuku c=dao.selectCKM(cid);
		Set<Chukuming> chukumings=c.getChukumings();
		for(Chukuming ckm: chukumings ){
			int num=ckm.getNum3();
			//Ò©·¿¿â´æÔö¼Ó
			List<Fanginventory> list=new ArrayList<Fanginventory>(ckm.getDrug().getFanginventories());
			Fanginventory f=list.get(0);
			int num2=f.getTotalNum4();
			f.setTotalNum4(num2+num);
			dao.updateFang(f);
			//Ò©¿â¿â´æ¼õÉÙ
			List<Kuinventory> list1=new ArrayList<Kuinventory>(ckm.getDrug().getKuinventories());
			Kuinventory ku=list1.get(0);
		    int kuNum=ku.getTotalNum4();
		    ku.setTotalNum4(kuNum-num);
			dao.updateKu(ku);
		}
		
		
	}

}
