package exercicios;

import java.util.Stack;

public class Exer04 {


	//  Repita o mesmo processo do exercício anterior, porém utilizando
	//	a classe Stack da API Java.
	//	l. Crie uma pilha com capacidade para 20 livros;
	//	2. Insira 6 livros na pilha; Cada livro contém nome, isbn, ano
	//	de lançamento e autor.
	//	3. Crie um exemplo para utilizar cada método da classe Pilha.


	public static void main(String[] args) {

		Stack<Livro>pilha = new Stack<Livro>();

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


		//estaVazia =isEmpty
		System.out.println("Pilha de  livros criada, pilha esta vazia ?" +pilha.isEmpty());

		System.out.println("Empilhando livros na pilha:");
		//empilha = push
		pilha.push(livro);
		pilha.push(livro2);
		pilha.push(livro3);
		pilha.push(livro4);
		pilha.push(livro5);

		System.out.println(pilha.size()+"livros foram empilhados");
		System.out.println(pilha);

		//estaVazia =isEmpty
		System.out.println("Pilha de  livros criada, pilha esta vazia ?" +pilha.isEmpty());

		//topo = peek
		System.out.println("Espiando o topo da  pilha: " + pilha.peek());


		System.out.println("Desempilhando livros da  pilha");


		//estaVazia = isEmpty  desempilha  = pop
		while (!pilha.isEmpty()) {
			System.out.println("Desempilhando livros: "+pilha.pop());


		}

		System.out.println("Todos os livros foram desempilhados, pilha vazia: " +pilha.isEmpty());

	}

}


