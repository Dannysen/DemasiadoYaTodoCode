package poo;
import java.util.*;
import java.lang.Comparable;
public class Uso_empleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creacion de objetos
		/*Empleado mesero1 = new Empleado("Danny Alexander",300,2024,04,11);
		
		Empleado mesero2 = new Empleado("Romario ",300,2024,04,11);
		
		Empleado mesero3 = new Empleado("Leonel Messi",300,2024,05,11);
		
		//metodos 
		mesero1.setDarSueldo(15);
		mesero2.setDarSueldo(5);
		mesero3.setDarSueldo(4);
		
		
		System.out.println("Nombre: " + mesero1.getDameNombre() + " Sueldo : " + mesero1.getDAmeSueldo() + " fecha alta: " + mesero1.getDameFechaContrato());
		System.out.println("Nombre: " + mesero2.getDameNombre() + " Sueldo : " + mesero2.getDAmeSueldo() + " fecha alta: " + mesero2.getDameFechaContrato());
		System.out.println("Nombre: " + mesero3.getDameNombre() + " Sueldo : " + mesero3.getDAmeSueldo() + " fecha alta: " + mesero3.getDameFechaContrato());
		*/
		
		Jefatura jefe_RRHH=new Jefatura("Danny Supremo",5000, 2006, 9 , 18 );
		
		jefe_RRHH.estableIncentivo(1570);
		
		Empleado[] misEmpleados=new Empleado[6];
		
		//osea si creamos dos constructores a la clase tiene que ser constructores que no tenga el mismo numero de parametros, es decir llamas a un metodo constructor de acuerdo a sus parametros
		misEmpleados[0] = new Empleado("Danny Alexander",30000,2024,03,11);
		misEmpleados[1] = new Empleado("Ricardo Brando",50000,2024,03,11);
		misEmpleados[2] = new Empleado("Vinicios Junior ",25000,2024,03,11);
		misEmpleados[3] = new Empleado("Danny Alvez");
		misEmpleados[4] =jefe_RRHH;//Polimorfismo en acción. Principio
		misEmpleados[5] = new Jefatura("Marfela",95000, 1999, 5, 26);
		//refundicion o casting para convertir lo que hay almacenado en esta pocision que en principio es de tipo empleado, en un objeto de tipo jefatura
		//para poderle el metodo insentivo. Es decir la refundicion se puede hacer a datos primitivos, clases y metodos 
		Jefatura jefa_finanzas=(Jefatura)misEmpleados[5];//casting para convertir un objeto de un tipo en otro, esto me permite acceder jefa finanzas y pueda acceder al metodo establece incentivo
		jefa_finanzas.estableIncentivo(55000);
		
		 
		
		
		/*for(int i = 0;i<misEmpleados.length;i++) {
			misEmpleados[i].setDarSueldo(5);
		}*/
		
		System.out.println(jefa_finanzas.tomar_decisiones("Dar más días de vacaciones a los empleados"));
		
		System.out.println("El jefe " + jefa_finanzas.getDameNombre() + " tiene un bonus de  "  
		+jefa_finanzas.establece_bonus(500));
		
		System.out.println(misEmpleados[3].getDameNombre() + " tiene un bonus de " 
		+ misEmpleados[3].establece_bonus(200));
		
		
		
		//con dar sueldo me refiero a dar aumento de del porcentaje de acuerdo al sueldo
		for(Empleado e: misEmpleados) {
			e.setDarSueldo(15);
		}
		
		/*for(int i = 0;i<3;i++) {
			System.out.println("Nombre " + misEmpleados[i].getDameNombre() + " Sueldo: " + misEmpleados[i].getDAmeSueldo() + "Fecha de alta: " + misEmpleados[i].getDameFechaContrato());
		}*/
		
			Arrays.sort(misEmpleados);//para ordenar de forma numerica
			
		for(Empleado e: misEmpleados) {
			System.out.println("Nombre: " +e.getDameNombre() + " sueldo: " + e.getDAmeSueldo()
			+ " Fecha de Alta: " + e.getDameFechaContrato());
		}

		
	}

}

class Empleado implements Comparable<Empleado>, Trabajadores{
	
	
	public Empleado(String nom, double sue, int agno, int mes, int día) {
		
		nombre = nom;
		
		sueldo = sue;
		
		//La clase GergorianCalendar lo que hace es construir una fecha con di mes y año
		GregorianCalendar calendario=new GregorianCalendar(agno, mes-1, día);
		
		altaContrado=calendario.getTime();
		
		++Idsiguiente;
		
		Id=Idsiguiente;
	}
	
	public double establece_bonus(double gratificacion) {
		
		return Trabajadores.bonus_base+gratificacion;
	}
	
	//Otro metodo constructor
	public Empleado(String nom) {
		this(nom, 30000, 2000,01,01);//El
	}
	
	public String getDameNombre() {
		return nombre + " Id : " + Id;
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
	
	
	//ordena desde el menor sueldo al mayor sueldo, si queremos que se ordena por id solo cambiamos el this por id nada mas
	
	public int compareTo(Empleado miObjeto){
		Empleado otroEmpleado = (Empleado)miObjeto;
		
		if(this.sueldo>otroEmpleado.sueldo) {
			return -1;
		}
		
		if(this.sueldo<otroEmpleado.sueldo) {
			return 1;
		}
		
		return 0;
	}
	
	private String nombre;
	private double sueldo;
	private Date altaContrado;
	private static int Idsiguiente;
	private int Id;
	
}

class Jefatura extends Empleado implements Jefes {
	
	private double incentivo;
	
	public Jefatura(String nom, double sue, int agno, int mes, int dia) {
		
		super(nom, sue, agno, mes, dia);
	}
	
	
	public String tomar_decisiones(String decision) {
		
		return "Un miembro de la direccion a tomado la decisión de: " + decision;
	}
	
	public double establece_bonus(double gratificacion) {

		double prima = 2000;
		
		return Trabajadores.bonus_base + gratificacion + prima; 
	}
	
	public void estableIncentivo(double b) {
		incentivo=b;
	}
	
	public double getDAmeSueldo() {//Estamos heredando un metodo el cual se llame sueldo de la clase empleado, estamos sobre escribiendo
		double sueldoJefe = super.getDAmeSueldo();	
		return sueldoJefe + incentivo;
	}
}
