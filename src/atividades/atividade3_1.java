package atividades;

import java.util.Scanner;

public class atividade3_1 {

	public static void main(String[] args) {
		int a;
		Scanner sc = new Scanner(System.in);
		System.out.printf("informe um numero: ");
		a = sc.nextInt();
		if (a < 0) {
			System.out.println("o numero é negativo");
		}
		else if(a > 0){
			System.out.println("o numero é positivo");
		}
		else
			System.out.println("o número é zero");
		sc.close();
	}

}
