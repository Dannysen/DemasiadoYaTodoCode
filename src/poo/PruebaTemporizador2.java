package poo;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.Timer;
import java.awt.Toolkit;
public class PruebaTemporizador2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Reloj mireloj = new Reloj();
		
		mireloj.enMarcha(3000,true);
		
		JOptionPane.showMessageDialog(null, "Pulse aceptar para terminar");//null significa para que la ventana este presente en primer plano hasta que pulsemos aceptar

		System.exit(0);
	}

}

class Reloj{
	
	//encargar en poner en marcha este temporizador METODO
	public void enMarcha(int intervalo, final boolean sonido) {
		class DameLaHora2 implements ActionListener {
			
			public void actionPerformed(ActionEvent evento) {
				
				Date ahora = new Date();
				
				System.out.println("Te pongo la hora cada 3 segundos: " +  ahora);
				
				if(sonido) {
					Toolkit.getDefaultToolkit().beep();
				}
			}
			
			
		}
		
		ActionListener oyente = new DameLaHora2();
		
		Timer miTemporizador = new Timer(intervalo, oyente);
		
		miTemporizador.start();
	}
	
	
	
}


