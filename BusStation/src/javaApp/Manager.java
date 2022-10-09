package javaApp;

import java.util.ArrayList;

public class Manager {
String manusername;
String maspassword;
ArrayList<trip> tripdetailsinternal= new ArrayList<trip>();
ArrayList<Manager> a = new ArrayList<Manager>();


public Manager(String manusername2, String manpassword) {

}
public String getManusername() {
	return manusername;
}
public void setManusername(String manusername) {
	this.manusername = manusername;
}
public String getMaspassword() {
	return maspassword;
}
public void setMaspassword(String maspassword) {
	this.maspassword = maspassword;
}



}
