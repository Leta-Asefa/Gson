package com.Leta;

import com.google.gson.Gson;

public class Student {
String name;
int age;
String department;
boolean isActive;


public Student() {
}


public Student(String name, int age, String department, boolean isActive) {
	
	this.name = name;
	this.age = age;
	this.department = department;
	this.isActive = isActive;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getDepartment() {
	return department;
}
public void setDepartment(String department) {
	this.department = department;
}
public boolean isActive() {
	return isActive;
}
public void setActive(boolean isActive) {
	this.isActive = isActive;
}


@Override
public String toString() {
	return "Student [name=" + name + ", age=" + age + ", department=" + department + ", isActive=" + isActive + "]";
}

public String toJson() {
	Gson gson=new Gson();
	return gson.toJson(this);
}

public static Student fromJson(String json) {
	Gson gson=new Gson();
	return gson.fromJson(json, Student.class);
}

























}
