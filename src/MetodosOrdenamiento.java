import java.util.Arrays;

public class MetodosOrdenamiento {
	
	static long tInicio, tFin;
	static long comparaciones = 0;
	static long intercambios = 0;
	static long recorridos = 0;
	
	static class Burbuja{
		public static long[] ordenacionBurbuja1(long []numeros) {
			long comparaciones = 0;
			long intercambios = 0;
			long recorridos = 0;
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
			long comparaciones = 0;
			long intercambios = 0;
			long recorridos = 0;
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
			long comparaciones = 0;
			long intercambios = 0;
			long recorridos = 0;
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
			long comparaciones = 0;
			long intercambios = 0;
			long recorridos = 0;
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
			long comparaciones = 0;
			long intercambios = 0;
			long recorridos = 0;
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

			intercambios = comparaciones = recorridos = 0;
			
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
			
			long comparaciones = 0;
			long intercambios = 0;
			long recorridos = 0;
			int intervalo = numeros.length/2;
			tInicio = System.nanoTime();
			
			while(intervalo>0) {
				comparaciones++;
				recorridos++;
				for(int i=intervalo; i<numeros.length; i++) {
					recorridos++;
					comparaciones++;
					int j=i-intervalo;
					while(j>=0) {
						recorridos++;
						comparaciones++;
						int k=j+intervalo;
						if(numeros[j]<=numeros[k]) {
							j=-1;
						}else {
							intercambios++;
							long aux=numeros[j];
							numeros[j] = numeros[k];
							numeros[k] = aux;
							j-=intervalo;
						}
						comparaciones++;
					}
				}
				intervalo = intervalo/2;
			}tFin = System.nanoTime();
			System.out.println("Cantidad de recorridos: " + recorridos);
            System.out.println("Cantidad de intercambios: " + intercambios);
            System.out.println("Cantidad de comparaciones: " + comparaciones);
 		    System.out.println("Tiempo de ejecucion en ordenamiento: " + (tFin-tInicio));
 		    return numeros;
		}
	}
	
    static class Radix{
    	public static long[] orden(long[]numeros) {
    		long comparaciones = 0;
			long intercambios = 0;
			long recorridos = 0;
    		  tInicio = System.nanoTime();
    	      if(numeros.length == 0) {
    	    	  comparaciones++;
    	          return null;
    	      }
    	          int[][] np = new int[numeros.length][2];
    	          int[] q = new int[0x100];
    	          int i,j,k,l,f = 0;
    	          for(k=0;k<4;k++) {
    	        	  recorridos++;
    	        	  comparaciones++;
    	             for(i=0;i<(np.length-1);i++) {
    	             recorridos++;
    	             np[i][1] = i+1;
    	             comparaciones++;
    	             }
    	             np[i][1] = -1;
    	             for(i=0;i<q.length;i++) {
    	             recorridos++;
    	             q[i] = -1;
    	             comparaciones++;
    	             }for(f=i=0;i<numeros.length;i++) {
    	            	 recorridos++;
    	            	 comparaciones++;
    	                j = (int)((0xFF<<(k<<3))&numeros[i])>>(k<<3);
    	                comparaciones++;
    	                if(q[j] == -1)
    	                l = q[j] = f;
    	             else {
    	                l = q[j];
    	                while(np[l][1] != -1) {
    	                l = np[l][1];
    	                recorridos++;
    	                }
    	                intercambios++;
    	                np[l][1] = f;
    	                l = np[l][1];
    	                comparaciones++;
    	             }
    	             f = np[f][1];
    	             np[l][0] = (int)numeros[i];
    	             np[l][1] = -1;
    	          }
    	          for(l=q[i=j=0];i<0x100;i++) {
    	        	  comparaciones++;
    	        	  recorridos++;
    	          for(l=q[i];l!=-1;l=np[l][1]) {
    	        	  numeros[j++] = np[l][0];
    	        	  comparaciones++;
    	        	  recorridos++;
    	          }
    	          }
    	       }//for
    	       tFin = System.nanoTime();
    	       System.out.println("Cantidad de recorridos: " + recorridos);
               System.out.println("Cantidad de intercambios: " + intercambios);
               System.out.println("Cantidad de comparaciones: " + comparaciones);
    		   System.out.println("Tiempo de ejecucion en ordenamiento: " + (tFin-tInicio));
    	    return numeros;
    	}//metodo
  	}//metodo
	
