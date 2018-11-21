import org.junit.Test;

import com.maths.interfaceImpl.MathOperationsImpl;

import junit.framework.TestCase;

public class TestJunit1 extends TestCase{
	
	/**
	 * Function to test the addNumbers functionality
	 */
	@Test
	public void testAddNumbers() {
		MathOperationsImpl mathOperationsImpl =  new MathOperationsImpl();
		Double actualSum = 11.0;
		Double number1 = 5.0;
		Double number2 = 6.0;
		Double expectedSum = mathOperationsImpl.addNumbers(number1, number2);		
		//Check for equality
		assertTrue(expectedSum.equals(actualSum));		
	}
	
	/**
	 * Function to test the subtractNumbers functionality
	 */
	@Test
	public void testSubtractNumbers() {
		MathOperationsImpl mathOperationsImpl =  new MathOperationsImpl();
		Double actualDifference = 4.0;
		Double number1 = 10.0;
		Double number2 = 6.0;
		Double expectedDifference = mathOperationsImpl.subtractNumbers(number1, number2);
		//Check for equality
		assertTrue(expectedDifference.equals(actualDifference));
	}
	
	/**
	 * Functionality to test the multiplyNumbers functionality
	 */
	@Test
	public void testMultiplyNumbers() {
		MathOperationsImpl mathOperationsImpl =  new MathOperationsImpl();
		Double actualProduct = 15.0;
		Double number1 = 3.0;
		Double number2 = 5.0;
		Double expectedProduct = mathOperationsImpl.multiplyNumbers(number1, number2);
		//Check for equality
		assertTrue(expectedProduct.equals(actualProduct));
	}
	
	/**
	 * Function to test the divideNumbers functionality
	 */
	@Test
	public void testDivideNumbers() {
		MathOperationsImpl mathOperationsImpl =  new MathOperationsImpl();
		Double actualQuotient = 5.0;
		Double number1 = 15.0;
		Double number2 = 3.0;
		Double expectedQuotient = mathOperationsImpl.divideNumbers(number1, number2);
		//Check for equality
		assertTrue(expectedQuotient.equals(actualQuotient));
	}
		
}
