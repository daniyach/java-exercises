package ejercicio1;

/*Pr�ctica 4. Ejercicio 1:

M�todos

Objetivos:

En esta primera pr�ctica el alumno adquiere conocimientos:

Implementar un nuevo m�todo para ser llamado por el m�todo principal (main()) o por otro m�todo.
Declarar su cabezera y su cuerpo.
Definir sus par�metros de entrada.
Devolver (return) su par�metro de salida.
Llamada a un m�todo desde otro m�todo, como por ejemplo el m�todo main
Entender el concepto de m�todos sobrecargados
Programa a realizar:

Consta de 6 m�todos:

M�todo 1:

Programe un m�todo que reciba como par�metro de entrada un String y devuelve un entero. El m�todo recibe un texto con el fin de solicitar un n�mero entero por teclado. Leer� el n�mero y lo devolver�.

Con la cabecera:

public static int readInt(String ask)

p.ej. Supongamos ask es " Introduce un n�mero entero ". El m�todo preguntar� "Introduce un n�mero entero:". Observa el m�todo elimina los espacios en blanco del principio y del final y ha a�adido dos puntos. Importante: Si en la pregunta ya est�n los dos puntos no deber� a�adirlos. En definitiva estamos programando el m�todo de Java nextInt(), pero con la diferencia que lleva integrada la pregunta a hacer.

M�todos 2 y 3:

Igual al m�todo uno, pero solicita un n�mero real, del tipo double y un String.

public static double readDouble(String ask) M�todo 2

public static String readString(String ask) M�todo 3

Importante: Tras leer por teclado un dato del tipo num�rico es necesario vaciar el buffer del teclado. Ya que el car�cter salto de l�nea se queda en el buffer y los m�todos nexInt(), nextDouble(), nextFloat(), etc, consideran n�mero todo lo que hay antes del c�digo de salto de l�nea. Para vaciar el buffer use tras leer el n�mero el m�todo nextLine(), ya que este leer� el salto de l�nea vaciando el buffer.

  p.ej.

      int p=kyb.nextInt();

      kyb.nexLine(); //No se almacena lo le�do en ninguna variable

Por tanto, el buffer del teclado ahora est� vac�o, en p ha quedado el n�mero y nextline() ha le�do el c�digo de salto de l�nea (observa queno hace falta almacenar esa informaci�n en ninguna variable)

M�todos 4,5 y 6:

Aplicando sobrecarga implemente tres m�todos con el mismo nombre (show()). Los tres no devuelven nada (void) y los tres tienen dos par�metros de entrada, el primero es com�n a los tres y es un String, y el segundo es diferente, para el m�todo 4, es un entero int, para el m�todo 5, es un n�mero real double y para el 6 es un String.

Los m�todos 4,5,6 imprimen la cadena de texto introducida como par�metro 1 seguido del valor introducido en el par�metro 2.

Ejemplo:

  show("El n�mero es", 5)

  El n�meroe es: 5
*/


import java.util.Scanner;


class UsandoMetodos {

 

  static Scanner tec = new Scanner(System.in);

 

  public static void main(String[] args) {

    int x = readInt("Introduce un n�mero entero");

    show("Valor introducido:", x);

   

    double d = readDouble("Introduce un n�mero real");

    show("Valor introducido:", d);

   

    String str = readString("Introduce tu nombre:   ");

    show("Nombre:", str);

   

    str = readString("Introduce tus apellidos:   ");

    show("Apellidos:", str);

 

  } //Fin m�todo main

 

 

 

  public static int readInt(String ask){

    //Programe aqu� el c�digo del m�todo
	  ask = ask.trim();
	  if(!ask.endsWith(":")) {
		ask = ask + ": ";
	  }else {
		  ask = ask + " ";
	  }
	  
	  System.out.print(ask);
	  int x = tec.nextInt();
	  tec.nextLine();

	  return x;
  }

 

   public static double readDouble(String ask){

    //Programe aqu� el c�digo del m�todo

		  ask = ask.trim();
		  if(!ask.endsWith(":")) {
			ask = ask + ": ";
		  }else {
			  ask = ask + " ";
		  }
		  
		  System.out.print(ask);
		  double x = tec.nextDouble();
		  tec.nextLine();

		  return x;
  }

 

  public static String readString(String ask){

    //Programe aqu� el c�digo del m�todo

	  ask = ask.trim();
	  if(!ask.endsWith(":")) {
		ask = ask + ": ";
	  }else {
		  ask = ask + " ";
	  }
	  
	  System.out.print(ask);
	  String x = tec.nextLine();

	  return x;
  }

 

  //Programe a partir de aqu� los m�todos show aplicando sobrecarga


  public static void show(String ask, int a) {
	  ask = ask.trim();
	  if(!ask.endsWith(":")) {
		ask = ask + ": ";
	  }else {
		  ask = ask + " ";
	  }
	  
	  System.out.println(ask+a);
  }

  public static void show(String ask, double a) { // esto se llama sobrecarga
	  ask = ask.trim();
	  if(!ask.endsWith(":")) {
		ask = ask + ": ";
	  }else {
		  ask = ask + " ";
	  }
	  
	  System.out.println(ask+a);
  }

  public static void show(String ask, String a) { // esto se llama sobrecarga
	  ask = ask.trim();
	  if(!ask.endsWith(":")) {
		ask = ask + ": ";
	  }else {
		  ask = ask + " ";
	  }
	  
	  System.out.println(ask+a);
  }
 

 

 

}