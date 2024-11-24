package ejercicio2;
/*
 Práctica 2. Ejercicio 2
 Usando estructura condicional anidada.

if() {

  if(){

  }else or else if() {

  }...

}else or else if() {

  if(){

  }else or else if() {

  }...

}...

Algoritmo a implementar

Se dispone de un sensor que en función de un determinado rango de temperaturas ha de proceder a activar o desactivar un refrigerador.

El programa ha de dar valor a las variables que controlen la activación o no del refrigerador, 
su potencia y el grado de apertura de las láminas de las ventans del techo del recinto, 
en función de la temperatura que indique el sensor y la franja horaria.

Si hay que activarlo, los valores de potencia oscilan entre 1 y 3. 
La apertura de las láminas oscilan entre 0 y 3, siendo 0 el estar cerradas.

Rangos de temperaturas que considera el sensor.

A) Inferior e igual a 10 grados.

B) Inferior e igual a 20 grados.

C) Inferior e igual a 40 grados.

D) Superior a 40 grados.

Franjas horarias para decidir el estado de las láminas.

A) Entre las 00:00 y las 05:59.

B) Entre las 06:00 y las 11:59.

C) Entre las 12:00 y las 17:59.

D) Entre las 18:00 y las 23:59.

De esta forma el algoritmo establece que:

    Si el Rango de Temperatura es A.

- Y la franja horaria es A ó B ó D. Lámina en estado 0, refrigerador desactivado.

- Y la franja horaria es C. Lámina en estado 3, refrigerador activado y potencia 1

    Si el Rango de Temperatura es B.

-Y la franja horaria es A. Lámina en estado 0, refrigerador activado y potencia 1.

-Y la franja horaria es B. Lámina en estado 3, refrigerador activado y potencia 1.

-Y la franja horaria es C. Lámina en estado 2, refrigerador activado y potencia 2.

-Y la franja horaria es D. Lámina en estado 1, refrigerador activado y potencia 1.

    Si el Rango de Temperatura es C.

-Y la franja horaria es A. Lámina en estado 0, refrigerador activado y potencia 2.

-Y la franja horaria es B. Lámina en estado 1, refrigerador activado y potencia 2.

-Y la franja horaria es C ó D. Lámina en estado 1, refrigerador activado y potencia 3.

    Si el Rango de Temperatura es D.

*- Cualquier franja horaria. Lámina en estado 0, refrigerador activado y potencia 3.

Siga los pasos en el código para implementar este ejercicio.
*/

import java.util.Scanner;

public class Control{

  public static void main (String args[]){

 

  //Bloque entrada datos

   Scanner tec = new Scanner(System.in);

   System.out.print("Lectura temperatura: ");

   double temp = tec.nextDouble();

   tec.nextLine(); //Vaciar salto del linea para poder leer un String después de un formato número

   System.out.print("Hora [hh:mm]: ");

   String horario = tec.nextLine();

  

   //Cerramos teclado

   tec.close();

      //Implemente aquí el algoritmo

     

   //A partir de la cadena horario, extraiga una subcadenas con los dígitos de la hora. Convierta la cadena en números entero, use el método parseInt de la clase envolvente Integer. Observe que los minutos no son necesarios para ajustar las franjas horarias.

   //Añada las líneas de código necesarias para extraer la cadena y su conversión a entero

   int dondeLos2Puntos = horario.indexOf(":");
   String hh = horario.substring(0,dondeLos2Puntos).trim();

   int h = Integer.parseInt(hh);

   //Trabaje con las siguientes variables

   boolean refrigApagado = true;

   int estadoLamina  = 0;

   int poteRefigerado = 0; //potencia desactivada

   ///Programe el if anidado por temperaturas y dentro de ellas en función de las horas indique los valores de las variables anteriores. Minimice lo máximo posible el número de operaciones y comparaciones.

   //Añada aquí esa parte de código

   if(temp<=10) {
	   if(h<=12 && h<18) {
		   
		   refrigApagado = false;
		   estadoLamina  = 3;
		   poteRefigerado = 1;
		   
	   }else {	// este else podría quitarse ya que ya están con esos valores por defecto.
		   refrigApagado = true;
		   estadoLamina  = 0;
		   poteRefigerado = 0;
	   }
   }else if(temp<=20){
	   if(h<6) {
		   refrigApagado = true;
		   estadoLamina  = 0;
		   poteRefigerado = 1;
	   }else if(h<12) {
		   refrigApagado = true;
		   estadoLamina  = 3;
		   poteRefigerado = 1;
	   }else if(h<18) {
		   refrigApagado = true;
		   estadoLamina  = 2;
		   poteRefigerado = 2;
	   }else {
		   refrigApagado = true;
		   estadoLamina  = 1;
		   poteRefigerado = 1;
	   }
   }else if(temp<=40) {
	   if(h<6) {
		   refrigApagado = true;
		   estadoLamina  = 0;
		   poteRefigerado = 2; 
	   }else if(h<12) {
		   refrigApagado = true;
		   estadoLamina  = 1;
		   poteRefigerado = 2;
	   }else {
		   refrigApagado = true;
		   estadoLamina  = 1;
		   poteRefigerado = 3;
	   }
   }else {
	   
   }
   
   // Bloque de salida
   if(refrigApagado) {
	   System.out.println("Refrigerador apagado");
   }else {
	   System.out.println("Refrigerador encendido");
   }
   System.out.println("Estado de la lámina = " + estadoLamina);
   System.out.println("Potencia Refrigerador = " + poteRefigerado);
  }

}
