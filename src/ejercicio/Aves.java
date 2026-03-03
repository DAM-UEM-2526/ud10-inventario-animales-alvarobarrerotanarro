package ejercicio;

/**
 * La clase abstracta Ave extiende a su vez de Mascotas, que tambien es
 * abstracta.
 */
public abstract class Aves extends Mascotas {

	public Aves(String nombre, int edad, String estado, String fechaNacimiento) {
		super(nombre, edad, estado, fechaNacimiento);
	}

	/**
	 * Me ha sobrado tiempo, entonces se me ocurre agregar este metodo abstracto.
	 * Las clases hijas lo tienen que implementar.
	 */
	public abstract void piar();
}
