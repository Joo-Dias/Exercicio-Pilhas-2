package view;

import br.edu.fateczl.pilhaint.Pilha;

public class Main {

	public static void main(String[] args) throws Exception {
		
		Pilha pilhaA = new Pilha();
		Pilha pilhaB = new Pilha();
		
		// Pilha A
		for(int i = 0; i < 10; i++) {
			if(i % 2 == 0) {
				pilhaA.push(i * i);
			} else {
				if(i <= 5) {
					pilhaA.push(i);
				} else {
					pilhaA.pop();
				}
			}
			System.out.println("O topo da pilha A: "+pilhaA.top());
			
		}
		
		System.out.println("O tamanha da pilha A:"+pilhaA.size());
		System.out.println("------------------------------");
		
		// Pilha B
		for(int i = 100; i < 115; i++) {
			if(pilhaB.isEmpty()) {
				pilhaB.push(i + 100);
			} else {
				if(pilhaB.size() <= 4) {
					pilhaB.push(i + 50);
				} else {
					pilhaB.pop();
				}
			}
			System.out.println("Topo da pilha B: "+pilhaB.top());
		}
		System.out.println("O tamanho da pilha B: "+pilhaB.size());

	}

}
