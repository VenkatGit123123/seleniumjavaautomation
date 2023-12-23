package org.javaprogramms.IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer; 

public class AirthmaticOperations {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//to accept data from keyboard
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//take input into str from keyboard
		System.out.println("Enter two numbers: ");
		
		String str = br.readLine();
		
		//split the string at comma
		StringTokenizer st = new StringTokenizer(str, ",");
		
		//take the two tokens into s1 and s2
		String s1 = st.nextToken();
		String s2 = st.nextToken();
		
		//trim the spaces in s1 and s2
		s1 = s1.trim();
		s2 = s2.trim();
		
		//convert s1 and s2 into double type and store in n1 and n2
		double n1 = Double.parseDouble(s1);
		double n2 = Double.parseDouble(s2);
		
		//perform the Airthmatic operations
		System.out.println("Result of addition: "+ (n1 + n2));
		System.out.println("Result of subtraction: "+ (n1 - n2));
		System.out.println("Result of multiolication: "+ (n1 * n2));
		System.out.println("Result of division: "+ (n1 / n2));

	}

}
