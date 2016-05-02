package Atividade1;

public class VetorInvertido {
	
	public static void main (String [] args){
		
		int [] arrayA = new int[]{2,0,1,6};
		int [] arrayB = new int[arrayA.length];
		int incr = 0;
		String resultado = "";
		
		for (int i=arrayA.length-1; i>=0; i--){
			
			arrayB[incr] = arrayA[i];
			resultado += arrayB[incr];
			incr++;
		}
		
		System.out.println(resultado);
		
	}
}
