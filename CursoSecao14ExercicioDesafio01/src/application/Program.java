package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {

		Scanner keyboard = new Scanner(System.in);
		
		List<Product> list = new ArrayList<>();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Enter the number of products: ");
		int numberOfProducts = keyboard.nextInt();
		
		for(int i = 1; i <= numberOfProducts; i++) {
			System.out.println("Product #" + i + "data:");
			System.out.print("Common, used or imported (c/u/i)? ");
			char commonUsedImported = keyboard.next().charAt(0);
			System.out.print("Name: ");
			keyboard.nextLine();
			String name = keyboard.nextLine();
			System.out.print("Price: ");
			double price = keyboard.nextDouble();
			
			switch(commonUsedImported) {
			case 'c':
				list.add(new Product(name, price));
				break;
			case 'i':
				System.out.print("Customs fee: ");
				double customsFee = keyboard.nextDouble();
				list.add(new ImportedProduct(name, price, customsFee));
				break;
			case 'u':
				System.out.print("Manufacture date (DD/MM/YYY): ");
				Date manufactureDate = simpleDateFormat.parse(keyboard.next());
				list.add(new UsedProduct(name, price, manufactureDate));
			}
			
		}
		
		System.out.println();
		System.out.println("PRICE TAGS:");
		
		for(Product product : list) {
			System.out.println(product.priceTag());
		}
		
		keyboard.close();
	}

}
