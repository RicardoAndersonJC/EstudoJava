package com.ricardo.cursojava.aula20;

public class Matrizes {

	public static void main(String[] args) {
		
		double [][] notasAlunos = new double[3][4];
		
		notasAlunos[0][0] = 10;
		notasAlunos[0][1] = 7;
		notasAlunos[0][2] = 8;
		notasAlunos[0][3] = 9;
		
		notasAlunos[1][0] = 9;
		notasAlunos[1][1] = 7;
		notasAlunos[1][2] = 6;
		notasAlunos[1][3] = 9;
		
		notasAlunos[2][0] = 5;
		notasAlunos[2][1] = 4;
		notasAlunos[2][2] = 9;
		notasAlunos[2][3] = 7;
		
	/*	for (int i = 0; i < notasAlunos.length; i++) {
			System.out.println(notasAlunos[0][i]);
			System.out.println(notasAlunos[1][i]);
			System.out.println(notasAlunos[2][i]);
			
			
		}
		*/
		for (double[] notasAluno : notasAlunos) {
			for (double nota: notasAluno) {
				
				System.out.println(nota);
			}
			
			System.out.println();
			
		}
		
	}

}
