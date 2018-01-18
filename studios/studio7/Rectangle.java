package studio7;

public class Rectangle {
	/**
	 * instance variables
	 */
	private int length;
	private int width;
	private int area;
	private int perimeter;
	/**
	 * constructor
	 * @param length
	 * @param width
	 */
	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
		this.area = length * width;
		this.perimeter = 2 * (length + width);
	}
	/**
	 * getters
	 * @return
	 */
	public int getLength() {
		return this.length;
	}
	public int getWidth() {
		return this.width;
	}
	public int getArea() {
		return this.area;
	}
	public int getPerimeter() {
		return this.perimeter;
	}
	/**
	 * method to check whether a rectangle is smaller than another
	 * @param r for another triangle
	 * @return boolean: true if this rectangle is smaller
	 */
	public boolean smallerThan(Rectangle r) {
		if (this.area < r.area) {
			return true;
		}
		else {
			return false;
		}
	}
	/**
	 * method to check whether a rectangle is a square
	 * @return true if it is a square
	 */
			
	public boolean square() {
		if (this.length == this.width) {
			return true;
		}
		else {
			return false;
		}
	}
	
}
