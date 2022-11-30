package tacos;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class MathOperationTest {
	
	@Test
	public void testAddTwoNumbers() {
		MathOperation sum = new MathOperation();
		float a = 5;
		float b = 4;
		Assertions.assertEquals(9, sum.addTwoNumbers(a, b));
	}

}
