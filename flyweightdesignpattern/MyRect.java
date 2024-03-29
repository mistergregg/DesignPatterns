package com.collabera.flyweightdesignpattern;

import java.awt.*;

public class MyRect
{
	private Color color;
	private int x, y, x2, y2;
	
	public MyRect(Color color)
	{
		this.color = color;
	}
	
	public void draw(Graphics g, int upperX, int upperY, int lowerX, int lowerY)
	{
		g.setColor(color);
		g.fillRect(upperX, upperY, upperX, upperY);
	}
	
	/* SLOW WAY
	public MyRect(Color color, int upperX, int upperY, int lowerX, int lowerY)
	{
		this.color = color;
		this.x = upperX;
		this.y = upperY;
		this.x2 = lowerX;
		this.y2 = lowerY;
	}
	
	public void draw(Graphics g)
	{
		g.setColor(color);
		g.fillRect(x, y, x2, y2);
	}*/
}
