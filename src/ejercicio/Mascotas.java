package ejercicio;

/**
 * Clase abstracta, decir que no podemos instanciar esta clase directamente.
 */
public abstract class Mascotas {
	private String nombre;
	private int edad;
	private String estado;
	private String fechaNacimiento;

	public Mascotas(String nombre, int edad, String estado, String fechaNacimiento) {
		this.nombre = nombre;
		this.edad = edad;
		this.estado = estado;
		this.fechaNacimiento = fechaNacimiento;
	}

	@Override
	public String toString() {
		return "Mascotas [nombre=" + nombre + ", edad=" + edad + ", estado=" + estado + ", fechaNacimiento="
				+ fechaNacimiento + "]";
	}
}
