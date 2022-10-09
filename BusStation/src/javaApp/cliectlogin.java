package javaApp;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class cliectlogin<customerlogin>  {
	
	
public JFrame frame3;
public JFrame profile;
public String str;
 ArrayList<customer> customerlogin= new ArrayList<customer>();

public void reads() throws FileNotFoundException {
	
	File f = new File ("CustomersProfiles.txt");
	Scanner x= new Scanner (f);
	
	while (x.hasNext()){
		String username = x.next();
		String password = x.next();
		customer s = new customer(username,password);
		s.setUsername(username);
		s.setPassword(password);
		customerlogin.add(s);
		  
	}
	x.close();	
	
}

 public boolean check(String validate, String passcheck) {
	 
	 for (int i=0;i<customerlogin.size();i++) {
	 if(customerlogin.get(i).getUsername().equals(validate))
	 if (customerlogin.get(i).getPassword().equals(passcheck))
	 {
		 return true;
	 }else
		 return false;
	 }
	return false;
	 
 }
	public static void main(String[] args) throws FileNotFoundException {
		Gui gui=new Gui();
		cliectlogin a = new cliectlogin();
		a.reads();
		
		

}
}
