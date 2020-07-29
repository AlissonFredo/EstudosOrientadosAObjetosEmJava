package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

public class Program {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		
		List<Shape> list = new ArrayList<>();
		
		System.out.print("Enter the number of shape: ");
		int numberOfShape = keyboard.nextInt();
		
		for(int i = 1; i <= numberOfShape; i++) {
			System.out.println("Shape #" + i + " data:");
			System.out.print("Rectangle or circle (r/c): ");
			char rectangleOrCircle = keyboard.next().charAt(0);
			System.out.print("Color (BLACK/BLUE/RED): ");
			Color color = Color.valueOf(keyboard.next());
			
			if(rectangleOrCircle == 'r') {
				
				System.out.print("Width: ");
				double width = keyboard.nextDouble();
				System.out.print("Height: ");
				double height = keyboard.nextDouble();
				list.add(new Rectangle(color, width, height));
			}else {
				System.out.print("Radius: ");
				double radius = keyboard.nextDouble();
				list.add(new Circle(color, radius));
			}
		}
		
		System.out.println();
		System.out.println("SHAPE AREAS:");
		
		for(Shape shape: list) {
			System.out.println(String.format("%.2f", shape.area()));
		}
		
		keyboard.close();
	}

}
