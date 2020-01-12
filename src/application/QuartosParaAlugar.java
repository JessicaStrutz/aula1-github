package application;

import java.util.Scanner;
import entities.Quarto;

public class QuartosParaAlugar {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Quartos para alugar:");
		
		int QtdQuartos = sc.nextInt();

		Quarto[] vect = new Quarto[10];
		
		String sName;
		String sEmail;
		int iQuarto = 0;
		
		for(int idx = 0; idx < QtdQuartos;idx++){
			System.out.println("Quarto: ");
			iQuarto = sc.nextInt();
			
			System.out.println("Nome:");
			sc.nextLine();
			sName = sc.nextLine();
			
			System.out.println("Email:");
			sEmail = sc.nextLine();
			
			vect[iQuarto] = new Quarto(sName, sEmail);
		}
		
		System.out.println("Quartos ocupados:");
		System.out.println();
		
		for(int idx = 0; idx < vect.length;idx++){
		
			if (vect[idx] != null) {
				System.out.println("Nome: " + vect[idx].getM_sNome());
				System.out.println("Email: " + vect[idx].getM_sEmail());
				System.out.println();			
			
			}
		}
	}

}
