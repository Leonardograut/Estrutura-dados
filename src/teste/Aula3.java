package teste;

import java.util.Stack;

import pilha.Pilha;

public class Aula3 {

	public static void main(String[] args) {
		
		
		Pilha<Integer>pilha = new Pilha<Integer>();
		
		Stack<Integer>stack = new Stack<Integer>();
		
		//verificando se esta vazia 
		System.out.println(stack.isEmpty());
		
		
		//empilhando com push
		stack.push(1);
		stack.push(2);
		stack.push(3);
		
		//verificando se  esta  vazio
		System.out.println(stack.isEmpty());
		
		//verificar o tamanho
		System.out.println(stack.size());
		
		//tostring
		System.out.println(stack);
		
		//espiar topo
		System.out.println(stack.peek());
		
		//removendo  elementos
		System.out.println(stack.pop());
		
		//tostring
		System.out.println(stack);
		
		
	}

}
