package com.aaa.action;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.aaa.actions.BaseAction;
import com.aaa.entity.Chuku;
import com.aaa.entity.Chukuming;
import com.aaa.service.ChukumingService;

import net.sf.json.JSONArray;
@Controller
public class ChukumingAction extends BaseAction{
	@Autowired
	private ChukumingService chuku;
	private Chuku ck;
	private int cid;
	private int id;
	
	
	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	

	public Chuku getCk() {
		return ck;
	}

	public void setCk(Chuku ck) {
		this.ck = ck;
	}

	public ChukumingService getChuku() {
		return chuku;
	}

	public void setChuku(ChukumingService chuku) {
		this.chuku = chuku;
	}
	public void selectChuku(){
		List<Map> list=chuku.selectChuku();
		System.out.println(list);
		this.getPrintWriter().print(JSONArray.fromObject(list));
	}
	public void selectChukuming(){
		int ckm=ck.getCkId();
		List<Map> list=chuku.selectChukuming(ckm);
		this.getPrintWriter().print(JSONArray.fromObject(list));
	}
	public void updateFang(){
		int k=100;
		chuku.selectCHU(cid);
		this.getPrintWriter().print(JSONArray.fromObject(k));
	}
}
