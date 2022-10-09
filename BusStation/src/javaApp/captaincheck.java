package javaApp;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JTextField;
public class captaincheck<captains> {
	
		
		

	public JTextField textField;
	public JFrame frame3;
	public JFrame profile;
	public String str;
	 ArrayList<captaingetters> captains= new ArrayList<captaingetters>();

	public void reads() throws FileNotFoundException {
		
		File f = new File ("CaptainsProfiles.txt");
		Scanner y= new Scanner (f);
		
		while (y.hasNext()){
			String capusername = y.next();
			String cappassword = y.next();
			captaingetters c = new captaingetters(capusername,cappassword);
			c.setCapusername(capusername);
			c.setCappassword(cappassword);
			captains.add(c);
		}
		y.close();	
		

		
	}
	 public boolean check(String validate, String passcheck) {
		 for (int i=0;i<captains.size();i++) {
		 if(captains.get(i).getCapusername().equals(validate))
		 if (captains.get(i).getCappassword().equals(passcheck))
		 {
			 return true;
		 }else
			 return false;
		
		 
		 
	 }
		return false;
	 }
		


		public static void main(String[] args) throws FileNotFoundException {
			Gui gui=new Gui();
			captaincheck a = new captaincheck();
			a.reads();
			
			// TODO Auto-generated method stub

	}
	}



