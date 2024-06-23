import java.util.*;

import javax.swing.JOptionPane;
public class Manbalque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Crear un cajero que tenga las siguiente opciones :
		 * 1-Depositar
		 * 2-Retirar
		 * 3-Consultar
		 * 4-Salir
		 * 
		 * Ojo tener en cuenta que puedes realizar las siguientes operaciones siempre y cuando la contraseña sea correcta
		 * */
		
		Scanner entrada = new Scanner(System.in);
		
		int opcion = 0;
		int salarioIni=3000;
		String clave = "TuDanicito1";
		String pass="";
		int intentos = 0;
		int monto, saldoActual;
		int respuesta ;
		
		
		while(!clave.equals(pass)) {
			
			pass = JOptionPane.showInputDialog("Digite su contraseña por favor: ");
			
			if(!clave.equals(pass)) {
				System.out.println("Contraseña incorrecta, vuelva a intentarlo por favor");
				intentos++;
				if(intentos == 3) {
					System.out.println("\nYa son tres veces que introdujo la contraseña incorrecta, si sigue asi Bloqueare su targeta. Por ende estoy escupiendo su targeta antes de bloquearloaa");
					System.exit(0);
				}
			
			} else {
				
				System.out.println("Bienvenido al Banco de la Nación del Perú"
						+ "\n1-Depositar. \n2-Retirar. \n3.Consultar. \n4-Salir");
				while(opcion != 4) {
					System.out.print("Digite la operacion a realizar:");
					opcion = entrada.nextInt();
					
					switch(opcion) {
						case 1:
							System.out.print("\n¿Cuanto dinero desea depositar a su cuenta señor: ");
							monto = entrada.nextInt();
						
							//porque sumo aqui: Simplemente suponemos que el cliente se acerca a ventanilla y quiere poner en su cuenta de ahorro 
							saldoActual = salarioIni + monto;						
							System.out.println("\n=======================================================================");
							System.out.println("Deposito realizado con exito Ud. cuenta con S/" +saldoActual+ " soles ");
							System.out.println("=======================================================================\n");
							
							
						
							break;
						
						case 2:
							System.out.print("\nDigite el monto a retirar : ");
							monto = entrada.nextInt();
							
							if(monto > salarioIni) {
								System.out.println("No cuenta con esa cantidad ");
							}
							else {
								saldoActual = salarioIni - monto;
								System.out.println("\n=======================================================================");
								System.out.println("Retiro realizado con exito Ud. cuenta con S/" +saldoActual+ " soles ");
								System.out.println("=======================================================================\n");
								
								System.out.print("Marque 1 si desea continuar, caso contrario 0 si desea abandonar: ");
								respuesta = entrada.nextInt();
								
								if(respuesta == 0) {
									System.out.println("\n=======================================================================");
									System.out.println("Gracias por preferirnos. Decidio salir CARAJO Y VAMOS LAPADULA");
									System.out.println("=======================================================================");
									opcion = 4;
								}
								
							}
							
							break;
							
						case 3:
							System.out.println("\n=======================================================================");
							System.out.println("Ud. Dispone de  " + salarioIni);
							System.out.println("=======================================================================");
							break;
							
						case 4:
							System.out.println("\n=======================================================================");
							System.out.println("Gracias por preferirnos. Decidio salir");
							System.out.println("=======================================================================");
						
							break;
								
						default:
							System.out.println("\n=======================================================================");
							System.out.println("Opcion no disponible ingrese una opcion valida");
							System.out.println("=======================================================================\n");
							
							break;
							
							
					}
						
				}
			}
		}
	}

}

