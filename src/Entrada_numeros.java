import javax.swing.*;
public class Entrada_numeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String num1=JOptionPane.showInputDialog("Introduce un número: ");
		
		Double num2 = Double.parseDouble(num1);
		
		System.out.print("La raiz de " + num2 + " es ");
		System.out.printf("%1.2f", Math.sqrt(num2));
		
		System.out.println();
		
		double x = 10000.0;
		
		
		System.out.printf("%1.2f",x/3);//darle dos decimales al resultado de esa operacion
	}

}
