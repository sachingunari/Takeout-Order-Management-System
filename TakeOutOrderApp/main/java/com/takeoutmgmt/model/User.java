package com.takeoutmgmt.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
	
@Id
@Column	
private int user_Id;
@Column
private String email;
@Column
private String username;
@Column
private String password;
@Column
private String access_level;




public User(){}
public User(int user_Id, String email, String username, String password, String access_level) {
	super();
	this.user_Id = user_Id;
	this.email = email;
	this.username = username;
	this.password = password;
	this.access_level = access_level;
}


public int getUser_Id() {
	return user_Id;
}
public void setUser_Id(int user_Id) {
	this.user_Id = user_Id;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getAccess_level() {
	return access_level;
}
public void setAccess_level(String access_level) {
	this.access_level = access_level;
}



}
