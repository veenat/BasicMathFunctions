package com.maths.interfaceImpl;

import com.maths.interfaces.MathematicalOperations;

public class MathOperationsImpl implements MathematicalOperations {
	
	public Double addNumbers(Double number1, Double number2) {
		if(number1 != null && number2 != null) {
			Double sum = number1 + number2;
			return sum;
		}
		else if(number1 == null) {
			return number2;
		}
		else if(number2 == null) {
			return number1;
		}
		return null;
	}

	public Double subtractNumbers(Double number1, Double number2) {
		if(number1 != null && number2 != null) {
			Double difference = (double) 0;
			difference = number1 - number2;
			return difference;
		}
		else if(number1 == null) {
			return number2;
		}
		else if(number2 == null) {
			return number1;
		}
		return null;
	}

	public Double multiplyNumbers(Double number1, Double number2) {		
		if(number1 != null && number2 != null) {
			Double product = number1 * number2;
			return product;
		}
		else if(number1 == null) {
			return number2;
		}
		else if(number2 == null) {
			return number1;
		}
		return null;
	}

	public Double divideNumbers(Double number1, Double number2) {
		if(number1 != null && number2 != null) {
			Double quotient = number1 / number2;
			return quotient;
		}
		else if(number1 == null) {
			return number2;
		}
		else if(number2 == null) {
			return number1;
		}
		return null;
	}

}
