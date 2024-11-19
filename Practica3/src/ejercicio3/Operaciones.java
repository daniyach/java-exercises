package ejercicio3;

/*Práctica 3. Ejercicio 3

Programa a implementar

El programa debe muestra el siguiente menú de operaciones.

    Calcular e^x
    Calcular cos(x).
    Calcular sen(x).
    Salir

A continuación, pide seleccionar una opción pulsando 1,2,3 y 4. El programa debe controlar el hecho de introducir un valor erróneo. En ese caso, volverá a mostrar el menú y pedir que se introduzca un valor entre 1 y 4.

Si el valor introducido es 1, 2 ó 3 pedirá el valor de x. Realizará el cálculo de la función indicada y volverá a mostrar el menú. Si el valor introducido es 4, cerrará el teclado y finalizará la ejecución del programa.

Para el cálculo de las funciones e^x, cos(x) y sen(x). Usaremos el Desarrollo de MacLaurin

• Desarrollo de MacLaurin de la exponencial

(abrir img1.png)

• Desarrollo de MacLaurin del coseno(x) en radianes

(abrir img2.png)

• Desarrollo de MacLaurin del seno(x) en radianes.

(abrir img3.png)

El resultado ha de probarse para cualquier número real, positivo o negativo. Para ello añada esta línea de código, según el caso, para evaluar que el resultado es correcto.

Verificamos el resultado comparando con el método ya programado en JAVA Math.exp()

System.out.println("\t e^x = " + ex + "---> e^x =" + Math.exp(x));

Verificamos el resultado comparando con el método ya programado en JAVA Math.cos()

System.out.println("\tcos(x) = " + cosx + " ---> cos(x) =" + Math.cos(x));

Verificamos el resultado comparando con el método ya programado en JAVA Math.sin()

System.out.println("\tsen(x) = " + senx + " ---> sen(x) =" + Math.sin(x));

IMPORTANTE:

Para el cálculo del coseno y del seno. El programa ha de funcionar si la x introducida por teclado es mayor que 2π. Por tanto, en el caso que sea mayor en módulo de 2π quite las vueltas necesarias para que el valor de la x en la serie sea un número en módulo menor que 2π.
*/

import java.util.Scanner;

class Operaciones {

  public static void main(String[] args) {

    //Cree teclado

	Scanner tec = new Scanner(System.in);


    //Cree variable entera para leer el número del menú.

	int menu;
   

    //código para resolver el algortimo

	
 

    do{//Bucle do-while para que permita salir al pulsar 4 (el programa termina)
    	
    	

      do{//Bucle do-while dentro del anterior controla se repita

        //el menú si el número introducido no es del 1 al 4.

     
    	  System.out.println("[1] Calcular e^x");
    	  System.out.println("[2] Calcular cos(x)");
    	  System.out.println("[3] Calcular sen(x)");
    	  System.out.println("[4] Salir");
    	  System.out.print("Selecciona una opción: ");
    	  menu=tec.nextInt();
       

      }while(!(menu==1 || menu==2 || menu==3 || menu ==4));

   

        //A partir de aquí los datos ya son correctos

        //Estructura de selección para que en función del número del menú resuelva la correspondiente serie de MacLaurin.

        /*Dentro de cada elemento del bloque de selección:  Pida el valor real x al teclado

          1. Inicialice el valor inicial de la serie (variable del tipo double).

          2. Inicialice un variable llamada coef para ir ajustando el divisor de cada elemento de la serie, también del tipo double, a pesar de ser número enteros. El motivo: tener mayor resolución.

          3. Programe un bucle for para evaluar cada elemento de la serie en cada iteración.

      

       Para el caso de cálculo de e^x (n=20) (20 términos de la serie)

       Para el caso de cálculo del cos(x) y sen(x) (n=40) (20 términos, observe que crece de 2 en 2, vea las imágenes donde están las fórmulas) */ 

     //Escriba a partir de aquí el código necesario.

      if (menu == 1) {
    	  System.out.print(">> x =");
    	  double x = tec.nextDouble();
    	  
    	  // Algoritmo resuelve e^x;
    	  double eX=1;
    	  double f=1.0;
    	  for(int i=1; i<=20; i++) {
    		  f*=i; // f = f*i
    		  eX += Math.pow(x,i)/f;
    	  }
    	  System.out.println("e^x = " + eX);
    	  System.out.println("e^x = " + Math.exp(x));
      
      }else if(menu ==2) {
    	  System.out.print(">> x(rad) = ");
    	  double x = tec.nextDouble();
    	  x %= 2*Math.PI; // x = x%2pi
    	  double cosx=1;
    	  double f=1.0;
    	  
    	  for(int i=2; i<=40; i+=2) {
    		  f*=-i*(i-1); // f = f*i
    		  cosx += Math.pow(x,i)/f;
    	  }
    	  System.out.println("e^x = " + cosx);
    	  System.out.println("e^x = " + Math.cos(x));
      }
    

    }while(menu != 4); //Salir al pulsar 4

    tec.close();

   

  }

}
