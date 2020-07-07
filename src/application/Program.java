package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Entre com os dados do produto:");

		System.out.print("Nome: ");
		String name = sc.nextLine();

		System.out.print("Preço: ");
		double price = sc.nextDouble();
		
		Product product = new Product(name, price);
		
		product.setName("Computer");
		System.out.println("Updated name: " + product.getName());
		product.setPrice(3200.00);
		System.out.println("Updated price: " + product.getPrice());

		System.out.println();
		System.out.println("Dados do produto: " + product);

		System.out.print("Entre com o numero de produtos para adicionar no estoque: ");
		int quantity = sc.nextInt();
		product.addProduct(quantity);
		System.out.println();
		System.out.println("Produto atualizado: " + product);

		System.out.print("Entre com o numero de produtos para remover no estoque: ");
		quantity = sc.nextInt();
		product.removeProduct(quantity);
		System.out.println();
		System.out.println("Produto atualizado: " + product);

		sc.close();
	}

}
