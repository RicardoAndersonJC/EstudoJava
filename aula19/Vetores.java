package com.ricardo.cursojava.aula19;

public class Vetores {

	public static void main(String[] args) {
		
		double tempDia001 = 31.3;
		double tempDia002 = 32;
		double tempDia003 = 34.3;
		double tempDia004 = 38.3;
		double tempDia005 = 35.3;
		double tempDia006 = 31.3;
		double tempDia007 = 30.3;
		
		double[] temperaturas = new double[365];
		
		temperaturas [0] = 31.3;
		temperaturas [1] = 32;
		temperaturas [2] = 55;
		temperaturas [3] = 25;
		temperaturas [4] = 43;
		temperaturas [5] = 29;
		
		for (int i= 0; i < temperaturas.length ; i++) {
			System.out.println("O valor da temperatura " + i + " é: " + temperaturas[i] );
			
			
		}
		
		for (double temp : temperaturas) {
			System.out.println(temp);
			
		}
		
	
	}

}
