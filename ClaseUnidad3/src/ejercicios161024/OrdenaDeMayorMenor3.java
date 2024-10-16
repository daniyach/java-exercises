package ejercicios161024;

import java.util.Scanner;

public class OrdenaDeMayorMenor3 {

	public static void main(String[] args) {

		// Crear teclado
		Scanner tec = new Scanner(System.in);

		// Entrada de datos
		System.out.print("Escribe 3 números reales: ");
		double num1 = tec.nextDouble();
		double num2 = tec.nextDouble();
		double num3 = tec.nextDouble();

		tec.close();

		// Algoritmo de ordenación
		double mayor, medio, menor;

		if (num1 >= num2 && num1 >= num3) {
			mayor = num1;
			if (num2 >= num3) {
				medio = num2;
				menor = num3;
			} else {
				medio = num3;
				menor = num2;
			}
		} else if (num2 >= num3) {
			mayor = num2;
			if (num1 >= num3) {
				medio = num1;
				menor = num3;
			} else {
				medio = num3;
				menor = num1;
			}
		} else {
			mayor = num3;
			if (num1 >= num2) {
				medio = num1;
				menor = num2;
			} else {
				medio = num2;
				menor = num1;
			}
		}

		
		//Algoritmo de transformar double a int en caso de que su parte decimal sea 0
		int parteEntera =  (int) mayor;
		double parteDeciamal = mayor - parteEntera;
		if (parteDeciamal == 0.0) {
			mayor = parteEntera;
		}
		
		// Bloque de salida

		System.out.println(">> " + mayor + " " + medio + " " + menor);
	}

}
