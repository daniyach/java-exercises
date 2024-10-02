package ejercicio1;

/* ENUNCIADO PRÁCTICA 1: Ejercicio 1

--------------------------------------------

Algunos datos del tipo primitivo han sido implementados

en java como una clase. Conocida como clase envolvente.


Así pues, tenemos:


(dato primitivo)  ---> (su clase envolvente) (wrapper class)

  byte                  Byte // objeto creado para dar información ¿clase?

  short                 Short // objeto creado para dar información ¿clase?

  int                   Integer // objeto creado para dar información ¿clase?

  long                  Long // objeto creado para dar información ¿clase?

  float                 Float // objeto creado para dar información ¿clase?

  double                Double // objeto creado para dar información ¿clase?

  char                  Character // objeto creado para dar información ¿clase?

  boolean               No tiene


La creación de esta clase envolvente nos permite disponer de código adicional para realizar operaciones con este tipo de datos. Estas operaciones son métodos implementados para cada clase, así como constantes que nos permiten disponer de más capacidades la hora de programar.

La práctica consiste en conocer las constantes y métodos de interés a usar en cada tipo de dato. Así como las operaciones, conversiones de tipo , etc. sobre los datos primitivos o su equivalente clase envolvente.

*/

//Puedes ir comentando y descomentando las partes con el fin de centrar la ejecución en cada parte. Solo debes borrar ente parte las líneas indicadas.



public class Main{

