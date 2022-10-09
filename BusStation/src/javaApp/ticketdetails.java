package javaApp;


import java.io.FileNotFoundException;

import java.util.ArrayList;

public abstract class ticketdetails {
		private String tripdestination; 
	    private String captain;
	    private boolean roundsingletrip;
	    private float price;
		public String getTripdestination() {
			return tripdestination;
		}
		public void setTripdestination(String tripdestination) {
			this.tripdestination = tripdestination;
		}
		public String getCaptain() {
			return captain;
		}
		public void setCaptain(String captain) {
			this.captain = captain;
		}
		public boolean isRoundsingletrip() {
			return roundsingletrip;
		}
		public void setRoundsingletrip(boolean roundsingletrip) {
			this.roundsingletrip = roundsingletrip;
		}
		public float getPrice() {
			return price;
		}
		public void setPrice(float price) {
			this.price = price;
		}
		public ticketdetails(String tripdestination, String captain, boolean roundsingletrip, float price) {
			super();
			this.tripdestination = tripdestination;
			this.captain = captain;
			this.roundsingletrip = roundsingletrip;
			this.price = price;
		}
	    
		
		    public abstract void writeToFile(ArrayList<ticketdetails> trips) throws FileNotFoundException ; 
		    public abstract ArrayList<ticketdetails> readfromFile() throws FileNotFoundException;

}
