/*
13-Buscando subcadenas
Escribe un programa que pida dos cadenas e imprima si la segunda cadena de texto 
es un subcadena de la primera.
 */

package actividadUnidad3;
import java.util.Scanner;


public class E13_BuscandoSubcadenas {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		System.out.print("Introduce una cadena de texto: ");
		String cadena1 = tec.nextLine().toLowerCase();
		System.out.print("Introduce una palabra para comprobar si es una subcadena de la primera: ");
		String cadena2 = tec.nextLine().toLowerCase();
		
		tec.close();
		
		int inicioSubcadena = cadena1.indexOf(cadena2);
		
		if (inicioSubcadena != -1) {
			System.out.println(">>> La segunda cadena es una subcadena de la primera");
			System.out.println(">>> Empieza en la posición: "+ (inicioSubcadena + 1));
		}else {
			System.out.println(">>> La segunda cadena no es una subcadena de la primera.");
		}
	
	}
	
}
