package org.javaprogramms.basic;

import java.io.IOException;

public class OpenNotepad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runtime rs = Runtime.getRuntime();
		try {
			rs.exec("notepad");
		} 
		catch(IOException e) {
			System.out.println(e);
		}

	}

}
