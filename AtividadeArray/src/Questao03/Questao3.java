package Questao03;

import java.util.Scanner;

public class Questao3 {
	
	private static Scanner scan;
	
	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		int[] Q = new int[10];
		int posicao=0;
		int maior=0;
		
		maior=0;
		for(int i=0; 1<10; i++) {
			System.out.println("Digite o"+(i+1)+"º numero:");
			Q[i]=scan.nextInt();
			while(Q[i]<0) {
				System.out.println("Digite um valor positivo");
				Q[i]=scan.nextInt();
			}
							
		}
		
		
		//for(int i=0; i<10; i++) {
	         //if (Q[i]>maior) {
				//maior=Q[i];
				//posicao=i;
			//}
		//}
		//System.out.println("Maoir elemento do vetor Q:"+maior);
	      //System.out.println("Na posição"+posicao);
		
		
	}

}