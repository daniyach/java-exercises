package ejecutables;
import java.util.Scanner;

import misMetodos.MyMath;

public class Operaciones {

	public static void main(String[] args) {

		Scanner tec = new Scanner(System.in);
		
		// Entrada de datos
		
		System.out.print("Escribe dos números: ");
		double num1 = tec.nextDouble();
		double num2 = tec.nextDouble();
		
		// Algoritmo (Llamada al método)
		double vmax = MyMath.maximo(num1, num2);
		
		// Bloque de salida
		
		System.out.println(">> " + vmax);
		System.out.println(">> " + MyMath.maximo(3, 2)); // devulve un int (coge el método del main)
		System.out.println(">> " + MyMath.maximo(3, 2.0)); // devuelve un double (coge el metodo del double)
		System.out.println(">> " + MyMath.maximo(2.0, 5, 7));
		
		System.out.print("[invierteNumero] Escribe un número entero: ");
		int x = tec.nextInt();
		
		int invertirX = MyMath.inverteEntero(x);
		
		System.out.println(">> " + invertirX);
		System.out.println(">> "+ MyMath.decimalToBinario(7));
		System.out.println(">> "+ MyMath.decimalBaseN(7, 7));
		System.out.println("-----------------");
		System.out.println(">> "+ MyMath.dec2Hex(0));
		
		
	}

}
