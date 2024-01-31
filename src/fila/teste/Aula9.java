package fila.teste;

import fila.FilaComPrioridade;

public class Aula9 {

	public static void main(String[] args) {
		
		FilaComPrioridade<Paciente>fila = new FilaComPrioridade<>();
		
	    fila.enfileira(new Paciente("A",2));
		fila.enfileira(new Paciente("B",1));
		fila.enfileira(new Paciente("C",3));
		
		System.out.println(fila);
		
	}

}
