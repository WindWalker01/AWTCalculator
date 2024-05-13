package org.example;

public class DataParser {

	private static String m_firstInput = "";
	
	private static String m_secondInput = "";
	
	private static String m_operator = "";
		
	public double Negated;
	public String StringResult;
	public double numParse1;
	public double numParse2;
	public int operParse;
  public double numResult;
  

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
	
	
	public String GetFirstInput(){
		return m_firstInput;
	}
	
	public String GetSecondInput(){
		return m_secondInput;
	}
	
	public String GetOperator(){
		return m_operator;
	}
	
	public void ResetFirstInput(){
		m_firstInput = "0";
		System.out.println("First: " + m_firstInput);
	}
	
	public void ResetSecondInput(){
		m_secondInput = "0";
		System.out.println("Second: " + m_secondInput);
	}
	
	public void ResetOperator(){
		m_operator = "";
		System.out.println("Operator: " + m_operator);
	}
	
	
		//Nathalie
		//
		// Convert to number para makapag calculate
		//
		public void Calculate(String firstInput, String secondInput, String operator){
			//Convert
//			num1 = firstInput;
//			num2 = secondInput;
			numParse1 = Integer.parseInt(firstInput);
			numParse2 = Integer.parseInt(secondInput);
			
			
			//Calculate
			switch (operator) {
				case "+":
					numResult = numParse1+numParse2;
					System.out.printf("%.2f", numResult);
					break;
				case "-":
					numResult = numParse1-numParse2;
					System.out.printf("%.2f", numResult);
					break;
				case "*":
					numResult = numParse1*numParse2;
					System.out.printf("%.2f", numResult);
					break;
				case "/":
					numResult = numParse1/numParse2;
					System.out.printf("%.2f", numResult);
					break;
				case "+/-":
					Negated = -numParse1;
					System.out.printf("%.2f", Negated);
					break;
				case "%":
					numResult = numParse1*0.01;
					System.out.printf("%.2f", numResult);
					break;
				case "=":
					if(operator.equals("+")) {
						numResult = numParse1+numParse2;
						System.out.printf("%.2f", numResult); }
					if(operator.equals("-")){
						numResult = numParse1-numParse2;
						System.out.printf("%.2f", numResult); }
					if(operator.equals("*")) {
						numResult = numParse1*numParse2;
						System.out.printf("%.2f", numResult); }
					if(operator.equals("/")){
						numResult = numParse1/numParse2;
						System.out.printf("%.2f", numResult); }
					if(operator.equals("%")){
						numResult = numParse1*0.01;
						System.out.printf("%.2f", numResult); }
					break;
				
				}
			
		}

		//Lei
		//
		// This Shows the Result for the calculated arithmetic
		// Basta kapag tapos na mag add, minus, etc.. show the result
		//
		//
		public String ShowResult(){
			if(numResult % 1 != 0){
				StringResult = String.valueOf(String.format("%.1f,", numResult));
			}else{
				StringResult = String.valueOf(Math.round(numResult));
			}
		  return StringResult;
		}

}
