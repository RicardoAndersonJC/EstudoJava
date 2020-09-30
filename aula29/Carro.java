package com.ricardo.cursojava.aula29;

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

	public Carro(String marca, String modelo, int numPassageiros, double capCombustivel, double consumoCombustivel) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.numPassageiros = numPassageiros;
		this.capCombustivel = capCombustivel;
		this.consumoCombustivel = consumoCombustivel;
	}
	
	
	
}
