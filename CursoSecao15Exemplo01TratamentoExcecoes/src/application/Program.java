package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		
		try {
			System.out.print("preencha o vetor: ");
			String[] vect = keyboard.nextLine().split(" ");
			System.out.print("digite uma posição do vetor: ");
			int position = keyboard.nextInt();
			System.out.println("Na posição #" + position + " tem o nome: " + vect[position]);
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("posição invalida!");
		}catch(InputMismatchException e) {
			System.out.println("erro de input!");
		}
		
		System.out.println("fim do programa!");
		
		keyboard.close();
	}

}
