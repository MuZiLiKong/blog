package com.demo.model.bean;

import com.jfinal.plugin.activerecord.Model;

import java.util.Date;

import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BasePersonLoginInfo<M extends BasePersonLoginInfo<M>> extends Model<M> implements IBean {

	public M setSysid(java.lang.Integer sysid) {
		set("sysid", sysid);
		return (M)this;
	}
	
	public java.lang.Integer getSysid() {
		return getInt("sysid");
	}

	public M setUserName(java.lang.String userName) {
		set("user_name", userName);
		return (M)this;
	}
	
	public java.lang.String getUserName() {
		return getStr("user_name");
	}

	public M setPhone(java.lang.Integer phone) {
		set("phone", phone);
		return (M)this;
	}
	
	public java.lang.Integer getPhone() {
		return getInt("phone");
	}

	public M setUserPassword(java.lang.String userPassword) {
		set("user_password", userPassword);
		return (M)this;
	}
	
	public java.lang.String getUserPassword() {
		return getStr("user_password");
	}

	public M setUserPassSalt(java.lang.String userPassSalt) {
		set("user_pass_salt", userPassSalt);
		return (M)this;
	}
	
	public java.lang.String getUserPassSalt() {
		return getStr("user_pass_salt");
	}

	public M setUserEmail(java.lang.String userEmail) {
		set("user_email", userEmail);
		return (M)this;
	}
	
	public java.lang.String getUserEmail() {
		return getStr("user_email");
	}

	public M setUserAddress(java.lang.String userAddress) {
		set("user_address", userAddress);
		return (M)this;
	}
	
	public java.lang.String getUserAddress() {
		return getStr("user_address");
	}

	public M setPassProblem1(java.lang.String passProblem1) {
		set("pass_problem1", passProblem1);
		return (M)this;
	}
	
	public java.lang.String getPassProblem1() {
		return getStr("pass_problem1");
	}

	public M setPassAnswer1(java.lang.String passAnswer1) {
		set("pass_answer1", passAnswer1);
		return (M)this;
	}
	
	public java.lang.String getPassAnswer1() {
		return getStr("pass_answer1");
	}

	public M setPassProblem2(java.lang.String passProblem2) {
		set("pass_problem2", passProblem2);
		return (M)this;
	}
	
	public java.lang.String getPassProblem2() {
		return getStr("pass_problem2");
	}

	public M setPassAnswer2(java.lang.String passAnswer2) {
		set("pass_answer2", passAnswer2);
		return (M)this;
	}
	
	public java.lang.String getPassAnswer2() {
		return getStr("pass_answer2");
	}

	public M setCreateTime(java.util.Date createTime) {
		set("create_time", createTime);
		return (M)this;
	}
	
	public java.util.Date getCreateTime() {
		return new Date();
	}

	public M setAccountState(java.lang.Integer accountState) {
		set("account_state", accountState);
		return (M)this;
	}
	
	public java.lang.Integer getAccountState() {
		return getInt("account_state");
	}

	public M setUserSfz(java.lang.String userSfz) {
		set("user_sfz", userSfz);
		return (M)this;
	}
	
	public java.lang.String getUserSfz() {
		return getStr("user_sfz");
	}

}
