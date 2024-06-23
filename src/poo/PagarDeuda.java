package poo;

import javax.swing.JOptionPane;

public class PagarDeuda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Deuda Danny = new Deuda();
		
		Deuda Anibal = new Deuda();
		
		String quienEntra;
		
		boolean infinito = true;
		
		
		while(infinito) {
			quienEntra = JOptionPane.showInputDialog("Digite el nombre de la persona que entra a pagar la Deuda: ");
			
			
			if(!quienEntra.equals("Danny") && !quienEntra.equals("Anibal")) {
				System.out.println("Ud. no tiene ningu prestamo pendiente. ");
				
			}
			
			else {
				if(quienEntra.equals("Danny")) {
					
					JOptionPane.showMessageDialog(null, Danny.consultar());
					
					Danny.DarPago(Integer.parseInt(JOptionPane.showInputDialog("Cuanto es el monto que va a pagar: ")));
					
					System.out.println(Danny.Recibo());
				}
				
				
				if(quienEntra.equals("Anibal")) {
					
					JOptionPane.showMessageDialog(null, Anibal.consultar());
					
					Anibal.DarPago(Integer.parseInt(JOptionPane.showInputDialog("Cuanto es el monto que va a pagar: ")));
					
					System.out.println(Anibal.Recibo());
					
				}
			}
			
		}
		
		
		System.out.println("Usted no tiene ningun prestamo ");

		
		
		

	}

}

class Deuda{
	private static int deuda;
	private int mensulidad;
	
	public Deuda() {
		deuda = 1000;
	}
	
	public void DarPago(int mensualidad) {
		this.mensulidad = mensualidad;
		
		deuda = deuda - mensualidad;
	}
	
	public String Recibo() {
		if(deuda == 0) {
			return "\n========================================================="
					+ "\nMuchas gracias usted ya termino de pagar su deuda"
					+ "\n======================================================";
		}
		else {
			
			return "\nMuchas gracias por el pago de  la cuota, tiene pendiente /S" + deuda + "\n";
		}
	}
	
	public String consultar() {
		return "Tiene una deuda de : S/" + deuda;
	}
	
	
	
}

