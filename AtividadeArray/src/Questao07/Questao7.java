package Questao07;

import java.util.Scanner;

public class Questao7 {
    private static Scanner scan;
	public static void main(String[] args) {
		scan=new Scanner(System.in);
		int[] vet = new int[30];
		int num;
		int cont;
		
		for(int i=0; i<10; i++) {
			System.out.println("Digite um numero:");
			vet[i]=scan.nextInt();
		}
		System.out.println("Digite outro numero a pesquisar:");
		num=scan.nextInt();
		cont=0;
		for(int i=0; i<30; i++) {
			if(vet[i]==num) {
				cont=cont+1;
			}
		}
		System.out.println("O"+num+"aparece"+cont+"vezes no vetor");

	}

}
