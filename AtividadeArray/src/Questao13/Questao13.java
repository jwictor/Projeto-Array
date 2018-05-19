package Questao13;

import java.util.Scanner;

public class Questao13 {
private static Scanner scan;
	public static void main(String[] args) {
		scan=new Scanner(System.in);
		
		int[][] NUMERO= new int[20][20];
		int I;
		int num;
		int cont;
		
		cont=0;
		for(int i=0; i<20; i++) {
			for(int j=0; j<20; j++) {
				System.out.println("Digite um numero:");
				NUMERO[i][j]=scan.nextInt();
			}
		}
       for(int i=0; i<20; i++) {
    	   for(int j=0; j<20; j++) {
    		   System.out.println(NUMERO[i][j]);
    	   }
       }
       System.out.println("");
       System.out.println("Digite o numero a ser localizado");
       num=scan.nextInt();
       
       for(int i=0; i<20; i++) {
    	   for(int j=0; j<20; j++) {
    		   if(NUMERO[i][j]==num) {
    			   cont=cont+1;
    		   }
    	   }
       }
       if(cont>0) {
    	   System.out.println("Numero encontrado"+cont+"veze(s)");
       }else {
    	   System.out.println("numero não localizado");
       }
	}

}
