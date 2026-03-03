package ejercicio;

/**
 * La clase Gato extiende de la clase abstracta Mascotas. Se me ocurre colocar
 * algun metodo extra porque tengo tiempo.
 */
public class Gato extends Mascotas {

	public Gato(String nombre, int edad, String estado, String fechaNacimiento) {
		super(nombre, edad, estado, fechaNacimiento);
	}

	/**
	 * Metodo extra de la clase gato. Agregamos esta funcionalidad
	 * a la clase gato.
	 * @param nombreRaton
	 */
	public void cazarRaton(String nombreRaton) {
		System.out.printf("El raton %s ha sido cazado\n", nombreRaton);
	}

}
