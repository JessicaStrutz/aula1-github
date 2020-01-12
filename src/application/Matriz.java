package application;

import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int n = sc.nextInt();
		
		int[][] matriz = new int[n][n];
		
		int qtdNegativos = 0;
		
		for(int idxLinha = 0;idxLinha < n;++idxLinha)
		{
			for(int idxColuna = 0;idxColuna < n;++idxColuna)
			{
				matriz[idxLinha][idxColuna] = sc.nextInt();
				if (matriz[idxLinha][idxColuna] < 0)
					++qtdNegativos;
			}
		}
		
		System.out.println("Main diagonal:");
		for(int idxLinha = 0;idxLinha < n;++idxLinha)
		{
			for(int idxColuna = 0;idxColuna < n;++idxColuna)
			{
				if (idxLinha == idxColuna)
					System.out.print(matriz[idxLinha][idxColuna] + " ");
			}
		}
		
		System.out.println();
		System.out.println("Negative numbers: " + qtdNegativos);

	}

}
