package org.javaprogramms.basic;
import java.io.*;  
public class WriteDataIntoTextFiles {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String fileContent = "This is Java interview question";
		BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\krish\\OneDrive\\Desktop\\samplefile.txt"));

	    writer.write(fileContent);
	    writer.close();
	}

}
