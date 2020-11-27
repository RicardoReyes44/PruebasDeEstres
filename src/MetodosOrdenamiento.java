
public class MetodosOrdenamiento {
	
	static long tInicio, tFin;
	
	static class Burbuja{
		public static void ordenacionBurbuja1(long []numeros) {
			
			tInicio = System.nanoTime();
            for(int i=1; i<=numeros.length-1; i++) {
				
				for(int j=0; j<=numeros.length-i-1; j++) {
					
					if(numeros[j]>numeros[j+1]) {
						long aux = numeros[j];
						numeros[j] = numeros[j+1];
						numeros[j+1] = aux;
					}
				}
			}
            tFin = System.nanoTime();
			System.out.println("Tiempo de ejecucion en ordenamiento por burbuja: " + (tFin-tInicio));
		}
		
		public static void ordenacionBurbuja2(long []numeros) {
			tInicio = System.nanoTime();
            for(int i=1; i<numeros.length; i++) {
				
				for(int j=0; j<numeros.length-i; j++) {
					
					if(numeros[j]>numeros[j+1]) {
						long aux = numeros[j];
						numeros[j] = numeros[j+1];
						numeros[j+1] = aux;
					}
				}
			}
            tFin = System.nanoTime();
			System.out.println("Tiempo de ejecucion en ordenamiento por burbuja: " + (tFin-tInicio));
		}
		
		public static void ordenacionBurbuja3(long []numeros) {
			int i=1;
			tInicio = System.nanoTime();
	     	   do {
	     		   
	     		   for(int j=0; j<numeros.length-i; j++) {
	 					
	 					if(numeros[j]>numeros[j+1]) {
	 						long aux = numeros[j];
	 						numeros[j] = numeros[j+1];
	 						numeros[j+1] = aux;
	 					}
	 				}
	     		   
	     		   i=1+i;
	     	   }while(i<numeros.length);
	     	tFin = System.nanoTime();
			System.out.println("Tiempo de ejecucion en ordenamiento por burbuja: " + (tFin-tInicio));
	    }
	}// class Burbuja
	
	static class Insercion {
		public static void ordenadorInsercion(long []numeros) {
            long aux;
			
            tInicio = System.nanoTime();
			for(int i=1; i<numeros.length; i++) {
				aux = numeros[i];
				
				
				for(int j=i-1; j>=0 && numeros[j]>aux; j--) {
					
					numeros[j+1] = numeros[j];
					numeros[j] = aux;
					
				}// segundo for
			}// primero for
			tFin = System.nanoTime();
			System.out.println("Tiempo de ejecucion en ordenamiento: " + (tFin-tInicio));
		}
	}

	public static class OrdenamientoPorSeleccion{
		public static void ordenamientoSeleccion(long []numeros) {
			tInicio = System.nanoTime();
            for(int i=0; i<numeros.length-1; i++) {
				
				for(int j=i; j<numeros.length; j++) {
					
					if(numeros[i]>numeros[j]) {
						long minimo = numeros[i];
						numeros[i] = numeros[j];
						numeros[j] = minimo;	
					}
				}
			}
            tFin = System.nanoTime();
			System.out.println("Tiempo de ejecucion en ordenamiento: " + (tFin-tInicio));
		}
	}
	
	
}
