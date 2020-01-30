package assignmentHiber;

import java.util.ArrayList;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args)
    {
    	ArrayList<itemtype>al=new ArrayList<itemtype>();
    	ArrayList<itemSmall>is=new ArrayList<itemSmall>();
    	ArrayList<itemBig>ib=new ArrayList<itemBig>();
    	ArrayList<cart>clist=new ArrayList<cart>();
    	Seller s1=new Seller();
    	Seller s2=new Seller();
    	
    	s1.setSname("abdul");
    	s1.setSid(1);
    	
    	s2.setSname("omdev");
    	s2.setSid(2);
    	
    	itemSmall i1=new itemSmall();
    	itemBig i2=new itemBig();
    	itemSmall i3=new itemSmall();
    	itemBig i4=new itemBig();
    	
    	i1.setName("Flower");
    	i1.setId(1);
    	
    	i1.setPrice(50);
    	al.add(new itemtype(i1.getId(),i1.getSize()));
    	//i1.setSize("small");
    	
    	//String str1=i1.getSize();
    	//System.out.println(str1);
    	
    	i2.setName("Candle");
    	i2.setId(2);
    	
    	i2.setPrice(60);
    	al.add(new itemtype (i2.getId(),i2.getSize()));
    	//i1.setSize("big");
    	
    	i3.setName("Lays");
    	i3.setId(3);
    	
    	i3.setPrice(10);
    	al.add(new itemtype (i3.getId(),i3.getSize()));
    	//i1.setSize("");
    	
    	i4.setName("5star");
    	i4.setId(4);
    	i4.setPrice(20);
    	al.add(new itemtype (i4.getId(),i4.getSize()));
    	is.add(i1);
    	is.add(i3);
    	
    	SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
    	Session session =sessionFactory.openSession();
    	session.beginTransaction();
    	session.save(s1);
    	session.save(i1);
        
    	
    	
    	
    	
    	session.getTransaction().commit();
    	session.close();

    	System.out.println("Press 1 for adding to cart\nPress 2 for checking cart\nPress 3 to order \nPress 4 to exit ");
    	Scanner sc=new Scanner(System.in);
    	int ch=sc.nextInt();
    	switch(ch)
    	{
        	case 1:
        	{
        		//cart crt=new cart();
        		int pri=0;
        		System.out.println("Add the object id of the object and quantity you want to add");
        		int objid=sc.nextInt();
        		int qtt=sc.nextInt();
        		String str2="asd";
        		for(itemtype it:al)
        		{
        			if(it.getI()==objid)
        			{
        				str2=it.getStr(); 
        			}
        		}
        		
        		if(str2=="small")
        		{
        			for(itemSmall itm1: is)
        	        {
        				if(itm1.getId()==objid) 
        				{
        	               clist.add(new cart(itm1.getName(),qtt,qtt*itm1.getPrice()));  
        	            }
        	        }
        		}
        		else
        		{
        			for(itemBig itm1: ib)
        			{
        				if(itm1.getId()==objid)
        				{
        					clist.add(new cart(itm1.getName(),qtt,qtt*itm1.getPrice()));
        				}
        			}
        		}
        		break;
        	}
        	
        	case 2:
        	{
        		System.out.println("The cart has these items:");
        		{
        			for(cart c:clist)
        			{
        				System.out.println(c.getItemName()+" "+c.getQty()+" "+c.getTotal());
        			}
        		}
        		break;
        	}
        	
        	case 3:
        	{
        		System.out.println("Order placed");
        		//query to fetch total amount
        	}
        	
        	case 4:
        	{
        		System.exit(0);
        	}
    	}
    	
    	
    }
}
