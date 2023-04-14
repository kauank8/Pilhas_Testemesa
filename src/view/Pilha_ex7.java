package view;

import br.com.KauanPaulino.pilhaint.Pilha;

public class Pilha_ex7 {
	public static void main(String[] args) {
		Pilha pilhaA = new Pilha();
		int vt[]= {5,26,1,17,20,22,25,11,39,5,15,38,26,14};
		int tamanhoVt = vt.length;
		for(int i=0;i<tamanhoVt;i++) {
			pilhaA.push(vt[i]);
		}
		Operacoes(pilhaA);
	}
	
	public static void Operacoes(Pilha pilhaA){
		Pilha pilhaB = new Pilha();
		Pilha pilhaAux = new Pilha();
		int tamanhoA = pilhaA.size();
		for(int i=0;i<tamanhoA;i++) {
			try {
				int valor = pilhaA.pop();
				if(valor%2==1) {
					pilhaB.push(valor);
				}
				if(valor%2==0) {
					pilhaAux.push(valor);
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		int tamanhoAux = pilhaAux.size();
		for(int i=0;i<tamanhoAux;i++) {
			try {
				int valor1 = pilhaAux.pop();
				pilhaA.push(valor1);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		Mostrapilhas(pilhaA,pilhaB);
	}
	private static void Mostrapilhas(Pilha pilhaA, Pilha pilhaB) {
		// TODO Auto-generated method stub
		int tamanhoA = pilhaA.size();
		int tamanhoB=pilhaB.size();
		System.out.println("Pilha A");
		for(int i=0;i<tamanhoA;i++) {
			try {
				int valor = pilhaA.pop();
				System.out.println(valor);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//pilha B
		System.out.println("PILHA B:");
		for(int i=0;i<tamanhoB;i++) {
			try {
				int valor = pilhaB.pop();
				System.out.println(valor);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		}
}
