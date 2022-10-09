package javaApp;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ticketdets {
	FileWriter ft;
	BufferedWriter w;
	
	
	
	
	public void writedetails(String xx) throws IOException { 
		ft = new FileWriter("annetrips.txt", true);
    w = new BufferedWriter(ft); 
    w.newLine();
	w.write(xx);	   
	w.close();
		    
		
		    
		    
	}

}
