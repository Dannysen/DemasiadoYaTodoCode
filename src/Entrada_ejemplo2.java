import javax.swing.*;
public class Entrada_ejemplo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String Nombre_usuario=JOptionPane.showInputDialog("Introduce tu nombre, por favor : ");
		
		String edad=JOptionPane.showInputDialog("Introduce tu edad: ");
		
		int edad_usuario=Integer.parseInt(edad);
		edad_usuario++;
		
		System.out.println("Hola " + Nombre_usuario + " tienes " + edad_usuario+ " años");
	}

}
