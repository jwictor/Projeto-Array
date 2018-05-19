package Questao19;

import java.util.Scanner;

public class Questao19 {
private static Scanner scan;
	public static void main(String[] args) {
		scan=new Scanner(System.in);
		float[][] n =new float[6][6];
     
		for(int x=0; x<6; x++) {
			for(int y=0; y<6; y++) {
				System.out.println("Preencha o valor da linha"+x+"e da coluna"+y);
				n[x][y]=scan.nextInt();
				if((x==y)||((x==2)&&(y==5))||((x==3)&&(y==4))||((x==4)&&(y==3))||((x==5)&&(y==2))||((x==6)&&(y==1))) {
					n[x][y]=n[x][y];
				}else {
					if(n[x][y]<0) {
						n[x][y]=0;
					}
				}
			}
		}
		for(int x=0; x<6; x++) {
			for(int y=0; y<6; y++) {
				System.out.println(n[x][y]+"");
			}
			System.out.println("");
		}
	}

}
