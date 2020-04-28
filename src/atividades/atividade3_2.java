package atividades;
import java.util.Scanner;
public class atividade3_2 {

	public static void main(String[] args) {
		int a;
		Scanner sc = new Scanner(System.in);
		System.out.printf("insira um numero: ");
		a = sc.nextInt();
		if (a == 0) {
			System.out.println("o numero informado é neutro");
		}
		else if (a%2 == 0) {
			System.out.println("o numero informado é par");
		}
		else {
			System.out.println("o numero informado é impar");
		}
		sc.close();
	}

}
