package exercicios;

import java.util.Scanner;

import pilha.Pilha;

public class Exer01 {

	/*
	 Escreva um programa que leia 10 números. Para cada número lido,
     verifique e codifique de acordo com as regras a seguir:
   - Se o número for par, empilhe na pilha;
     Se o número for ímpar, desempilhe um número da pilha. Caso a pilha
     esteja vazia, mostre uma mensagem
     Se ao final do programa a pilha não estiver vazia, desempilhe todos os
     elementos, imprimindo-os na tela
	*/
	
	
	public static void main(String[] args) {
		
		Pilha<Integer>pilha = new Pilha<Integer>();
		
		Scanner sc = new Scanner (System.in);
		
		
		for (int i = 1; i <=10; i++) {
			
			System.out.println("Entre com um numero");
			
			int num = sc.nextInt();
			
			if (num%2==0) {
				
				System.out.println("Empillhando o numero" +num);
				pilha.empilha(num);
				
			}else {
				
				Integer desempilhado = pilha.desempilha();
				
				if (desempilhado == null) {
					System.out.println("Pilha esta vazia");
					
				}else {
					System.out.println("Numero impar, desempilhado um elemento da  pilha" + desempilhado);
				}
			}
		}

		
		System.out.println("Todos os  foram  lidos, desempilhando numeros  da pilha");
		
		//enquanto a  pilha nao estiver vazia
		while (!pilha.estaVazia()) {
			
			
				System.out.println(" desempilhado um elemento da  pilha "
				            + pilha.desempilha());
			
		}
		
		System.out.println("Todos os elementos foram desempilhados");
			
		}
	}


