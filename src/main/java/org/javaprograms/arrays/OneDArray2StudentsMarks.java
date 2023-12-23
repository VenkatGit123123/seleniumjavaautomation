package org.javaprograms.arrays;
import java.io.*;

public class OneDArray2StudentsMarks {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		//to accept data from keyboard
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//ask how many subjects
		System.out.print("How many subjects? ");
		int n = Integer.parseInt(br.readLine());
		
		//create one dimensional array with size n
		int[] marks = new int[n];
		
		//store elements into the array
		for(int i=0; i<n; i++)
		{
			
			System.out.print("Enter Marks: ");
			marks[i] = Integer.parseInt(br.readLine());
		}
		
		
		//find total marks
		int tot = 0;
		for(int i=0; i<n; i++)
		{
			tot += marks[i];
		}
		
		//display total marks
		System.out.println("Total marks= "+ tot);
		
		//find percentage
		float percent = (float)tot/n;
		System.out.println("Percentage= "+ percent);
		

	}

}
