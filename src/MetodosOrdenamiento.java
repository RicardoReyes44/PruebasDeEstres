import java.util.Arrays;

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
	
	public static class QuickSort{
		
		public static long[] ejecutar(long[] array) {
			
			tInicio = System.nanoTime();
            long []ordenado = quickSort(array, 0, array.length-1);
            tFin = System.nanoTime();
			System.out.println("Tiempo de ejecucion en ordenamiento: " + (tFin-tInicio));

			return ordenado;
		}
		
		public static long[] quickSort(long[] array, int izq, int der){
			
			long pivote = array[izq];
			int i = izq, j=der;
			long aux;
			
			while(i<j) {
				while(array[i]<=pivote && i<j) i++;
				while(array[j]>pivote) j--;
				if(i<j) {
					aux = array[i];
					array[i] = array[j];
					array[j] = aux;
				}
			}
			array[izq] = array[j];
			array[j] = pivote;
			
			if(izq<j-1)
				quickSort(array, izq, j-1);
			if(j+1<der)
				quickSort(array, j+1, der);
			
			return array;
		}
		
	}
	
    static class Radix{
    	public static void orden(long[]numeros) {
    		  tInicio = System.nanoTime();
    	      if(numeros.length == 0)
    	          return;
    	          int[][] np = new int[numeros.length][2];
    	          int[] q = new int[0x100];
    	          int i,j,k,l,f = 0;
    	          for(k=0;k<4;k++) {
    	             for(i=0;i<(np.length-1);i++)
    	             np[i][1] = i+1;
    	             np[i][1] = -1;
    	             for(i=0;i<q.length;i++)
    	             q[i] = -1;
    	             for(f=i=0;i<numeros.length;i++) {
    	                j = (int)((0xFF<<(k<<3))&numeros[i])>>(k<<3);
    	                if(q[j] == -1)
    	                l = q[j] = f;
    	             else {
    	                l = q[j];
    	                while(np[l][1] != -1)
    	                l = np[l][1];
    	                np[l][1] = f;
    	                l = np[l][1];
    	             }
    	             f = np[f][1];
    	             np[l][0] = (int)numeros[i];
    	             np[l][1] = -1;
    	          }
    	          for(l=q[i=j=0];i<0x100;i++)
    	          for(l=q[i];l!=-1;l=np[l][1])
    	        	  numeros[j++] = np[l][0];
    	       }//for
    	       tFin = System.nanoTime();
    		   System.out.println("Tiempo de ejecucion en ordenamiento: " + (tFin-tInicio));
    	}//metodo
  	}//metodo
	
	public static void mostrar(long[] array) {
    	System.out.println("Array ordenado: " + Arrays.toString(array));
    }
}
