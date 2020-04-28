package atividades;

import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("informe a quatidade de linhas e colunas:");
		int m = sc.nextInt();
		int n = sc.nextInt();
		int[][] mat = new int [m][n]; 
		System.out.println("Preencha a matriz:");
		for (int i=0; i<mat.length; i++) {
			for (int j=0;j<mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Informe o numero a ser buscado");
		int find = sc.nextInt();
		
		for (int i=0; i<mat.length; i++) {
			for (int j=0;j<mat[i].length; j++) {
				if (find == mat[i][j]) {
					System.out.println("Posicao: "+ i +","+j);
					if (j>0) {System.out.println("esquerda: "+ mat[i][j-1]);}
					if (i>0) {System.out.println("acima: "+ mat[i-1][j]);}
					if (j<mat.length) {System.out.println("direita: "+mat[i][j+1]);}
					if (i<mat.length) {System.out.println("abaixo: "+mat[i+1][j]);}					
				}
				
			}
			
		}
		sc.close();
	}

}
