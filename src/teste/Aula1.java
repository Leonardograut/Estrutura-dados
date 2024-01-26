package teste;

import pilha.Pilha;

public class Aula1 {

	public static void main(String[] args) {
		Pilha<Integer> pilha = new Pilha<Integer>();
		
		 for (int i = 0; i < 11; i++) {
		 	pilha.empilha(i);
	 }
        
		//verificando se  esta vazia
		 System.out.println(pilha.estaVazia());

         pilha.empilha(1);

		 System.out.println(pilha.estaVazia());


		 System.out.println(pilha.tamanho());

	}

}
