package model;

public class Bebidas extends Producto {

	private Double capacidad;

	public Bebidas(String nombre, int precio, Double capacidad) {
		super(nombre, precio);
		this.capacidad = capacidad;
	}

	public Double getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(Double capacidad) {
		this.capacidad = capacidad;
	}

	@Override
	public String toString() {
		return "Nombre: " + getNombre() + " /// Litros: " + capacidad + " /// Precio: " + "$" + getPrecio();
	}

}
