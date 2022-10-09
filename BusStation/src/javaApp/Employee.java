package javaApp;

public abstract class Employee {


	 
	    private String username;
	    private String password;
	    

	    public Employee(float salary, String username, String password) {
	      
	        this.username = username;
	        this.password = password;
	       
	    }
	    
	    public String getUsername() {
	        return username;
	    }

	    public void setUsernamre(String username) {
	        this.username = username;
	    }

	    public String getPassword() {
	        return password;
	    }

	    public void setPassword(String password) {
	        this.password = password;
	    }
	    
	   
	}
	 




