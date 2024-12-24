package ejercicio1;

public class MyArrays1 {

	public static void print1D(int[] v ) {
		System.out.print("[");
		for(int e=0; e<=v.length-1; e++) {
			if (e==v.length-1) {
				System.out.println(v[e]+"]");
			}else {
				System.out.println(v[e]+",");
			}
		}
	}
	
	/********************************************************************/
	
	public static void print1D(double[] v ) {
		System.out.print("[");
		for(int e=0; e<=v.length-1; e++) {
			if (e==v.length-1) {
				System.out.println(v[e]+"]");
			}else {
				System.out.println(v[e]+",");
			}
		}
	}
	/********************************************************************/
	public static void print1D(long[] v ) {
		System.out.print("[");
		for(int e=0; e<=v.length-1; e++) {
			if (e==v.length-1) {
				System.out.println(v[e]+"]");
			}else {
				System.out.println(v[e]+",");
			}
		}
	}
	/********************************************************************/

	public static void print1D(String[] v ) {
		System.out.print("[");
		for(int e=0; e<=v.length-1; e++) {
			if (e==v.length-1) {
				System.out.println(v[e]+"]");
			}else {
				System.out.println(v[e]+",");
			}
		}
	}
	/********************************************************************/

	public static void print1D(char v[] ) {
		System.out.print("[");
		for(int e=0; e<=v.length-1; e++) {
			if (e==v.length-1) {
				System.out.println(v[e]+"]");
			}else {
				System.out.println(v[e]+",");
			}
		}
	}
	
}
