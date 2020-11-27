
public class Prueba {

	public static int[] generarMilNumeros() {
        int []array = new int[1000];
		
		for(int i=0; i<1000; i++) {
			array[i] = (int)(Math.random()*100);
		}
		
		return array;
	}
	
	public static int[] generarDiezMilNumeros() {
        int []array = new int[10000];
		
        for(int i=0; i<10000; i++) {
			array[i] = (int)(Math.random()*100);
		}
        
		return array;
	}
	
	public static int[] generarCienMilNumeros() {
        int []array = new int[100000];
		
        for(int i=0; i<100000; i++) {
			array[i] = (int)(Math.random()*100);
		}
        
		return array;
	}
	
	public static void main(String[] args) {
		
		int []mil = generarMilNumeros();
		int []diezMil = generarDiezMilNumeros();
		int []CienMil = generarCienMilNumeros();
		
		while(true) {
			
		}

		
	}

}
