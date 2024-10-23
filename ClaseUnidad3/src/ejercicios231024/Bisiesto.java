package ejercicios231024;

import java.util.Scanner;


public class Bisiesto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner tec = new Scanner(System.in);
		System.out.print("Introduce un año: ");
		int anyo = tec.nextInt();
		
		
		// algoritmo
		
		String es="No es bisiesto";
		
		if((anyo % 100 == 0 && anyo % 400 == 0) || anyo % 4 == 0) {
			es = "Es bisiesto";
		}
		
		System.out.println(es);
		
	}

}
