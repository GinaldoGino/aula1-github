package entities;

public class Employee {
	
	private int id;
	private String nome;
	private double salario;
	
	public Employee(int id, String nome, double salario) {
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getId() {
		return id;
	}

	public double getSalario() {
		return salario;
	}
	
	public void aumentaSalario(double porcentagem) {
		this.salario += salario * porcentagem / 100;
	}
	
	
}
