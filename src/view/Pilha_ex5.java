package view;

import java.util.Random;

import javax.swing.JOptionPane;

import br.com.KauanPaulino.pilhaint.Pilha;

public class Pilha_ex5 {
	public static void main(String[] args) {
		Pilha p = new Pilha();
		Random gerador = new Random();
		int resultado=1;
		int n=gerador.nextInt(10)+1;
		System.out.println("o numero que deve ser feito fatorial:"+n);
		for(n=n;n>0;n--){
			p.push(n);
		}
		int tamanho=p.size();
		for(int i=0;i<tamanho;i++) {
			int valor;
			try {
				valor = p.pop();
				resultado *=valor;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		System.out.println(resultado);
	}
}
