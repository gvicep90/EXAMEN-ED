package main;

import java.util.Scanner;

public class MainED_EXAMEN1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		int array[] = { 5, 1, 22, 9, 12, 6, 4, 8, 15, 21, 18, 17, 2, 11, 6};
		int num, i;
		boolean sw = false;
		
		System.out.println("Introduce un numero para ver si esta en el array:");
		num = sc.nextInt();
		
		for (i = 0; i < array.length && sw == false; i++) {
			if (array[i] == num) {
				sw = true;
			}
		}
		
		if (sw) {
			System.out.println("El numero " + num + " SI esta en el array");
		}
		else {
			System.out.println("El numero " + num + " NO esta en el array");
		}
		
		sc.close();
		
		
	}

}
