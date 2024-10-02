package claseDelDia021024;

public class DadoBasico {
	public static void main(String[] args) {
		
		// No hay bloque de entrada
		
		// Algoritmo
		double aleatorio = 6*Math.random()+1;
		int dado = (int) Math.floor(aleatorio);
		
		// Bloque de salida
		System.out.println(">> " + dado);
		
	}
}
