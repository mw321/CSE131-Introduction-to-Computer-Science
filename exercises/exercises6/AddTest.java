package exercises6;

import static org.junit.Assert.*;

import org.junit.Test;

public class AddTest {

	@Test
	public void test() {
		assertEquals(0, Add.add(0, 0));
		//
		// write other test cases here:
		//
		assertEquals(1, Add.add(0, 1));
		assertEquals(1, Add.add(1, 0));
		assertEquals(5, Add.add(2, 3));
		for (int x = 0; x < 10; x++) {
			for (int y = 0; y < 10; y++) {
				assertEquals(Math.addExact(x, y), Add.add(x, y));
			}
		}
	}
	public void addAnyTest() {
		for (int x = -10; x < 10; x++) {
			for (int y = -10; y < 10; y++) {
				assertEquals(Math.addExact(x, y), Add.addAny(x, y));
			}
		}
	}
}
