package com.ricardo.cursojava.aula26;

import com.ricardo.cursojava.aula26.Carro;

public class TesteCarro {

	public static void main(String[] args) {
	  
		Carro van = new Carro();
		van.marca = "Fiat";
		van.modelo = "Ducato";
		van.numPassageiros = 4;
		van.capCombustivel = 30;
		van.consumoCombustivel = 0.15;
		
		System.out.println(van.marca);
		System.out.println(van.modelo);
		
		van.obterAutonomia();
	}

}
