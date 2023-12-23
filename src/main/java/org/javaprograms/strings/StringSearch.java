package org.javaprograms.strings;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class StringSearch {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		//accept data from keyboard
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//ask how many strings
		System.out.print("How many Strings? ");
		int n = Integer.parseInt(br.readLine());
		
		//create a string type array with size n
		String str[] = new String[n];
		
		//store strings into str[]
        for(int i=0; i<n; i++)
        {
        	System.out.print("Enter a string: ");
        	str[i] = br.readLine();
        	
        }
		
        //accept the string to search
        System.out.print("Enter string to search: ");
        String search = br.readLine();
        
        //take a boolean var
        boolean found = false;
        
        //search for the string str
        for(int i=0; i<n; i++)
        {
        	if(search.equalsIgnoreCase(str[i]))
        		{
        		System.out.println("Found at position: "+(i+1));
        		found = true; //string found
        		}
        }
        
        //if not found display message
        if(!found)
        	System.out.println("Not found in the group");
	}

}
