package ejercicio;

/**
 * Clase test.
 */
public class Test {
	public static void main(String args[]) {
		// Creamos un par de animales.
		// El motivo por el que podemos instanciar estas clases es porque no son
		// abstract.
		Perro r = new Perro("Rokcy", 1, "OK", "11022017");
		Gato g = new Gato("Negro", 2, "OK", "05012016");
		System.out.println(r.getNombre());
		System.out.println(g.getEstado());

		// Creamos un inventario e introducimos los animales.
		Inventario i = new Inventario();
		i.anyadirMascota(r); // Tambien podriamos utilizar el metodo insertarMascota
		i.anyadirMascota(g);

		// Imprimimos todos antes de vaciarlos
		i.imprimirTodos();
		i.imprimirPerros();

		// Vaciamos
		i.vaciar();

		// Volvemos a imprimir todos.
		i.imprimirTodos();
		i.imprimirPerros();
	}
}
