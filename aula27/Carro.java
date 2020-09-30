package com.ricardo.cursojava.aula27;

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
			
			double calcularCombustivel(double km) {
				
				double qtdCombustivel = km/consumoCombustivel;
				return qtdCombustivel;
			
			}
			
}




