
public class ManipulaCadenas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nombre="Danny";
		
		//vamos a utilizar los metodos de la clase String
		
		System.out.println("Mombre es " + nombre);
		
		System.out.println("Mi nombre tiene " +nombre.length() + " letras");
		
		//utilizamos el metodo char para ubicar un caracter 
		System.out.println("La primera letra de mi nombre es " + nombre.charAt(0));
		
		//para saber la ultima letra de mi nombre
		
		int ultima_letra;
		
		ultima_letra=nombre.length();
		
		//porque ultima letra en el caso de que la oracion o palabra sea larga no contemos manualmente sino 
		//que utilizemos metodos para eso y solo la logica para podes encontrarlo
		System.out.println("Y la ultima letra es la " + nombre.charAt(ultima_letra-1));
	}

}
