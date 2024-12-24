package myarrays2;

public class MyArrays2 {
	
	public static int sumElemntsOfArray(int w[]) {
		
		int suma=0;
		
		for( int e=0; e<=w.length-1; e++) {
			//suma = suma + w[e];
			suma += w[e];
		}
		
		return suma;
		
	}
	
	/********************************************************************/

	public static double sumElemntsOfArray(double w[]) {
		
		double suma=0;
		
		for( int e=0; e<=w.length-1; e++) {
			//suma = suma + w[e];
			suma += w[e];
		}
		
		return suma;
		
	}
	/********************************************************************/

	public static long sumElemntsOfArray(long w[]) {
		
		long suma=0;
		
		for( int e=0; e<=w.length-1; e++) {
			//suma = suma + w[e];
			suma += w[e];
		}
		
		return suma;
		
	}
	
	public static int sumElemntsOfArraysR(int w[], int pos) {
		
		if (pos == w.length-1) {
			return w[pos];
			
		}else {
			return w[pos]+sumElemntsOfArraysR(w,pos+1);
		}
	}
	
	public static double sumElemntsOfArraysR(double w[], int pos) {
		
		if (pos == w.length-1) {
			return w[pos];
			
		}else {
			return w[pos]+sumElemntsOfArraysR(w,pos+1);
		}
	}
	
	public static long sumElemntsOfArraysR(long w[], int pos) {
		
		if (pos == w.length-1) {
			return w[pos];
			
		}else {
			return w[pos]+sumElemntsOfArraysR(w,pos+1);
		}
	}
	
	public static int foundElement(int z[], int x) {
		int donde = -1; 
		boolean noEsta = true;
		// para hacer busquedas se crea una variable booleana inicializada en true
		for(int e=0; e<z.length-1 && noEsta; e++) { //En los arrays no se escribe length(), se hace sin los parentesis
			if (z[e]==x) {
				noEsta = false;
				donde = e;
			}
		}
		return donde;
			
	}
	
	public static int foundElement(double z[], double x) {
		int donde = -1; 
		boolean noEsta = true;
		// para hacer busquedas se crea una variable booleana inicializada en true
		for(int e=0; e<z.length-1 && noEsta; e++) { //En los arrays no se escribe length(), se hace sin los parentesis
			if (z[e]==x) {
				noEsta = false;
				donde = e;
			}
		}
		return donde;
			
	}
	
	public static int foundElementR(int z[], int x, int pos) { // en recusividad se necesita una extra para la posición.
		if (pos>=z.length) {
			return -1;
		}else if(z[pos]==x) {
			return pos;
		}else {
			return foundElementR(z,x,pos+1);
		}
	}
	
	public static int foundElementR(double z[], double x, int pos) { // en recusividad se necesita una extra para la posición.
		if (pos>=z.length) {
			return -1;
		}else if(z[pos]==x) {
			return pos;
		}else {
			return foundElementR(z,x,pos+1);
		}
	}
	
	public static int[] filaColumnaEstaValorEn2D(int M[][], int x) {
		//int donde[] = new int[2];
		int donde[] = {-1,-1};
		boolean noEsta = true;
		for(int f=0; f < M.length && noEsta; f++) {
			for (int c=0; c<M[f].length && noEsta; c++) {
				if (M[f][c] == x) {
					noEsta = false;
					donde[0]=f;
					donde[1]=c;
				}
			} // bucle 2
		}// bucle 1
		return donde;
	}
}
