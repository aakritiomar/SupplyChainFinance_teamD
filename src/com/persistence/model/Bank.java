package com.persistence.model;

import java.sql.Date;
import java.util.Map;

public class Bank {
	private String swift_id;
private String bank_name;
private int reg_no;
private String acc_no;
private Map<String,String> nostro_accounts;
private String category;
private String dir_name;
private Date d;
private String address;
private int contact;
private String pan_no;
public Bank(String swift_id,String bank_name, int reg_no, String acc_no, Map<String, String> nostro_accounts, String category,
		String dir_name, Date d, String address, int contact, String pan_no) {
	super();
	this.swift_id=swift_id;
	this.bank_name = bank_name;
	this.reg_no = reg_no;
	this.acc_no = acc_no;
	this.nostro_accounts = nostro_accounts;
	this.category = category;
	this.dir_name = dir_name;
	this.d = d;
	this.address = address;
	this.contact = contact;
	this.pan_no = pan_no;
}
public String getSwift_id() {
	return swift_id;
}
public void setSwift_id(String swift_id) {
	this.swift_id = swift_id;
}
public String getBank_name() {
	return bank_name;
}
public void setBank_name(String bank_name) {
	this.bank_name = bank_name;
}
public int getReg_no() {
	return reg_no;
}
public void setReg_no(int reg_no) {
	this.reg_no = reg_no;
}
public String getAcc_no() {
	return acc_no;
}
public void setAcc_no(String acc_no) {
	this.acc_no = acc_no;
}
public Map<String, String> getNostro_accounts() {
	return nostro_accounts;
}
public void setNostro_accounts(Map<String, String> nostro_accounts) {
	this.nostro_accounts = nostro_accounts;
}
public String getCategory() {
	return category;
}
public void setCategory(String category) {
	this.category = category;
}
public String getDir_name() {
	return dir_name;
}
public void setDir_name(String dir_name) {
	this.dir_name = dir_name;
}
public Date getD() {
	return d;
}
public void setD(Date d) {
	this.d = d;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public int getContact() {
	return contact;
}
public void setContact(int contact) {
	this.contact = contact;
}
public String getPan_no() {
	return pan_no;
}
public void setPan_no(String pan_no) {
	this.pan_no = pan_no;
}

}

/*create table bank(swift_id varchar(12) primary key,
bank_name varchar(40) not null,
reg_no numeric(10),
acc_no varchar(40),
nostro_accounts jsonb,
category varchar(40),
dir_name varchar(40),
date_of_incorp date,
address varchar(100),
contact numeric(13) not null,
pan_no varchar(12) not null);*/