package poo;

import javax.swing.JOptionPane;

public class Pruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Empleados trabajador1=new Empleados("Danny Arriaga");
		trabajador1.SetCambiarSeccion("Drogadigto ");
		
		
		
		Empleados trabajador2=new Empleados("Leonel Messsi");
		
		Empleados trabajador3=new Empleados("Ricardo Kaka");
		
		Empleados trabajador4=new Empleados("Neymar Jr.");
		
		System.out.println(trabajador1.devuelveDatos() + "\n" + trabajador2.devuelveDatos() + "\n" + trabajador3.devuelveDatos() + "\n" + trabajador4.devuelveDatos());
		
		
		System.out.println(Empleados.dameIdSiguiente());
;		
		

	}

}

class Empleados{
	
	//aparte de que el trabajador tenga un nombre, la empresa le brinda un numero de identificacion unico.
	
	public Empleados(String nombre) {
		
		this.nombre=nombre;
		seccion="Administracion";
		id=IdSiguiente;//esto implica que cuando creamos una instancia u objeto esto viene a ser una variable 
		IdSiguiente++;
		
	}
	
	public void SetCambiarSeccion(String seccion) {
		this.seccion = seccion;
	}
	
	public String devuelveDatos() {
		return "El nombre es : " + nombre + " y la seccion es " + seccion + " y su Id= " + id;
	}
	
	//metodo statico fijamente 
	public static String dameIdSiguiente() {
		return "El IdSiguiente es: " + IdSiguiente;
	}
	
	
	
	private final String nombre;
	private String seccion;
	private int id;
	private static int IdSiguiente=1;
	
	
	
	
	
	
}
