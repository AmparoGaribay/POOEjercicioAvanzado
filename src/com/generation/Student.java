package com.generation;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Student
{
    private String name;
    private String id;
    private int age;
    public final List<Course> courseList = new ArrayList<>();///constante

    public Student( String name, String id, int age)
    {
        this.name = name;
        this.id = id;
        this.age = age;
    }//constructor

	public String getName() {
		return name;
	}//get

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}//get

	public void setId(String id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}//get

	public void setAge(int age) {
		this.age = age;
	}

	public List<Course> getCourseList() {//solo lectura
		return courseList;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", age=" + age + ", courseList=" + courseList + "]";
	}


    //---------------------------------getts and setts
    
	
    
}