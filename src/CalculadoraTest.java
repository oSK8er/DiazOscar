import static org.junit.Assert.*;

import org.junit.Test;
import junit.framework.TestCase;

public class CalculadoraTest extends TestCase {
/*
	@Test
	public void test() {
		fail("No implementado aun");
		
	}
	*/
	@Test
	public void testRPN_test() {
		RPN calc = new RPN(" 5 6 + 5 6 - 9 + *");
		assertEquals(88.0, calc.resultado());
	}
	 
	
	

}
