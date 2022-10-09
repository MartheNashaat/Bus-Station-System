package javaApp;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ben {
	 ArrayList<ben2> bentrips= new ArrayList<ben2>();

	public void readtrips() throws FileNotFoundException {

		File f4 = new File("benafflick.txt");
		Scanner ky = new Scanner(f4);

		while (ky.hasNext()) {

			String trip1 = ky.next();
			String trip2=ky.next();
			ben2 rrr = new ben2(trip1);
			rrr.setTrip1(trip1);
			rrr.setTrip2(trip2);
			bentrips.add(rrr);
		}
		ky.close();

	}
	public static void main(String[] args) throws FileNotFoundException {
		Gui gui=new Gui();
		ben a = new ben();
		a.readtrips();
		
		// TODO Auto-generated method stub

}


	

	
}
