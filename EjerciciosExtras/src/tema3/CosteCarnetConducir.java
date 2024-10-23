package tema3;

import java.util.Scanner;

public class CosteCarnetConducir {

	/*	Realizar un programa que calcule la tarifa de una autoescuela teniendo en cuenta el tipo de carnet (A,B,C
	 *	o D) y el número de prácticas realizadas. Precios de las matrículas: A 150 euros, B 325 euros, C 520
	 *	euros, D 610 euros. Precios por práctica según carnet: A 15 euros, B 21 euros, C 36 euros, D 50 euros.
	 */
	
	public static void main(String[] args) {
		
		Scanner tec = new Scanner(System.in);
		
		// Bloque entrada de datos
		
		System.out.print("¿Tipo de carnet? (A, B, C, D): ");
		String carnet = tec.nextLine().trim().substring(0,1).toUpperCase();
		
		System.out.print("Horas realizadas: "); // Importante dejar para el final los números
		int horas = tec.nextInt();

		/*System.out.print("Horas realizadas: "); 
		int horas = tec.nextInt();
		
		System.out.print("¿Tipo de carnet? (A, B, C, D): ");
		String carnet = tec.nextLine().trim().substring(0,1).toUpperCase();*/
		
		tec.close();
		
		// Algoritmo
		
		int matA = 150, phoraA = 15;
		int matB = 320, phoraB = 21;
		int matC = 520, phoraC = 36;
		int matD = 610, phoraD = 50;
		
		int aPagar;
		
		if (carnet.equals("A")) {
			aPagar = phoraA * horas + matA;
		}else if(carnet.equals("B")) {
			aPagar = phoraB * horas + matB;
		}else if(carnet.equals("C")) {
			aPagar = phoraC * horas + matC;
		}else {
			aPagar = phoraD * horas + matD;
		}
		
		// Bloque de salida
		System.out.println("Debe usted abonar: " + aPagar + "€");
	}

}
