import javax.swing.JOptionPane;

public class CompruebaMail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//vamos a evaluar si hay un arroba o no lo hay
		
		int arroba=0;
		boolean punto=false;
		
		String meal=JOptionPane.showInputDialog("Introduce mail: ");
		
		for(int i = 0;i<meal.length();i++) {
			if(meal.charAt(i)=='@') {
				arroba++;
			}
			if(meal.charAt(i)=='.') {
				punto=true;
			}
		}
		
		if(arroba==1  && punto==true) {
			System.out.println("Es correcto");
		}
		else {
			System.out.println("Es incorrecto");
		}
		


	}

}
