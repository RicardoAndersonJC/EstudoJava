package com.ricardo.cursojava.aula14;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
      
		 
		Scanner scan = new Scanner(System.in);
		
	/*	System.out.println("Digite sua idade :");
		
		int idade = scan.nextInt();
		
		if (idade >= 18){
			System.out.println("Maior de Idade");			
		}
		else {
			System.out.println("Menor de Idade");	
				
		}
		*/
		System.out.println("Digite o valor do item");
		double valor = scan.nextDouble();
		if (valor <= 10) {
			System.out.println("pode comprar ");			
		} else if (valor > 10 && valor <= 15) {
			System.out.println("você pode pedir um desconto");
			
		} else if(valor >= 15 && valor < 17) {
			System.out.println("Precisamos pesquisar mais");
			
		}else {
			System.out.println("Não compra, ta muito caro");
		}
		
	}

}
