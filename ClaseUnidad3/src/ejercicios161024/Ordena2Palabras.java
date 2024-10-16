package ejercicios161024;

import java.util.Scanner;

public class Ordena2Palabras {

	public static void main(String[] args) {

		Scanner tec = new Scanner(System.in);
		// Bloque de entrada de datos

		System.out.print("Escribe 2 palabras: ");
		String p1 = tec.next(); // Saber la diferencia entre el método next() y el nextLine()
		String p2 = tec.next();

		tec.close();

		// Algoritmo de ordenación

		String po1, po2;
		String minus1 = p1.toLowerCase();
		String minus2 = p2.toLowerCase();

		if (minus1.compareTo(minus2) <= 0) { // se puede utilizar el compareToIgnoreCase()
			po1 = p1;
			po2 = p2;
		} else {
			po1 = p2;
			po2 = p1;
		}

		// Bloque de salida
		System.out.println(">> " + po1 + ", " + po2);
	}

}
