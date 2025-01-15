package metodos1;
import java.util.Scanner;

public class MetodosArrays {
	static Scanner tec = new Scanner(System.in);
	/*
	 * Método que recibe una matriz cuadrada (MxM), (Traza = elemenos de la
	 * diagonal) sumar los elementos de las diagonales
	 */
	public static double sumaElementosDiagonal(double[][] m) {
		// suma acumulada
		double sumaDiagonal = 0.0;

		for (int i = 0; i < m.length; i++) {
			sumaDiagonal += m[i][i];
		}

		return sumaDiagonal;
	}

	public static double sumaElementosDiagonalOpuesta(double[][] m) {
		// suma acumulada
		double sumaDiagonal = 0.0;

		for (int i = 0; i < m.length; i++) {
			sumaDiagonal += m[i][m.length - 1 - i];
		}

		return sumaDiagonal;
	}

	/* Método que haga las traspuesta de la matriz */
	public static double[][] matrizTranspuesta(double M[][]) {
		// devuelve una estructura bidimensional
		double[][] mt = new double[M[0].length][M.length]; // Primero hay que crear una matriz rellena de 0.

		for (int f = 0; f < mt.length; f++) {
			for (int c = 0; c < mt[f].length; c++) {
				mt[f][c] = M[c][f];
			}
		}
		return mt;
	}

	public static int[][] matrizTranspuesta(int M[][]) {
		// devuelve una estructura bidimensional
		int[][] mt = new int[M[0].length][M.length]; // Primero hay que crear una matriz rellena de 0.

		for (int f = 0; f < mt.length; f++) { // mt.length = 2
			for (int c = 0; c < mt[f].length; c++) { // mt.length = 3
				mt[f][c] = M[c][f];
			}
		}
		return mt;
	}

	public static void print2D(double m[][]) {
		for (int f = 0; f < m.length; f++) {
			for (int c = 0; c < m[f].length; c++) {
				System.out.print(m[f][c] + " ");
			}
			System.out.println();
		}
	}

	public static int[] rellenaVector(int ta) {
		int vector[] = new int[ta];
		for (int i = 0; i < ta; i++) {
			System.out.print("v["+i+"]=");
			// hay que poner el scanner como variable global
			vector[i]=tec.nextInt();
		}
		return vector;
	}
	
	public static double[] rellenaVectorDouble(int ta) {
		double vector[] = new double[ta];
		for (int i = 0; i < ta; i++) {
			System.out.print("v["+i+"]=");
			// hay que poner el scanner como variable global
			vector[i]=tec.nextDouble();
		}
		return vector;
	}
	
	public static double [][] rellenaMatriz(int tf, int tc){
		double mat[][] = new double [tf][tc];
		for(int i=0; i<tf; i++) {
			mat[i] = rellenaVectorDouble(tc);
		}
		return mat;
	}

}
