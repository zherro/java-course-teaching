package br.com.learnjava.basic.chapI.fileio;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors

public class WriteToFile {
	
  public static void main(String[] args) {
	  
    try {
      FileWriter myWriter = new FileWriter("filename.txt");
//      myWriter.write("Files in Java might be tricky, but it is fun enough!\n"); 
//      myWriter.write("Files in Java might be tricky, but!");
//      myWriter.close();
      
      BufferedWriter bw = new BufferedWriter(myWriter);    
      
      bw.newLine();
      bw.append("teste");
      bw.append("teste");
      bw.append("teste");
      bw.close();
      
      
      // write the new string with the replaced line OVER the same file
      FileOutputStream fileOut = new FileOutputStream("notes.txt");
      fileOut.write("teste".getBytes());
      fileOut.close();
      
      System.out.println("Successfully wrote to the file.");
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
    
  }
}