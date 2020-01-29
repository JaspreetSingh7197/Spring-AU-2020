package com.springau.springdemo2.model;
import com.springau.springdemo2.services.*;
public class Employee {
	public Integer empId;
	public String empName;
	public String pos;
	
	public Employee(Integer a,String b,String c)
	{
		System.out.println("Inside employee");
		this.empId=a;
		this.empName=b;
		this.pos=c;
	}

	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getPos() {
		return pos;
	}
	public void setPos(String pos) {
		this.pos = pos;
	}
	
}
