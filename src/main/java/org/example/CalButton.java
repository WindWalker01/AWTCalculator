package org.example;

import javax.xml.crypto.Data;
import java.awt.*;
import java.awt.event.*;

public class CalButton extends Button {

	public int m_posX;
	public int m_posY;
	
	public final int m_width = 120;
	public final int m_height = 60;
	
	private CalTextField m_entryField;
	private CalTextField m_formulaField;
	
	private DataParser m_parser;
	
	private static String m_entryInput = "";
	private static String m_formulaInput = "";
	
	public CalButton(int posX, int posY, String label, CalTextField firstField, CalTextField secondField){
		this.m_posX = posX;
		this.m_posY = posY;
		this.m_entryField = firstField;
		this.m_formulaField = secondField;
		
		m_parser = new DataParser();
		
		setBounds(m_posX, m_posY, m_width, m_height);
		setLabel(label);
		
		
		addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
//				entryField.setText(parser.ShowResult());
				
				if(getLabel().equals("+") || getLabel().equals("-") || getLabel().equals("x") || getLabel().equals("/")  || getLabel().equals("%") || getLabel().equals("=")) {
					
					
					if(m_parser.m_operator.isEmpty()){
						m_parser.SetOperator(getLabel());
						m_parser.SetFirstInput(m_entryInput);
					}else{
						m_parser.SetSecondInput(m_entryInput);
					}
					
					m_formulaInput = m_entryInput.concat(" " + m_parser.m_operator);
					m_entryInput = "0";
					
					if(!DataParser.m_firstInput.isEmpty() && !DataParser.m_secondInput.isEmpty() && !DataParser.m_operator.isEmpty()){
						m_parser.Calculate(DataParser.m_firstInput, DataParser.m_secondInput, DataParser.m_operator);
						
						m_formulaField.setText(m_parser.ShowResult());
						
						m_entryField.setText(m_parser.ShowResult() + DataParser.m_operator);
						
					}else{
						m_formulaField.setText(m_formulaInput);
						m_entryField.setText(m_entryInput);
					}
					
					
				
				}else if(getLabel().equals("C")){
					
					DataParser.m_firstInput = "0";
					DataParser.m_secondInput = "0";
					DataParser.m_operator = "";
					
					m_entryField.setText("0");
					m_formulaField.setText("0");
					
				}else if(getLabel().equals("CE")){
					
					DataParser.m_firstInput = "0";
					
					m_entryField.setText("0");
					
				}else{
					//if the user clicked a numbered button:
					
					if(m_entryInput.equals("0")){
						m_entryInput = getLabel();
					}else{
						m_entryInput = m_entryInput.concat(getLabel());
					}
					
					m_entryField.setText(m_entryInput);
					
					
				}
				
				
				
				
				
			
			}
		});
		
		
		
		
		
		
	}

}
