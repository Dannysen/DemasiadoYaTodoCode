import java.util.*;
public class Uso_tallas {
	
	 //enum Talla {MINI, MEDIANO, GRANDE, MUY_GRANDE};
	
	enum Talla{
		//la palabra es el nombre, lo que esta entre parentecis es la representación abreviada
		MINI("S"), MEDIANO("M"), GRANDE("X"), MUY_GRANDE("XL");
		
		private Talla(String abreviatura) {
			this.abreviatura = abreviatura;
		}
		
		public String dimeAbreviatura() {
			return abreviatura;
		}
		private String abreviatura;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escribe una talla: MINI, MEDIANO, GRANDE, MUY GRANDE");
		
		String entradaDatos = entrada.next().toUpperCase();//con esto lo que hacemos es pasar a mayuscula todo lo que el usuario escriba en minuscula
		
		Talla la_Talla=Enum.valueOf(Talla.class, entradaDatos);
		
		System.out.println("Talla = " + la_Talla);
		
		System.out.println("Abreviatura = " + la_Talla.dimeAbreviatura());
	}

}
