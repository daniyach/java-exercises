package ejecutables;

import misArrays.PrintArrays;

public class EstructurasDimensionales {
	public static void main(String args[]) {
		int[] v = { 1, 2, 7, -9 };
		PrintArrays.printArray1D(v);

		String[] palabras = { "Antonio", "Madrid", "Barcelona", "Zaragoza" };
		PrintArrays.printArray1D(palabras);

		System.out.println("");

		double v2[][] = { { 1, -2, 3 }, { 2.3, 4.5 }, { 3.8, -6.3 }, { -3.9 } };
		PrintArrays.printArray2D(v2);

		System.out.println("");

		int[][][] v3 = { { { 1, 2 }, { 3, 4 } }, { { 5, 6 }, { 7, 8 } }, { { 9, 10 }, { 11, 12 } } };
		PrintArrays.printArray3D(v3);
	}
}
