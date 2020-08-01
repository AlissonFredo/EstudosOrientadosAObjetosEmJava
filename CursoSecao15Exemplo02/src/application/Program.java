package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Reservation;
import model.exceptions.DomainException;

public class Program {

	public static void main(String[] args){

		Scanner keyboard = new Scanner(System.in);
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		
		try {
			System.out.print("Room number: ");
			int roomNumber = keyboard.nextInt();
			System.out.print("Check-in date (DD/MM/YYYY): ");
			Date checkIn = simpleDateFormat.parse(keyboard.next());
			System.out.print("Check-out date (DD/MM/YYYY): ");
			Date checkOut = simpleDateFormat.parse(keyboard.next());
			
			Reservation reservation = new Reservation(roomNumber, checkIn, checkOut);
			System.out.println("Reservation: " + reservation);
			
			System.out.println();
			System.out.println("Enter data to update the reservation: ");
			System.out.print("Check-in date (DD/MM/YYYY): ");
			checkIn = simpleDateFormat.parse(keyboard.next());
			System.out.print("Check-out date (DD/MM/YYYY): ");
			checkOut = simpleDateFormat.parse(keyboard.next());
			
			reservation.update(checkIn, checkOut);
			System.out.println("Reservation: " + reservation);
		}catch(ParseException e){
			System.out.println("Invalid date format");
		}catch(DomainException e) {
			System.out.println("Error in reservation: " + e.getMessage());
		}
		
		keyboard.close();
	}
}
