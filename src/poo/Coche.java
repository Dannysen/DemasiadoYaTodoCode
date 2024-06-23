package poo;

public class Coche {
	
	//estos son propiedades que estandar todos los coches tienen y deben tener 
	private int ruedas;
	private int largo;
	private int ancho;
	private int motor;
	private int peso_plataforma;
	
	//atributos que pueden variar en uno y otros carros
	// y estos no van en el constructor 
	private String color;
	private int peso_total;
	private boolean asientos_cuero, climatizador;
	
	public Coche(){
		ruedas=4;
		largo=2000;
		ancho=300;
		motor=1600;
		peso_plataforma=500;
	}
	
	//la sintaxis de esto es el modificador de acceso + el tipo de dato que quieres que te devuelva, no importa si es igual al dato del atributo inicializado  +  el nombre del metodo y no olvidar que un metodo getter tiene una palabra reservada llamada return. Cierto?
	public String dime_DatosGenerales() {
		return "La plataforma del vehiculo tiene " + ruedas + " ruedas " + 
				"Mide " + largo/1000 + " metros con un ancho de " + ancho + 
				" cm y un peso de plataforma de " + peso_plataforma + " kilos";
	}
	
	public void estable_color(String color_coche) {
		color = color_coche;
	}
	
	public String dime_color() {
		return "El color del coche es " + color ;
	}
	
	public void configura_asientos(String asientos_cuero) {//Setter
		if(asientos_cuero.equalsIgnoreCase("si")) {
			this.asientos_cuero = true;
		}
		else {
			this.asientos_cuero = false;
		}
	}
	
	public String dime_asientos() {
		if(asientos_cuero==true) {
			return "El coche tien asientos de cuero";
		}
		else {
			return "El coche tiene asientos de serie";
		}
	}
	
	public void ConfiguraClimatizador(String climatizador) {
		if(climatizador.equals("si")) {
			this.climatizador=true;
		}
		else {
			this.climatizador=false;
		}
	}
	
	public String dime_climatizador() {
		if(climatizador==true) {
			return "El coche incorpora climatizador ";
		}
		else {
			return "El coche lleva aire acondicionado";
		}
	} 
	
	public String dime_peso_coche(){
		
		int peso_carroceria=500;
		
		peso_total=peso_plataforma+peso_carroceria;
		
		if(asientos_cuero) {
			peso_total += 50;
		}
		if(climatizador) {
			peso_total+=20;
		}
		
		return "El peso del coche es " + peso_total;
	}
	
	public int precio_coche() {
		int precio_final=10000;
		
		if(asientos_cuero) {
			precio_final += 2000;
		}
		if(climatizador) {
			precio_final += 1500;
		}
		
		return precio_final;
	}
		
	
	

}
