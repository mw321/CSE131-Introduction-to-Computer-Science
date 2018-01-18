package exercises4;

import java.awt.Color;

import sedgewick.StdDraw;

public class GraphicsDemo {

	public static void main(String[] args) {
		// blue point (look carefully, will be very small on your screen)
		StdDraw.setPenColor(Color.BLUE);
		StdDraw.point(0.5, 0.5);
		
		// larger green point
		StdDraw.setPenRadius(0.01);
		StdDraw.setPenColor(Color.green);
		StdDraw.point(0.1, 0.1);
		// unfilled red triangle
		StdDraw.setPenColor(Color.RED);
		StdDraw.line(0.6, 0.2, 0.7, 0.2);
		StdDraw.line(0.6, 0.2, 0.67, 0.25);
		StdDraw.line(0.67, 0.25, 0.7, 0.2);
		// yellow circle, filled
		StdDraw.setPenColor(Color.yellow);
		StdDraw.filledCircle(0.8, 0.8, 0.1);
		// filled blue rectangle
		StdDraw.setPenColor(Color.blue);
		StdDraw.filledRectangle(0.25, 0.7, 0.15, 0.25);


	}

}
