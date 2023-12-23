package org.javaprogramms.IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class GeneratingFibonacciNumbers {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		//accept how many fibonaccis need
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("How many fibonaccis? ");
		int n = Integer.parseInt(br.readLine());
		
		//take first two fibonaccis as 0 and 1
		long f1 =0, f2=1;
		
		System.out.println(f1);
		System.out.println(f2);
		
		//find next fibonics number
		long f = f1+f2;
		System.out.println(f);
		
		//already two fibinocis are displayed so count will start at 3
		int count =3;
		while(count<n)
		{
			f1=f2;
			f2=f;
			f=f1+f2;
			System.out.println(f);
			
			count++;
		}
		
		 

	}

}
