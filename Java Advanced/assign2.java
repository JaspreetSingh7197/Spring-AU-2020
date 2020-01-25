import java.util.*;
import java.util.function.*;

@FunctionalInterface
 interface TriConsumer
{
	void accept(Integer t,Integer u,Integer v);
}
public class assign2
{
	public static void main(String args[])
	{
		int a=6,b=6,c=7;
         TriConsumer objc=(x,y,z) -> { int d=x+y+z; System.out.println("The sum of two integers is "+ d); };
         objc.accept(a,b,c);
	}
}
