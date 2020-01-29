package package3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import package2.Point;

@Service
public class MyWire {
	@Autowired
	Point p1;
	
	public void getDetails() {
		p1.show();
	}

}
