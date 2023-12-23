package org.javaprograms.strings;

public class StringCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Hello";
		String s2 = new String("Hello");
//		
//		if(s1==s2)
//		{
//			System.out.println("Both are same");
//		}
//		else
//		{
//			System.out.println("Both  not same");
//		}
		
		if(s1.equals(s2))
		{
			System.out.println("Both are same");
		}
		else {
			System.out.println("Both not  same");
		}

	}

}
