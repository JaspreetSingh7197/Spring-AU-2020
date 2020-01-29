package com.springau.springdemo2.services;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.springau.springdemo2.model.Employee;


public class EmployeeManager {
    ArrayList<Employee>l;
	public EmployeeManager()
	{
		l=new ArrayList<Employee>();
	}
	public void addEmployee(Employee ob)
	{
		l.add(ob);
		System.out.println("he");
	}
	
	public List<Employee> getALLEmployee(){
		System.out.println("getALLEmployee called");
		System.out.println(l);
		for(Employee el:l)
		{
			System.out.println(el.getEmpId()+ " "+ el.getEmpName());
		}
		/*for(int i=0;i<l.size();i++)
		{
			Employee x=this.l.i;
			System.out.println(x.getEmpId()+" "+x.getEmpName()+" "+x.getPos());
		}*/
		return new ArrayList<>();
	}
	
	public void createEmployee(Employee employee) {
		System.out.println("createEmployee");
	}
	
	public void deleteEmployee(Employee employee) {
		System.out.println("deleteEmployee");
	}
	
	public void updateEmployee(Employee employee) {
		System.out.println("updateEmployee");
	}
}

