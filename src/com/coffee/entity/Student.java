package com.coffee.entity;

import java.util.Date;

public class Student
{
	public Integer id;
	public String name;
	public Boolean sex;
	public String phone;
	public Date birthday;
	
	//////////////////////////////////
	public Integer getId()
	{
		return id;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public void setId(Integer id)
	{
		this.id = id;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public Boolean getSex()
	{
		return sex;
	}
	public void setSex(Boolean sex)
	{
		this.sex = sex;
	}

	
	
	
}
