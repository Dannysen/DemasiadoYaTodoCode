package poo;

import java.util.Date;
import java.util.GregorianCalendar;

public class Uso_persona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Persona[] lasPersonas = new Persona[2];
		
		lasPersonas[0] = new Empleado2("Danny",3000,2009,02,25);
		lasPersonas[1] = new Alumno("Danny Arriaga","Ingeníeria de Software");
		
		for(Persona Iterador: lasPersonas) {
			System.out.println(Iterador.dameNombre() + ", " + Iterador.dameDescripcion());		}
	}

}

abstract class Persona {
	
	public Persona(String nom) {
		nombre = nom;
	}
	
	
	public String dameNombre() {
		return nombre;
	}
	
	//Creamos el metodo abstracto que es el metodo que deben tener todas las clases heredadas y que debera ser diferente para cada clase
	public abstract String dameDescripcion();
	
	private String nombre;
}

class Empleado2 extends Persona{
	
	
	public Empleado2(String nom, double sue, int agno, int mes, int día) {
		
		super(nom);
		
		sueldo = sue;
		
		//La clase GergorianCalendar lo que hace es construir una fecha con di mes y año
		GregorianCalendar calendario=new GregorianCalendar(agno, mes-1, día);
		
		altaContrado=calendario.getTime();
		
		++Idsiguiente;
		
		Id=Idsiguiente;
	}

	public String dameDescripcion() {
		return "Este empleado tiene un Id de: " + Id + " con un sueldo igual a " + sueldo;
	}
	
	public double getDAmeSueldo() {
		return sueldo;
	}
	
	public void setDarSueldo(double porcentaje) {
		
		double aumento = sueldo*porcentaje/100;
		sueldo+=aumento;
	}
	
	public Date getDameFechaContrato() {
		return altaContrado;
	}
	
	
	
	private double sueldo;
	private Date altaContrado;
	private static int Idsiguiente;
	private int Id;
	
}

class Alumno extends Persona{
	
	public Alumno(String nom, String carrera) {
		
		super(nom);
		
		this.carrera = carrera;
	}
	
	
	//Cuando heredamos de una clase abstracta, estamos obligados a sobrescribir algun metodo dandele el mismo nombre que en de la clase abstracta
	
	public String dameDescripcion() {
		return "Este alumno esta estudiando la carrera de " + carrera;
	}
	private String carrera;
}
