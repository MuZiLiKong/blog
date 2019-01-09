package com.demo.dao;

import com.demo.model.bean.BasePersonLoginInfo;
import com.jfinal.plugin.activerecord.Db;

public class PersonLoginInfoDao {
	
		public int savePerson(BasePersonLoginInfo<?> bpl){
			String sql="insert into person_login_info("
							+ "sysid,user_name,phone,user_password,"
							+ "user_pass_salt,user_email,user_address,pass_problem1,pass_answer1,pass_problem2,pass_answer2,create_time,account_state,user_sfz) "
							+ "value(null,?,?,?,?,?,?,?,?,?,?,?,?,?)";
			return Db.update(bpl.getUserName(),bpl.getPhone(),bpl.getUserPassword(),bpl.getUserPassSalt(),bpl.getUserEmail(),bpl.getUserAddress(),bpl.getPassProblem1(),bpl.getPassAnswer1(),bpl.getPassProblem2(),bpl.getPassAnswer2(),bpl.getCreateTime(),bpl.getAccountState(),bpl.getUserSfz());
		}
		
		
		public int loginPerson(BasePersonLoginInfo<?> bpl){
			String sql="select * from person_login_info where user_name=? and user_password=?";
			return Db.update(sql,bpl.getUserName(),bpl.getUserPassword());
		
		}
}
