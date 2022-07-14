package Q15Itemcl;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

class ItemCheck {

	@Test
	void test() {
		ItemCl i=new ItemCl(1, "Pen", 200,500,LocalDate.of(2022, 11, 23),LocalDate.of(2023, 2, 10));
				
				assertEquals(true,i.createObject(i));
	}

}
