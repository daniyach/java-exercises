package ejercicio1;

/*Práctica 2. Ejercicio1  Trabajando con estructuras de selección

*/

/*Programa 1:  Estructura if(){ }

Implemente un programa que reciba una nota numérica de un alumno entre 0 y 10 y responda:

Si nota=10 Matrícula de Honor

Si 9<=nota<10 Sobresaliente

Si 7<=nota<9 Notable

Si 6<=nota<7 Bien

Si 5<=nota<7 Suficiente

Si 4<=nota<5 Insuficiente

Si 3<=nota<4 Deficiente

Si nota<3 Muy Deficiente

Si la nota está fuera de rango debe responder con nota numérica no valida.

Sólo puede usar if(){ } (observa no hay else).

Programa 2 a continuación realiza el mismo programa pero usando una estructura

if(){

}else if(){ //Repetir else if las veces sea necesaria

......

......

}else{

}

Nota: Implemente los programas 1 y 2 en la zona indicada. Se han añadido unas líneas para determinar el tiempo de calculo de cada estructura. Responda en el lugar indicado las cuestiones se planteen

*/

import java.util.Scanner;

public class Notas {

    public static void main(String[] args) {


      //Bloque entrada datos

      Scanner tec= new Scanner(System.in);

      System.out.print("Introduce nota (0 a 10): ");

      float nota =tec.nextFloat();
   
      tec.close();

     

      //Instrucción para obtener en ns (nanosegundos) el instante temporal previo a la ejecución.

      long startTime = System.nanoTime();

      //Programa aquí el código del Programa 1

      String str=""; // Declarar la variable y asignarle valor, ya que si no le asignamos tendríamos que tener algún else sino daría error
      
      if (nota==10) {
    	  str="Matrícula de Honor";
      }
      if (nota<10 && nota>=9) {
    	  str="Sobresaliente";
      }
      if (nota<9 && nota>=7) {
    	  str="Notable";
      }
      if (nota<7 && nota>=6) {
    	  str="Bien";
      }
      if (nota<6 && nota>=5) {
    	  str="Suficiente";
      }
      if (nota<5 && nota>=4) {
    	  str="Insuficiente";
      }
      if (nota<4 && nota>=3) {
    	  str="Deficiente";
      }
      if (nota<3 && nota>=0) {
    	  str="Muy Deficiente";
      }
      if (nota<0 || nota>10) {
    	  str="Nota no valida";
      }
      
      //Instrucciones para leer el instante de tiempo tras la ejecución de la estructura y para evaluar la resta de los instantes temporales de inicio y fin en microsegundos.

      long endTime=System.nanoTime();

      double timeRun =(endTime - startTime)/1000.0;

     

      //Muestra en pantalla el resultado de la nota y el tiempo de ejecución del fragmento de código.

      System.out.println(str+ " "+ timeRun+ " \u03bc" +"s");


      //Fin del programa 1

      //Inicio del programa 2. Añádelo sin comentar el bloque del programa 1, con el fin se ejecuten uno detrás de otro,
      

     //Instrucción para obtener en ns (nanosegundos) el instante temporal previo a la ejecución.

      startTime = System.nanoTime();

     

      //Implemente aquí código del programa 2

      if (nota<0 || nota>10) {
    	  str="Nota no válida";
      }else if(nota<3){ // No habría que poner nota<0 ya que lo evaluamos en el primer if
    	  str="Muy deficiente";
      }else if(nota<4) {
    	  str="Deficiente";
      }else if(nota<5) {
    	  str="Insuficiente";
      }else if(nota<6) {
    	  str="Suficiente";
      }else if(nota<7) {
    	  str="Bien";
      }else if(nota<9) {
    	  str="Notable";
      }else if(nota<10) {
    	  str="Sobresaliente";
      }else {
    	  str="Matricula de Honor";
      }

     

      //Instrucciones para leer el instante de tiempo tras la ejecución de la estructura y para evaluar la resta de los instantes temporales de inicio y fin en microsegundos.

      endTime=System.nanoTime();

      timeRun =(endTime - startTime)/1000.0;

     

      //Muestra en pantalla el resultado de la nota y el tiempo de ejecución del fragmento de código.

      System.out.println(str+ " "+ timeRun+ " \u03bc" +"s");

     

     

      //Fin del programa 2

     

    }

}

//Responda a las cuestiones

//¿Por qué cree que la ejecución del programa 2 es más rápida?

// Considera que el orden de la estructura del programa 2 puede hacer que aún sea más rápida su ejecución ¿Por qué?
