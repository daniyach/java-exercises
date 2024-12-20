package ejercicio3;


/*Práctica 2. Ejercicio 3

En este ejercicio vas a realizar un programa con tres partes:

Parte 1: Se pide una letra por teclado (las letras son las vocales o las consonantes). La letra se lee en formato char. Mediante una estructura de selección switch() el programa responderá si es una vocal o una consonante.

Consideraciones: El programa debe ser robusto a la entrada de letras en mayúsculas y el parámetro de entrada del switch() es un char.

Parte 2: Exactamente igual a la Parte 1 pero todo debe estar en formato String, incluido el parámetro de entrada del switch().

Parte 3: Se pide por teclado una letra (consonante o vocal), o un número o un símbolo. El programa debe responder si la letra introducida es un número, una letra o un símbolo. Si es una letra, indicará además si es vocal o consonante. Debe funcionar tanto para letras mayúsculas o minúsculas

Ideas para programar el algoritmo de la parte 3

    Trabajar en formato char.
    Ver tabla ASCII para ver el rango de valores de cada tipo.
    Usar estructura if()... else if() ... else() .
    Si ya sabemos que es una letra, usar una estructura switch() para determinar si es consonante o vocal, tal como hiciste en la Parte 1.

 Práctica 2. Ejercicio 3

  Estructura de selección switch

 

*/

import java.util.Scanner;

class QueEs {

  public static void main(String[] args) {

    //Creación teclado para entrada de datos desde consola

     Scanner tec = new Scanner(System.in);

    

    //Bloque entrada de datos lectura en formato char : Subparte 1

    System.out.print("[Parte 1] Introduzca una letra: ");

    char letra = tec.next().toLowerCase().trim().replace("á", "a").replace("é", "e").replace("í", "i").replace("ó", "o").replace("ú", "u").charAt(0);
    
   
    //Programe aquí el switch de la Parte 1

    String str;
    // En los switch solo se puede utilizar para casos concretos, no para intervalos.
    switch(letra) {
    case 'a':
    case 'e':
    case 'i':
    case 'o':
    case 'u': str="Es una vocal"; break;
    default: str= "Es una consonante";
    }
    
    System.out.println(">> "+str);
  


    //Bloque entrada de datos lectura en formato String : Subparte 2

    System.out.print("[Parte 2] Introduzca una letra: ");

    String letra1 = tec.next().trim().toLowerCase().replace("á", "a").replace("é", "e").replace("í", "i").replace("ó", "o").replace("ú", "u").substring(0,1);
  

   //Programe aquí el switch de la Parte 2

    switch(letra1) {
    case "a", "e", "i", "o", "u": str="Es una vocal"; break; // se puede hacer esta estructura a partir de la version 14 de Java.
    default: str = "Es una consonantes";
    }
   
    System.out.println(">> "+str);

    

    //Entrada de datos en formato char: Parte 3

    System.out.print("[Parte 3] Introduzca una letra, un número o un símbolo: ");
    char letra3 = tec.next().toLowerCase().trim().replace("á", "a").replace("é", "e").replace("í", "i").replace("ó", "o").replace("ú", "u").charAt(0);

    
    //Programe aquí la estructura de selección de la Parte 3

   if(letra3>='0' && letra3<='9') {//al aplicar las comillas simples de los números cogerá el código ASCII
   
	   str="Es un número";
   
   }else if(letra3>='a' && letra3<='z' || letra3=='ñ') {
	    switch(letra3) {
	    case 'a':
	    case 'e':
	    case 'i':
	    case 'o':
	    case 'u': str="Es una vocal"; break;
	    default: str= "Es una consonante";
	    }
   }else {
	   str="Es un símbolo";
   }

   System.out.println(">> "+str);

  }

}

