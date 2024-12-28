package misArrays;

public class PrintArrays {

	// Crear metodo que reciba un vector de enteros y lo imprima en pantalla
	public static void printArray1D(int[] x) {
		int e;
		System.out.print("[");
		for (e = 0; e < x.length - 1; e++) {
			System.out.print(x[e] + ", ");
		}
		System.out.println(x[e] + "]");
	}

	public static void printArray1D(long[] x) {
		int e;
		System.out.print("[");
		for (e = 0; e < x.length - 1; e++) {
			System.out.print(x[e] + ", ");
		}
		System.out.println(x[e] + "]");
	}

	public static void printArray1D(float[] x) {
		int e;
		System.out.print("[");
		for (e = 0; e < x.length - 1; e++) {
			System.out.print(x[e] + ", ");
		}
		System.out.println(x[e] + "]");
	}

	public static void printArray1D(double[] x) {
		int e;
		System.out.print("[");
		for (e = 0; e < x.length - 1; e++) {
			System.out.print(x[e] + ", ");
		}
		System.out.println(x[e] + "]");
	}

	public static void printArray1D(char[] x) {
		int e;
		System.out.print("[");
		for (e = 0; e < x.length - 1; e++) {
			System.out.print(x[e] + ", ");
		}
		System.out.println(x[e] + "]");
	}

	public static void printArray1D(String[] x) {
		int e;
		System.out.print("[");
		for (e = 0; e < x.length - 1; e++) {
			System.out.print(x[e] + ", ");
		}
		System.out.println(x[e] + "]");
	}

	public static void printArray2D(int[][] d2) {
		System.out.println("-------2D-------");
		for (int f = 0; f < d2.length; f++) {
			PrintArrays.printArray1D(d2[f]);
		}
		System.out.println("-------2D-------");
	}

	public static void printArray2D(long[][] d2) {
		System.out.println("-------2D-------");
		for (int f = 0; f < d2.length; f++) {
			PrintArrays.printArray1D(d2[f]);
		}
		System.out.println("-------2D-------");
	}

	public static void printArray2D(float[][] d2) {
		System.out.println("-------2D-------");
		for (int f = 0; f < d2.length; f++) {
			PrintArrays.printArray1D(d2[f]);
		}
		System.out.println("-------2D-------");
	}

	public static void printArray2D(double[][] d2) {
		System.out.println("-------2D-------");
		for (int f = 0; f < d2.length; f++) {
			PrintArrays.printArray1D(d2[f]);
		}
		System.out.println("-------2D-------");
	}

	public static void printArray2D(char[][] d2) {
		System.out.println("-------2D-------");
		for (int f = 0; f < d2.length; f++) {
			PrintArrays.printArray1D(d2[f]);
		}
		System.out.println("-------2D-------");
	}

	public static void printArray2D(String[][] d2) {
		System.out.println("-------2D-------");
		for (int f = 0; f < d2.length; f++) {
			PrintArrays.printArray1D(d2[f]);
		}
		System.out.println("-------2D-------");
	}

	public static void printArray3D(int[][][] d3) {
		System.out.println("-------3D-------");
		for (int i = 0; i < d3.length; i++) {
			PrintArrays.printArray2D(d3[i]);
		}
		System.out.println("-------3D-------");
	}
	
	public static void printArray3D(long[][][] d3) {
		System.out.println("-------3D-------");
		for (int i = 0; i < d3.length; i++) {
			PrintArrays.printArray2D(d3[i]);
		}
		System.out.println("-------3D-------");
	}
	
	public static void printArray3D(float[][][] d3) {
		System.out.println("-------3D-------");
		for (int i = 0; i < d3.length; i++) {
			PrintArrays.printArray2D(d3[i]);
		}
		System.out.println("-------3D-------");
	}
	
	public static void printArray3D(double[][][] d3) {
		System.out.println("-------3D-------");
		for (int i = 0; i < d3.length; i++) {
			PrintArrays.printArray2D(d3[i]);
		}
		System.out.println("-------3D-------");
	}
	
	public static void printArray3D(char[][][] d3) {
		System.out.println("-------3D-------");
		for (int i = 0; i < d3.length; i++) {
			PrintArrays.printArray2D(d3[i]);
		}
		System.out.println("-------3D-------");
	}
	
	public static void printArray3D(String[][][] d3) {
		System.out.println("-------3D-------");
		for (int i = 0; i < d3.length; i++) {
			PrintArrays.printArray2D(d3[i]);
		}
		System.out.println("-------3D-------");
	}

}
