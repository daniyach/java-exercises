/* Complete el programa tal que lea un valor real 
 * correspondiente a una magnitud en grados Celsius 
 * y la convierta en Fahrenheit usando la siguiente formula:
 * (grados_Fahrenheit) = (grados_Celsius * 9 / 5) + 32
*/
package claseDelDia2509;
import java.util.Scanner;


public class Celsius2Fahrenheit {
	public static void main(String[] args) {
		// Crear teclado 
		Scanner tec = new Scanner(System.in);
		
		// Leer los grados en Celsius usando Scanner
		System.out.print("Dame el número de grados Celsius que quieres transformar: ");
		double gCelsius = tec.nextDouble();
		tec.close();
		
		// Calcular e imprimir el equivalente en Fahrenheit
		double gFahren = (gCelsius * 9 / 5) + 32 ;
		
		// Imprime los grados Fahrenheit
		System.out.println("La equivalencia en Fahrenheit es: " + gFahren + "ºF");
	}
	
	
}