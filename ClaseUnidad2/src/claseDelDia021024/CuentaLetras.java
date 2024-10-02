package claseDelDia021024;
import java.util.Scanner;

public class CuentaLetras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Bloque de entrada
		// Crear el teclado
		Scanner tec = new Scanner(System.in);
		// Pedir el dato de entrada
		System.out.print("Escribe 3 palabras separadas por comas: ");
		String frase = tec.nextLine();
		// Fin del bloque de entrada
		tec.close();
		
		// Algoritmo para obetener la lóngitud  de cada palabra
		int posicionComa1 = frase.indexOf(",");
		int posicionComa2 = frase.indexOf(",", posicionComa1+1);
		String p1 = frase.substring(0, posicionComa1).trim();
		String p2 = frase.substring(posicionComa1+1, posicionComa2).trim();
		String p3 = frase.substring(posicionComa2+1).trim();
		
		int letrasP1 = p1.length();
		int letrasP2 = p2.length();
		int letrasP3 = p3.length();
		
		
		
		// Bloque de salida
		System.out.println(p1 + " tiene " + letrasP1 + " letras");
		System.out.println(p2 + " tiene " + letrasP2 + " letras");
		System.out.println(p3 + " tiene " + letrasP3 + " letras");
	}

}
