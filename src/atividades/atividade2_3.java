package atividades;

import java.util.Scanner;

public class atividade2_3 {

	public static void main(String[] args) {
		int a,b,c,d,diferenca;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("informe os valores a serem calculados: ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		diferenca = a*b - c*d;
		System.out.println("a diferenca do produto de AB por CD e: " + diferenca);
		
		sc.close();
	}

}
