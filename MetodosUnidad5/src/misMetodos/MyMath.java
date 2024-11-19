package misMetodos;

public class MyMath {
	
	public static int maximo(int a, int b) {		// void = no devuelve ningún resultado (tipo de dato que devuelve); dentro del parentesis están los datos de entrada que se necesitan

		int max;
		
		if (a>=b) {
			max = a;
		}else {
			max = b;
		}
		return max;
	}

	public static double maximo(double a, double b) {	// Un mismo método puede tener distintos (Sobre carga de métodos)

		double max;
		
		if (a>=b) {
			max = a;
		}else {
			max = b;
		}
		return max;
	}
	
	public static int maximo(int a, int b, int c) {
		return maximo(a, maximo(b,c));
		
	}
	public static double maximo(double a, double b, double c) {
		return maximo(a, maximo(b,c));
		
	}
	
	public static int inverteEntero(int x) {
		int numInvertido = 0;
		
		while (x!=0) {
			int cifra = x%10;
			numInvertido = numInvertido * 10 + cifra;
			x = x/10;
		}
		
		return numInvertido;
	}
	
	public static String decimalToBinario(int dec) {
		String bin = "";
		
		while(dec!=0) { // Parar cuando sea 0
			int cifra = dec%2;
			bin = cifra + bin;// La cadena hay que pegarla por delante
			dec = dec/2; // deplazar?
		}
		return bin;
		
	}
	
	public static String decimalBaseN(int dec, int base) {
		String bin = "";
		
		while(dec!=0) { // Parar cuando sea 0
			int cifra = dec%base;
			bin = cifra + bin;// La cadena hay que pegarla por delante
			dec = dec/base; // deplazar?
		}
		return bin;
		
	}

}
