import java.util.Arrays;

public class MetodosOrdenamiento {
	
	static long tInicio, tFin;
	static int comparaciones = 0;
	static int intercambios = 0;
	static int recorridos = 0;
	
	static class Burbuja{
		public static long[] ordenacionBurbuja1(long []numeros) {
			int comparaciones = 0;
			int intercambios = 0;
			int recorridos = 0;
			tInicio = System.nanoTime();
            for(int i=1; i<=numeros.length-1; i++) {
            	recorridos++;
				comparaciones++;
				for(int j=0; j<=numeros.length-i-1; j++) {
					comparaciones++;
					recorridos++;
					if(numeros[j]>numeros[j+1]) {
						comparaciones++;
						long aux = numeros[j];
						numeros[j] = numeros[j+1];
						numeros[j+1] = aux;
						intercambios++;
					}
				}
			}
            tFin = System.nanoTime();
            System.out.println("Cantidad de recorridos: " + recorridos);
            System.out.println("Cantidad de intercambios: " + intercambios);
            System.out.println("Cantidad de comparaciones: " + comparaciones);
			System.out.println("Tiempo de ejecucion en ordenamiento por burbuja: " + (tFin-tInicio));
		    return numeros;
		}
		
		public static long[] ordenacionBurbuja2(long []numeros) {
			int comparaciones = 0;
			int intercambios = 0;
			int recorridos = 0;
			tInicio = System.nanoTime();
            for(int i=1; i<numeros.length; i++) {
				recorridos++;
				comparaciones++;
				for(int j=0; j<numeros.length-i; j++) {
					recorridos++;
					comparaciones++;
					if(numeros[j]>numeros[j+1]) {
						comparaciones++;
						long aux = numeros[j];
						numeros[j] = numeros[j+1];
						numeros[j+1] = aux;
						intercambios++;
					}
				}
			}
            tFin = System.nanoTime();
            System.out.println("Cantidad de recorridos: " + recorridos);
            System.out.println("Cantidad de intercambios: " + intercambios);
            System.out.println("Cantidad de comparaciones: " + comparaciones);
			System.out.println("Tiempo de ejecucion en ordenamiento por burbuja: " + (tFin-tInicio));
		    return numeros;
		}
		
		public static long[] ordenacionBurbuja3(long []numeros) {
			int i=1;
			int comparaciones = 0;
			int intercambios = 0;
			int recorridos = 0;
			tInicio = System.nanoTime();
	     	   do {
	     		   
	     		   for(int j=0; j<numeros.length-i; j++) {
	 					comparaciones++;
	 					recorridos++;
	 					if(numeros[j]>numeros[j+1]) {
	 						comparaciones++;
	 						long aux = numeros[j];
	 						numeros[j] = numeros[j+1];
	 						numeros[j+1] = aux;
	 						intercambios++;
	 					}
	 				}
	     		   recorridos++;
	     		   i=1+i;
	     		   comparaciones++;
	     	   }while(i<numeros.length);
	     	tFin = System.nanoTime();
	     	System.out.println("Cantidad de recorridos: " + recorridos);
            System.out.println("Cantidad de intercambios: " + intercambios);
            System.out.println("Cantidad de comparaciones: " + comparaciones);
			System.out.println("Tiempo de ejecucion en ordenamiento por burbuja: " + (tFin-tInicio));
	        return numeros;
		}
	}// class Burbuja
	
	static class Insercion {
		public static long[] ordenadorInsercion(long []numeros) {
			int comparaciones = 0;
			int intercambios = 0;
			int recorridos = 0;
            long aux;
			
            tInicio = System.nanoTime();
			for(int i=1; i<numeros.length; i++) {
				aux = numeros[i];
				comparaciones++;
				recorridos++;
				for(int j=i-1; j>=0 && numeros[j]>aux; j--) {
					comparaciones++;
					recorridos++;
					numeros[j+1] = numeros[j];
					numeros[j] = aux;
					intercambios++;
					
				}// segundo for
			}// primero for
			tFin = System.nanoTime();
			System.out.println("Cantidad de recorridos: " + recorridos);
            System.out.println("Cantidad de intercambios: " + intercambios);
            System.out.println("Cantidad de comparaciones: " + comparaciones);
			System.out.println("Tiempo de ejecucion en ordenamiento: " + (tFin-tInicio));
		    return numeros;
		}
	}

