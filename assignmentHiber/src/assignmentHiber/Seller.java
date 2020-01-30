package assignmentHiber;

import java.util.ArrayList;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="shop")
public class Seller {
   public String sname;
   @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
   public int sid;
   
   @Embedded
	address address = new address();
   
   @OneToMany(mappedBy="selid")
   public ArrayList<item>it;
   
   
public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}
public int getSid() {
	return sid;
}
public void setSid(int i) {
	this.sid = i;
}
    
}
