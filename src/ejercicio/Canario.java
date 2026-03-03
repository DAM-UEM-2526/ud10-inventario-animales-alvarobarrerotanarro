package ejercicio;

/**
 * La clase Canario hereda de la clase abstracta Aves. Esta clase tiene la
 * responsabilidad de implementar el metodo extra piar porque es abstracto en la
 * clase padre.
 */
public class Canario extends Aves {

	public Canario(String nombre, int edad, String estado, String fechaNacimiento) {
		super(nombre, edad, estado, fechaNacimiento);
	}

	@Override
	public void piar() {
		System.out.println("PIO PIO");
	}
}
