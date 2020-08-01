package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Reservation;

public class Program {

	public static void main(String[] args) throws ParseException {

		Scanner keyboard = new Scanner(System.in);
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Room number: ");
		int roomNumber = keyboard.nextInt();
		System.out.print("Check-in date (DD/MM/YYYY): ");
		Date checkIn = simpleDateFormat.parse(keyboard.next());
		System.out.print("Check-out date (DD/MM/YYYY): ");
		Date checkOut = simpleDateFormat.parse(keyboard.next());
		
		/*o metodo after testa se uma data é depois da outra*/
		if(!checkOut.after(checkIn)) {
			System.out.println("Error in reservation: check-out date must be after check-in date");
		}else {
			Reservation reservation = new Reservation(roomNumber, checkIn, checkOut);
			System.out.println("Reservation: " + reservation);
			
			System.out.println();
			System.out.println("Enter data to update the reservation: ");
			System.out.print("Check-in date (DD/MM/YYYY): ");
			checkIn = simpleDateFormat.parse(keyboard.next());
			System.out.print("Check-out date (DD/MM/YYYY): ");
			checkOut = simpleDateFormat.parse(keyboard.next());
			
			String error = reservation.update(checkIn, checkOut);
			if(error != null) {
				System.out.println("Error in reservation: " + error);
			}else {
				System.out.println("Reservation: " + reservation);
			}		
		}	
		keyboard.close();
	}
}
