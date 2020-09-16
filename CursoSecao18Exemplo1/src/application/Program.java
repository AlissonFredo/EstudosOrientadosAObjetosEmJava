package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.CarRental;
import model.entities.Vehicle;
import model.services.BrazilTaxService;
import model.services.RentalService;

public class Program {

	public static void main(String[] args) throws ParseException{

		Scanner keyboard = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:ss");
		
		System.out.println("enter rental date");
		System.out.print("car model: ");
		String carModel = keyboard.nextLine();
		System.out.print("pickup (dd/MM/yyyy HH:ss): ");
		Date start = sdf.parse(keyboard.nextLine());
		System.out.print("return (dd/MM/yyyy HH:ss): ");
		Date finish = sdf.parse(keyboard.nextLine());
		
		CarRental cr = new CarRental(start, finish, new Vehicle(carModel));
		
		System.out.print("enter price per hour: ");
		double pricePerHour = keyboard.nextDouble();
		System.out.print("enter price per day: ");
		double pricePerDay = keyboard.nextDouble();
		
		RentalService rentalService = new RentalService(pricePerDay, pricePerHour, new BrazilTaxService());
		
		rentalService.processInvoice(cr);
		
		System.out.println("invoice");
		System.out.println("basic payment: " + String.format("%.2f", cr.getInvoice().getBasicPayment()));
		System.out.println("tax: " + String.format("%.2f", cr.getInvoice().getTax()));
		System.out.println("total payment: " + String.format("%.2f", cr.getInvoice().getTotalPayment()));

		
		keyboard.close();
	}

}
