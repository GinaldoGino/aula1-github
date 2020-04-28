package atividades;

public class Employee {
	public String name;
	public double grossSalary, tax;
	
	public double netSalary() {
		return grossSalary - tax;
	}
	
	public void increaseSalary(double percent) {
		this.grossSalary += percent * this.grossSalary / 100;
	}

}
