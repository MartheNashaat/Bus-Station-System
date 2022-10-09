package javaApp;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class externaltrips  {
	FileWriter fp ;
	BufferedWriter writeg;


	 ArrayList<externaldetails> externaltripdetails= new ArrayList<externaldetails>();
	
	 


	public void readtrip() throws FileNotFoundException {
		externaltripdetails.clear();
		File f3= new File ("Externaltrips.txt");
		Scanner k= new Scanner (f3);
		
		while (k.hasNext()){
		
		String tripdest2 = k.next();
		String eprice= k.next();
			
		externaldetails t = new externaldetails(tripdest2);
		t.setTripdest2(tripdest2);
		t.setEprice(eprice);
		externaltripdetails.add(t);
		}
		k.close();		
	}
	 
	
	public boolean tripdet( String dest ) {
		 
		 for (int i=0;i<externaltripdetails.size();i++) {
			 if (externaltripdetails.get(i).getTripdest2().equals(dest))
				
		
		 {
			 return true;
		
		 }
		 }
		return false;
		 
		 
	 }
	public String getprice (String dest) {
		 
		 for (int i=0;i<externaltripdetails.size();i++) {
			 if (externaltripdetails.get(i).getTripdest2().equals(dest))
				  return  (externaltripdetails.get(i).getEprice());
				  
			  }
		 
		return "";	
	
		
	}
	

	public void writeext(String z1) throws IOException { 
		fp = new FileWriter("Externaltrips.txt", true);
			writeg = new BufferedWriter(fp); 
			writeg.write(z1);
		    writeg.newLine();
		    writeg.close();
		    System.out.println("reached writer");
		    
	}
	


		public static void main(String[] args) throws FileNotFoundException {
			Gui gui=new Gui();
			externaltrips r = new externaltrips ();
			
			r.readtrip();
			
			// TODO Auto-generated method stub

	}
	}

	
	
