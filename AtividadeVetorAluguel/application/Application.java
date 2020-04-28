package application;

import java.util.Scanner;
import entities.Pension;

public class Application {

	public static void main(String[] args) {
		
		Pension[] pen = new Pension[10];
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos quartos serão alugados? ");
		int quantidade = sc.nextInt();
		sc.nextLine();
		for (int i=0;i<quantidade;i++) {
			System.out.println("");
			System.out.printf("ALUGUEL #%d: ", i+1);
			System.out.println("");
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Quarto: ");
			int quarto = sc.nextInt();
			sc.nextLine();
			pen[quarto] = new Pension(nome,email);
		}
		System.out.println("");
		System.out.println("Quartos ocupados:");
		for(int i=0;i<pen.length;i++) {
			if (pen[i] != null) {
				System.out.printf("%d: %s, %s\n", i, pen[i].getNome(),pen[i].getEmail());
			}
		}
		sc.close();
	}

}
