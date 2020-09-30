package com.ricardo.cursojava.aula26;

public class Carro {
	
		String marca;
		String modelo;
		int numPassageiros;
		double capCombustivel;
		double consumoCombustivel;
		
		
		void exibirAutonomia() {
			
			System.out.println(capCombustivel * consumoCombustivel);
			
			
			
		}
		
		double obterAutonomia() {
			
			double retorno = capCombustivel * consumoCombustivel;
			System.out.println("Metodo chamado " + retorno);
			return retorno;
			
		}
		
}


