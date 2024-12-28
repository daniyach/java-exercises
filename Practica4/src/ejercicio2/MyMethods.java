package ejercicio2;
import java.util.Scanner;

public class MyMethods {
	
	static Scanner tec = new Scanner(System.in);

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
