package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import entities.DadosFuncionario;;

public class Funcionario {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many employees will be registered? ");
		
		int lQtdFuncionarios = sc.nextInt();
		
		int vect[] = new int[lQtdFuncionarios];
		
		List<DadosFuncionario> listEmployees = new ArrayList<>();
		
		int numero = 0;
		
		System.out.println();
		
		for(int idx = 0; idx < lQtdFuncionarios;++idx)
		{
			++numero;
			
			System.out.println("Employee # " + numero + ":");
			System.out.print("Id: ");
			int iId = sc.nextInt();
			
			System.out.print("Name: ");
			sc.nextLine();
			String sName = sc.nextLine();
			
			System.out.print("Salary: ");
			double dSalario = sc.nextDouble();
			
			DadosFuncionario funcionario = new DadosFuncionario(iId, sName, dSalario);
			
			listEmployees.add(funcionario);
			
			System.out.println();
		}
		
		System.out.print("Enter the employee id that will have salary increase: ");
		int id = sc.nextInt();
		
		System.out.print("Enter the porcentage: ");
		double dPorcentage = sc.nextDouble();
		
		
		for(DadosFuncionario funcionario: listEmployees)
		{
			if (funcionario.getId() == id) {
				double dNovoSalario = funcionario.getSalary() + funcionario.getSalary() * (dPorcentage / 100);
				funcionario.setSalary(dNovoSalario);
			}
		}
		
		System.out.println("List of employees:");
		for(DadosFuncionario funcionario: listEmployees)
		{
			System.out.print(funcionario.getId() + ", ");
			System.out.print(funcionario.getName() + ", ");
			System.out.printf("%.2f%n", funcionario.getSalary());
		}
		
		
		
	}

}
