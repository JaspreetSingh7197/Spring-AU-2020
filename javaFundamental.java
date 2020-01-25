import java.util.ArrayList;

import java.util.Scanner;

class order {
    int id;
    ArrayList<product> p;
      order(int d,ArrayList<product> p)
      {
        this.id = d;
        this.p = p;
      }
}

class product {
   int pid;
   int pq;
   int prt;
   String pnam;
      product(int a,String b,int c,int d)
      {
        this.pid = a;
        this.pnam=b;
        this.pq = c;
        this.prt = d;
      }
}

public class java_Fundamental 
{
   static  ArrayList<product> c = new ArrayList<product>();
   static  ArrayList<product> pr = new ArrayList<>();
   static   ArrayList<order> od = new ArrayList<>();
	 static int total = 0;
	public static void main(String[] args) {
	pr.add(new product(1,"kurkure",10,10));
	pr.add(new product(2,"Magnum",10,50));
	pr.add(new product(3,"Sugar",10,30));
  pr.add(new product(4,"5 Star",10,20));
	int x=1;
	while(x==1) {
		System.out.println("Press 1 to add item to the cart\nPress 2 to remove item from the cart\nPress 3 View the items in the cart\nPress 4 to place the order\nPress 5 to exit");
		Scanner scan = new Scanner(System.in);
		int ch = scan.nextInt();
    switch(ch)
    {
		case 1:
    {     
        addCart();
        break;
    }             
		case 2:
    {    
         viewMyCart();
         break;
		}
    case 3:
    {    
        removeCart();
        break;
    }
		case 4: 
    {
			 placeOrd();
       break;
		}
		case 5:
       System.exit(0);
	
	}
}
}
 static void addCart()
  {
		    int i=0;
		    System.out.println("Product Window");
          	for(product p : pr)
            {
              System.out.println("Product id: "+p.pid+"  "+"Name "+p.pnam+"  "+"Qty: "+p.pq+"  "+"Rate:"+p.prt);
          	}
          	System.out.println("Enter the Product Id and Quantity to add to cart");
          	Scanner scan = new Scanner(System.in);
          	int ids = scan.nextInt();
          	int q = scan.nextInt();
          	for(product p:pr)
            {
          		if(ids==p.pid) 
              {
          			if(p.pq>=q) 
                {
          				c.add(new product(p.pid,p.pnam,q,q*p.prt));
          			}else {
          				System.out.println("Product Not Available");
          			}
          		}
          	}
	}
	static void viewMyCart() {
		System.out.println("items in the cart:");
		for(product ca : c){
            System.out.println("Product id: "+ca.pid+"  "+"Product Name: "+ca.pnam+"  "+"Product Quantity: "+ca.pq+"  "+"Product Price:"+ca.prt);          		
        	}
	}
	static void removeCart() 
  {
	 		 	System.out.println("Enter the valid Product Id to Remove item from the cart");
      	Scanner scan = new Scanner(System.in);
      	int idd = scan.nextInt();
      	for(int i=0;i<c.size();i++)
        {
      		if(idd==c.get(i).pid) {
      			if(c.get(i).pq>1) 
            {
      				 c.get(i).prt =c.get(i).prt-(c.get(i).prt/c.get(i).pq); 
      				 c.get(i).pq = c.get(i).pq-1;
      			}
      			else if(c.get(i).pq==1){
               c.remove(c.indexOf(c.get(i)));
               }
               else
               {
                 System.out.println("No such item exits");
               }
      		}
      	}
      	System.out.println("item removed and cart has:");
      	viewMyCart();
	}
	static void placeOrd() {
		viewMyCart();
	  Scanner scan=new Scanner(System.in);
		for(product p:c)
    {
      	  total = total+p.prt;
    }
    System.out.println("Enter orderId as provided to you by SMS");
		int oid = scan.nextInt();
		od.add(new order(oid,c));
		for(product p:c)
     {
			for(product q:pr) {
				if(p.pid==q.pid) {
					q.pq = q.pq-p.pq;
				}
			}
		}
		System.out.println("order placed with total amount : "+total+" and order id :"+oid);
		c.clear();
	}

}
