/*Escribe un programa que pida tu edad, la almacene en una variable 
 * y escriba una frase en tu pantalla diciendo algo así (si, por ejemplo, tu introduces 24). 
 * Tienes 24 años y el próximo año tendrás 25.
 */

package actividadesUnidad2;
import java.util.Scanner;


public class MiEdad {
	public static void main(String[] args) {
		// pedir por teclado la edad
		Scanner tec = new Scanner(System.in);
		
		System.out.print("¿Cuántos años tienes? ");
		// int year = (int) tec.nextInt();
		/* Para evitar que se introduzca un dato con coma flotante y falle
		 * podríamos guardar la variable year como String, después redondear el numero 
		 * a la baja para que luego utilizando el dato envolvente Integer con el método parseInt guardarlo como int.
		 * El problema es que si pasa un double habría que hacer un Math.floor(year).
		 */
		String year = tec.nextLine().trim();
		tec.close();
		
		double yearD = Double.parseDouble(year);
		yearD = Math.floor(yearD);
		int yearInt = (int) yearD;
		
		// Devolver los años que tiene y los que tendrá el año que viene
		System.out.println("Tienes " + yearInt + ", el próximo año tendrás " + ++yearInt + ".");
	}
}
