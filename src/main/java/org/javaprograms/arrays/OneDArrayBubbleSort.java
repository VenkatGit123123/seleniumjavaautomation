package org.javaprograms.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OneDArrayBubbleSort {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		//to accept data from keyboard
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//create an int type array
		System.out.print("How many elements? ");
		int n = Integer.parseInt(br.readLine());
		int arr[] = new int[n];
		
		//accept integer elements into the array
		for(int i=0; i<n; i++)
		{
			System.out.print("Enter int: ");
			arr[i] = Integer.parseInt(br.readLine());
			
		}
		
		//use bubble sort techniq to sort the integers
		int limit = n-1; //elements from 0 to n-1
		boolean flag = false; //if it is true swapping done
		int temp; //temporary variables
		
		for(int i=0; i<limit; i++)
		{
			for(int j=0; j<limit-i; j++)
			{
				//if first element is bigger than second one, then swap
				if(arr[j] > arr[j+1])
				{
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					flag = true; //true -> swapping done
				}
			}
			
			if(flag=false) break; // no swapping, so come out
			else flag = false; //assign initial value
		}
		
		//display the sorted array
		System.out.println("The sorted array is: ");
		for(int i=0; i<n; i++)
			System.out.println(arr[i]);

	}

}
