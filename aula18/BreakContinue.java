package com.ricardo.cursojava.aula18;

import java.util.Scanner;

public class BreakContinue {
 
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Entre com um numero");
		 int num = scan.nextInt();
		 
		 System.out.println("Entre com um limite"); 
		  int max = scan.nextInt();
		  
		for (int i=num; i <= max; i++) {
			if (i % 7 == 0) {
		      System.out.println("O valor de i � :" + i);	
				break;
			}
			
		}
	
		
		for (int j=num; j <= max; j++) {
			if (j % 7 == 0) {
		      
				continue;
			}
			System.out.println("O valor de j � :" + j);	
		}
	
	
	
	
	
	}
	
	
	
}
