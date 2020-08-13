package application;

import java.io.File;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		
		String strpath = "C:\\Users\\dougl\\Desktop\\in.txt";
		System.out.println("Enter a file path: " + strpath);
		
		File path = new File(strpath);
		
		System.out.println("getName: " + path.getName());
		System.out.println("getParent: " + path.getParent());
		System.out.println("getPath: " + path.getPath());
		
		keyboard.close();
	}

}
