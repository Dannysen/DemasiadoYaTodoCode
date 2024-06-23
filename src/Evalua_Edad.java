import java.util.*;
public class Evalua_Edad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce tu edad, por favor: ");
		int edad = entrada.nextInt();
		
		if(edad < 18) {
			System.out.println("Usted es Joven");
		}
		else if(edad < 40) {
			System.out.println("Usted es Joven");
		}
		else if(edad < 65) {
			System.out.println("Usted es Madurito");
		}
		else{
			System.out.println("Dios mio ya vas a morir");
		}
	}

}
