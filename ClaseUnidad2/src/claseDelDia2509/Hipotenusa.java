package claseDelDia2509;
import java.util.Scanner;

public class Hipotenusa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tec = new Scanner(System.in);
		
		// Bloque de entrada
		System.out.println("Este programa calcula la hipotenusa de un triángulo, a partir de sus catetos: ");
		System.out.print("Valor del cateto 1: ");
		double c1 = tec.nextDouble();
		System.out.print("Valor del cateto 2: ");
		double c2 = tec.nextDouble();
		tec.close();
		
		// Algoritmo calcula hipotenusa
		//double hipo = Math.sqrt(c1*c1+c2*c2);
		double hipo = Math.sqrt(Math.pow(c1, 2) + Math.pow(c2, 2));

		// Bloque de salida
		System.out.println("Su hipotenusa es: " + hipo);
	}

}
