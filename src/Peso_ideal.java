import javax.swing.*;
public class Peso_ideal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String genero="";
		
		do {
			genero=JOptionPane.showInputDialog("Introduce tu genero: (H/M)");
			
		}while(!genero.equalsIgnoreCase("H") && !genero.equalsIgnoreCase("M"));//sino se cumple es como si el no respondiera a que genero pertece
	
		int altura=Integer.parseInt(JOptionPane.showInputDialog("Introduce altura en cm: "));
		
		int pesoideal=0;
		
		if(genero.equalsIgnoreCase("H")) {
			pesoideal=altura-110;
		}
		else if(genero.equalsIgnoreCase("M")) {
			pesoideal=altura-120;
		}
		
		System.out.println("Tu peso ideal es " + pesoideal);
	}

}
