package org.example;

public class Main {
	public static void main(String[] args) {
		CalWindow window  = new CalWindow(500, 600);

		CalTextField entryField = new CalTextField(0, 180, 450, 50, 50);
		CalTextField formulaField = new CalTextField(0, 130, 450, 50, 25);

		CalButton btnNegate = new CalButton(10 ,530, "+/-", entryField, formulaField);
		CalButton btn0 = new CalButton(130,530, "0", entryField, formulaField);
		CalButton btnDot = new CalButton(250,530, ".", entryField, formulaField);
		CalButton btnEquals = new CalButton(370,530, "=", entryField, formulaField);

		CalButton btn1 = new CalButton(10,460, "1", entryField, formulaField);
		CalButton btn2 = new CalButton(130,460, "2", entryField, formulaField);
		CalButton btn3 = new CalButton(250,460, "3", entryField, formulaField);
		CalButton btnPlus = new CalButton(370,460, "+", entryField, formulaField);
		
		
		CalButton btn4 = new CalButton(10,390, "4", entryField, formulaField);
		CalButton btn5 = new CalButton(130,390, "5", entryField, formulaField);
		CalButton btn6 = new CalButton(250,390, "6", entryField, formulaField);
		CalButton btnMinus = new CalButton(370,390, "-", entryField, formulaField);
		
		
		CalButton btn7 = new CalButton(10,320, "7", entryField, formulaField);
		CalButton btn8 = new CalButton(130,320, "8", entryField, formulaField);
		CalButton btn9 = new CalButton(250,320, "9", entryField, formulaField);
		CalButton btnMultiply = new CalButton(370,320, "X", entryField, formulaField);
		
		
		CalButton btnDivide = new CalButton(370, 250, "/", entryField, formulaField);
		CalButton btnPercent = new CalButton(250, 250, "%", entryField, formulaField);
		CalButton btnC = new CalButton(130, 250, "C", entryField, formulaField);
		CalButton btnCE = new CalButton(10, 250, "CE", entryField, formulaField); // Clear Entry
		
		
//		window.add(entryText);
		
		window.add(btnNegate);
		window.add(btn0);
		window.add(btnDot);
		window.add(btnEquals);
		
		window.add(btn1);
		window.add(btn2);
		window.add(btn3);
		window.add(btnPlus);
		
		window.add(btn4);
		window.add(btn5);
		window.add(btn6);
		window.add(btnMinus);
		
		window.add(btn7);
		window.add(btn8);
		window.add(btn9);
		window.add(btnMultiply);
		
		window.add(btnDivide);
		window.add(btnPercent);
		window.add(btnC);
		window.add(btnCE);
		
		window.add(entryField);
		window.add(formulaField);


		
	}
}