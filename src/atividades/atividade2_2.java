package atividades;

import java.util.Scanner;


public class atividade2_2 {

	public static void main(String[] args) {
		
		double r,A;
		double pi = 3.14159;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("informe o valor do raio:");
		r = sc.nextDouble();
		A = pi * Math.pow(r,2.0);
		System.out.printf("a area do circulo e: %.4f", A );
		
		sc.close();
	}

}
