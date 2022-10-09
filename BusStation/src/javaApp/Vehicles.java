package javaApp;

public class Vehicles {
	 
	public int numberofseats;
	public String Driver;
	
	
}


class Car extends Vehicles{
	public int numberofseats=4;
	
			
	 
}
	 
class Bus extends Vehicles{
	public int numberofseats= 18;

	public int getNumberofseats() {
		return numberofseats;
	}

	public void setNumberofseats(int numberofseats) {
		this.numberofseats = numberofseats;
	}
	
 }
  
 class Limosine extends Vehicles{
	 public int numberofseats=1;
	 
	 
 }
 