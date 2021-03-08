package progettomp;

import static org.junit.Assert.*;

import org.junit.Test;

public class ContoCorrenteTest {

	@Test
	public void testConstructorArgumentsAreAssigned() {
		ContoCorrente c = new ContoCorrente("prova", 10);
		assertEquals("prova", c.getName());
		assertEquals(10, c.getSaldo(), 0);
	}

}
