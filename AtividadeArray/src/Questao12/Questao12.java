package Questao12;

import java.util.Scanner;

public class Questao12 {
private static Scanner scan;
	public static void main(String[] args) {
		scan=new Scanner(System.in);
		int c = 0;
		float[][] mat =new float[6][6];
		 System.out.println("Preencha a Matriz");
		 for(int A=0; A<6; A++) {
			 for(int B=0; B<6; B++) {
				 mat[A][B]=scan.nextInt();
			 }
		 }
       for(int A=0; A<6; A++) {
    	   for(int B=0; B<6; B++) {
    		   if(mat[A][B]>10) {
    			   c= c+1;
    			   System.out.println("Maior que 10"+mat[A][B]);
    		   }
    	   }
       }
       System.out.println("Dos 36 valores, Tnha"+c+"valores maiores que 10");
	}

}
