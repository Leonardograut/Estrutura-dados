package exercicios;

import java.util.Scanner;

import pilha.Pilha;

public class Exer02 {



	/*Escreva um programa que leia 10 números. Para cada número lido,
	verifique e codifique de acordo com as regras a seguir:
	- Se o número for par, empilhe na pilha chamada par;
	- Se o número for ímpar, empilhe na pilha chamada impar;
	- Se o número for zero (0), desempilhe um elemento de cada pilha. Caso
	alguma pilha esteja vazia, mostre uma mensagem de erro na tela.
	Ao final do programa desempilhe todos os elementos das duas pilhas,
	imprimindo-os na tela
	 */

	public static void main(String[] args) {

		Pilha<Integer> par = new Pilha<Integer>();
		Pilha<Integer> impar = new Pilha<Integer>();

		Scanner sc =  new Scanner(System.in);

		for (int i = 1; i<=10; i++) {

             System.out.println("Entre com o numero");

			int num = sc.nextInt();


			if (num==0) {

				//pilha par

				Integer desempilhado = par.desempilha();

				if (desempilhado ==null) {

					System.out.println("Pilha par  vazia");

				}else {
					System.out.println("Desempilhando da  pilha " + desempilhado);
				}


				//pilha impar

				desempilhado = impar.desempilha();

				if (desempilhado ==null) {

					System.out.println("Pilha impar  vazia");

				}else {
					System.out.println("Desempilhando da  pilha impar " + desempilhado);
				}

			}
			else if (num % 2==0) {
				System.out.println(" Numero par , empilhando na pilha par" + num);
				par.empilha(num);
			}else {
				System.out.println(" Numero impar, empilhando na pilha impar " + num);
				impar.empilha(num);
			}

		}
		
		System.out.println("Desempilhando todos os  numeros da  pilha par");
		
		while (!par.estaVazia()) {
			System.out.println(" Desempilhando da pilha par " + par.desempilha());
		}
		
		
        System.out.println(" Desempilhando todos os  numeros da  pilha impar ");
		
		while (!impar.estaVazia()) {
			System.out.println(" Desempilhando da pilha impar " + impar.desempilha());
		}
		
		
		
	}

}
