import java.util.function.BiConsumer;
import java.util.*;
public class Myexception{
	public static void main(String args[])
	{
		int values[]={2,4,6,8};
		int k=0;
		func(values,k,wrapper((v,m)->System.out.println(v/m)));

    } 
    private static void func(int values[],int k,BiConsumer<Integer,Integer>x)
    {
    	for(int i:values)
    	{
    		x.accept(i,k);
    	}
    }
    private static BiConsumer<Integer,Integer> wrapper(BiConsumer<Integer,Integer>x)
    {
    	return(v,m)->{
    		try{
    			x.accept(v,m);
    		}
    		catch(ArithmeticException e)
    		{
    			System.out.println("Exception caught in wrapper lambda");
    		}
    	};
    }
}