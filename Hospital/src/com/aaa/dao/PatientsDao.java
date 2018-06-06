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
	//��ѯȫ��δ���۵Ļ�����Ϣ
	public List<Map> allPatients();
	//ͨ��idȷ��һ��δ���۵Ļ�����Ϣ
	public Map selects(int oid);
	//��ѯ�û���ҩƷ
	public List<Map> alls(int rid);
	//ģ����ѯ�û���ҩƷ
	public List<Map> yaoselect(int yid);
	//�޸�״̬
	public void updates(int sid);
	//��ѯ�ѻ���ȫ����Ϣ
	public List<Map> selectPrescribe();
	//ͨ������id��ѯҩƷ
	public List<Map> selectLop(int lpid);
	//ģ����ѯ�ѻ��۵�ȫ����Ϣ
	public List<Map> mselect(int seria);
	//�޸�״̬
	public void updatess(int sid);
	//ҩ�������ѯ
	public List<Map> chuselect();
	//ҩ������ģ����ѯ
	public List<Map> mohuselect(String pname);
	//����շѱ�
	public void saveCh(Charge ch);
	//����շ���ϸ��
	public void savePart(Particulars part);
	//ͨ�����ڲ�ѯҩ������
	public List<Map> dateSelect(String dtime,String dtime1);
	//ͨ��ҩƷid�޸Ŀ��
	public Prescribe fangSelect(int chineseid);
	public void fangUpdate(Fanginventory f);
	//��ѯ������˵�ȫ��ҩƷ
	
}
