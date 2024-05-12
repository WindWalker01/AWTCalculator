package org.example;

public class DataParser {
		
		public double Negated;
		public String StringResult;
		public double numParse1;
		public double numParse2;
		public int operParse;
		public double numResult;
		
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
