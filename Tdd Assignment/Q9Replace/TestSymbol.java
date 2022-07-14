package Q9Replace;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestSymbol {

	@Test
	void test() {
		assertEquals("This  Red car.",ReplaceSymbol.check("This @ Red $car-."));
	}

}
