package lista;

public class ListaTeste {

	public static void main(String[] args) {

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