	public static class OrdenamientoPorSeleccion{
		public static long[] ordenamientoSeleccion(long []numeros) {
			int comparaciones = 0;
			int intercambios = 0;
			int recorridos = 0;
			tInicio = System.nanoTime();
            for(int i=0; i<numeros.length-1; i++) {
				recorridos++;
				comparaciones++;
				for(int j=i; j<numeros.length; j++) {
					recorridos++;
					comparaciones++;
					if(numeros[i]>numeros[j]) {
						comparaciones++;
						intercambios++;
						long minimo = numeros[i];
						numeros[i] = numeros[j];
						numeros[j] = minimo;	
					}
				}
			}
            tFin = System.nanoTime();
            System.out.println("Cantidad de recorridos: " + recorridos);
            System.out.println("Cantidad de intercambios: " + intercambios);
            System.out.println("Cantidad de comparaciones: " + comparaciones);
			System.out.println("Tiempo de ejecucion en ordenamiento: " + (tFin-tInicio));
		    return numeros;
		}
	}
	
	public static class QuickSort{
		
		public static long[] ejecutar(long[] array) {
			
			tInicio = System.nanoTime();
            long []ordenado = quickSort(array, 0, array.length-1);
            tFin = System.nanoTime();
            System.out.println("Cantidad de recorridos: " + recorridos);
            System.out.println("Cantidad de intercambios: " + intercambios);
            System.out.println("Cantidad de comparaciones: " + comparaciones);
			System.out.println("Tiempo de ejecucion en ordenamiento: " + (tFin-tInicio));

			return ordenado;
		}
		
		public static long[] quickSort(long[] array, int izq, int der){
			
			long pivote = array[izq];
			int i = izq, j=der;
			long aux;
			
			while(i<j) {
				comparaciones++;
				recorridos++;
				while(array[i]<=pivote && i<j) { i++;
				comparaciones++;
				recorridos++;
				}
				while(array[j]>pivote) { j--;
				comparaciones++;
				recorridos++;
				}
				if(i<j) {
					comparaciones++;
				    intercambios++;
					aux = array[i];
					array[i] = array[j];
					array[j] = aux;
				}
			}
			array[izq] = array[j];
			array[j] = pivote;
			
			if(izq<j-1) {
				comparaciones++;
				quickSort(array, izq, j-1);
			}
			if(j+1<der) {
				comparaciones++;
				quickSort(array, j+1, der);
			}
			
			return array;
		}
		
	}
	
    static class ShellSort{
		
		public static long[] ordenar(long []numeros) {
			
			int intervalo = numeros.length/2;
			tInicio = System.nanoTime();
			
			while(intervalo>0) {
				for(int i=intervalo; i<numeros.length; i++) {
					int j=i-intervalo;
					while(j>=0) {
						int k=j+intervalo;
						if(numeros[j]<=numeros[k]) {
							j=-1;
						}else {
							long aux=numeros[j];
							numeros[j] = numeros[k];
							numeros[k] = aux;
							j-=intervalo;
							
						}
					}
				}
				intervalo = intervalo/2;
			}tFin = System.nanoTime();
 		   System.out.println("Tiempo de ejecucion en ordenamiento: " + (tFin-tInicio));
			return numeros;
		}
	}
	
    static class Radix{
    	public static long[] orden(long[]numeros) {
    		  tInicio = System.nanoTime();
    	      if(numeros.length == 0)
    	          return null;
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
    	    return numeros;
    	}//metodo
  	}//metodo
	
	public static void mostrar(long[] array) {
    	System.out.println("Array ordenado: " + Arrays.toString(array));
    }
}
