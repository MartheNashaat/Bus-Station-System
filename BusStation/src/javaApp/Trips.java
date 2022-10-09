package javaApp;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Trips {

	ArrayList<trip> tripdetailsinternal = new ArrayList<trip>();

	public void readtrips() throws FileNotFoundException {
tripdetailsinternal.clear();
		File f4 = new File("internaltrips.txt");
		Scanner k = new Scanner(f4);

		while (k.hasNext()) {

			String tripdestt = k.next();
			String price=k.next();
			trip rr = new trip(tripdestt);
			rr.setTripdestt(tripdestt);
			rr.setPrice(price);
			tripdetailsinternal.add(rr);
		}
		k.close();

	}

	public boolean tripdet(String dest) {

		for (int i = 0; i < tripdetailsinternal.size(); i++) {
			if (tripdetailsinternal.get(i).getTripdestt().equals(dest))
			{
				return true;
			}
		}
		return false;
	}
	
	public String getprice (String dest) {
		 
		 for (int i=0;i<tripdetailsinternal.size();i++) {
			 if (tripdetailsinternal.get(i).getTripdestt().equals(dest))
				  return  (tripdetailsinternal.get(i).getPrice());
				  
			  }
		 
		return "";	
	
		
	}
	

	public static void main(String[] args) throws FileNotFoundException {
		Gui gui = new Gui();
		Trips r = new Trips();

		r.readtrips();

		// TODO Auto-generated method stub

	}
}
