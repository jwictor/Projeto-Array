package Questao06;

import java.util.Scanner;

public class Questao6 {
	private static Scanner scan;
	
	public static void main(String[] args) {
		
 Scanner scan = new Scanner(System.in);
 
    int[] V1 = new int[15];
    int[] V2 = new int[15];
   for (int i=0;i<15;i++){
	   
  System.out.println("Informe o valor do elemento "+i+" de V1");
  V1[i] = scan.nextInt();
}
  for (int i=0;i<15;i++){
	  
  System.out.println("Informe o valor do elemento "+i+" de V2");
  
  V2[i] = scan.nextInt();
}
scan.close();
int vezes =0;
for (int i=0;i<15;i++) {
  if( V1[i]==V2[i]) {
    vezes++;
  }
}
System.out.println("Os vetores V1 e V2 tem "+vezes+
" elementos iguais na mesma posição");

    }
 }

