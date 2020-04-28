package atividades;

import java.util.Scanner;

public class atividade4_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee empregado = new Employee();
		
		System.out.print("Name: ");
		empregado.name = sc.nextLine();
		
		System.out.print("Gross Salary: ");
		empregado.grossSalary = sc.nextDouble();
		
		System.out.print("Tax: ");
		empregado.tax = sc.nextDouble();
		
		System.out.println(" ");
		System.out.printf("Employee: %s, $ %.2f", empregado.name , empregado.netSalary());
		System.out.println(" ");
		System.out.print("Which percentage to increase salary? ");
		empregado.increaseSalary(sc.nextDouble());
		System.out.println(" ");
		System.out.printf("Update data: %s, $ %.2f", empregado.name , empregado.netSalary());
		
		sc.close();
	}

}
