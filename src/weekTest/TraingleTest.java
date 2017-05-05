package weekTest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import weekend.Triangle;

public class TraingleTest {
		Triangle triangle;

		@Before
		public void setUp() throws Exception {
			triangle = new Triangle(4, 5, 6);
		}

		@Test
		public void isTriangle() {
			boolean result = triangle.isTriangle();
			assertEquals(true, result);

		}

		@Test
		public void getAngle() {
			double result = triangle.getAngle(6);
			assertEquals(82.81924421854171, result, 0);
		}
		
@Before
public void setUp1() throws Exception {
	triangle = new Triangle(150,30,130);
}

@Test
public void isTriangle1() {
	boolean result = triangle.isTriangle();
	assertEquals(true, result);

}

@Test
public void getAngle1() {
	double result = triangle.getAngle(30);
	assertEquals(9.184497772678071, result, 0);
}
}