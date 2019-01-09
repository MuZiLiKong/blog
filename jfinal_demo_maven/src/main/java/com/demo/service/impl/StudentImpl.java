package com.demo.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.demo.dao.StudentDao;
import com.demo.model.BaseStudent;
import com.demo.service.StudentService;
import com.jfinal.plugin.activerecord.Record;

public class StudentImpl implements StudentService{
	private StudentDao stuDao=new StudentDao();
	public int saveStu(BaseStudent stu) {
		return    stuDao.save(stu);
		
	}
//	public List<Record> findById(){
//		return stuDao.cStudent(0);
//	}
	
	public List<BaseStudent> findList() {
		List<Record> rs=stuDao.selStudent();
		List<BaseStudent> list=new ArrayList<BaseStudent>();
		for(Record r:rs){
			BaseStudent bean=new BaseStudent();
			bean.setRecord(r);
			list.add(bean);
		}
		return list;
	}
	public List<BaseStudent> findListAll() {
		List<Record> rs=stuDao.listS();
		List<BaseStudent> list=new ArrayList<BaseStudent>();
		for(Record r:rs){
			BaseStudent bean=new BaseStudent();
			bean.setRecord(r);
			list.add(bean);
		}
		return list;
	}
	 public boolean del(int id){
		 boolean flag=false;
		 flag=stuDao.del(id)==1?true:false;
		 return flag;
	 }
	@Override
	public BaseStudent cInfo(int id) {
		BaseStudent bean=new BaseStudent();
		bean.setRecord(stuDao.cStudent(id));
		return bean;
	}

	@Override
	public int update(BaseStudent bs) {
		
		return stuDao.update(bs);
	}

}
