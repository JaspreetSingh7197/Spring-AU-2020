package assignmentHiber;
import javax.persistence.Embeddable;

@Embeddable
public class address {
	public String street;
	public int pincode;
		
		public String getStreet() {
			return street;
		}
		public void setStreet(String street1) {
			this.street = street1;
		}
		public int getPincode() {
			return pincode;
		}
		public void setPincode(int pincode) {
			this.pincode = pincode;
		}
		
	
}
