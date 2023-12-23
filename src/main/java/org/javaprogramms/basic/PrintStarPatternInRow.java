package org.javaprogramms.basic;
import java.util.*;

public class PrintStarPatternInRow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num of rows");
		int rows = sc.nextInt();
		printStars(rows);
	}
	
	public static void printStars(int n)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<=i;j++) 
			{
				System.out.println("* ");
			}
			
			System.out.println();
		}
		
		

	}

}
