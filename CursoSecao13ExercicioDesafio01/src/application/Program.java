package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter client data:");
		System.out.print("Name: ");
		String name = keyboard.nextLine();
		System.out.print("Email: ");
		String email = keyboard.nextLine();
		System.out.print("Brith date (DD/MM/YYYY): ");
		Date birthDate = sdf.parse(keyboard.next());
		
		Client client = new Client(name, email, birthDate);
		
		System.out.println("Enter order data");
		System.out.print("Status: ");
		OrderStatus status = OrderStatus.valueOf(keyboard.next());
		
		Order order = new Order(new Date(), status, client);
		
		System.out.print("how many items to this order: ");
		int quantityItemsOrder = keyboard.nextInt();
		
		for(int i = 1; i <= quantityItemsOrder; i++) {
			System.out.println("Enter #" + i + " item data:");
			System.out.print("Product name:");
			keyboard.nextLine();
			String productName = keyboard.nextLine();
			System.out.print("Product price: ");
			double productPrice = keyboard.nextDouble();
			
			Product product = new Product(productName, productPrice);
			
			System.out.print("Quantity: ");
			int productQuantity = keyboard.nextInt();
			
			OrderItem orderItem = new OrderItem(productQuantity, productPrice, product);
			
			order.addItem(orderItem);
		}
		
		System.out.println();
		System.out.println("Order Sumary: ");
		System.out.println(order);
		
		keyboard.close();
	}

}
