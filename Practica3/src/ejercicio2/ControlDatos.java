package ejercicio2;

/*Práctica 3. Ejercicio 2

Para controlar la entrada de datos se usan estructura de repetición del tipo while(){...} o do{...} while()

Programa 1: Control datos de entrada 1

Se desea programar un bloque de control de datos de forma que repita la pregunta en caso de que el dato introducido no sea correcto. El programa finalizará si el dato introducido es correcto.

Dato a controlar: Factor de carga. Valores correctos de la carga cumplen la ecuación:

              0.2<=carga<220 N/m^2

Realice la programación usando la estructura do{..... } while();.

Programa 2: Control datos de entrada 2

Implemente el control de datos del programa 1, usando la estructura while. En este caso, si el dato es erróneo, deberá mostrar "Valor de carga erróneo, introduzca un valor adecuado entre 0.2 y 220 N/m^2 no incluido".

Programa 3: Control datos de entrada 3

Implemente usando cualquiera de las estructuras vistas en los progrmas 1 y 2 un progrma que permita controlar un número entero . El valor del dato entero sólo puede ser 1, 2, 3, 4 , 5 y 10 el resto de valores enteros tanto positivos como negativos obliga a repetir la pregunta. El programa continuará sólo si el valor entero introducido está en el rango especificado.

Cuestiones:

¿Qué diferencias de programación observas en las estructuras de repetición usadas?

¿Cómo programaría con estas estructuras, un bucle infinito?
*/

import java.util.Scanner;

class ControlDatos {

  public static void main(String[] args) {

   

    //Programa 1: Control entrada de datos SIEMPRE CON WHILE O DO_WHILE

 

    //Cree teclado

	
    Scanner tec = new Scanner(System.in);
    
 

    //Declare variable carga e inicialícela.
    
    double carga=0;
 
    while(carga < 0.2 || carga >= 220) {
    	System.out.print("Escribe el valor de la carga [1] entre [0.2,220[ : ");
    	carga = tec.nextDouble();
    	
    }

    //Complete la estructura do --while

     //Implemente instrucciones necesarias


   

    //Programa 2

    //Implemente aquí el código

   
    
    double carga2; // no hace falta inicializarla
    do {
    	System.out.print("Escribe el valor de la carga [2] entre [0.2,220[ : ");
    	carga2 = tec.nextDouble();
    }while(carga2 < 0.2 || carga2 >=220);
   

    System.out.println("[carga 1] Valor correcto " + carga + " N/m^2");
    System.out.println("[carga 2] Valor correcto " + carga2 + " N/m^2");


   

   

    //Programa 3:

    //Implemente aquí el código

    
    int x=0;
    

    do {
        try {
    	System.out.print("[Programa 3] Escribe 1,2,3,4,5 o 10: ");
    	x = tec.nextInt();
        }catch(Exception e) {
        	System.out.println("Por favor datos del tipo entero");
        	tec.nextLine(); // Vaciar el buffer
        }
    }while(!(x==1 || x==2 || x==3 || x==4 || x==5 || x == 10));

    System.out.println("Valor seleccionando: " + x);

    /* Responda aquí a las cuestiones

   

   

    */

  }
}

