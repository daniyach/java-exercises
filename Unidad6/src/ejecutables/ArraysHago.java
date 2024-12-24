package ejecutables;
import misArrays.*;

public class ArraysHago {

	public static void main(String[] args) {
		int w[] = InicializaArray.inicializaVectorEnteros();
		/*	
			PrintArrays.printArray1D(w); // Hay que crear un método para que imprima el array () (día de la clase 11/12/24)
			
			String s[] InicializaArray.inicializaVectorString();
			PrintArrays.printArray1D(w);
			
			ArraysOp.ordena1DMenorMayor(w);
			
			PrintArrays.printArray1D(w);
			*/
		
		int A[][]=InicializaArray.inicializaEstructura2DInt();
		int B[][]=InicializaArray.inicializaEstructura2DInt();
		int C[][]= ArraysOp.multiplicaMatrices(A, B);
		//PrintArrays.printArray2D(C);
		
		
		
	}
	

	
	
}
