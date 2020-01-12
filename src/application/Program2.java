package application;

import java.util.Scanner;
import entities.Product;
import java.util.Locale;

public class Program2 {

	public static void main(String[] args) {

	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	Product cProduto = new Product();

	System.out.println("Enter product data:");
	System.out.println("Name:");
	cProduto.sNome = sc.next();
	System.out.println("Price:");
	cProduto.dPreco = sc.nextDouble();
	System.out.println("Quantity in stock:");
	cProduto.ulQtd = sc.nextLong();

	System.out.println();
	System.out.println(cProduto.toString());

	System.out.println();
	System.out.print("Enter the number of products to be added  in stock: ");
	long ulQtd = 0;
	ulQtd = sc.nextLong();
	cProduto.AddProducts(ulQtd);
	
	System.out.println();
	System.out.println(cProduto.toString());

	System.out.println();
	System.out.print("Enter the number of products to be removed  in stock: ");
	ulQtd = sc.nextLong();
	cProduto.RemoveProducts(ulQtd);
	
	System.out.println();
	System.out.println(cProduto.toString());

	sc.close();
	}
}
