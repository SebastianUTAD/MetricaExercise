package controller;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;

import model.Bebidas;
import model.Frutillas;
import model.Higiene;
import model.Producto;

public class Calculo {

	public static void Calculo() {
		// TODO Auto-generated method stub

		// Calculation of the year
		int year_fundation = 2000;
		Calendar actual_year = Calendar.getInstance();
		int year = actual_year.get(Calendar.YEAR);
		int result = year - year_fundation;

		System.out.println(
				"La empresa Manolita es una experta en la venta y distribucion de productos de\n" + "alimentación.");
		System.out.println("Fundada en el año " + year_fundation + ". Contigo desde hace " + result + " anios \n");

		// List of products
		ArrayList<String> productos = new ArrayList<String>();

		Bebidas ob1 = new Bebidas("Coca-Cola Zero", 20, 1.5);
		Bebidas ob2 = new Bebidas("Coca-Cola", 18, 1.5);
		Higiene ob3 = new Higiene("Shampoo Sedal", 19, 500);
		Frutillas ob4 = new Frutillas("Frutillas", 64, "kilo");

		productos.add(ob1.toString());
		productos.add(ob2.toString());
		productos.add(ob3.toString());
		productos.add(ob4.toString());

		System.out.println("Productos");
		System.out.println("=============================");

		for (int i = 0; i < productos.size(); i++) {

			System.out.println(productos.get(i));
		}

		System.out.println("=============================\n");

		// Compare names and prices of products
		ArrayList<Producto> comparacion = new ArrayList<Producto>();
		comparacion.add(new Producto(ob1.getNombre(), ob1.getPrecio()));
		comparacion.add(new Producto(ob2.getNombre(), ob2.getPrecio()));
		comparacion.add(new Producto(ob3.getNombre(), ob3.getPrecio()));
		comparacion.add(new Producto(ob4.getNombre(), ob4.getPrecio()));

		Collections.sort(comparacion);

		System.out.println("Producto más caro: " + comparacion.get(comparacion.size() - 1).nombre);
		System.out.println("Producto más barato: " + comparacion.get(0).nombre);

	}

}
