package atividades;

import java.util.Scanner;

public class atividade2_6 {

	public static void main(String[] args) {
		double a,b,c;
		double pi = 3.14159;
		Scanner sc = new Scanner (System.in);
		
		System.out.printf("informe o valor de A: ");
		a = sc.nextDouble();
		System.out.printf("informe o valor de B: ");
		b = sc.nextDouble();
		System.out.printf("informe o valor de C: ");
		c = sc.nextDouble();
		System.out.printf("a area do tri�ngulo ret�ngulo que tem A por base e C por altura: %.3f\n", a*c/2);
		System.out.printf("a �rea do c�rculo de raio C: %.3f\n", pi*Math.pow(c,2.0));
		System.out.printf("a �rea do trap�zio que tem A e B por bases e C por altura: %.3f\n", (a+b)*c/2);
		System.out.printf("a �rea do quadrado que tem lado B: %.3f\n", Math.pow(b,2.0));
		System.out.printf("a �rea do ret�ngulo que tem lados A e B: %.3f\n", a*b);
		
		sc.close();
	}

}
