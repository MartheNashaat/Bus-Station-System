package javaApp;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Captain extends Employee {

	public Captain(float salary, String username, String password) {
		super(salary, username, password);
		
		
		
	}
	
	

	public ArrayList<Employee> readfromFile() throws FileNotFoundException {
	       
	        ArrayList<Employee> list=new ArrayList<Employee>();
	        File ff = new File ("Captains.txt");
	        Scanner kk=new Scanner(ff);
	        while(kk.hasNext())
	        {
	            String usern=kk.next();
	            String pass=kk.next();
	            
	            Captain c=new Captain(0, usern,pass);
	            list.add(c);
	            
	        }
	        kk.close();
	        
	        return list;    

}
	 }
