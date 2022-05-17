package com.jobiak.mvc.model;
import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.Table;
//JPA->is a standard and a specification for developing ORM frameworks
//ORM->Object Relation Mapping
//bean,model,CommandObject,Entity
@Entity
@Table(name="userdetails")
public class User {
	
	
    @Id//primary key
    private Long userId;
	private String name;
	
	private String email;
	private Long mobile;
	
	public User() {
		// TODO Auto-generated constructor stub
	}

	
	public Long getUserId() {
		return userId;
	}


	public void setUserId(Long userId) {
		this.userId = userId;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getMobile() {
		return mobile;
	}

	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}
}
