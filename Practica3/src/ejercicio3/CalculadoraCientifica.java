package ejercicio3;
import java.util.Scanner;
public class CalculadoraCientifica {

	public static void main(String[] args) {
		
		Scanner tec = new Scanner(System.in);
		
		//entrada de datos
		System.out.print("Calculando e^x. Escribe el valor de x = ");
		double x = tec.nextDouble();
		
		//Algoritmo resuelve e^x
		double ex=1;
		double f=1.0;
		for (int k=1; k<=150; k++) {
			f=k*f;
			ex += Math.pow(x, k)/f;
		}
		System.out.println(">> e^x = "+ex);
		System.out.println(">> e^x = "+ Math.exp(x));
	
		
		// Calcular cos(x)
		System.out.print("Calculando cosx: Escribe el valor de x = ");
		x = tec.nextDouble();
		x %= 2*Math.PI;
		
		//Algoritmo resuelve cos(x)
		double cosx=1;
		f=1.0;
		for (int k=2; k<=40; k+=2) {
			f=-k*(k-1)*f;
			cosx += Math.pow(x, k)/f;
		}
		System.out.println(">> cos(x) = "+cosx);
		System.out.println(">> cos(x) = "+ Math.cos(x));
		
		// Calcular sen(x)
		System.out.print("Calculando senx: Escribe el valor de x = ");
		x = tec.nextDouble();
		x %= 2*Math.PI;
		
		//Algoritmo resuelve sen(x)
		double sen=x;
		f=1.0;
		for (int k=3; k<=40; k+=2) {
			f=-k*(k-1)*f;
			sen += Math.pow(x, k)/f;
		}
		System.out.println(">> sen(x) = "+sen);
		System.out.println(">> cos(x) = "+ Math.sin(x));
	
	}
	

}
