import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Prueba {

	public static long[] ejecutar(long[] array) {
		
		long []ordenado = quickSort(array, 0, array.length-1);
		
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
	
	public static long[] generarMilNumeros() {
        long []array = new long[1000];
		
		for(int i=0; i<1000; i++) {
			array[i] = (long)(Math.random()*100);
		}
		
		return array;
	}
	
	public static long[] generarDiezMilNumeros() {
        long []array = new long[10000];
		
        for(int i=0; i<10000; i++) {
			array[i] = (long)(Math.random()*100);
		}
        
		return array;
	}
	
	public static long[] generarCienMilNumeros() {
        long []array = new long[100000];
		
        for(int i=0; i<100000; i++) {
			array[i] = (long)(Math.random()*100);
		}
        
		return array;
	}
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		long []mil = generarMilNumeros();
		long []diezMil = generarDiezMilNumeros();
		long []CienMil = generarCienMilNumeros();
		
		while(true) {
			
			System.out.println("------------MENU------------");
			System.out.println("1.- Calcular con 1000 numeros");
			System.out.println("2.- Calcular con 10000 numeros");
			System.out.println("3.- Calcular con 100000 numeros");
			System.out.println("4.- Salir");
			System.out.println("Introduce una opcion: ");
			int op = entrada.nextInt();
			
			try {
			if(op==1) {
				
				System.out.println("Burbuja 1: ");
				System.out.println(Arrays.toString(MetodosOrdenamiento.Burbuja.ordenacionBurbuja1(mil.clone()))+"\n");
				System.out.println("Burbuja 2: ");
				System.out.println(Arrays.toString(MetodosOrdenamiento.Burbuja.ordenacionBurbuja2(mil.clone()))+"\n");
				System.out.println("Burbuja 3: ");
				System.out.println(Arrays.toString(MetodosOrdenamiento.Burbuja.ordenacionBurbuja3(mil.clone()))+"\n");
				System.out.println("Insercion: ");
				System.out.println(Arrays.toString(MetodosOrdenamiento.Insercion.ordenadorInsercion(mil.clone()))+"\n");
				System.out.println("Seleccion: ");
				System.out.println(Arrays.toString(MetodosOrdenamiento.OrdenamientoPorSeleccion.ordenamientoSeleccion(mil.clone()))+"\n");
				System.out.println("QuickSort: ");
				System.out.println(Arrays.toString(MetodosOrdenamiento.QuickSort.ejecutar(mil.clone()))+"\n");
				System.out.println("Shellsort: ");
				System.out.println(Arrays.toString(MetodosOrdenamiento.ShellSort.ordenar(mil.clone()))+"\n");
				System.out.println("Radix: ");
				System.out.println(Arrays.toString(MetodosOrdenamiento.Radix.orden(mil.clone()))+"\n");
				long primero[] = ejecutar(generarMilNumeros());
				long segundo[] = ejecutar(mil.clone());
				System.out.println("Intercalacion: ");
				System.out.println(Arrays.toString(MetodosOrdenamiento.Intercalacion.ordenar(primero, segundo))+"\n");
				
			}else if(op==2) {
				
				System.out.println("Burbuja 1: ");
				MetodosOrdenamiento.Burbuja.ordenacionBurbuja1(diezMil.clone());
				System.out.println();
				System.out.println("Burbuja 2: ");
				MetodosOrdenamiento.Burbuja.ordenacionBurbuja2(diezMil.clone());
				System.out.println();
				System.out.println("Burbuja 3: ");
				MetodosOrdenamiento.Burbuja.ordenacionBurbuja3(diezMil.clone());
				System.out.println();
				System.out.println("Insercion: ");
				MetodosOrdenamiento.Insercion.ordenadorInsercion(diezMil.clone());
				System.out.println();
				System.out.println("Seleccion: ");
				MetodosOrdenamiento.OrdenamientoPorSeleccion.ordenamientoSeleccion(diezMil.clone());
				System.out.println();
				System.out.println("QuickSort: ");
				MetodosOrdenamiento.QuickSort.ejecutar(diezMil.clone());
				System.out.println();
				System.out.println("Shellsort: ");
				MetodosOrdenamiento.ShellSort.ordenar(diezMil.clone());
				System.out.println();
				System.out.println("Radix: ");
				MetodosOrdenamiento.Radix.orden(diezMil.clone());
				System.out.println();
				long primero[] = ejecutar(generarDiezMilNumeros());
				long segundo[] = ejecutar(diezMil.clone());
				System.out.println("Intercalacion: ");
				MetodosOrdenamiento.Intercalacion.ordenar(primero, segundo);
				System.out.println();
				
			}else if(op==3) {
				
				System.out.println("Burbuja 1: ");
				MetodosOrdenamiento.Burbuja.ordenacionBurbuja1(CienMil.clone());
				System.out.println();
				System.out.println("Burbuja 2: ");
				MetodosOrdenamiento.Burbuja.ordenacionBurbuja2(CienMil.clone());
				System.out.println();
				System.out.println("Burbuja 3: ");
				MetodosOrdenamiento.Burbuja.ordenacionBurbuja3(CienMil.clone());
				System.out.println();
				System.out.println("Insercion: ");
				MetodosOrdenamiento.Insercion.ordenadorInsercion(CienMil.clone());
				System.out.println();
				System.out.println("Seleccion: ");
				MetodosOrdenamiento.OrdenamientoPorSeleccion.ordenamientoSeleccion(CienMil.clone());
				System.out.println();
				System.out.println("QuickSort: ");
				MetodosOrdenamiento.QuickSort.ejecutar(CienMil.clone());
				System.out.println();
				System.out.println("Shellsort: ");
				MetodosOrdenamiento.ShellSort.ordenar(CienMil.clone());
				System.out.println();
				System.out.println("Radix: ");
				MetodosOrdenamiento.Radix.orden(CienMil.clone());
				System.out.println();
				long primero[] = ejecutar(generarCienMilNumeros());
				long segundo[] = ejecutar(CienMil.clone());
				System.out.println("Intercalacion: ");
				MetodosOrdenamiento.Intercalacion.ordenar(primero, segundo);
				System.out.println();
				
			}else if(op==4){
				break;
			}else {
				System.out.println("Opcion invalida, vuelve a intentarlo");
			}
			System.out.println();
			}catch(InputMismatchException error) {
				System.out.println("Error en la entrada de datos <" + error + ">");
			}
			
		}

	}

}
