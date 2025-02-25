package ejercicio2;
/*
Práctica 4, Ejercicio 2

Objetivos

En esta parte de la práctica se pretende.

Practicar la llamada a métodos cuando el método principal está en una clase distinta a la de los métodos.
Saber distinguir los casos:

- Cuando las clases están en el mismo package.

- Cuando las clases están en packages distintos.

Realización de la práctica.

Observe que en el panel de la izquierda puede añadir ficheros y carpetas. 
Pulsando sobre los iconos +. Pulsando sobre el + "add file" hemos creado los ficheros MyMath.java 
y MyMethods.java.

La primera Metodos2.java (donde debe estar el método main), MyMethods.java y MyMath.java. 
Estas dos últimas corresponden a dos clases la primera de ellas incluirá cualquier método que no sea 
matemático. En la clase MyMath añadiremos todos los métodos que sean matemáticos.

Desde el método principal llamaremos a los métodos implementados en las dos clases indicadas.

En la clase MyMath cree:

Un método publico que presenta dos parámetros de entrada que son dos números float y devuelve 
el máximo de los dos.

Un método publico, aplicando sobrecarga, que reciba tres números float y devuelva el máximo de los tres. 
Nota importante. Este método debe resolver el máximo simplemente llamando al método que resuelve 
el máximo de dos números.

Un método público, para obtener, el módulo de un número complejo expresado en cartesianas. 
(ver img/modulo.png).

Un método público, para obtener, la fase (ángulo) del número complejo en el plano complejo. 
(ver img/angle.png)
Nota: Para resolver use el método Math.atan(Math.abs(b)/Math.abs(a)). Devolviendo así, un ángulo 
del primer cuadrante. Posteriormente ajustará el ángulo al cuadrante. Use para ello una estructura 
de selección. El programa debe funcionar incluso cuando a y b son cero al mismo tiempo. Para ello 
devolverá 0 de fase. La fase se devolverá en ángulos entre -π<=α<=π

Será del segundo cuadrante si a<=0 y b>=0. --> Fase = Math.PI-α (Sirva como ejemplo)
Será del tercer cuadrante si a<=0 y b<=0.
Será del cuarto cuadrante si a>=0 y b<=0.
En la clase MyMethods.java

Traslada los métodos readInt, readDouble, readString y show de la Práctica 4 Ejercicio 1. 
Añade si es necesario otros métodos para poder leer o mostrar otros tipos de datos.

En la clase principal (Main.java)

Solicite la entrada de tres números reales en formato float.
Evalúe el máximo de los 3 números.
Muestre el valor máximo.
Solicite la parte real de un número complejo (número real double)
Solicite la parte imaginaria de un número complejo (número real double)
Evalúe el módulo.
Evalúe la fase.
Muestre el valor del módulo y de la fase tanto en radianes como grados. - Use la función Math.toDegrees(double rad) para pasar de radianes a grado.

Main.java
*/

//import java.util.Scanner;  El teclado ya se abre en los métodos.

class Metodos2 {

	public static void main(String[] args) {

		// Scanner tec = new Scanner(System.in); El teclado ya se abre en los métodos.

		// Programe las llamadas a partir de aquí
		// al estar los métodos en el mismo package, no haría falta importarlos

		float n1 = (float) MyMethods.readDouble("     Escribe un número real    ");
		float n2 = (float) MyMethods.readDouble("     Escribe un número real    ");
		float n3 = (float) MyMethods.readDouble("     Escribe un número real    ");

		float m = MyMath.maximo(n1, n2, n3);
		MyMethods.show("El valor máximo es", m);

		double pr = MyMethods.readDouble("Escribe la parte real: ");
		double pi = MyMethods.readDouble("Escribe la parte imaginaria: ");

		double mod = MyMath.absComplejo(pr, pi);
		double ang = MyMath.angComplejo(pr, pi);

		MyMethods.show("El modulo es: ", mod);
		MyMethods.show("El ángulo es: ", ang);

	}

}

// Responda a partir aquí a la pregunta se indican en consideraciones
