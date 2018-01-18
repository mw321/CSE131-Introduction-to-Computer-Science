package studio7;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestUnivCourse {

	@Test
	public void test() {
		UnivCourse a = new UnivCourse(131, 100, "CSE");
		assertEquals(131,a.getCourseNum());
		assertEquals(100,a.getNumStudent());
		assertEquals("CSE",a.getDepartment());
		a.enroll();
		assertEquals(101,a.getNumStudent());
		a.drop();
		assertEquals(100,a.getNumStudent());
		assertEquals("CSE131 has 100 students enrolled.", a.toString());
	}

}
