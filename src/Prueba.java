import java.util.Arrays;
import java.util.Scanner;

public class Prueba {

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
			System.out.println("Introduce una opcion: ");
			int op = entrada.nextInt();
			
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
				
			}else if(op==2) {
				
				
				
			}else if(op==3) {
				
				
				
			}else {
				System.out.println("Opcion invalida, vuelve a intentarlo");
			}
			System.out.println();
			
		}

		
	}

}
