package ejecuta;
import metodos1.*;

public class Matrices {

	public static void main(String[] args) {
		
		double m[][] = {{1,2,3},{4,5,6}};
		
		MetodosArrays.print2D(m);
		double [][] mt = MetodosArrays.matrizTranspuesta(m);
		MetodosArrays.print2D(mt);
		
		double x[][] = MetodosArrays.rellenaMatriz(2, 3);

	}

}
