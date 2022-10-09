package javaApp;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Manageraccess {
	
	

String manusername = "admin";
String manpassword ="123";




public boolean check(String validate, String passcheck) {
	 
	Manager man= new Manager(manusername,manpassword);
	
	man.setManusername(manusername);
	man.setMaspassword(manpassword);
	System.out.println(manusername);
	System.out.println(manpassword);
	String m=man.getManusername();
	String n= man.getMaspassword();
	
	 if(m.equals(validate))
	 if (n.equals(passcheck))
	 {
		 return true;
	 }else
		 return false;
	 
	return false;
	 
	 
}

	


	public static void main(String[] args) throws FileNotFoundException {
		Gui gui=new Gui();
		Manageraccess a = new Manageraccess();
		
		//a.check(gui.str);
		// TODO Auto-generated method stub

}
}
