package mypackage;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import package3.MyWire;



public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
		MyWire service = (MyWire) context.getBean(MyWire.class);
		service.getDetails();
	}

}
