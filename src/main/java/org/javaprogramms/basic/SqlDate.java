package org.javaprogramms.basic;

public class SqlDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long millis = System.currentTimeMillis();
		java.sql.Date date = new java.sql.Date(millis);
		System.out.println(date);

	}

}
