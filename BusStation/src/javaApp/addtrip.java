package javaApp;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class addtrip{
	FileWriter fw,fw1,fw2 ;
	BufferedWriter writes,writes2,writes3;
	
	
	public void addtofile() throws IOException {

   
    
   
}
	
	public void writer(String x1) throws IOException { 
		fw = new FileWriter("internaltrips.txt", true);
    writes = new BufferedWriter(fw); 
			writes.write(x1);
		    writes.newLine();
		    writes.close();
		    
		
		    
		    
	}

	public void writerext(String y1) throws IOException { 
		fw1 = new FileWriter("Externaltrips.txt", true);
		writes2 = new BufferedWriter(fw1); 
		writes2.newLine();
		writes2.write(y1);
		writes2.close();
		
		
		    		    
	}
	
	
	public void ticketdetails(String y1	) throws IOException {
		fw2 = new FileWriter("Transtypes.txt", true);
		writes3 = new BufferedWriter(fw2); 
		writes3.newLine();    
		writes3.write(y1);
		    
		    writes3.close();
		 
}
	
	
	
	
	public static void main (String args[]) throws IOException {
		Gui gui=new Gui();
		addtrip a = new addtrip();
		a.addtofile();
		
		
	}
	

}