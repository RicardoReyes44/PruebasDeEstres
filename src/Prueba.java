
public class Prueba {

	public static int[] generarMilNumeros() {
        int []array = new int[1000];
		
		for(int i=0; i<1000; i++) {
			array[i] = (int)(Math.random()*100);
		}
		
		return array;
	}
	
	public static void main(String[] args) {

	}

}
