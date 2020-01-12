package application;

import java.util.Scanner;

public class MatrizOutro {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		int[][] matriz = new int[m][n];
		
		for(int idxLinha = 0;idxLinha < m;++idxLinha)
		{
			for(int idxColuna = 0;idxColuna < n;++idxColuna)
			{
				matriz[idxLinha][idxColuna] = sc.nextInt();
			}
		}
		
		int numero =sc.nextInt();
		
		for(int idxLinha = 0;idxLinha < m;++idxLinha)
		{
			for(int idxColuna = 0;idxColuna < n;++idxColuna)
			{
				if (matriz[idxLinha][idxColuna] == numero)
				{
					System.out.println("Position " + idxLinha + "," + idxColuna + ":");
					if (idxColuna - 1 >= 0)
						System.out.println("Left: " + matriz[idxLinha][idxColuna - 1]);
					if (idxColuna + 1 < n)
						System.out.println("Right: " + matriz[idxLinha][idxColuna + 1]);
					if (idxLinha - 1 >= 0)
						System.out.println("Up: " + matriz[idxLinha - 1][idxColuna]);
					if (idxLinha + 1 < m)
					System.out.println("Down: " + matriz[idxLinha + 1][idxColuna]);
				}
			}
		}
	}

}
