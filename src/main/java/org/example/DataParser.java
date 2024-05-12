package org.example;

public class DataParser {
	
	
	
	public String StringResult = "";
	
	public float num1;
	public float num2;
	public float numResult;
	
	public static String m_firstInput = "";
	
	public static String m_secondInput = "";
	
	public static String m_operator = "";
	
	//Nathalie
	//
	// Convert to number para makapag calculate
	//
	public void Calculate(String fistInput, String secondInput, String operator){
		//Convert
//		num1 = firstInput;
//		num2 = secondInput;
		
		//Calculate
		
		if(operator == "+"){
			numResult = num1 + num2;
		}
	}
	
	
	//Lei
	//
	// This Shows the Result for the calculated arithmetic
	// Basta kapag tapos na mag add, minus, etc.. show the result
	//
	//
	public String ShowResult(){
		
		StringResult = "35";
		
		return StringResult;
	}
	
	public void SetFirstInput(String input){
		m_firstInput = input;
		
		System.out.println("First: " + m_firstInput);
	}
	
	public void SetSecondInput(String input){
		m_secondInput = input;
		System.out.println("Second: " + m_secondInput);
	}
	
	public void SetOperator(String input){
		m_operator = input;
		System.out.println("Operator: " + m_operator);
	}
	
}
