package Questão02;

import java.util.Scanner;

public class Questao2 {
	private static Scanner scan;
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		
		float[] nota = new float[20];
		float soma,media;
		int cont;
		
		soma =0;
		for(int i=0; i<20; i++) {
			System.out.println("Digite a nota do"+(i+1)+"ªaluno");
			nota[i]=scan.nextInt();
			soma=soma+nota[i];
		}
		media=soma/20;
		cont=0;
		for(int i=0; i<20; i++) {
			if(nota[i]>media) {
				cont=cont+1;
			}
		}
		System.out.println("Media:"+media);
		System.out.println(cont+"alunos obtiveram nota acima da media");
	}
}
