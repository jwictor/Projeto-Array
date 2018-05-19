package Questao14;

import java.util.Scanner;

public class Questao14 {
private static Scanner scan;
	public static void main(String[] args) {
		scan= new Scanner(System.in);
		
		int[][] matriz = new int[4][4];
		
		int aux;
		
		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
				matriz[i][j]=scan.nextInt();
			}
		}
		for(int i=0; i<4; i++) {
			aux=matriz[1][i];
			matriz[1][i]=matriz[i][4];
			matriz[i][4]=aux;
		}
		for(int i=0; i<4; i++) {
			System.out.println("");
			for(int j=0; j<4; j++) {
				System.out.println(matriz[i][j]);
			}
		}

	}

}
