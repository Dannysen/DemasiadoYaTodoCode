import java.util.*;
public class Adivina_numeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//que me atine un numero aleatoria del 0 al 100
		
		int aleatoria =(int)( Math.random()*100);//la clase nos da un numero 
		
		Scanner entrada = new Scanner(System.in);
		
		
		
		int numero=0;//nosotros debemos ingresar ese numero para acertar
		
		int intentos=0;
		
		 do{
			System.out.println("Digite un número ");
			numero=entrada.nextInt();
			
			if(numero < aleatoria) {
				System.out.println("Digite un número con un valor mas alto");
			}
			else if(numero > aleatoria ){
				System.out.println("Digite un número con un valor mas bajor");
			}
			
			intentos++;
		 }while(numero!=aleatoria);
		
		System.out.println("Atinado, Felicidades. El numero es  " + aleatoria + " las veces que intento son : " + intentos);
	}

}
