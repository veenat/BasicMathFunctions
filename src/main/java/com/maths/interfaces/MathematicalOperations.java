package com.maths.interfaces;

public interface MathematicalOperations {
	
	/**
	 * Returns the sum of two numbers
	 * @param number1
	 * @param number2
	 * @return
	 */
	Double addNumbers(Double number1, Double number2);
	
	/**
	 * Returns the difference of two numbers
	 * @param number1
	 * @param number2
	 * @return
	 */
	Double subtractNumbers(Double number1, Double number2);
	
	/**
	 * Returns the product of two numbers
	 * @param number1
	 * @param number2
	 * @return
	 */
	Double multiplyNumbers(Double number1, Double number2);
	
	/**
	 * Returns the quotient after dividing two numbers
	 * @param number1
	 * @param number2
	 * @return
	 */
	Double divideNumbers(Double number1, Double number2);

}
