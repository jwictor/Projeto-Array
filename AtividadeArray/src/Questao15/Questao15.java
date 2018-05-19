package Questao15;

import java.util.Scanner;

public class Questao15 {
private static Scanner scan;
	public static void main(String[] args) {
		scan= new Scanner(System.in);
		 int[][] A = new int[8][8];
		 
		 for(int i=0; i<8; i++) {
			 for(int j=0; j<8; j++) {
				 A[i][j]=scan.nextInt();
			 }
		 }
		for(int i=0; i<8; i++) {
			for(int j=0; j<8; j++) {
				if(i<j) {
					A[i][j]=0;
				}
			}
		}
		for(int i=0; i<8; i++) {
			for(int j=0; j<8; j++) {
				System.out.println(A[i][j]);
				
			}
			System.out.println("");
		}

	}

}
