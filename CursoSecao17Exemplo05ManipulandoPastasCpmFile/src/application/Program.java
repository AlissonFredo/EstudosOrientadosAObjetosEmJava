package application;

import java.io.File;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter a folder path: ");
		String strPath = "C:\\Users\\dougl\\Documents";
		System.out.println(strPath);
		System.out.println();
		
		File path = new File(strPath);
		
		File[] folders = path.listFiles(File::isDirectory);
		System.out.println("FOLDER: ");
		for(File folder : folders) {
			System.out.println(folder);
		}
		
		System.out.println();
		File[] files = path.listFiles(File::isFile);
		System.out.println("FILES: ");
		for(File file : files) {
			System.out.println(file);
		}
		
		System.out.println();
		boolean success = new File(strPath + "\\subdir").mkdir();
		System.out.println("Directory created successfully: " + success);
		
		keyboard.close();
	}

}
