package ejercicio;

/**
 * La clase Perro extiende de la abstract class Mascotas. El UML no especifica
 * ningun metodo ni propiedad, yo voy a agregar alguno porque me ha sobrado
 * tiempo.
 */
public class Perro extends Mascotas {

	public Perro(String nombre, int edad, String estado, String fechaNacimiento) {
		super(nombre, edad, estado, fechaNacimiento);
	}

	/**
	 * Me ha sobrado tiempo, agrego un metodo extra al perro.
	 */
	public void ladrar() {
		System.out.println("GUAW");
	}
}
