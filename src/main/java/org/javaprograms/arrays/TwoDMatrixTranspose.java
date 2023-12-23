package org.javaprograms.arrays;
import java.util.*;

public class TwoDMatrixTranspose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//use scanner to accept data from keyboard
		Scanner sc = new Scanner (System.in);
		
		//accept rows columns of matrix
		System.out.println("Enter rows, colimns of matrics? ");
		int r = sc.nextInt();
		int c = sc.nextInt();
		
		//create an array with size [r][c]
		int arr[][] = new int[r][c];
		
		//accept a matrix from keyboard
		System.out.println("Enter elements of matrix: ");
		
		for(int i=0; i<r; i++)
		for(int j=0; j<c; j++)
		arr[i][j] = sc.nextInt();
		
		System.out.println("The transpose matrix: ");
		
		//take columns as rows and vice versa and display
		for(int i=0; i<c; i++)
		{
			for(int j=0; j<r; j++)
			{
				System.out.print(arr[j][i]+ " ");
			}
			
			System.out.println("\n");
			
		}
		
	}

}
