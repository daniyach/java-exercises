package ejercicio2;

public class MyMath {

	public static float maximo(float a, float b) {
		float max; // Lo primero que hacemos es declarar la variable
		
		if(a >= b) {
			max = a;
		}else {
			max = b;
		}
		return max;
	}
	
	public static float maximo(float a, float b, float c) {
		//float max3;
		
		//max3 = maximo(a,b);
		//max3 = maximo(max3, c);
		
		//max3 = maximo(maximo(a,b), c);
		
		// return max3;
		return maximo(maximo(a,b), c);
	}
	
	public static double absComplejo(double pr, double pi) {
		
		return Math.sqrt(Math.pow(pr, 2) + Math.pow(pi, 2));
	}
	
	public static double angComplejo (double pr, double pi) {
		double ang;
		
		double a1c = Math.atan(Math.abs(pi)/Math.abs(pr));
		if (pr >= 0 && pi >= 0) {
			if (pr==0 && pi ==0) {
				ang = 0;
			}else {
				ang = a1c;
			}
		}else if(pr <= 0 && pi >= 0) {
			ang = Math.PI - a1c;
		}else if (pr <=0 && pi <=0) {
			ang = -Math.PI + a1c;
		}else {
			ang = -a1c;
		}
		
		return ang;
	}
}
