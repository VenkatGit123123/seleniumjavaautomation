package org.javaprogramms.basic;

public class FindLargestNumber {
	
	static int array[] = {23,6,4,3,9};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int maxnum = findLargestNumber();
		
		System.out.println("Maximum number in the array:"+maxnum);
	}
	
	private static int findLargestNumber()
	{
		
		int max=array[0];
		for(int i=0;i<array.length; i++) {
			if(array[i]>max)
				max = array[i];
		}
		return max;

	}

}
