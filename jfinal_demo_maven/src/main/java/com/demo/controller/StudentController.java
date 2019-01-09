package com.demo.controller;

import java.util.List;

import com.demo.blog.BlogInterceptor;
import com.demo.model.BaseStudent;
import com.demo.service.StudentService;
import com.demo.service.impl.StudentImpl;
import com.jfinal.aop.Before;
import com.jfinal.aop.Inject;
import com.jfinal.core.Controller;

public class StudentController extends Controller {
	
	//@Inject
	 StudentService stuServer=new StudentImpl();//此处会注入依赖对象
	 
	 public void list111(){
		 
		 render("/page/login.jsp");
	 }
	 public void getStuList(){
		 List<BaseStudent> list=stuServer.findList();
		 setAttr("list", list);
		 render("stuList.html");
	 }
	 public void getStuListAll(){
		 List<BaseStudent> list=stuServer.findListAll();
		 setAttr("list", list);
		 render("stuList.html");
	 }
	 public void delete(){
		 boolean flag=false;
		 String json="";
		 if(isParaExists("id")){
			 Integer id=getParaToInt("id");
			flag= stuServer.del(id);
		 }
		// getStuList();
		 if(flag){
				json = "{\"success\":\"true\",\"message\":\"删除成功!\"}";
		 }else{
			 json = "{\"success\":\"false\",\"message\":\"删除失败!\"}";
		 }
		 renderJson(json);
	 }
	 
	 public void edit(){
		 BaseStudent bean=stuServer.cInfo(getParaToInt());
		setAttr("student",bean );
		 render("edit.html");
	 }
	 //修改
	 public void update(){
		 BaseStudent bs=new BaseStudent();
		 bs.setName(getPara("name"));
		 bs.setPhone(getPara("phone"));
		 bs.setId(getParaToInt("id"));
		 bs.setSchool(getPara("school"));
		 bs.setSex(getPara("sex"));		 		 
		 System.out.println(bs.getId()+"1111111111");
		 stuServer.update(bs);	 
		 redirect("/student/getStuListAll");
	 }
	 public void add(){
		 render("add.html");
	 }
	 //增加
	 public void save(){
		 BaseStudent bs=new BaseStudent();
		 bs.setName(getPara("name"));
		 bs.setPhone(getPara("phone"));
		 bs.setSchool(getPara("school"));
		 bs.setSex(getPara("sex"));		 
		 bs.setIsdeleted(getPara("isdeleted"));	
		 bs.setCourId(getParaToInt("courld"));
		 stuServer.saveStu(bs);
		 redirect("/student/getStuListAll");
	 }
}
