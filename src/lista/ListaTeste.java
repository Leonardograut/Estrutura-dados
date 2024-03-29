package lista;

import java.util.LinkedList;

public class ListaTeste {

	public static void main(String[] args) {

		//testeIniciais();

		//adicionaInicio();

		//removeInicio();
		//adicionaPosicao();
		//		removeFinal();
		testeLinkedList();
		//removePosicao();
	}




	public static  void removeFinal() {
		ListaEncadeada<Integer>lista = new ListaEncadeada<>();


		lista.adiciona(1);
		lista.adiciona(2);
		lista.adiciona(4);


		System.out.println("Elemento removido: " + lista.removeFinal());
		System.out.println("Lista: " +lista);

		System.out.println("Elemento removido: " + lista.removeFinal());
		System.out.println("Lista: " +lista);

		System.out.println("Elemento removido: " + lista.removeFinal());
		System.out.println("Lista: " +lista);


	}


	public static void removePosicao() {
		ListaEncadeada<Integer>lista = new ListaEncadeada<>();

		lista.adiciona(1);
		lista.adiciona(2);
		lista.adiciona(3);
		lista.adiciona(4);
		lista.adiciona(5);

		System.out.println("Elemento removido: " + lista.remove(1));
		System.out.println("Lista: " +lista);
	}



	public static void removeInicio() {
		ListaEncadeada<Integer>lista = new ListaEncadeada<>();


		//lista.removeInicio();
		lista.adiciona(1);
		lista.adiciona(2);
		lista.adiciona(4);

		System.out.println("Elemento removido: " + lista.removeInicio());
		System.out.println("Lista: " +lista);


		System.out.println("Elemento removido: " + lista.removeInicio());
		System.out.println("Lista: " +lista);

		System.out.println("Elemento removido: " + lista.removeInicio());
		System.out.println("Lista: " +lista);


	}


	public static void testeLinkedList() {
		LinkedList<Integer> list = new LinkedList<>();

		list.add(1);
		list.addFirst(0);
		list.addLast(3);

		list.add(2, 2);
		System.out.println(list);

		list.remove();

		System.out.println(list);

		list.remove(0);
		list.removeFirst();
		list.removeLast();

		System.out.println(list);

	}

	public static void adicionaInicio() {
		ListaEncadeada<Integer>lista = new ListaEncadeada<>();

		lista.adicionaInicio(3);
		lista.adicionaInicio(2);
		lista.adicionaInicio(1);

		System.out.println(lista);
	}


	public static void adicionaPosicao() {
		ListaEncadeada<Integer> lista = new ListaEncadeada<>();
		//		lista.adiciona(-1, 1);
		lista.adiciona(1);
		lista.adiciona(2);
		lista.adiciona(4);
		//lista.adiciona(5, 0);

		lista.adiciona(0, 0);//0,1,2,4

		lista.adiciona(4, 5);//0,1,2,4,5

		lista.adiciona(2, 3);

		System.out.println(lista);
	}


	public  static  void testeIniciais() {
		ListaEncadeada<Integer> lista = new ListaEncadeada<>();
		lista.adiciona(1);

		System.out.println("Tamanho = "+lista.getTamanho());
		System.out.println(lista);

		lista.adiciona(2);
		System.out.println(lista);

		lista.adiciona(3);
		System.out.println(lista);

		lista.adiciona(4);
		System.out.println(lista);


		//lista.limpa();
		//System.out.println(lista);


		//busca por elemento
		System.out.println("********** busca por elemento");
		//System.out.println(lista.busca(0));
		System.out.println(lista.busca(1));
		System.out.println(lista.busca(2));
		System.out.println(lista.busca(3));


		//busca por posicao
		System.out.println("********* busca por posicao");
		System.out.println(lista.buscaPorPosicao(0));
		System.out.println(lista.buscaPorPosicao(1));
		System.out.println(lista.buscaPorPosicao(2));
		//		System.out.println(lista.buscaPorPosicao(-1));
		//		System.out.println(lista.buscaPorPosicao(4));
		//		
	}

}
