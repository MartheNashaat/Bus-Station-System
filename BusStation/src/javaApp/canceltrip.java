package javaApp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

import javax.swing.JOptionPane;

public class canceltrip {
	
	public void deleteExTrip(String filename,String trip) throws Exception
	{
		System.out.println("Called");
		File inputFile = new File(filename);  
		File tempFile = new File("myTempFile.txt");
		
		BufferedReader reader = new BufferedReader(new FileReader(inputFile));
		BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

		String lineToRemove = trip;
		String currentLine;
		

		while((currentLine = reader.readLine()) != null) {
                    
                   
			String trimmedLine = currentLine.trim();
                        
                         
		    if(trimmedLine.contains(lineToRemove)) 
		    	{
		    	
		    	continue;
		    	//break;
		    	}
		    writer.write(currentLine + System.getProperty("line.separator"));
		}

		
		
		
		
		
		writer.close(); 
		reader.close(); 
		boolean successful = inputFile.delete();
		boolean successful2 = tempFile.renameTo(inputFile);
		
		
	}
	
	public static void main (String args[]) throws FileNotFoundException
	{
		Gui gh= new Gui();
	
	}
	}
	


