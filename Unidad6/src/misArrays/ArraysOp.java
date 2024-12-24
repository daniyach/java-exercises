package misArrays;

public class ArraysOp {
	public static void ordena1DMenorMayor(int v[]) {
		int pmin = 0, min;
		
		for(int i=0; i<v.length-1; i++) {
			min=v[i];
			for(int j=i+1; j<v.length; j++) {
				if (min>v[j]) {
					min=v[j];
					pmin=j;
				}
			}
			v[pmin]=v[i];
			v[i]=min;
		}
	}
	
	/*public static void ordena1DMenorMayor(double v[]) { // SOLUCIONAR PROBLEMAS
		double pmin = 0;
		int min;
		
		for(int i=0; i<v.length-1; i++) {
			min=v[i];
			for(int j=i+1; j<v.length; j++) {
				if (min>v[j]) {
					min=v[j];
					pmin=()j;
				}
			}
			v[pmin]=v[i];
			v[i]=min;
		}
	}*/

	// Recorrer la matriz por filas y columnas y añadir suma acumulada.
	public static int[][] multiplicaMatrices(int[][] A, int[][] B){
		int [][] R = new int[A.length][B[0].length];
		for(int fil=0; fil<R.length; fil++) {
			for(int col=0; col<R[fil].length; col++) {
				for(int k=0; k<B.length; k++) {
					R[fil][col] = R[fil][col]+A[fil][k]*B[k][col];
				}
			}
		}
		return R;
	}
	
	public static double[][] multiplicaMatrices(double[][] A, double[][] B){
		double [][] R = new double[A.length][B[0].length];
		for(int fil=0; fil<R.length; fil++) {
			for(int col=0; col<R[fil].length; col++) {
				for(int k=0; k<B.length; k++) {
					R[fil][col] = R[fil][col]+A[fil][k]*B[k][col];
				}
			}
		}
		return R;
	}
	
	public static int cuantasVecesEsta(int[][] M, int x) {
		int contador = 0;
		for (int f=0; f<M.length; f++) {
			for(int c=0; c<M[f].length; c++) {
				if(M[f][c]==x) {
					contador++;
				}
			}
		}
		return contador;
	}
	
	public static int[] convierte2Da1D(int M[][]) {
		int [] es1D = new int[M.length*M[0].length];
		int k = 0;
		for (int f=0; f<M.length; f++) {
			for(int c=0; c<M[f].length; c++) {
				es1D[k]=M[f][c];
				k++;
			}
		}
		return es1D;
	}
	
}
