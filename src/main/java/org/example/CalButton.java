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
				
				if(getLabel().equals("+") || getLabel().equals("-") || getLabel().equals("x") || getLabel().equals("/")) {
					
					if(m_parser.GetOperator().isEmpty()){
						m_parser.SetOperator(getLabel());
					}
					m_entryField.setText("0");
					
					if(!m_parser.GetSecondInput().isEmpty()){
						CalCulateResult();
						m_formulaField.setText(m_parser.GetFirstInput() + m_parser.GetOperator());
						m_entryField.setText(m_parser.ShowResult());
					}else{
						m_formulaField.setText(m_parser.GetFirstInput() + m_parser.GetOperator());
					}
					
				
				
				
				}else if(getLabel().equals("+/-") || getLabel().equals("%")){
					
					if(m_parser.GetOperator().isEmpty()){
						m_parser.SetOperator(getLabel());
						m_parser.SetSecondInput("0");
						m_formulaField.setText(m_parser.GetFirstInput() + m_parser.GetOperator());
						CalCulateResult();
						
						m_parser.ResetOperator();
					}else{
						CalCulateResult();
						m_parser.SetOperator(getLabel());
						m_formulaField.setText(m_parser.GetFirstInput() + m_parser.GetOperator());
						CalCulateResult();
					}
					
					
					
				} else if(getLabel().equals("=")){
					m_formulaField.setText(m_parser.GetFirstInput() + m_parser.GetOperator() + m_parser.GetSecondInput() + getLabel());
					CalCulateResult();
					
					m_parser.ResetSecondInput();
					m_parser.ResetOperator();
					
					
					
				} else if(getLabel().equals("C")){
					
					m_parser.ResetFirstInput();
					m_parser.ResetSecondInput();
					m_parser.ResetOperator();
					
					m_entryField.setText("0");
					m_formulaField.setText("0");
				
				
				}else if(getLabel().equals("CE")){
					
					if(m_parser.GetOperator().isEmpty()){
						m_parser.ResetFirstInput();
					}else{
						m_parser.ResetSecondInput();
					}
					
					m_entryField.setText("0");
				
				
				}else{
					//if the user clicked a numbered button:
					
					if(m_parser.GetOperator().isEmpty()){
						if(m_parser.GetFirstInput().equals("0")){
							m_parser.SetFirstInput(getLabel());
						}else{
							m_parser.SetFirstInput(m_parser.GetFirstInput().concat(getLabel()));
						}
						
						m_entryField.setText(m_parser.GetFirstInput());
					}else{
						
						if(m_parser.GetSecondInput().equals("0")){
							m_parser.SetSecondInput(getLabel());
						}else{
							m_parser.SetSecondInput(m_parser.GetSecondInput().concat(getLabel()));
						}
						
						m_entryField.setText(m_parser.GetSecondInput());
					}
					
					
				}
			}
		});
		
		
		
	}
	
	private void CalCulateResult(){
		m_parser.Calculate(m_parser.GetFirstInput(), m_parser.GetSecondInput(), m_parser.GetOperator());
		
		
		// Set the result of the calculation to the first input and then reset the second input to 0.
		m_parser.SetFirstInput(m_parser.ShowResult());
		m_parser.ResetSecondInput();
		m_parser.SetOperator(getLabel());
		
		m_entryField.setText(m_parser.ShowResult());
	}

}
