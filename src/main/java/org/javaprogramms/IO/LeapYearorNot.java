package org.javaprogramms.IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LeapYearorNot {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		//accept year
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter Year no: ");
		int year = Integer.parseInt(br.readLine());
		
		//if it is century year divisible by 400
		if(year % 100 ==0 && year % 400==0)
		System.out.println("It is leap");
		
		//if it is not a century year and divisible by 4
		else
		if(year % 100 !=0 && year % 4==0)
		System.out.println("It is leap");
		//otherwise is not a leap year
		else
			System.out.println("It is not leap");

		
	}

}
