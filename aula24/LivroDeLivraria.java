package com.ricardo.cursojava.aula24;

public class LivroDeLivraria {

	public static void main(String[] args) {
		Livro anime = new Livro();
		
		anime.anoLivro = 2020;
		anime.autorLivro =  "Ricardo";
		anime.tipoLivro = "Anime";
		anime.nomeLivro = "Naruto";
		
		System.out.println(anime.anoLivro);
		System.out.println(anime.autorLivro);
		System.out.println(anime.tipoLivro);
		System.out.println(anime.nomeLivro);
		
	}

}
