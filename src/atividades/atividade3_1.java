package atividades;

import java.util.Scanner;

public class atividade3_1 {

	public static void main(String[] args) {
		int a;
		Scanner sc = new Scanner(System.in);
		System.out.printf("informe um numero: ");
		a = sc.nextInt();
		if (a < 0) {
			System.out.println("o numero � negativo");
		}
		else if(a > 0){
			System.out.println("o numero � positivo");
		}
		else
			System.out.println("o n�mero � zero");
		sc.close();
	}

}
