package org.javaprograms.strings;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringBufferClassMethods {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//creating empty string buffer object
		StringBuffer sb = new StringBuffer();
		
		//to accept data from keyboard
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//accept surname
		System.out.print("Enter surname: ");
		String sur = br.readLine();
		
		//accept middile name
		System.out.print("Enter midname: ");
		String mid = br.readLine();
		
		//accept lastname
		System.out.print("Enter lastname: ");
		String last = br.readLine();
		
		//append sur to sb
		sb.append(sur);
		
		//append last to sb
		sb.append(last);
		
		//display the name till now
		System.out.println("Name= "+sb);
		
		//insert mid after sur name in sb
		int n = sur.length(); //n represents no.of characters  in sur name
		sb.insert(n, mid);
		
		
		//display fullname
		System.out.println("Full name= "+ sb);
		
		//reverse and display the name
		System.out.println("In reverse= "+ sb.reverse());
				
		

	}

}
