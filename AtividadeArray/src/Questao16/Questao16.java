package Questao16;

import java.util.Scanner;

public class Questao16 {
private static Scanner scan;
	public static int main(String[] args) {
		scan=new Scanner(System.in);
		
		int [][] m=new int[5][5];
		
		for(int i=0; i<5; i++) {
			System.out.println("Digite os numeros da lnha: %d\n"+(i+1));
			for(int j=0; j<5; j++) {
				System.out.println("coluna: %d\n"+(j+1));
				m[i][j]=scan.nextInt();
			}
		}
		for(int i=0; i<5; i++) {
			System.out.println("  \n\n");
			for(int j=0; j<5; j++) {
				System.out.println("  %d  "+m[i][j]);
			}
		}
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				
			}
		if(m[i][+1]>0) {
				System.out.println(" \n\n superior");
			}else {
				System.out.println("inferior");
			}
		}
    return 0;
	}

}
