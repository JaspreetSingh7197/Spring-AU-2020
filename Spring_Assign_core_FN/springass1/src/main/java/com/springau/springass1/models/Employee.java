package com.springau.springass1.models;

public class Employee {
	private String name;
	private Integer id;
	
	public Employee(String firstname, Integer id){
		this.name=firstname;
		this.id=id;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", emp Id=" + id + "]";
	}
}
