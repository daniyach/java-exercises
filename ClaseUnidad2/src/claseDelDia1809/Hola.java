package claseDelDia1809;

import java.util.Scanner;

public class Hola {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Traer teclado a partir de la clase Scanner
		
		Scanner tec = new Scanner(System.in);
		
		// algoritmo
		System.out.print("Hola mundo, soy yo...");
		System.out.print("Dime tu nombre: ");
		String name;
		name = tec.nextLine();
		System.out.print("Hola " + name+"...Dime tu edad: ");
		int age;
		age = tec.nextInt();
		System.out.println("Tengo "+age+" años.");
		tec.close();
		
	}

}
