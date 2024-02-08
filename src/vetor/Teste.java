package vetor;

public class Teste {

	public static void main(String[] args) {


		//Aula01();
		//Aula02();
		//Aula03();
		//Aula04();
		//Aula05();
		//Aula06();
		 Aula07();

	}

	public static void Aula01() {

		Vetor vetor = new Vetor(2);

		vetor.adiciona("elemento 1");
		vetor.adiciona("elemento 2");
		vetor.adiciona("elemento 3");


		System.out.println(vetor);
	}


	public static void Aula02() {

		Vetor vetor = new Vetor(10);

		vetor.adiciona("elemento 1");
		vetor.adiciona("elemento 2");
		vetor.adiciona("elemento 3");

		System.out.println(vetor.tamanho());

		System.out.println(vetor.toString());
	}


	public static void Aula03() {

		Vetor vetor = new Vetor(10);

		vetor.adiciona("elemento 1"); //0
		vetor.adiciona("elemento 2"); //1
		vetor.adiciona("elemento 3"); //2

		System.out.println(vetor.busca(3));
	}


	public static void Aula04() {
		Vetor vetor = new Vetor(10);

		vetor.adiciona("elemento 1"); //0
		vetor.adiciona("elemento 2"); //1
		vetor.adiciona("elemento 3"); //2

		System.out.println(vetor.busca("elemento 1"));
		System.out.println(vetor.busca("elemento 4"));
	}


	public static void Aula05() {

		Vetor vetor = new Vetor(10);

		vetor.adiciona("B");
		vetor.adiciona("C");
		vetor.adiciona("E");
		vetor.adiciona("F");
		vetor.adiciona("G");

		System.out.println(vetor);

		vetor.adiciona(0, "A");

		System.out.println(vetor);

		vetor.adiciona(3, "D");

		System.out.println(vetor);

	}


	public static void Aula06() {
		Vetor vetor = new Vetor(3);

		vetor.adiciona("B");
		vetor.adiciona("C");
		vetor.adiciona("E");
		vetor.adiciona("F");
		vetor.adiciona("G");

		System.out.println(vetor);
	}



	public static void Aula07() {


		Vetor vetor = new Vetor(3);

		vetor.adiciona("B");
		vetor.adiciona("G");
		vetor.adiciona("D");
		vetor.adiciona("E");
		vetor.adiciona("F");

		System.out.println(vetor);

		vetor.remove(1);

		System.out.println(vetor);

		System.out.println("Remover o elemento A");

		int pos = vetor.busca("A");
		if (pos > -1){
			vetor.remove(pos);
		} else {
			System.out.println("Elemento não existe no vetor");
		}

		System.out.println(vetor);
	}



	//	public static void Aula08() {
	//		
	//		
	//		VetorObjetos vetor = new VetorObjetos(3);
	//
	//		Contato c1 = new Contato("Contato 1", "1234-4567", "contato1@email.com");
	//		Contato c2 = new Contato("Contato 2", "2345-6789", "contato2@email.com");
	//		Contato c3 = new Contato("Contato 3", "3456-7890", "contato3@email.com");
	//		
	//		Contato c4 = new Contato("Contato 1", "1234-4567", "contato1@email.com");
	//		
	//		vetor.adiciona(c1);
	//		vetor.adiciona(c2);
	//		vetor.adiciona(c3);
	//		
	//		System.out.println("Tamanho = " + vetor.tamanho());
	//		
	//		int pos = vetor.busca(c4);
	//		if (pos > -1){
	//			System.out.println("Elemento existe no vetor");
	//		} else {
	//			System.out.println("Elemento não existe no vetor");
	//		}
	//		
	//		System.out.println(vetor);
	//	}

}






