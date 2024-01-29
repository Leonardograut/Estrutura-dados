package exercicios;

import java.util.Stack;

public class Exer07 {

	public static void main(String[] args) {


		//Usando a classe Pilha ou Stack, desenvolva um algoritmo que
		//faça a conversão de números decimais para binário.



		imprimeResultado(2);

		imprimeResultado(4);
		imprimeResultado(8);
		imprimeResultado(10);

		imprimeResultado(1035);


		imprimeResultadoQualquerBase(25,16);
		imprimeResultadoQualquerBase(10035,8);
		imprimeResultadoQualquerBase(10035,16);

	}


	public static void  imprimeResultado(int numero) {

		System.out.println(numero + " em binario e " + decimalBinario(numero));
	}



	public static void  imprimeResultadoQualquerBase(int numero , int base) {

		System.out.println(numero + " na base e "+ base +" e "  + decimalQualquerBase(numero,base));
	}


	public static String decimalQualquerBase(int numero, int base) {


		if (base >16) {

			throw new IllegalArgumentException();
		}


		Stack<Integer> pilha = new Stack<>();
		String numBase = "";
		int resto;
		String bases = "012346789ABCDEF";

		while (numero > 0) {

			resto = numero % base;

			pilha.push(resto);

			numero /= base; 
		}


		while (!pilha.isEmpty()) {

			numBase += bases.charAt(pilha.pop());
		}


		return numBase;
	}



	public static String decimalBinario(int numero) {


		Stack<Integer> pilha = new Stack<>();
		String numBinario = "";
		int resto;

		while (numero > 0) {

			resto = numero %2;

			pilha.push(resto);

			numero /=2; //numero  = numero /2;
		}


		while (!pilha.isEmpty()) {

			numBinario += pilha.pop();
		}


		return numBinario;
	}









}
