package Questão01;

import java.util.Scanner;

public class Questao1 {

	private static Scanner scan;
	
	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		String[] nomes = new String[10] ;
		
		String nome;
		
		boolean encontrou;
		
			for( int i=0; i < nomes.length; i++ ) {
				System.out.println("Digite o nome do Aluno"+ (i+1) + ":");			
				nomes[i] = scan.next();
			}
			System.out.println("Agora escreva um nome a ser buscado:");
			nome=scan.next();
			
			encontrou = false;
			for( int i=0; i < 10; i++ ) {
				if(nomes[i].equals(nome)) {
					encontrou=true;
				}
				
			}
			if(encontrou==true) {
				System.out.println("ACHOU");
			}else {
				System.out.println("Não ACHOU");
			}
	
	}

}
