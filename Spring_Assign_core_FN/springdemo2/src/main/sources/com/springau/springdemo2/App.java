package com.springau.springdemo2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springau.springdemo2.model.Employee;
import com.springau.springdemo2.services.EmployeeManager;

@ComponentScan(basePackages = "com.springau.springdemo2")
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml"); 
        EmployeeManager m=context.getBean(EmployeeManager.class);
        m.addEmployee(new Employee(1,"abc","def"));
        m.addEmployee(new Employee(2,"ghi","jkl"));
        m.addEmployee(new Employee(3,"mno","pqr")); 
      //  m = context.getBean(EmployeeManager.class); 
        m.getALLEmployee();
       // manager.createEmployee(e);      
    }

	private static void EmployeeManager() {
		// TODO Auto-generated method stub
		
	}
}
