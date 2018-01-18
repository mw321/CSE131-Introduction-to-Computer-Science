package studio7;

import static org.junit.Assert.*;

import org.junit.Test;

public class Tests {

	@Test
	public void rectangleTest() {
		Rectangle a = new Rectangle(1, 2);
		assertEquals(1, a.getLength());
		assertEquals(2, a.getWidth());
		assertEquals(2, a.getArea());
		assertEquals(6, a.getPerimeter());
		assertEquals(false, a.square());
		Rectangle b = new Rectangle(2,3);
		assertEquals(true, a.smallerThan(b));
}
	@Test
	public void dieTest() {
		Die d = new Die(6);
		assertEquals(6, d.getSides());
	}
	@Test
	public void HPTest() {
		HP a = new HP("Joe", 10, true, true, true, true);
		assertEquals("Joe", a.getName());
		assertEquals(10, a.getJnum());
		assertEquals(true, a.islHanded());
		assertEquals(true, a.isrHanded());
		assertEquals(true, a.islShoot());
		assertEquals(true, a.isrShoot());
		a.game(5, 1);
		a.game(1, 2);
		assertEquals(6, a.getGoals());
		assertEquals(3, a.getAssists());
		assertEquals(2, a.getGames());
		assertEquals(9, a.getPoints());
	}
	
}
