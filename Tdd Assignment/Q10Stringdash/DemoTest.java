package Q10Stringdash;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DemoTest {

	@Test
	void test() {
		assertEquals("apple-orange-banana-lemon",StringDash.concat(new String[] {"apple", 
			"orange","banana","lemon"}));
	}

}
