
public class Declaraciones_Operadores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declaracion en una sola línea
		final double apulgada = 2.54;//no se puede modificar esta variable porque es una constante
		
		//imaginemos que queremos saber cuantas pulgadas hay en 6 centimetros
		double cm=6;
		
		double resultado=cm/apulgada;

		
		System.out.println("En " + cm + " centimetros hay " + resultado + " pulgadas"); 

	}

}
