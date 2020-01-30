package assignmentHiber;

public class cart {
    public String itemName;
    public int qty;
    public int total;
    public cart(String a,int b,int c)
    {
    	this.itemName=a;
    	this.qty=b;
    	this.total=c;
    }
	public String getItemName() 
	{
		return itemName;
	}
	public void setItemName(String itemName) 
	{
		this.itemName = itemName;
	}
	public int getQty()  
	{
		return qty;
	}
	public void setQty(int qty) 
	{
		this.qty = qty;
	}
	public int getTotal() 
	{
		return total;
	}
	public void setTotal(int total) 
	{
		this.total = total;
	}
	
}
