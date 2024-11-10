/*
14-¿Son las dos cadenas iguales?
Escribe un programa que pida dos cadenas de texto y responda si 
el contenido de las dos cadenas es el mismo.
 */

package actividadUnidad3;
import java.util.Scanner;

public class E14_CadenasIguales {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		System.out.print("Introduce una cadena de texto: ");
		String cadena1 = tec.nextLine();
		
		System.out.print("Introduce una segunda cadena para comparar si es la misma: ");
		String cadena2= tec.nextLine();
		
		System.out.print("¿Quieres distinguir entre mayúsculas y minúsculas? yes/no ");
		String caseSensitive = tec.nextLine();
		
		tec.close();
		
		if (caseSensitive.toLowerCase().equals("no")) {
			/*
			cadena1 = cadena1.toLowerCase();
			cadena2 = cadena2.toLowerCase();
			if (cadena1.equals(cadena2)) {
				System.out.println("El contenido de las dos cadenas es el mismo.");
			}else {
				System.out.println("El contenido de las dos cadenas NO es el mismo.");
			}
			*/
			// También se puede utilizar el método equalsIgnoreCase()
			if (cadena1.equalsIgnoreCase(cadena2)) {
				System.out.println("El contenido de las dos cadenas es el mismo.");
			}else {
				System.out.println("El contenido de las dos cadenas NO es el mismo.");
			}
		
		}else {
			if (cadena1.equals(cadena2)) {
				System.out.println("El contenido de las dos cadenas es el mismo.");
			}else {
				System.out.println("El contenido de las dos cadenas NO es el mismo.");
			}
		}
		

	}
}
