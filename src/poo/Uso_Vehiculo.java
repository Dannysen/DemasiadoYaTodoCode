package poo;
import javax.swing.*;
public class Uso_Vehiculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Coche miCoche=new Coche();//Instancia de la clase coche, es decir crear un objeto gracias al model Coche es decir cree mi carro con marca PerroMuerto que es nuevo en el mercado pero cree el carro gracias a una arquitectura del carro que todos los carros sin importar la marca tienen

		//para modifica gracias al getter. La sintaxis es nombre del objeto creado + un punto  + nombre del metodo 
		miCoche.estable_color(JOptionPane.showInputDialog("Introduce color: "));
		
		
	
		//esto es cuando accedemos gracias al getters porque el guetter obtiene datos del constrouctor, el constructor tiene un valor incial en la largo del coche y grecias a su metodo geter pude acceder a ese valor
		System.out.println(miCoche.dime_DatosGenerales());
	
		System.out.println(miCoche.dime_color());
		
		miCoche.configura_asientos(JOptionPane.showInputDialog("¿Tiene asientos de cuero? 'Si o No'"));
		
		System.out.println(miCoche.dime_asientos());
		
		miCoche.ConfiguraClimatizador(JOptionPane.showInputDialog("¿Tiene climatizador? 'Si o No'"));
		
		System.out.println(miCoche.dime_climatizador());
		
		System.out.println(miCoche.dime_peso_coche());
		
		System.out.println("El precio final del coche es " + miCoche.precio_coche());
		
		*/
		
		//creoa instancias a la clase Coche y Furgoneta
		
		Coche micoche1=new Coche();
		
		micoche1.estable_color("Rojo");
		
		Furgoneta mifurgoneta1= new Furgoneta(7, 580);
		
		//Como estamos heredando algurnos atributos de la clase coche le estamos dando con new con los constructores, tanto en coche como en furgoneta
		//le estamos dando un estado inicial, tiene 4 ruedas, tienen un peso determinado, que tienen un ancho y largo determinado todo eso en el constructor coche
	
		//hemos utilizado  tres metodos heredados de la clase padre con un Objeto de tipo furgoneta
		mifurgoneta1.estable_color("Azul");
		mifurgoneta1.configura_asientos("Si");
		mifurgoneta1.ConfiguraClimatizador("Si");
		
		System.out.println(micoche1.dime_DatosGenerales() + " " + micoche1.dime_color());
		
	
		System.out.println("\n" + mifurgoneta1.dime_DatosGenerales() + " y caracteristicas propias de la furgoneta " + mifurgoneta1.dimeDatosFurgoneta() );
	
		//¿Como diseño la herencia de mis clases, determinarlos, como saber quien hereda de quien ?
		/*Consiste en aplicar el termino "Es un " me refiero a que si creamos un clase vehiculo generalmente, y este vehiculo tentrá
		 * todas las caracteristicas para todos los vehiculos, color, tamaño, peso, etc, y luego tenemos que crear mas clases como por ejemplo
		 * coche y preguntarnos ¿es un vehiculo coche?, entonce "Es un " toma sentido al porque hacemos referencia a una clase como un molde,*/
	}
	

}
