package com.zhngye.test;

import java.io.Serializable;

public class User implements Serializable,Cloneable{
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public User(Integer age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	private Integer age;
	private String name;
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "User [age=" + age + ", name=" + name + "]";
	}
	
}
