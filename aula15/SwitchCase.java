package com.ricardo.cursojava.aula15;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o dia da semana :");
				 
		int diaSemana = scan.nextInt();
		
		/*if (diaSemana == 1 ) {
			System.out.println("Domingo");
		}else if(diaSemana == 2 ) {
			System.out.println("Segunda");
		}else if(diaSemana == 3 ) {
			System.out.println("Ter�a");
		}else if(diaSemana == 4 ) {
			System.out.println("Quarta");
		}else if(diaSemana == 5 ) {
			System.out.println("Quinta");
		}else if(diaSemana == 6 ) {
			System.out.println("Sexta");
		}else if(diaSemana == 7 ) {
			System.out.println("S�bado");
		}else {
			System.out.println("N�o � um dia v�lido");
		}*/
		
	switch (diaSemana) {
	case 1 :System.out.println("Domingo"); break;
	case 2 :System.out.println("Segunda");break;
	case 3 :System.out.println("Ter�a");break;
	case 4 :System.out.println("Quarta");break;
	case 5 :System.out.println("Quinta");break;
	case 6 :System.out.println("Sexta");break;
	case 7 :System.out.println("S�bado");break;
	default:System.out.println("N�o � um dia v�lido");
	}
	
	if (diaSemana >=2 && diaSemana <= 6) {
		System.out.println("Dia util");
	}else if (diaSemana == 1 || diaSemana == 7) {
		System.out.println("Fim de semana");
	}else {
		System.out.println("N�o � um dia v�lido");
	}
	
	}

}

