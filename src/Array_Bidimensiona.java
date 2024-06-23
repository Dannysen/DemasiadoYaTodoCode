
public class Array_Bidimensiona {

	public static void main(String[] args) {
		
		int [][] matriz = {
				{10,22,12,32,65,76},
				{12,32,43,34,45,65},
				{90,3,2,54,65,67},
				{10,22,12,32,65,76},
				{12,32,43,34,45,65}
		};
		
		
		
	for(int[]fila:matriz) {

		System.out.println();
		for(int z : fila) {
			
			System.out.print(z + " ");
		}
	}
	}
}
