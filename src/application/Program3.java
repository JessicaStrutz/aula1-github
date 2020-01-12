package application;

import java.util.Scanner;

import entities.Conta;

public class Program3 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter account number: ");
		long number = sc.nextLong();
		
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();

		System.out.print("Is there an initial deposit (y/n)? ");
		char answer = sc.next().charAt(0);
		double money = 0;
		if (answer == 'y') {
		
			System.out.print("Enter initial deposit value: ");
		
			money = sc.nextDouble();
		}
		else
			money = 0;
		
		Conta conta = new Conta(number, holder, money);
		
		System.out.println("Account data:");
		System.out.println(conta.toString());

		System.out.print("Enter a deposit value: ");
		double dMoney = sc.nextDouble();
		
		conta.AddMoney(dMoney);
		
		System.out.print("Uptaded account data: ");
		System.out.println(conta.toString());
		
		System.out.print("Enter a withdraw value: ");
		dMoney = sc.nextDouble();
		
		conta.RemoveMoney(dMoney);
		
		System.out.print("Uptaded account data: ");
		System.out.println(conta.toString());
		sc.close();
	}

}
