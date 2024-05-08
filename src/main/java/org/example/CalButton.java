package org.example;

import java.awt.*;
import java.awt.event.*;

public class CalButton extends Button {

	public int m_posX;
	public int m_posY;
	
	public final int m_width = 120;
	public final int m_height = 60;
	
	private CalTextField entryField;
	
	public CalButton(int posX, int posY, String label, CalTextField txt){
		this.m_posX = posX;
		this.m_posY = posY;
		this.entryField = txt;
		
		setBounds(m_posX, m_posY, m_width, m_height);
		setLabel(label);
		
		
		addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				entryField.setText("Hello World");
				
			}
		});
		
	}

}
