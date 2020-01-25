import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)  
@Target(ElementType.METHOD) 
public @interface myannotate {
	int a() default 101;
	String b() default "default value";
}

class Hello{  
@MyAnnotation(a=10 ,b= "not default")  
public void mymethod(){System.out.println("Hello world");}  
}



