package Questao20;

import java.util.Scanner;

public class Questao20 {
private static Scanner scan;
	public static void main(String[] args) {
	scan=new Scanner(System.in);
	float[][] A = new float[50][2];
	float[] B = new float[50];
	
	for(int i=0; i<50; i++) {
		for(int j=0; j<2; j++) {
			A[i][j]=scan.nextInt();
		}
	}
	for(int i=0; i<50; i++) {
		B[i]=(A[i][1]*A[i][2])/2;
		System.out.println(B[i]+"");
	}

	}

}
