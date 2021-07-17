package model;

public class Frutillas extends Producto {

	private String ud_venta;

	public Frutillas(String nombre, int precio, String ud_venta) {
		super(nombre, precio);
		this.ud_venta = ud_venta;
	}

	public String getUd_venta() {
		return ud_venta;
	}

	public void setUd_venta(String ud_venta) {
		this.ud_venta = ud_venta;
	}

	@Override
	public String toString() {
		return super.toString() + " Unidad de venta: " + ud_venta;
	}

}
