package ejercicio1;


/*Práctica 3. Ejercicio 1

Implemente un programa que lea una cadena de texto e imprima la misma cadena, pero invertida.

p.ej.

Hola Pedro

ordeP aloH

Para ello proceda de la siguiente forma:

    Cree una variable del tipo String vacía donde se almacenará la cadena invertida (txtInv).
    Mediante un bucle while añada en cada iteración la letra correspondiente de la cadena original 
    a la cadena invertida, de tal forma que en cada iteración dicha cadena tenga un carácter más. 
    Use el método charAt() para añadir la letra que toca.
    Controle el bucle con una variable, dicha variable debe ser actualizada en el cuerpo del bucle while.
    Imprima la cadena una vez esté invertida.

Repita el procedimiento anterior, pero usando una estructura for.*/

import java.util.Scanner;

class InvierteCadena {

  public static void main(String[] args) {

    Scanner tec = new Scanner (System.in);

   

    System.out.print("Introduce una cadena de texto: ");

    String txt = tec.nextLine();
    tec.close();
    
    //Código con bucle while
    String txtInvWhl = "";
    int j = 0;
    while (j < txt.length()) {
    	char letra = txt.charAt(txt.length()-1-j);
    	txtInvWhl += letra; // el char pasa al superior que en este caso sería el string (Teoría)
    	j++;
    }
    System.out.println("**** Con bucle while ****");
    System.out.println(">> " + txtInvWhl);
    

   //Código con bucle for

    
    String txtInv = "";
    for (int i=0; i<txt.length(); i++ ) {
    	char letra = txt.charAt(txt.length()-1-i);
    	txtInv = txtInv + letra;
    }
    System.out.println("**** Con bucle for ****");
    System.out.println(">> " + txtInv);
  

  }

}
