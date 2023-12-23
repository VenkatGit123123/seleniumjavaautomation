package org.javaprogramms.IO;
import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("Enter Id name sal: ");
		Scanner sc = new Scanner(System.in);
		
		int id = sc.nextInt();
	    String name = sc.next();
	    float sal = sc.nextFloat();
	    
	    System.out.println("Id= "+ id);
	    
	    System.out.println("Name= "+ name);
	    
	    System.out.println("Sal= "+ sal);

	}

}
