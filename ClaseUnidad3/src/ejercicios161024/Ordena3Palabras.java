package ejercicios161024;

import java.util.Scanner;

public class Ordena3Palabras {

	public static void main(String[] args) {

		// Crear teclado
		Scanner tec = new Scanner(System.in);

		// Entrada de datos
		System.out.print("Escribe 3 palabras: ");
		String p1 = tec.next();
		String p2 = tec.next();
		String p3 = tec.next();

		tec.close();

		// Algoritmo de ordenación
		String po1, po2, po3;

		if (p1.compareToIgnoreCase(p2) <= 0 && p1.compareToIgnoreCase(p3) <= 0) {
			po1 = p1;
			if (p2.compareToIgnoreCase(p3) <= 0) {
				po2 = p2;
				po3 = p3;
			} else {
				po2 = p3;
				po3 = p2;
			}
		} else if (p2.compareToIgnoreCase(p3)<=0) {
			po1 = p2;
			if (p1.compareToIgnoreCase(p3)<=0) {
				po2 = p1;
				po3 = p3;
			} else {
				po2 = p3;
				po3 = p1;
			}
		} else {
			po1 = p3;
			if (p1.compareTo(p2)<=0) {
				po2 = p1;
				po3 = p2;
			} else {
				po2 = p2;
				po3 = p1;
			}
		}

		// Bloque de salida
		System.out.println(">> " + po1 + ", " + po2 + ", " + po3);
	}


}
