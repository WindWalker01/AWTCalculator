package org.example;

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
			
			}
		});
		
		
		
		
		
		
	}

}
