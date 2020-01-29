package com.springau.springass1.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springau.springass1.models.Employee;
import com.springau.springass1.models.EmployeeManager;
//import com.springau.springass1.models.StudentManager;

public class App {

	public static void main(String[] args) {
	
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Employee emp = (Employee)context.getBean("emp1");
		String s=emp.getName();
		System.out.println(s);
		EmployeeManager em = context.getBean(EmployeeManager.class);
		em.show();
	}
}
