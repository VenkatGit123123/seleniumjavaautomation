package org.javaprograms.arrays;

public class ThreeDArrayStudentsMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//declare three var
		int dept, student, marks, tot=0;
		
		//take the marks of students in a 3D array
		int arr[][][] = {{{50, 51, 52}, {60, 61, 62}},
				{{70, 71, 72}, {80, 81, 82}},
				{{65, 62, 72}, {87,56,86}}};
		
		//display the marks from 3D array
		for(dept=0; dept<3; dept++)
		{
			System.out.println("Department "+(dept+1)+": ");
			for(student=0; student<2; student++)
			{
				System.out.print("Student "+(student+1)+": ");
				for(marks=0; marks<3; marks++)
				{
					System.out.print(arr[dept][student][marks]+" ");
					tot += arr[dept][student][marks];
				}
				
				System.out.println("Total: "+tot); //display total marks of total
				tot =0; //reset total to 0
			}
			
			System.out.println();
		} //end of for loops
}
}


