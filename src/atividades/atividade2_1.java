package atividades;

import java.util.Scanner;

public class atividade2_1 {

	public static void main(String[] args) {
		int x,y;
		
		Scanner sc = new Scanner (System.in);
		
		x = sc.nextInt();
		y = sc.nextInt() + x;
		
		System.out.println("soma = " + y);
		
		sc.close();
		

	}

}
