package com.ricardo.cursojava.aula29;

import com.ricardo.cursojava.aula29.Carro;

public class TesteCarro {

	public static void main(String[] args) {

		Carro van = new Carro("Fiat", "Ducato",4,30,0.15);
		van.marca = "Fiat";
		van.modelo = "Ducato";
		van.numPassageiros = 4;
		van.capCombustivel = 30;
		van.consumoCombustivel = 0.15;
		
		System.out.println(van.marca);
		System.out.println(van.modelo);
		
		van.obterAutonomia();
		
	double qtdCombustivel = van.calcularCombustivel(10);
	System.out.println(qtdCombustivel);

		
		
		

	}

}
