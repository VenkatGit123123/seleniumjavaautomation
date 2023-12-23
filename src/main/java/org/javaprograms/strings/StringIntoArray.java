package org.javaprograms.strings;

public class StringIntoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Hello, this is a book on java";
		char arr[] = new char[20];
		
		
		//copy from str into arr starting from 7th character to 20th
		str.getChars(7, 21, arr, 0);
		System.out.println(arr);

	}

}
