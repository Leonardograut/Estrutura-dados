package exercicios;

import java.util.Iterator;
import java.util.Stack;



public class Exer05 {



	//	Escreva um programa que testa se uma sequência de caracteres
	//	fornecida pelo usuário é um palíndromo, ou seja, é uma palavra cuja
	//	primeira metade é simétrica à segunda metade. Veja alguns exemplos:
	//	AABCCBAA - sim
	//	- ADDFDDA - sim
	//	- ABFFBB - não




	public static void main(String[] args) {

		imprimeResultado("ADA");
		imprimeResultado("ABCD");
		imprimeResultado("ABCCBA");
		imprimeResultado("Maria");


	}


	public static void imprimeResultado(String palavra) {
		System.out.println( palavra + " e palindromo ? " + testaPalindromo(palavra));
	}


	public   static boolean testaPalindromo(String palavra) {

		Stack<Character> pilha = new Stack<Character>();

		for (int i = 0; i <palavra.length(); i++) {
			pilha.push(palavra.charAt(i));
		}

		String palavraInversa = "";
		while (!pilha.isEmpty()) {
			palavraInversa += pilha.pop();
		}

		if (palavraInversa.equalsIgnoreCase(palavra)) {
			return true;
		}

		return false;
	}
}
