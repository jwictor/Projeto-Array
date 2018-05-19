package Questao04;

import java.util.Scanner;

public class Questao4 {
     private static Scanner scan;
	public static void main(String[] args) {
		scan=new Scanner(System.in);
		int[] Q = new int[10];
		int posicao =0;
		int menor=0;
		
		for(int i=0; i<10; i++) {
			System.out.println("Digite o"+(i+1)+"ºnumero");
			Q[i]=scan.nextInt();
			
			while(Q[i]<0) {
				System.out.println("Digite um valor positivo");
				Q[i]=scan.nextInt();
			}
			if(i==1) {
				menor=Q[i];
			}
			if(Q[i]<menor) {
				menor=Q[i];
				posicao=i;
			}
		}
		System.out.println("menor elemento do vetor Q:"+menor);
		System.out.println("Na posição"+posicao);
      
	}

}
