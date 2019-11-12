package com.games.GameSearch;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//import lombok.Builder;
//import lombok.Data;
//import lombok.Getter;
//import lombok.Setter;
//import lombok.ToString;

@Entity
//@Data
//@Setter
//@Builder
@Table(name = "Users")
public class User /* implements Serializable */ {
	@Id
	@Column(name = "NickName")
	private String nickName;
	@Column(name = "Name")
	private String name;
	@Column(name = "surName")
	private String surName;
	@Column(name = "mail")
	private String mail;
	@Column(name = "password")
	private String password;
	@Column(name = "adress")
	private String adress;
	@Column(name="homelat")
	private double homeLat;
	@Column(name="homelong")
	private double homeLong;
	@Column(name = "birthday")
	private Date birthday;
}