package ejercicio;

/**
 * Al igual que ocurre con la clase Canario, esta clase hereda de Aves y como he
 * agregado el metodo abstracto pio que me he inventado entonces esta subclase
 * tiene la obligacion de implementarlo.
 */
public class Loro extends Aves {

	public Loro(String nombre, int edad, String estado, String fechaNacimiento) {
		super(nombre, edad, estado, fechaNacimiento);
	}

	@Override
	public void piar() {
		System.out.println("RRRR");
	}
}
