package model;

public class Producto implements Comparable<Producto> {

	public String nombre;
	private double precio;

	public Producto(String nombre, double precio) {
		super();
		this.nombre = nombre;
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Nombre: " + nombre + " /// Precio: " + precio + " ///";
	}

	@Override
	public int compareTo(Producto product) {
		if (this.precio == product.precio)
			return 0;
		else if (this.precio > product.precio)
			return 1;
		else
			return -1;
	}

}
