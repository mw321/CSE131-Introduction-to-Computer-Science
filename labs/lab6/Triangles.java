package lab6;

import java.awt.Color;

import sedgewick.StdDraw;

public class Triangles {
	/**
	 * 
	 * @param x0 left hand side x coordinate
	 * @param x1 upper x coordinate
	 * @param x2 right hand side x coordinate
	 * @param y0 left hand side y coordinate
	 * @param y1 upper y coordinate
	 * @param y2 left hand side y coordinate
	 * @param size length of the triangle's sides
	 */
	public static void triangle(double x0, double x1, double x2, double y0, double y1, double y2, double size) {
		if (size < .05) { //base case
			return;
		}
		//for every black triangle, draw the big white triangle at the center
		double[]x = new double[3];
		double[]y = new double[3];
		x[0] = 0.5 * (x0+x1);	
		x[1] = 0.5 * (x0+x2); 	
		x[2] = 0.5 * (x1+x2);
		y[0] = 0.5 * (y0+y1);	
		y[1] = 0.5 * (y0+y2); 	
		y[2] = y[0];
		StdDraw.filledPolygon(x, y);
		//locate the upper black triangle
		triangle(x[0], x1, x[2], y[0], y1, y[0], x[2]-x[0]);
		//locate the left black triangle
		triangle(x0, x[0], x[1], y[1], y[0], y[1], x[1]-x0);
		//locate the right black triangle
		triangle(x[1], x[2], x2, y[1], y[0], y2, x2-x[1]);
	}

	
	public static void main(String[] args) {
		//black background triangle
		double[]a = {0, 0.5, 1};
		double[]b = {0, 0.5 * Math.sqrt(3), 0};
		StdDraw.filledPolygon(a, b);

		//call method to draw the first white triangle at the center
		StdDraw.setPenColor(Color.WHITE);
		triangle(a[0], a[1], a[2], b[0], b[1], b[2], a[2]-a[0]);
	}
}