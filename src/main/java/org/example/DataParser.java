package org.example;

public class DataParser {
	
	
	
	public String StringResult;
	
	public float num1;
	public float num2;
	public float Numresult;
	
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
			Numresult = num1 + num2;
		}
	}
	
	
	//Lei
	//
	// This Shows the Result for the calculated arithmetic
	// Basta kapag tapos na mag add, minus, etc.. show the result
	//
	//
	public String ShowResult(){
		StringResult = String.valueOf(Math.round(Numresult));
		return StringResult;
	}
}