  public static void main(String args[]){


  System.out.println("Parte 1: ");

  System.out.println("----------------------");

  //Evaluando las constantes SIZE, MAX_VALUE, MIN_VALUES;

  //Ejemplo para la clase Byte

  System.out.println(Byte.SIZE);
  System.out.println(Byte.MAX_VALUE);
  System.out.println(Byte.MIN_VALUE);


  //Realiza lo mismo para el resto de clases envolventes.

  System.out.println(Short.SIZE);
  System.out.println(Short.MAX_VALUE);
  System.out.println(Short.MIN_VALUE);
  
  System.out.println(Integer.SIZE);
  System.out.println(Integer.MAX_VALUE);
  System.out.println(Integer.MIN_VALUE);
  
  System.out.println(Long.SIZE);
  System.out.println(Long.MAX_VALUE);
  System.out.println(Long.MIN_VALUE);
  
  System.out.println(Float.SIZE);
  System.out.println(Float.MAX_VALUE);
  System.out.println(Float.MIN_VALUE);
  
  System.out.println(Double.SIZE);
  System.out.println(Double.MAX_VALUE);
  System.out.println(Double.MIN_VALUE);
  
  System.out.println(Character.SIZE);
  System.out.println(Character.MAX_VALUE);
  System.out.println(Character.MIN_VALUE);


  //¿Qué valor está proporcionando cada uno de ellos?

  /*
   SIZE --> explicar lo que hace cada uno de estos ¿métodos?
   MAX_VALUE
   MIN_VALUE
   */
  
  System.out.println("El tamaño de chart es: " + Character.SIZE);
  System.out.println(Character.MAX_VALUE);
  System.out.println(Character.MIN_VALUE);

//Borra esta línea para resolver la parte 1 */


  System.out.println("Parte 2: ");

  System.out.println("----------------------");

  //Vamos a dar formato a la salida para nombrar adecuadamente las constantes usadas.

  //Ejemplo para la clase Byte.

  System.out.println("Un byte ocupa en memoria "+ Byte.SIZE + " bits");


  //Añade el resto del código aquí. Recuerda para todas las variables.

  System.out.println("Un short ocupa en memoria "+ Short.SIZE + " bits");
  System.out.println("Un int ocupa en memoria "+ Integer.SIZE + " bits");
  System.out.println("Un long ocupa en memoria "+ Long.SIZE + " bits");
  System.out.println("Un float ocupa en memoria "+ Float.SIZE + " bits");
  System.out.println("Un double ocupa en memoria "+ Double.SIZE + " bits");
  System.out.println("Un char ocupa en memoria "+ Character.SIZE + " bits");

  


  //Parte 3:

  System.out.println("Parte 3: ");

  System.out.println("----------------------");

  //Operando con los números del tipo entero.


  //Asígnale a la variable byte valorByte su valor máximo

  byte valorByte = Byte.MAX_VALUE;


  //Añade el código que imprime el valor al incremetar 1 dicha variable usando el operador ++. Cuidado, primero incrementar y luego imprimir.

  System.out.println(++valorByte);
 

 // valorByte = valorByte+1 --> No se puede operar con primitivos de 32 bits
  double d = valorByte+1;

  //¿Qué valor has obtenido. ¿Por qué?
  
  

  valorByte=Byte.MAX_VALUE; //Volvemos a su valor original

  //imprime valorByte+1;

  System.out.println(valorByte+1);


  //¿Por qué el resultado no es el mismo?

  /* Cuando en una operación matemática se suman 2 tipos de datos diferentes predomina y se convierte al mayor
   * en este caso se pasaría en entero. El incremento sí que respeta el tipo de dato, la suma no lo respeta.
   */

  //Ejecuta el código descomentando la siguiente línea de código

 // byte vB=valorByte+1;
		 /*
		  * no se puede hacer la siguiente operación ya que estamos intentando guardar un int en una variable
		  * que está definida como byte.
		  */

  //Vuelve a ejecutar comentando la línea anterior y descomentando la siguiente

  

  //¿Por qué una da error y la otra no? ¿Entiendes ahora porqué el resultado es distinto al usar la orden de incremento frente a la de sumar 1.


  //Si quieres incrementar la variable en 3 manteniendo el tipo de dato inicial debes usar +=. Prueba..

  valorByte=126;

 //Añade aquí la instrucción con +=
  
  System.out.println(valorByte+=3);

  valorByte+=3;

  System.out.println(">" + valorByte);

 //Comparamos

 valorByte=126;

 System.out.println(valorByte+3);


 //Parte 4:

 System.out.println("Parte 4: ");

 System.out.println("----------------------");


 //Sabemos que el signo + provoca si los datos son numéricos la suma de ambos, pero si los datos son del tipo String concatena ambas cadenas.



 //Declare una variable x del tipo int y asignale el valor 12;

 int x=12;

 //Crea una variable del tipo int llamada y con valor 13;

 int y=13;

 //Imprime la suma

 System.out.println(x + y);
 System.out.println("La suma de x + y es: " + (x+y));

 //Crea una variable del tipo String llamada str1 de valor "13";

 String str1 = "13";

 //Imprime x+str

 System.out.println(x + str1);

 // ¿Por qué se obtiene 1213 en vez de dar un error? ¿Qué sucede pues?

 /* por que el dato de x pasa a ser String */

 //De las siguientes instrucciones comentadas, descomenta las que son correctas, e indica el error que se dará en las incorrectas.

 


 byte b1,b2,b3;

 short s1,s2,s3;

 int n1,n2,n3;

 long l1,l2,l3;

 float f1,f2,f3;

 double d1,d2,d3;


//Comenta y descomenta de una en una para verificar tu respuesta.


 //b1=1; b2=5; b3=b1+b2; System.out.println("El valor de b3 es: "+b3); No se pueden operar con el primitivo byte, la suma está programada para enteros como mínimo.
 b1=1; b2=5; b3=b1+=b2; System.out.println("El valor de b3 es: "+b3);
 //s1=1; s2=5; s3=s1+s2; System.out.println("El valor de s3 es: "+s3); Las operaión si que la hace pero para hacerla lo transforma en entero y luego al guardarla en al variable no puede ya que es una variable declarada como byte.

 //n1=1; n2=5; n3=n1+n2; System.out.println("El valor de n3 es: "+n3);

 //n1=1L; 

 l1=1L; l2=5L; l3=l1+l2; System.out.println("El valor de l3 es: "+l3);

 l1=100;

 //f1=5.3f; f2=4.6F; f3=f2+f1; System.out.println("El valor de f3 es: "+f3); Sí que se puede hacer.

 //f1=5.4; No se puede, por defecto el 5.4 lo crea como double y no se puede convertir a float.

 //f1=5.4f; f2=4.6f; d3=f1+f2; System.out.println("El valor de d3 es: "+d3); Sí, un float cabe en un double.

 //d1=5.8f; Correcto

 //d1=5.8; d2=3.45; d3=d1+d2; System.out.println("El valor de d3 es: " +d3); Sí


 //Sustituye el (*) por (b3 o s3 o n3 o l3 o f3 o d3). Criterio el tipo de dato de menor memoria da validez a la asignación. Descomenta previamente.


 b1=5;  l3 = b1+1L;  System.out.println("Debe ser del tipo (long)");

 d1=4.6; d3 = 2.4F/d1+3L;  System.out.println("Debe ser del tipo (double)");

 System.out.println("----------------------");

  //Parte 5:

  System.out.println("Parte 5: ");

  System.out.println("----------------------");


  //Observa el resultado de estas operaciones:

  float f4=5f/0.0f;  System.out.println(f4); // Infinito --> sí que desborda

  float f5=-5f/0.0F; System.out.println(f5); // - Infinito

  float f6=0.0f/0.0f; System.out.println(f6); // Not a Number

  float f7=Float.MAX_VALUE*10; System.out.println(f7); // Infinito. En ninguno de los casos de queda colgado.


  // ¿Hay desbordamiento?¿La ejecución del programa se ha parado?

  /*
   *  Sí que desborda, pero no se lanza una excepción y por tanto no se cuelga.
   *  división de numeros enteroes entre 0 sí que salta la excepción.
   */
  

  // Procede de la misma forma con datos del tipo double. Añade las líneas de código

  //para crear d4,d5,d6 y d7 del tipo double.




  //Métodos de las clases envolventes Float y Double para gestionar estos valores. Analiza el valor que devuelve. Y piensa su futura utilidad //


  System.out.println(Float.isNaN(f6));

  System.out.println(Float.isFinite(f6));

  System.out.println(Float.isInfinite(f6));


  //Haz los mismo para f4, f5 y f7. Añade las líneas de código aquí.




  //Si además queremos saber si es +Infinito o -Infinito qué podemos hacer. La clase envolvente también nos los facilita en ese caso comparamos con la constante Float.NEGATIVE_INFINITY


  System.out.println(f5==Float.NEGATIVE_INFINITY);


  //Cómo evaluarías sí d4, d5 d6 y d7 son +infinite. Añade a continuación el código.



  // Borra esta línea para resolver la parte 5 */



/*Borra esta línea para resolver la parte 6


//Parte 6:

System.out.println("Parte 6: ");

System.out.println("----------------------");


//Crea una variable del tipo int llamada e1 de valor 7 y otra llamada e2 de valor 2




//Imprime el resultado de división, ¿Es el resultado el esperado, por qué?



// ¿Puedes afirmar que el resultado obtenido es el cociente? Para ello cambia los valores asignados a e1 y e2.



//Imprime el resultado de e1%e2. ¿Qué has obtenido?




//Imprime la siguiente operación 1.0*e1/e2. ¿Por qué el resultado es un número real?



//Dada las siguientes operaciones determina antes de comprobar (descomentando y ejecutando) si el resultado es int o double. Y cuál será el resultado numérico. Explica el porqué del resultado en cada caso insertado como comentario.


//Descomenta todo de una vez hayas pensado las respuestas en cada caso


/*Quitar esta línea para descomentar

System.out.println("**************");


System.out.println(e1+e2+2.5);

int e3=3; System.out.println(e1+e2/e3);

System.out.println((e1+e2)/e3);

double dd1=3.5; System.out.println((int)dd1);

System.out.println((int)dd1*3);

System.out.println((int)(dd1*3));

System.out.println(3.5*e1/8+12);

System.out.println((double)e1);


Quitar está línea también para descomentar la parte 6*/



  }

}