    static class Intercalacion{
         public static long[] ordenar(long[] numeros, long[] numeros2) {
        	long arrayOrdenado[] = new long[numeros.length+numeros2.length];
     		
         	int i=0, j=0, k=0;
         	tInicio = System.nanoTime();
         	while(i<numeros.length && j<numeros2.length) {
         		recorridos++;
         		intercambios++;
         		comparaciones++;
         		if(numeros[i]<numeros2[j]) {
         			arrayOrdenado[k] = numeros[i];
         			i++;
         		}else {
         			arrayOrdenado[k] = numeros2[j];
         			j++;
         		}
         		comparaciones++;
         		k++;
         	}
         	
         	while(i<numeros.length) {
         		recorridos++;
         		intercambios++;
         		comparaciones++;
         		arrayOrdenado[k] = numeros[i];
     			i++;
     			k++;
         	}
         	
             while(j<numeros2.length) {
            	recorridos++;
            	intercambios++;
            	comparaciones++;
             	arrayOrdenado[k] = numeros2[j];
     			j++;
     			k++;
         	}
            tFin = System.nanoTime();
            System.out.println("Cantidad de recorridos: " + recorridos);
            System.out.println("Cantidad de intercambios: " + intercambios);
            System.out.println("Cantidad de comparaciones: " + comparaciones);
 		    System.out.println("Tiempo de ejecucion en ordenamiento: " + (tFin-tInicio));
			recorridos = comparaciones = intercambios = 0;
         	return arrayOrdenado;
    	}
    }
    
    static class OrdenamientoMezclaDirecta{
    	
    	public static long[] ordenamientoMezcla(long arreglo[]) {
            int i,j,k;

    		if(arreglo.length>1) {
    			comparaciones++;
    			int numElementosIzq = arreglo.length/2;
    			int numElementosDer=arreglo.length-numElementosIzq;
    			
    			long arregloIzquierdo[] = new long[numElementosIzq];
    			long arregloDerecho[] = new long[numElementosDer];
    			
    			for(i=0; i<numElementosIzq; i++) {
    				recorridos++;
    				arregloIzquierdo[i] = arreglo[i];
    				comparaciones++;
    			}
    			
    			for(i=numElementosIzq; i<numElementosIzq+numElementosDer; i++) {
    				arregloDerecho[i-numElementosIzq]=arreglo[i];
    				comparaciones++;
    				recorridos++;
    			}
    			
    			//Ahora se aplica la recursividad
    			arregloIzquierdo = ordenamientoMezcla(arregloIzquierdo);
    			arregloDerecho = ordenamientoMezcla(arregloDerecho);
    			i=j=k=0;
    			/*
    			 * i= posicion en el arreglo original
    			 * j= posicion en el arreglo izquierdo
    			 * k= posicion en el arreglo derecho
    			 * 
    			*/
    			
    			while(arregloIzquierdo.length!=j && arregloDerecho.length!=k) {
    				comparaciones++;
    				recorridos++;
    				if(arregloIzquierdo[j]<arregloDerecho[k]) {
    					arreglo[i] = arregloIzquierdo[j];
    					i++;
    					j++;
    				}else {
    					arreglo[i] = arregloDerecho[k];
    					i++;
    					k++;
    				}
    				intercambios++;
    				comparaciones++;
    			}
    			
    			//Arreglo izquierdo
    			while(arregloIzquierdo.length!=j) {
    				arreglo[i] = arregloIzquierdo[j];
    				i++;
    				j++;
    				intercambios++;
    				recorridos++;
    				comparaciones++;
    			}
    			
    			while(arregloDerecho.length!=k) {
    				arreglo[i] = arregloDerecho[k];
    				i++;
    				k++;
    				intercambios++;
    				recorridos++;
    				comparaciones++;
    			}
    			
    		}// if

    		return arreglo;
    	}
    	
