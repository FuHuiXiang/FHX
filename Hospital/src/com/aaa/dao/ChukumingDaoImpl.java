package com.aaa.dao;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.aaa.entity.Audit;
import com.aaa.entity.Chuku;

import com.aaa.entity.Fanginventory;
import com.aaa.entity.Kuinventory;
@Repository
public class ChukumingDaoImpl implements ChukumingDao{
	@Autowired
	private HibernateTemplate hibernateTemplate;
	@Override
	//��ѯ������˵�ȫ��ҩƷ
	public List<Map> selectChuku() {
		// TODO Auto-generated method stub
		String hql="select new Map(c.ckId as ckmId,c.ckDate as ckDate,c.pharmacy.phName as phName,s.stuffname as stuffname) from Chuku as c join c.stuffs as s where c.audit.auId=1";
		List<Map> list=this.hibernateTemplate.find(hql);
		return list;
	}
	//��ѯ��ָ������˵�ҩƷ��Ϣ
	@Override
	public List<Map> selectChukuming(int ckm) {
		// TODO Auto-generated method stub
		String hql="select new Map(c.drug.did as did,c.ckmId as ckmId,c.num3 as num3,c.drug.dname as dname,c.drug.zhuji as zhuji,c.drug.spec as spec,c.drug.doseunit.duName as duName,c.drug.address.aname as aname,c.num3 as num3,c.totalPrice5 as totalPrice5,c.drug.retaiPrice as retaiPrice,c.chuku.ckId as ckId) from Chukuming as c where c.chuku.ckId='"+ckm+"'";
		List<Map> list=this.hibernateTemplate.find(hql);
		return list;
	}
	//ͨ��id��ѯ��ҩƷ�����
	@Override
	public Chuku selectCKM(int cid) {
		// TODO Auto-generated method stub
		return this.hibernateTemplate.get(Chuku.class, cid);
	}
	//�޸Ŀ��
	@Override
	public void updateFang(Fanginventory f) {
		// TODO Auto-generated method stub
		this.hibernateTemplate.update(f);
	}
	//�޸�״̬
	@Override
	public void updateAudit(int cid) {
		// TODO Auto-generated method stub
		System.out.println(cid);
		Chuku ck=this.hibernateTemplate.get(Chuku.class, cid);
		Audit au=new Audit();
		au.setAuId(2);
		ck.setAudit(au);
		this.hibernateTemplate.update(ck);
	}
	//�޸Ŀ��
	@Override
	public void updateKu(Kuinventory ku) {
		// TODO Auto-generated method stub
		this.hibernateTemplate.update(ku);
	}
	
	
}
