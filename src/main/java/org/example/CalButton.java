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
				
				if(getLabel().equals("+") || getLabel().equals("-") || getLabel().equals("x") || getLabel().equals("/")  || getLabel().equals("%")) {
					
					m_parser.SetOperator(getLabel());
				
					if(!m_parser.GetSecondInput().isEmpty()){
						m_parser.Calculate(m_parser.GetFirstInput(), m_parser.GetSecondInput(), m_parser.GetOperator());
						// Set the result of the calculation to the first input and then reset the second input to 0.
						
						m_entryField.setText(m_parser.ShowResult());
						m_formulaField.setText(m_parser.ShowResult() + m_parser.GetOperator());
					}
				
				
				
				
				}else if(getLabel().equals("=")){
				
				
				
				} else if(getLabel().equals("C")){
				
				
				}else if(getLabel().equals("CE")){
				
				
				
				}else{
					//if the user clicked a numbered button:
					
					if(m_parser.GetOperator().isEmpty()){
						m_parser.SetFirstInput(getLabel());
					}else{
						m_parser.SetSecondInput(getLabel());
					}
					
					
				}
			}
		});
		
		
		
		
		
		
	}

}
