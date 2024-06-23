//java.lang es el paquete por defecto
import java.util.*;//directiva import la clase Scanner no pertece a la carpeta java.lang
public class Entrada_ejemplo1 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Entroduce tu nombre: ");
		
		String nombre_usuario=entrada.nextLine();
		
		System.out.println("Introduce edad por favor: ");
		
		int edad=entrada.nextInt();
		
		System.out.println("Hola " + nombre_usuario + ". El año que viene tendras " + (edad+1) + " años");

	}

}
