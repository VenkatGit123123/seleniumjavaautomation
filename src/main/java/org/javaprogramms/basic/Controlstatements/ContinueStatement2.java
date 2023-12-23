package org.javaprogramms.basic.Controlstatements;

public class ContinueStatement2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=1, j;
		
		lp1: while(i<=3)
		{
		System.out.println(i);
		lp2: for(j=1; j<=5; j++)
		{
			System.out.println("\t"+j);
		}
		if(j==3) 
		{
			i++;
			continue lp1;
		}
		
	}
	i++;
	System.out.println("-----------------");

}

}