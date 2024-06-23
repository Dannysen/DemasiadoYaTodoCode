package poo;

public class Furgoneta extends Coche {//Solo se puede heredas una sola clase, es decir no admite herencia multiple
	
	//caracteristicas propias
	private int capacidad_carga;
	private int plazas_extra;
	
	public Furgoneta(int plazas_extra, int capacidad_carga) {//Cuando hereda de una clase tambien hereda su construcctor, pero ponemos las cosas unicas de esta clase osea las que no hereda porque ya esta heredando 
		
		super();//que significa super dentro de un constructor, esto hace llamar al constructor de la clase padre OKIIIIIII JSJSJSJS
		this.capacidad_carga = capacidad_carga;
		this.plazas_extra = plazas_extra;
		
		
	}
	
	public String dimeDatosFurgoneta() {
		return "La capaciadad de carga es: " + capacidad_carga + " y las plazas son " + plazas_extra;
	}
}
