package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
	
	StdDraw.setScale(0, 2);
	
	Color black =  new Color(0, 0, 0);
	StdDraw.setPenColor(black);
	StdDraw.rectangle(1, 1, 0.45, 0.35);
	
	Color purple = new Color(240,230,255);
	StdDraw.setPenColor(purple);
	StdDraw.filledRectangle(1, 1, 0.45, 0.35);
	
	Color orange =  new Color(251, 153, 0);
	StdDraw.setPenColor(orange);
	StdDraw.filledCircle(1, 1, 0.25);
	
		
	}
}