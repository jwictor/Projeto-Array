package Questao11;

import java.util.Scanner;

public class Questao11 {
private static Scanner scan;
	public static void main(String[] args) {
		scan= new Scanner(System.in);
		float[][] a = new float[4][4];
		float[][] b = new float[4][4];
		float[] c = new float[16];
		
		for(int x=0; x<4; x++) {
			for(int y=0; y<4; y++) {
				System.out.println("Preencha a matriz 'A', posição Linha "+x+"coluna"+y);
				a[x][y]=scan.nextInt();
				
			}
		}
		for(int x=0; x<4; x++) {
			for(int y=0; y<4;y++) {
				System.out.println("Preencha a matriz 'B', posição linha"+x+"Coluna"+y);
				b[x][y]=scan.nextInt();
			}
		}
		for(int x=0; x<4; x++) {
			for(int y=0; y<4; y++) {
				if(a[x][y]>b[x][y]) {
					c[x]=a[x][y];
				}else {
					c[x]=b[x][y];
				}
			}
		}

	}

}
