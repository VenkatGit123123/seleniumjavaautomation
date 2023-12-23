package org.javaprogramms.basic;
import java.util.Scanner;

public class FahrenheitToCelsius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Input Temp in Fahrenheit: ");
		double fahr = sc.nextDouble();
		double cels = ((5*(fahr-32.0))/90);
		
		System.out.println(fahr+"degree fahrenheit is equal to"+cels+"in celsius");

	}

}
