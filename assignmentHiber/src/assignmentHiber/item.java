package assignmentHiber;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@NamedQueries({@NamedQuery(name="GET_ALL_ITEMS", query="from item")})
public class item {
    
	public int id;
	
	public String name;
	
	@ManyToOne
	@JoinColumn(name="sid",nullable=false)
	public int getId() 
	{
		return id;
	}
	public void setId(int id) 
	{
		this.id = id;
	}
	/*public int getSellerid() 
	{
		return sellerid;
	}
	public void setSellerid(int sellerid) 
	{
		this.sellerid = sellerid;
	}*/
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	
}
