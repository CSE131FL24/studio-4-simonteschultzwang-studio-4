package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.setPenColor(Color.GREEN);
		StdDraw.filledRectangle(0.25, 0.5, 0.25, 0.5);
		
		StdDraw.setPenColor(Color.YELLOW);
		StdDraw.filledRectangle(0.75, 0.75, 0.25, 0.25);
		
		StdDraw.setPenColor(Color.PINK);
		StdDraw.filledRectangle(0.75, 0.25, 0.25, 0.25);
		
		StdDraw.setPenColor(Color.BLUE);
		StdDraw.filledEllipse(0.25, 0.5, 0.2, 0.4);
		
		StdDraw.setPenRadius(0.02);
		StdDraw.setPenColor(Color.BLACK);
		StdDraw.rectangle(0.5, 0.5,0.5, 0.5);
	}
	
}