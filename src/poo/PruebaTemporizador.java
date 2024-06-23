package poo;
import java.awt.Toolkit;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.JOptionPane;
import javax.swing.Timer;
public class PruebaTemporizador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DameLaHora oyente = new DameLaHora();//constructor por defecto
		
		//le decimos que comienze a ejecutar el temporizador eso lo hacemos con el metodo star
		
		//vimos que una interfaz y una clase abstracta no se puede instanciar, lo que si se puede hacer es intanciar la interfaz diciendole que
		//es igual a un objeto, es decir de la clase que implementa esa interfaz, indirectamente
		
		//Seria igual : ActionListener oyente= new DameLaHora.
		
		Timer miTemporizador = new Timer(5000, oyente);//cinco segundos primer parametro,
		//DANNY
		miTemporizador.start();
		
		JOptionPane.showMessageDialog(null, "Pulsa acceptar para detener el temporizador");
		
		System.exit(0);
		
	}

}

class DameLaHora implements ActionListener{
	
	public void actionPerformed(ActionEvent e) {
		
		Date ahora = new Date();
		
		System.out.println("Te pongo la hora cada 5 segundo " + ahora);
		
		//para conseguir ese sonido cada vez que nos da esto
		
		Toolkit.getDefaultToolkit().beep(); 
	}
}
