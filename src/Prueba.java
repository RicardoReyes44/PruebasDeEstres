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
			
			System.out.println("Introduce una opcion: ");
			int op = entrada.nextInt();
			
			if(op==1) {
				
				MetodosOrdenamiento.Burbuja.ordenacionBurbuja1(mil);
				MetodosOrdenamiento.Burbuja.ordenacionBurbuja2(mil);
				MetodosOrdenamiento.Burbuja.ordenacionBurbuja3(mil);
				MetodosOrdenamiento.Insercion.ordenadorInsercion(mil);
				MetodosOrdenamiento.mostrar(mil);
				MetodosOrdenamiento.OrdenamientoPorSeleccion.ordenamientoSeleccion(mil);
				MetodosOrdenamiento.mostrar(mil);
				long ordenado[] = MetodosOrdenamiento.QuickSort.ejecutar(mil);
				MetodosOrdenamiento.mostrar(ordenado);
				MetodosOrdenamiento.ShellSort.ordenar(mil);
				MetodosOrdenamiento.mostrar(mil);
				MetodosOrdenamiento.Radix.orden(mil);
				MetodosOrdenamiento.mostrar(mil);
				
			}else if(op==2) {
				
				
				
			}else if(op==3) {
				
				
				
			}else {
				System.out.println("Opcion invalida, vuelve a intentarlo");
			}
			
		}

		
	}

}
