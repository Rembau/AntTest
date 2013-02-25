package example;

import static org.junit.Assert.*;

import org.junit.Test;

public class HelloTest {

	@Test
	public void testAdd() {
		int x=0,y=0;
		example.Hello test = new example.Hello();
		int r_=test.add(x, y);
		int r=0;
		assertEquals(r,r_);
		System.out.println("good");
	}

}
