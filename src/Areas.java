import java.util.*;
import javax.swing.*;
public class Areas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada =  new Scanner(System.in);
		
		System.out.println("Elige una opcion: \n1: Cuadrado \n2: Rectángulo \n3: Triángulo \n4: Circulo");
		
		int figura=entrada.nextInt();
		
		switch(figura) {
		case 1:
			int lado = Integer.parseInt(JOptionPane.showInputDialog("Introduce el lado"));
			
			System.out.println("El area del cuadrado es " + Math.pow(lado, 2));
			
			break;
			
	
		case 2:
			int base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));
			
			int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));
			
			System.out.println("El área del rectángulo es " + base*altura);
			
			break;
			
	
		case 3:
			
			 base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));
			
			altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));
			
			System.out.println("El area del triángulo es " + (base*altura)/2);
			
			break;
			
		case 4:
			
			int radio = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));
			
			System.out.print("El área del círculo es ");
			
			System.out.printf("%1.2f",Math.PI*(Math.pow(radio, 2)));
			
			break;
			
		default:
			
			System.out.println("OPcion no disponible");
			
			break;
			
			
		}
	}

}
