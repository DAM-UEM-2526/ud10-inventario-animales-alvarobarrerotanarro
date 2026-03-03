package ejercicio;

import java.util.*;

public class Inventario {
	private List<Mascotas> contenedor;

	public Inventario() {
		vaciar();
	}

	public void vaciar() {
		this.contenedor = new ArrayList<>();
	}

	public void insertarMascota(Mascotas a) {
		this.contenedor.add(a);
	}

	public void eliminarMascota(String nombre) {
		Mascotas m = null;
		boolean found = false;

		// Buscamos la mascota.
		for (int i = 0; !found && i < contenedor.size(); i++) {
			m = contenedor.get(i);
			if (m.getNombre().equals(nombre)) {
				found = true;
			}
		}

		// Si la hemos encontrado la eliminamos.
		if (found) {
			contenedor.remove(m);
		}
	}
}
