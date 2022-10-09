package javaApp;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class vehicletype  {



	 ArrayList<trans> transportation = new ArrayList<trans>();


	public void readtrips() throws FileNotFoundException {
		
		File f5= new File ("Transtypes.txt");
		Scanner kk= new Scanner (f5);
		
		while (kk.hasNext()){
		
		String transport= kk.next();		
		trans rr = new trans(transport);
		rr.setTransport(transport);
		transportation.add(rr);
				   
		}
		kk.close();	
		
			
	}
	 
	
	public boolean tripdet( String dest ) {
		 
		 for (int i=0;i<transportation.size();i++) {
			 if (transportation.get(i).getTransport().equals(dest))
		
		 {
			 return true;
		 }else
			 return false;
		 }
		return false;
		 
		 
	 }

		


		public static void main(String[] args) throws FileNotFoundException {
			Gui gui=new Gui();
			vehicletype ry = new vehicletype ();
			
			ry.readtrips();
		

	}
	}

	
	
