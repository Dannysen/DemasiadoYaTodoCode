
public class Ejemplo_array2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double acumulado;
		double interes=0.10;
		
		double [][] saldo=new double[6][5];
		
		for(int i = 0;i<6;i++) {
			saldo[i][0]=100;
			acumulado=1000;
			
			for(int j = 1;j<5;j++) {
				acumulado=acumulado+(acumulado*interes);
				
				saldo[i][j] = acumulado;
			}
			
			interes=interes+0.01;
		}
		
		for(int z = 0;z<6;z++) {
			for(int y = 0;y < 5 ;y++) {
				System.out.printf("%1.2f", saldo[z][y]);
			}
			System.out.println();
		}
	}
	
	

}
