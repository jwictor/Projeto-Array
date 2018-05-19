package Questao09;

import java.util.Scanner;

public class Questao9 {
    private static Scanner scan;
	public static void main(String[] args) {
		scan=new Scanner(System.in);
		
		int[][] matriz =new int[10][10];
		int maior=matriz[1][1];
		int lin_maior=1;
		int col_maior=1;
		
for(int i=0; i<10; i++) {
	 
	for(int j=0; j<10; j++) {
		if(maior<matriz[i][j]) {
			maior=matriz[i][j];
			lin_maior=i;
			col_maior=j;
		}
	}
}
System.out.println("Maior:"+maior+"na linha"+lin_maior+"e coluna"+col_maior);
	}

}
