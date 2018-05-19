package Questao10;

import java.io.Console;
import java.util.Scanner;

public class Questao10 {
private static Scanner scan;
	public static void main(String[] args) {
		scan= new Scanner(System.in);

		int[][] matriz = new int[5][5];
		
		for (int l = 0; l < 5; l++)
		{
			for (int c = 0; c < 5; c++)
			{
				System.out.println("Digite os numeros:");
				matriz[l][c]=scan.nextInt();
				matriz[l][c] = (l == c) ? 1 : 0;
				
				System.out.println(matriz[l][c] + " ");
			}
			
			System.out.println("\n");
		}
		
				
	}


	}


