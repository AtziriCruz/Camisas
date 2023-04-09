package fes.aragon.producto;

import org.junit.jupiter.api.Test;

class camisaTest {

	@Test
	void testGetTipo() {
		camisa c= new camisa("casual","larga",190);
		c.getTipo();
		//fail("Not yet implemented");
	}

	@Test
	void testSetTipo() {
		camisa c= new camisa("casual","larga",190);
		c.setTipo("S/T");
	//	fail("Not yet implemented");
	}

	@Test
	void testGetManga() {
		camisa c= new camisa("casual","larga",190);
		c.getManga();
		//fail("Not yet implemented");
	}

	@Test
	void testSetManga() {
		camisa c= new camisa("casual","larga",190);
		c.setManga("corta");
		//fail("Not yet implemented");
	}

	@Test
	void testGetPrecio() {
		camisa c= new camisa("casual","larga",190);
		c.getPrecio();
		//fail("Not yet implemented");
	}

	@Test
	void testSetPrecio() {
		camisa c= new camisa("casual","larga",190);
		c.setPrecio(200);
		//fail("Not yet implemented");
	}

	@Test
	void testCamisa() {
		camisa c= new camisa("casual","larga",190);
		//c.camisa("casual","larga",190);
		//fail("Not yet implemented");
	}

	@Test
	void testToString() {
		camisa c= new camisa("casual","larga",190);
		c.toString();
		//fail("Not yet implemented");
	}

}
