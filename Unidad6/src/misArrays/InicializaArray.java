package misArrays;
import java.util.Scanner;

public class InicializaArray {
	
	static Scanner tec = new Scanner(System.in);
	
	public static int[] inicializaVectorEnteros() {
		System.out.print("Tamaño del vector: ");
		int ta = tec.nextInt();
		int v[] = new int[ta];
		for (int e=0; e<ta; e++) {
			System.out.println("v["+e+"]=");
			v[e]=tec.nextInt();
		}
		return v;
	}
	
	public static int[][] inicializaEstructura2DInt(){
		System.out.print("Filas de la matriz: ");
		int tf = tec.nextInt();
		int[][] M = new int[tf][];
		for(int fila=0; fila<M.length;fila++) {
			System.out.print("Columnas de la fila: ");
			M[fila]= new int [tec.nextInt()];
			for (int col=0; col<M[fila].length; col++) {
				System.out.print("v["+fila+"]["+col+"] =");
				M[fila][col] = tec.nextInt();
			}
		}
		return M;
	}
	
	public static double[][] inicializaEstructura2DDouble(){
		System.out.print("Filas de la matriz: ");
		int tf = tec.nextInt();
		double[][] M = new double[tf][];
		for(int fila=0; fila<M.length;fila++) {
			System.out.print("Columnas de la fila: ");
			M[fila]= new double [tec.nextInt()];
			for (int col=0; col<M[fila].length; col++) {
				System.out.print("v["+fila+"]["+col+"] =");
				M[fila][col] = tec.nextInt();
			}
		}
		return M;
	}
}
