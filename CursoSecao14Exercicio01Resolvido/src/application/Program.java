package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		
		List<Employee> list = new ArrayList<>();
		
		System.out.print("Enter the number of employees: ");
		int numberOfEmployees = keyboard.nextInt();
		
		for(int i = 1; i <= numberOfEmployees; i++) {
			
			System.out.println("Employee #" + i + " data:");
			System.out.print("Outsourced (y/n)? ");
			char OutsourcedYesOrNot = keyboard.next().charAt(0);
			System.out.print("Name: ");
			keyboard.nextLine();
			String name = keyboard.nextLine();
			System.out.print("Hours: ");
			int hours = keyboard.nextInt();
			System.out.print("Value per hour: ");
			double valuePerHour = keyboard.nextDouble();
			
			if(OutsourcedYesOrNot == 'y') {
				System.out.print("Additional charge: ");
				double additionalCharge = keyboard.nextDouble();
				list.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));
			}else {
				list.add(new Employee(name, hours, valuePerHour));
			}
		}
		
		System.out.println();
		for(Employee emp : list) {
			System.out.println(emp.getName() + " - $" + String.format("%.2f", emp.payment()));
		}
		
		keyboard.close();
	}

}
