package br.com.matriz;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int linhas = sc.nextInt();
		int colunas = sc.nextInt();
		

		int[][] matriz = new int[linhas][colunas];

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}
		int x = sc.nextInt();

		for (int i = 0; i < linhas; i++) {
			for (int j = 0; j < colunas; j++) {
				if(x == matriz[i][j]) {
					System.out.print("Position:" + i +", " + j + " ");
					if (j > 0) {
						System.out.println("Left: " + matriz[i][j - 1]);
					}
					
					if(i > 0) {
						System.out.println("Up: " + matriz[i - 1][j]);
					}
					
					if(j < matriz[i].length -1) {
						System.out.println("Right: " + matriz[i][j+1]);
					}
					
					if (i < matriz.length-1) {
						System.out.println("Down: " + matriz[i+1][j]);
					}
	
				}
			}
		}

	}

}
