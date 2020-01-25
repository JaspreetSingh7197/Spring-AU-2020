import java.util.Date;
import java.util.*;
import java.time.*;
import java.time.temporal.ChronoUnit;

public class timerelated
{
    
    public static void timediffNano(int a,int b,int c,int d,int e,int f)
    {
        LocalDateTime date1=LocalDateTime.of(a,b,c,0,0,0,0);
        LocalDateTime date2=LocalDateTime.of(d,e,f,0,0,0,0);
        long diffInNanos=ChronoUnit.NANOS.between(date1,date2);
        System.out.println("Difference between 2 dates is "+ diffInNanos);
    }
	public static void main(String[] args)
	{
          Scanner obj=new Scanner(System.in);
          System.out.println("Enter your date of birth in format dd/mm/yyyy");
          String your=obj.next();
          System.out.println("Enter your father's date of birth in format dd/mm/yyyy");
          String fath=obj.next();
          string y[]=your.split("/");
          string f[]=fath.split("/");
          int dy=Integer.parseInt(y[0]);  
	  int my=Integer.parseInt(y[1]);
       	  int yy=Integer.parseInt(y[2]);
	  int fd=Integer.parseInt(f[0]);
	  int fm=Integer.parseInt(f[1]);
	  int fy=Integer.parseInt(f[2]);
          timediffinNano(yy,my,dy,fy,fm,fd);
        }
}
