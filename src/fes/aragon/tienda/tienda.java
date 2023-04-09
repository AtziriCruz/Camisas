package fes.aragon.tienda;

import fes.aragon.producto.camisa;

public class tienda {
	static camisa c1 = new camisa("S/T", "corta", 190);
	static camisa c2 = new camisa("Casual", "Larga", 210);
	static camisa c3 = new camisa("formal", "larga", 310);

	static int x = 0;
	static int y = 0;
	static int z = 0;
	static int tot;

	public static void AgregarC(int a, int b, int c) {
		if (a < 0 || b < 0 || c < 0) {
			System.out.println("cantidades negativas, vuelva a intentar");
		} else {
			x = a;
			y = b;
			z = c;
			tot = x + y + z;

		}
	}

	public static float PrecioTotal() {
		float total;
		total = x * c1.getPrecio() + y * c2.getPrecio() + z * c3.getPrecio();
		return total;

	}

	public static float Descuento() {
		float total;

		total = PrecioTotal();

		if (tot <= 2) {
		} else if (tot >= 3 && tot <= 5) {
			total = (float) (total * 0.95);
			System.out.println("Descuento del 5%");
		} else if (tot > 5) {
			System.out.println("Descuento del 8%");
			total = (float) (total * 0.92);
		}

		return total;
	}

	public static void ticket() {

		System.out.println(x + " " + c1.toString());
		System.out.println(y + " " + c2.toString());
		System.out.println(z + " " + c3.toString());
		System.out.println("Precio total:" + PrecioTotal());
		if (tot > 2) {
			System.out.println("Precio con descuento:" + Descuento());
		}

	}

}
