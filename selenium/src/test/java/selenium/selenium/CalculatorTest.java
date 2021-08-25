package selenium.selenium;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertTrue;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import junit.framework.Assert;

@Ignore
public class CalculatorTest {
	
	Calculator calc= new Calculator(); 

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testmul() {
		
		assertEquals(20,calc.mul(5, 4));
		
	}
	
	@Test
	public void testsub() {
		
		assertEquals(6,calc.sub(10, 4));
		
	}
	@Test
	public void testadd() {
		
		assertEquals(9,calc.add(5, 4));
		
		
	}
	@Test
	public void testdivide() {
		
		assertNotSame(4,calc.divide(20, 5));
		
	}
	
	
	
	

}
