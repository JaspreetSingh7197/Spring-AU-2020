package package2;

public class Point {
	int x;
	int y;
	public Point()
	{
		System.out.println("Inside Point class");
	}
	public Point(int a, int b)
	{
		this.x = a;
		this.y = b;
	}
	
	public void show() 
	{	
		System.out.println("X="+this.x+" Y="+this.y);
	}
}
