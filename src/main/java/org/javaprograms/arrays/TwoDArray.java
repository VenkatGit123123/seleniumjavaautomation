package org.javaprograms.arrays;

public class TwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float x[][] = {{1.1f, 1.2f, 1.3f,1.4f},{2.1f,2.2f,2.3f,3.4f},{3.1f,3.2f,3.3f,3.4f}};
		
		//read and display the array elelemnts
		System.out.println("In matrix form");
		for (int i=0; i<3; i++) //rows
		{
			for(int j=0; j<4;j++)
			{
				System.out.print(x[i][j]+"\t");
			}
			
			System.out.println(); //next line
		}
		

	}

}
