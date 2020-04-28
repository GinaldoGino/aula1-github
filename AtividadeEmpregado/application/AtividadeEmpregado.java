package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;

public class AtividadeEmpregado {

	public static void main(String[] args) {
		
		List<Employee> lista = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos empregados serao registrados? ");
		int n = sc.nextInt();
		System.out.println("");
		
		for (int i=1; i<=n; i++) {
			System.out.println("Empregado #"+ i);
			System.out.print("ID: ");
			int id = sc.nextInt();		
			sc.nextLine();
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Salario: ");
			double salario = sc.nextDouble();
			System.out.println("");
			lista.add(new Employee (id,nome, salario)); //cada elemento da lista está apontando para um objeto Employee	 
		}
		System.out.print("Informe o ID do empregado que recebera aumento: ");
		int id = sc.nextInt();
		Employee emp = lista.stream().filter(x -> x.getId() == id).findFirst().orElse(null);// emp recebe o endereço para o objeto que contem a ID informado 
		System.out.println(emp);
		if (emp == null) {
			System.out.println("Empregado inexistente!");
		}
		else {
			System.out.print("Informe a porcentagem do aumento: ");
			double porcentagem = sc.nextDouble();
			emp.aumentaSalario(porcentagem);
		}
		
		
		System.out.println("");
		System.out.println("Lista de empregados");
		for (Employee x: lista) {
			System.out.printf("%d, %s, %.2f\n", x.getId(),x.getNome(), x.getSalario());
			
			
		}
		sc.close();
	}

}
