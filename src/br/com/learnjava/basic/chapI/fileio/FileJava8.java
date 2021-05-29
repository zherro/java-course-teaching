package br.com.learnjava.basic.chapI.fileio;

import java.io.File;
import java.io.IOException;

public class FileJava8 {
	
	void createFile(String name) throws IOException {
		 File newFile = new File(name);
		 boolean success = newFile.createNewFile();
		 
		 System.out.println("Arquivo " + name + " criado!");
	}
	
	public static void main(String[] args) throws IOException {
		FileJava8 file = new FileJava8();
		
		file.createFile("java8File.txt");
	}

}
