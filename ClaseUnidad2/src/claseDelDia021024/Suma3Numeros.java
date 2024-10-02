package claseDelDia021024;
import java.util.Scanner;

public class Suma3Numeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Bloque de entrada
		Scanner tec = new Scanner(System.in);
		System.out.print("Escribe 3 números separados por espacios en blanco: ");
		String datos = tec.nextLine();
		// Fin de bloque de entrada
		tec.close();
		
		// Algoritmo para que obtenga la suma
		datos = datos.trim();
		int blanco1 = datos.indexOf(" ");
		String num1 = datos.substring(0, blanco1);
		String datos2 = datos.substring(blanco1+1).trim();
		blanco1 = datos2.indexOf(" ");
		String num2 = datos2.substring(0, blanco1);
		String num3 = datos2.substring(blanco1+1).trim();
		
		double n1 = Double.parseDouble(num1);
		double n2 = Double.parseDouble(num2);
		double n3 = Double.parseDouble(num3);
		
		double suma = n1+n2+n3;
		
		// Bloque de salida
		System.out.println("\n >> "+ n1+" + "+n2+" + "+n3+" = " + suma);
		
		
	}

}
