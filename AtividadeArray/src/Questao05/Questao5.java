package Questao05;

import java.util.Scanner;

public class Questao5 {
private static Scanner scan;
	public static void main(String[] args) {
		scan=new Scanner(System.in);
	int[] A	= new int[10];
	
	
	System.out.println("Informe 10 numeros");
	for(int x=0; x<10; x++) {
		System.out.println("Digite o"+(x)+"ªnumero");
		A[x]=scan.nextInt();
	}
	System.out.println("Agora, informe um novo numero:");
	   int X = scan.nextInt();
	   System.out.println("x="+ X);

	}

}
