package main;

import java.util.Scanner;

import clases.Array;

/**
 * Programa para comprobar que un numero esta en un array.
 * @author 	Gonzalo Vicente Cepeda
 * @version 1.0
 * @since 	2019-03-15 
 */
public class MainED_EXAMEN2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		Array a = new Array ();
		int num;
		
		System.out.println("Introduce un numero para ver si esta en el array:");
		num = sc.nextInt();
		
		if (a.busquedaLineal(num)) {
			System.out.println("El numero " + num + " SI esta en el array");
		}
		else {
			System.out.println("El numero " + num + " NO esta en el array");
		}
		
		sc.close();
		
	}

}
