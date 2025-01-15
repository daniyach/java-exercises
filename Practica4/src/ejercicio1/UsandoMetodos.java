package ejercicio1;

/*Pr�ctica 4. Ejercicio 1:

M�todos

Objetivos:

En esta primera pr�ctica el alumno adquiere conocimientos:

- Implementar un nuevo m�todo para ser llamado por el m�todo principal (main()) o por otro m�todo.
- Declarar su cabezera y su cuerpo.
- Definir sus par�metros de entrada.
- Devolver (return) su par�metro de salida.
- Llamada a un m�todo desde otro m�todo, como por ejemplo el m�todo main
- Entender el concepto de m�todos sobrecargados

Programa a realizar:

Consta de 6 m�todos:

M�todo 1:

Programe un m�todo que reciba como par�metro de entrada un String y devuelve un entero. 
El m�todo recibe un texto con el fin de solicitar un n�mero entero por teclado. 
Leer� el n�mero y lo devolver�.

Con la cabecera:

public static int readInt(String ask)

p.ej. Supongamos ask es " Introduce un número entero ". El método preguntará "Introduce un número entero:".
Observa el método elimina los espacios en blanco del principio y del final y ha añadido dos puntos. 
Importante: Si en la pregunta ya están los dos puntos no deberá añadirlos. En definitiva estamos 
programando el método de Java nextInt(), pero con la diferencia que lleva integrada la pregunta a hacer.

Métodos 2 y 3:

Igual al método uno, pero solicita un número real, del tipo double y un String.

public static double readDouble(String ask) Método 2

public static String readString(String ask) Método 3

Importante: Tras leer por teclado un dato del tipo numérico es necesario vaciar el buffer del teclado. 
Ya que el carácter salto de línea se queda en el buffer y los métodos nexInt(), nextDouble(), nextFloat(), 
etc, consideran némero todo lo que hay antes del código de salto de línea. 
Para vaciar el buffer use tras leer el número el método nextLine(), ya que este leerá el salto de línea
vaciando el buffer.

  p.ej.

      int p=tec.nextInt();

      tec.nexLine(); //No se almacena lo leído en ninguna variable

Por tanto, el buffer del teclado ahora está vacío, en p ha quedado el número y nextline() ha leído 
el código de salto de línea (observa queno hace falta almacenar esa información en ninguna variable)

M�todos 4,5 y 6:

Aplicando sobrecarga implemente tres m�todos con el mismo nombre (show()). 
Los tres no devuelven nada (void) y los tres tienen dos par�metros de entrada, el primero es com�n 
a los tres y es un String, y el segundo es diferente, para el m�todo 4, es un entero int, para el m�todo 5,
 es un n�mero real double y para el 6 es un String.

Los m�todos 4,5,6 imprimen la cadena de texto introducida como par�metro 1 seguido del valor introducido 
en el par�metro 2.

Ejemplo:

  show("El n�mero es", 5)

  El n�meroe es: 5
*/

import java.util.Scanner;

class UsandoMetodos {

	static Scanner tec = new Scanner(System.in);

	public static void main(String[] args) {

		int x = readInt("  Introduce un número entero:  ");
		show("Valor introducido:", x);

		double d = readDouble("Introduce un número real");
		show("Valor introducido:", d);

		String str = readString("Introduce tu nombre:   ");
		show("Nombre:", str);

		str = readString("Introduce tus apellidos:   ");
		show("Apellidos:", str);

	} // Fin método main

	// Método 1
	public static int readInt(String ask) {

		// Programe aquí el código del método
		ask = ask.trim();
		if (!ask.endsWith(":")) {
			ask = ask + ": ";
		} else {
			ask = ask + " ";
		}

		System.out.print(ask);
		int x = tec.nextInt();
		tec.nextLine();

		return x;
	}

	// Método 2
	public static double readDouble(String ask) {

		// Programe aqu� el c�digo del m�todo

		ask = ask.trim();
		if (!ask.endsWith(":")) {
			ask = ask + ": ";
		} else {
			ask = ask + " ";
		}

		System.out.print(ask);
		double x = tec.nextDouble();
		tec.nextLine();

		return x;
	}

	// Método 3
	public static String readString(String ask) {

		// Programe aqu� el c�digo del m�todo

		ask = ask.trim();
		if (!ask.endsWith(":")) {
			ask = ask + ": ";
		} else {
			ask = ask + " ";
		}

		System.out.print(ask);
		String x = tec.nextLine();

		return x;
	}

	// Programe a partir de aqu� los m�todos show aplicando sobrecarga

	// Método 4
	public static void show(String ask, int a) {
		ask = ask.trim();
		if (!ask.endsWith(":")) {
			ask = ask + ": ";
		} else {
			ask = ask + " ";
		}

		System.out.println(ask + a);
	}

	// Método 5
	public static void show(String ask, double a) { // esto se llama sobrecarga
		ask = ask.trim();
		if (!ask.endsWith(":")) {
			ask = ask + ": ";
		} else {
			ask = ask + " ";
		}

		System.out.println(ask + a);
	}

	// Método 6
	public static void show(String ask, String a) { // esto se llama sobrecarga
		ask = ask.trim();
		if (!ask.endsWith(":")) {
			ask = ask + ": ";
		} else {
			ask = ask + " ";
		}

		System.out.println(ask + a);
	}

}