    	public static long[] ejecutarMD(long[] array) {
    		tFin = System.nanoTime();

    		long ordenado[] =ordenamientoMezcla(array);
    		
            System.out.println("Cantidad de recorridos: " + recorridos);
            System.out.println("Cantidad de intercambios: " + intercambios);
            System.out.println("Cantidad de comparaciones: " + comparaciones);
 		    System.out.println("Tiempo de ejecucion en ordenamiento: " + (tFin-tInicio));
			recorridos = comparaciones = intercambios = 0;
			
			return ordenado;
    	}
    }
    
    static class MezclaNatural {
    	public static void mezclaDirecta2(long arreglo[]) {
            int i,j,k;
    		
    		if(arreglo.length>1) {
    			comparaciones++;
    			int numElementosIzq = arreglo.length/2;
    			int numElementosDer=arreglo.length-numElementosIzq;
    			
    			long arregloIzquierdo[] = new long[numElementosIzq];
    			long arregloDerecho[] = new long[numElementosDer];
    			
    			for(i=0; i<numElementosIzq; i++) {
    				comparaciones++;
    				arregloIzquierdo[i] = arreglo[i];
    				recorridos++;
    			}
    			
    			for(i=numElementosIzq; i<numElementosIzq+numElementosDer; i++) {
    				arregloDerecho[i-numElementosIzq]=arreglo[i];
    				comparaciones++;
    				recorridos++;
    			}
    			
    			//Ahora se aplica la recursividad
    			mezclaDirecta2(arregloIzquierdo);
    			mezclaDirecta2(arregloDerecho);
    			i=j=k=0;
    			/*
    			 * i= posicion en el arreglo original
    			 * j= posicion en el arreglo izquierdo
    			 * k= posicion en el arreglo derecho
    			 * 
    			*/
    			
    			while(arregloIzquierdo.length!=j && arregloDerecho.length!=k) {
    				recorridos++;
    				comparaciones++;
    				if(arregloIzquierdo[j]<arregloDerecho[k]) {
    					arreglo[i] = arregloIzquierdo[j];
    					comparaciones++;
    					i++;
    					j++;
    				}else {
    					arreglo[i] = arregloDerecho[k];
    					i++;
    					comparaciones++;
    					k++;
    				}
    				intercambios++;
    			}
    			
    			//Arreglo izquierdo
    			while(arregloIzquierdo.length!=j) {
    				arreglo[i] = arregloIzquierdo[j];
    				i++;
    				j++;
    				intercambios++;
    				comparaciones++;
    				recorridos++;
    			}
    			
    			while(arregloDerecho.length!=k) {
    				arreglo[i] = arregloDerecho[k];
    				i++;
    				intercambios++;
    				k++;
    				comparaciones++;
    				recorridos++;
    			}
    		}//if
    	}
    		
    	public static void mezclaNatural(long numeros[]) {
    		int izquierda = 0;
	        int izq = 0;
	        int derecha = numeros.length-1;
	        int der = derecha;
	        boolean ordenado = false;
	        
	        tFin = System.nanoTime();
	        do {
	        	
	        	izquierda = 0;
	        	ordenado = true;
	        	recorridos++;
	        	while(izquierda<derecha) {
	        		recorridos++;
	        		comparaciones++;
	        		izq = izquierda;
	        		while(izq<derecha && numeros[izq]<=numeros[izq+1]) {
	        			izq++;
	        			comparaciones++;
	        			recorridos++;
	        		}
	        		der = izq+1;
	        		while(der==derecha-1 || der<derecha && numeros[der]<=numeros[der+1]) {	
	        			recorridos++;
	        			comparaciones++;
	        		}
	        		
	        		if(der<=derecha) {
	        			comparaciones++;
	        			mezclaDirecta2(numeros);
	        			
	        			ordenado = false;
	        		}
	        		izquierda = izq;
	        	}
	        	comparaciones++;
	        }while(!ordenado);
	        
	        System.out.println("Cantidad de recorridos: " + recorridos);
            System.out.println("Cantidad de intercambios: " + intercambios);
            System.out.println("Cantidad de comparaciones: " + comparaciones);
 		    System.out.println("Tiempo de ejecucion en ordenamiento: " + (tFin-tInicio));
			recorridos = comparaciones = intercambios = 0;
    	}
    }
    
	public static void mostrar(long[] array) {
    	System.out.println("Array ordenado: " + Arrays.toString(array));
    }
}
