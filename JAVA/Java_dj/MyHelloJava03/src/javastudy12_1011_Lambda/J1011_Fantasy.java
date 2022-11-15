package javastudy12_1011_Lambda;
import java.util.*;
import java.util.ArrayList;

public class J1011_Fantasy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<FantasticBeast> fantasies = new ArrayList<FantasticBeast>();
		fantasies.add(new Dragon());
		fantasies.add(new Unikorn());
		fantasies.add(new FantasticBeast() {
			@Override	//sleep ctrl space 
			public void sleep() {
				// TODO Auto-generated method stub
				super.sleep();
			}
			
		});
	}

}
