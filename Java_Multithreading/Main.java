import java.util.ArrayList;
import java.util.Scanner;
public class Main {


    static class market
    {
         String name;
         int qty;

        market(String a,int b)
        {
            this.name=a;
            this.qty=b;
        }


    }
     public static ArrayList<market> m;
     public static String fruits[]={"mango","guava","strawberry","apple"};
     public static void main(String[] args) 
     {
       m=new ArrayList<market>();
        m.add(new market("mango",5));
        m.add(new market("guava",5));
        m.add(new market("strawberry",5));
        m.add(new market("apple",5));
        for (int i = 0; i < 4; i++)
            new Thread(new producer(i,i,i,i), "producer_" + i).start();

        for (int i = 0; i < 4; i++)
            new Thread(new Consumer(i), "Consumer_" + i).start();
     }
    }


  class Consumer implements Runnable {
    int ind;

    public Consumer(int i) {
        ind = i;
    }

    @Override
    public void run() 
    {
        int a;
        String name = Thread.currentThread().getName();
        System.out.println(name + " started...");

        while (true) {
            Main.market mrkt=null;
            synchronized (Main.m) {
                String str=Main.fruits[ind];
                for(Main.market mkt:Main.m)
                {
                    if(mkt.name.equals(str))
                    mrkt=mkt;
                }
                int rem = mrkt.qty;
                if (rem > 0) 
                {
                    mrkt.qty-=1;
                    System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t" + name + " consumed 1 " +  str);
                    //Main.getInfo();
                    Main.m.notifyAll();

                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {
                        System.err.println(name + " " + e.getMessage());
                    }
                }

                try {
                    Main.m.wait();
                } catch (Exception e) {
                    System.err.println(name + " " + e.getMessage());
                }
            }
        }
    }
}

 class producer implements Runnable {
    int mango,guava,strawberry,apple;
    String name;
    
    public producer(int a, int b, int c, int d) 
    {
        this.mango = a;
        this.guava = b;
        this.strawberry = c;
        this.apple = d;
    }

    @Override
    public void run() {
        name = Thread.currentThread().getName();
        System.out.println(name + " started...");

        while(true) {
            synchronized (Main.m) {
                addFruit("mango", mango);
                addFruit("guava", guava);
                addFruit("strawberry", strawberry);
                addFruit("apple", apple);

                try {
                    Main.m.wait();
                } catch (Exception e) 
                {
                    System.err.println(name + " " + e.getMessage());
                }
            }
        }
    }
    public void addFruit(String fruit, int value)
    {
        /*
        Assumption:
        Considering (total) as total capacity & (current) as current threshold of fruit,
        Farmer can sell (x) fruits only if
                  (current) <= (total)
         */
        int b;
       // Main.market mkt;
        for(Main.market mkt:Main.m)
        {
            if(mkt.name.equals(fruit))
               b=1;
        

        int present = mkt.qty;
        if (present <= 3) {
            mkt.qty=mkt.qty+value;
            //System.out.println("\n" + name + " sold " + value + " " + fruit + "(s)");
            //Main.getInfo();
            Main.m.notifyAll();
        }
    }

        try {
            Thread.sleep(1000);
        } 
        catch (Exception e) 
        {
            System.err.println(name + " " + e.getMessage());
        }
    }
}      
