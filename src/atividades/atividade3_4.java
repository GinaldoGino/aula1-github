package atividades;
import java.util.Scanner;
public class atividade3_4 {

	public static void main(String[] args) {
		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("informe a entrada depois a saida:");
		a = sc.nextInt();
		b = sc.nextInt();
		
		while (a<0 || b>23) {
			System.out.println("informe a entrada depois a saida:");
			a = sc.nextInt();
			b = sc.nextInt();
		}
		
		if (b >= a) {
			System.out.printf("o jogo durou %d horas", b-a);
		}
		else {
			System.out.printf("o jogo durou %d horas", 24-(a-b));
		}
		sc.close();
	}

}
