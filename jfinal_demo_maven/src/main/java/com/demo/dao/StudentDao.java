package com.demo.dao;


import java.util.List;

import com.demo.model.BaseStudent;
import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.Record;

public class StudentDao  {
	
     public int save(BaseStudent stu){
    	 String sql="INSERT into student(id,name,phone,sex,isdeleted,courid,school)  values(null,?,?,?,?,?,?);";
    	
    	 return  Db.update(sql, stu.getName(),stu.getPhone(),stu.getSex(),stu.getIsdeleted(),stu.getCourId(),stu.getSchool());
		 
     }
     /**
      * @author qzz
      * @param     id 学生id
      * @return  boolean
      * version 1.0   2018-12-19  14:26:46
      */
     public int del(int id){
    	  String sql="DELETE from student where id=?";
    	 return Db.update(sql, id);
     }
     
     public int update(BaseStudent bs){
        String sql="update student set name='"+bs.getName()+"',phone='"+bs.getPhone()+"',sex='"+bs.getSex()+"',school='"+bs.getSchool()+"' where id='"+bs.getId()+"'";	
    	 return Db.update(sql);
     }
    
     
     public List<Record>  selStudent(){ 	 
    	 String sql="select id,name,sex,courId,phone,school from student where isdeleted=?";
    	 return Db.find(sql, "0");
     }
     
     public List<Record>  listS(){ 	 
    	 String sql="select id,name,sex,courId,phone,school from student";
    	 return Db.find(sql);
     }
	public Record  cStudent(int id) {
		String sql="select id,name,sex,courId,phone,school from student where id=?";
   	    return Db.findFirst(sql, id);
	}
     
}
