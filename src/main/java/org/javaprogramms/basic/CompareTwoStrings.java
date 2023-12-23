package org.javaprogramms.basic;
import java.util.*;

public class CompareTwoStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first string");
		String first = sc.next();
		
		System.out.println("Enter second string");
		String second = sc.next();
		
		compare(first,second);
		
			
		
	}

	public static void compare(String s1,String s2)
	{
		if(s1.compareTo(s2)==0) {
			System.out.println("Strings are equal");
		}else
		{
			System.out.println("Strings are not equal");
		}
	}
}
