/*
15-Lanzar un dado
Escribe un programa que simule lanzar un dado.
p. ej. Para imprimir un número aleatorio de 1 a 6. Usarás Math.random(). Debes tener en cuenta que esta función genera un número aleatorio entre [0,1[, 1 no incluido.
Por lo tanto, tú tienes que desarrollar una expresión aritmética que partiendo de los valores generados por Math.random() genere número aleatorios enteros entre 1 y 6 (6 incluido).
Ejecútalo varias veces con el fin de estar seguro de que los 6 números son generados.
 */
package actividadUnidad3;

public class E15_LanzaDado {

	public static void main(String[] args) {
		
		int dado = (int) (Math.random()*6)+1;
		
		System.out.println("El número del dado que ha salido es: " + dado);	
	}
}