package ejercicio1;

public class MyArrays1 {

	public static void printVector(int[] v) {
		System.out.print("[");
		for (int e = 0; e < v.length; e++) {
			if (e == v.length - 1) {
				System.out.print(v[e] + "]");
			} else {
				System.out.print(v[e] + ",");
			}
		}
		System.out.println("");
	}

	/********************************************************************/

	public static void printVector(double[] v) {
		System.out.print("[");
		for (int e = 0; e <= v.length - 1; e++) {
			if (e == v.length - 1) {
				System.out.print(v[e] + "]");
			} else {
				System.out.print(v[e] + ",");
			}
		}
		System.out.println("");
	}

	/********************************************************************/

	public static void printVector(float[] v) {
		System.out.print("[");
		for (int e = 0; e <= v.length - 1; e++) {
			if (e == v.length - 1) {
				System.out.print(v[e] + "]");
			} else {
				System.out.print(v[e] + ",");
			}
		}
		System.out.println("");
	}

	/********************************************************************/
	public static void printVector(long[] v) {
		System.out.print("[");
		for (int e = 0; e <= v.length - 1; e++) {
			if (e == v.length - 1) {
				System.out.print(v[e] + "]");
			} else {
				System.out.print(v[e] + ",");
			}
		}
		System.out.println("");
	}

	/********************************************************************/

	public static void printVector(String[] v) {
		System.out.print("[");
		for (int e = 0; e <= v.length - 1; e++) {
			if (e == v.length - 1) {
				System.out.print(v[e] + "]");
			} else {
				System.out.print(v[e] + ",");
			}
		}
		System.out.println("");
	}

	/********************************************************************/

	public static void printVector(char v[]) {
		System.out.print("[");
		for (int e = 0; e <= v.length - 1; e++) {
			if (e == v.length - 1) {
				System.out.print(v[e] + "]");
			} else {
				System.out.print(v[e] + ",");
			}
		}
		System.out.println("");
	}

	/********************************************************************/
	/********************************************************************/

	public static void printMatrix(int m[][]) {
		for (int f = 0; f < m.length; f++) {
			MyArrays1.printVector(m[f]);
			// System.out.println("");
		}
	}

	public static void printMatrix(long m[][]) {
		for (int f = 0; f < m.length; f++) {
			MyArrays1.printVector(m[f]);
			// System.out.println("");
		}
	}

	public static void printMatrix(float m[][]) {
		for (int f = 0; f < m.length; f++) {
			MyArrays1.printVector(m[f]);
			// System.out.println("");
		}
	}

	public static void printMatrix(double m[][]) {
		for (int f = 0; f < m.length; f++) {
			MyArrays1.printVector(m[f]);
			// System.out.println("");
		}
	}

	public static void printMatrix(String m[][]) {
		for (int f = 0; f < m.length; f++) {
			MyArrays1.printVector(m[f]);
			// System.out.println("");
		}
	}

	public static void printMatrix(char m[][]) {
		for (int f = 0; f < m.length; f++) {
			MyArrays1.printVector(m[f]);
			// System.out.println("");
		}
	}

}
