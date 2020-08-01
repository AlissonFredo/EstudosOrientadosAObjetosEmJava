
package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		method1();
		
		System.out.println("fim do programa!");
		
	}

	public static void method1() {
		System.out.println("***METODO 1 INICIO***");
		method2();
		System.out.println("***METODO 1 FIM***");
	}
	
	public static void method2() {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("***METODO 2 INICIO***");
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
		System.out.println("***METODO 2 FIM***");
		keyboard.close();

	}
	
}
