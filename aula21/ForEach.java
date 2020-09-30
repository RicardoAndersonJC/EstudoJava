package com.ricardo.cursojava.aula21;

public class ForEach {

	public static void main(String[] args) {
	 
	
		
	 int[] idades = new int[10];
	 idades[0] = 10;
	 idades[1] = 11;
	 idades[2] = 12;
	 idades[3] = 13;
	 idades[4] = 14;
	 idades[5] = 15;
	 idades[6] = 16;
	 idades[7] = 17;
	 idades[8] = 18;
	 idades[9] = 19;
	 
	for (int idade : idades) {
		System.out.println(idade);
	}
		

	}

}
