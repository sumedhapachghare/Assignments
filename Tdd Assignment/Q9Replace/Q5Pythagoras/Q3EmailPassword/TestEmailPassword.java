package Q3EmailPassword;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.SQLException;

import org.junit.jupiter.api.Test;

class TestEmailPassword {

	@Test
	void test123() throws ClassNotFoundException, SQLException {
		assertTrue(User.check("sumedha" , "sumedha.pachghare@gmail.com"));
	}

}
