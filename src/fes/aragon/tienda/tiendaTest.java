package fes.aragon.tienda;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class tiendaTest {

	@Test
	void testAgregarC() {
		tienda t= new tienda();
		t.AgregarC(1, 2, 0);
		//fail("Not yet implemented");
	}

	@Test
	void testPrecioTotal() {
		//tienda t= new tienda();
			float resultado=tienda.PrecioTotal();
			assertEquals(1900, resultado);
	}

	@Test
	void testDescuento() {
		tienda t= new tienda();
		t.AgregarC(1,2,0);
		float resultado=t.Descuento();
		assertEquals(1748.0, resultado);
		//fail("Not yet implemented");
	}

	@Test
	void testTicket() {
		tienda.ticket();
		//fail("Not yet implemented");
		
	}

}
