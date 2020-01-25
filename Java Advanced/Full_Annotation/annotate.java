import java.lang.reflect.Method;

public class annotate { 
	  
	public static void main(String args[])throws Exception{  
	  
	Hello h=new Hello();  
	Method m=h.getClass().getMethod("mymethod");  
	  
	MyAnnotation myano=m.getAnnotation(MyAnnotation.class);  
	System.out.println("integer value is: "+myano.myValue()+ "string value is "+ myano.mystrng());  
	
	
	}
}

