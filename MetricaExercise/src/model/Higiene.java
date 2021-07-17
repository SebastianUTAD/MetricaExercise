package model;

public class Higiene extends Producto {

	private int Contenido;

	public Higiene(String nombre, int precio, int contenido) {
		super(nombre, precio);
		Contenido = contenido;
	}

	public int getContenido() {
		return Contenido;
	}

	public void setContenido(int contenido) {
		Contenido = contenido;
	}

	@Override
	public String toString() {
		return "Nombre: " + getNombre() + " /// Contenido: " + Contenido + "ml " + " /// Precio: " + "$" + getPrecio();
	}

}
