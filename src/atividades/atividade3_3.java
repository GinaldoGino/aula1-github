package atividades;
import java.util.Scanner;
public class atividade3_3 {

	public static void main(String[] args) {
		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira os numeros");
		a = sc.nextInt();
		b = sc.nextInt();
		if (a <= b) {
			if (b%a == 0) {
				System.out.println("sao multiplos");
			}
			else {
				System.out.println("não sao multiplos");
			}
				
		}
		else {
			if (a%b == 0) {
				System.out.println("sao multiplos");
			}
			else {
				System.out.println("não sao multiplos");
			}
		}
		sc.close();

	}

}
