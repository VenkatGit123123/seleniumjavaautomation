package org.javaprogramms.basic;

import java.util.Random;

public class GenerateRandomNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		int r1 = rand.nextInt(10000);
		System.out.println("Random numbers:"+r1);
		

	}

}
