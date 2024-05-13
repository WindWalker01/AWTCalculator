package org.example;

import java.awt.*;

public class CalTextField extends Label {
	
	private int m_posX;
	private int m_posY;
	private int m_width;
	private int m_height;
	private int m_fontSize;
	
	public CalTextField(int posX, int posY, int width, int height, int fontSize){

		this.m_posX = posX;
		this.m_posY = posY;

		this.m_fontSize = fontSize;
		
		this.m_width = width;
		this.m_height = height;
		
		setBounds(m_posX, m_posY, m_width, m_height);
		
		setText("0");
		setFont(new Font("Arial", Font.PLAIN, m_fontSize));
		
		setAlignment(RIGHT);

	}
}
