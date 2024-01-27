package exercicios;

import pilha.Pilha;

public class Exer03 {

	
	
//	Utilize a classe Pilha (criada durante as aulas) e desenvolva os
//	seguintes items:
//	l. Crie uma pilha com capacidade para 20 livros;
//	2. Insira 6 livros na pilha; Cada livro contém nome, isbn, ano
//	de lançamento e autor.
//	3. Crie um exemplo para utilizar cada método da classe Pilha.
//	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Pilha<Livro>pilha = new Pilha<Livro>(6);
		
		Livro livro = new Livro();
		livro.setNome("Estrutura de dados");
		livro.setAutor("Loiane Gronner");
		livro.setAnoLancamento(2016);
		livro.setIsbn("B01448596");
		
		
		
		Livro livro2 = new Livro();
		livro2.setNome("Logica de programaçao");
		livro2.setAutor("Loiane Gronner");
		livro2.setAnoLancamento(2016);
		livro2.setIsbn("B01A8C899");
		
		
		
		Livro livro3 = new Livro();
		livro3.setNome("Estrutura de dados");
		livro3.setAutor("Loiane Gronner");
		livro3.setAnoLancamento(2016);
		livro3.setIsbn("B015D4847");
		
		
		Livro livro4 = new Livro();
		livro4.setNome("Louis Vuitton: uma Saga");
		livro4.setAutor(" Stéphanie Bonvicini");
		livro4.setAnoLancamento(2023);
		livro4.setIsbn("6556663530");
		
		
		Livro livro5 = new Livro();
		livro5.setNome("Antes que o café esfrie");
		livro5.setAutor("Toshikazu Kawaguchi");
		livro5.setAnoLancamento(2022);
		livro5.setIsbn("6588490364");
		
		
		System.out.println("Pilha de  livros criada, pilha esta vazia ?" +pilha.estaVazia());
		
		System.out.println("Empilhando livros na pilha:");
		
		pilha.empilha(livro);
		pilha.empilha(livro2);
		pilha.empilha(livro3);
		pilha.empilha(livro4);
		pilha.empilha(livro5);
		
		System.out.println(pilha.tamanho()+"livros foram empilhados");
		System.out.println(pilha);
		
		System.out.println("Pilha de  livros criada, pilha esta vazia ?" +pilha.estaVazia());
		
		System.out.println("Espiando o topo da  pilha: " + pilha.topo());
		
		
		System.out.println("Desempilhando livros da  pilha");
		
		while (!pilha.estaVazia()) {
			System.out.println("Desempilhando livros: "+pilha.desempilha());
			
			
		}
		
		System.out.println("Todos os livros foram desempilhados, pilha vazia: " +pilha.estaVazia());
		
	}

}
