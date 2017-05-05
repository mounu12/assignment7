package weekTest;

import static org.junit.Assert.*;

import org.junit.Test;

import weekend.Powerof10;

public class PowerTest {

	@Test
	public void test() {
   Powerof10 pow=new Powerof10();
   String result=pow.power(30);
   assertEquals("Nonillion",result);
	}
	@Test
	public void test1() {
		   Powerof10 pow=new Powerof10();
		   String result=pow.power(100);
		   assertEquals("Googol",result);
}
	@Test
	public void test2() {
		   Powerof10 pow=new Powerof10();
		   String result=pow.power(15);
		   assertEquals("Quadrillion",result);
}
	@Test
	public void test3() {
		   Powerof10 pow=new Powerof10();
		   String result=pow.power(5);
		   assertEquals("Quadrillion",result);
	}
}