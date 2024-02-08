package vetor;

import java.util.ArrayList;

public class labs {

	public static void main(String[] args) {

		//exer01();
		//exer02();
		//exer03();
		//exer04();
		//exer05();

	}


	public static  void exer01 () {

		Lista<String> lista = new Lista<String>(5);

		lista.adiciona("A");
		lista.adiciona("B");
		lista.adiciona("C");

		System.out.println(lista.contem("A"));
		System.out.println(lista.contem("B"));
		System.out.println(lista.contem("E"));

	}

	public static void exer02() {
		ArrayList<String> arrayList = new ArrayList<String>(5);
		arrayList.add("A");
		arrayList.add("B");
		arrayList.add("A");

		System.out.println(arrayList.lastIndexOf("A"));

		Lista<String> lista = new Lista<String>(5);
		lista.adiciona("A");
		lista.adiciona("B");
		lista.adiciona("A");

		System.out.println(lista.ultimoIndice("A"));
	}


	public  static void exer03() {


		Lista<String> lista = new Lista<String>(5);

		lista.adiciona("A");
		lista.adiciona("B");
		lista.adiciona("C");
		lista.adiciona("D");
		lista.adiciona("E");

		System.out.println(lista);

		lista.remove("A");

		System.out.println(lista);

		lista.remove("E");

		System.out.println(lista);

		lista.remove("C");

		System.out.println(lista);

	}

	public static void exer04() {

		Lista<String> lista = new Lista<String>(5);

		lista.adiciona("A");
		lista.adiciona("B");
		lista.adiciona("C");
		lista.adiciona("D");
		lista.adiciona("E");

		System.out.println(lista.obtem(0));
		System.out.println(lista.obtem(2));
		System.out.println(lista.obtem(4));


	}


	public static void exer05() {

		ArrayList<String> arrayList = new ArrayList<String>(5);

		arrayList.add("A");
		arrayList.add("B");
		arrayList.add("C");
		arrayList.add("D");
		arrayList.add("E");

		System.out.println(arrayList);

		arrayList.clear();

		System.out.println(arrayList);


		Lista<String> lista = new Lista<String>(5);

		lista.adiciona("A");
		lista.adiciona("B");
		lista.adiciona("C");
		lista.adiciona("D");
		lista.adiciona("E");

		System.out.println(lista);

		lista.limpar();

		System.out.println(lista);
	}



	public static void exer06() {

	}

}









