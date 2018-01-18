package studio7;

public class Complex {
	/**
	 * instance variables
	 */
	private double real, img;
	/**
	 * getters and setters
	 * @return
	 */
	public double getReal() {
		return real;
	}
	public void setReal(double real) {
		this.real = real;
	}
	public double getImg() {
		return img;
	}
	public void setImg(double img) {
		this.img = img;
	}
	/**
	 * constructor
	 * @param real
	 * @param img
	 */
	public Complex(double real, double img) {
		this.real = real;
		this.img = img;
	}
	/**
	 * method to add two complex numbers
	 * @param a for another complex number
	 * @return result of addition which is also a complex number
	 */
	public Complex add(Complex a) {
		Complex b = new Complex(this.real + a.real, this.img + a.img);
		return b;
	}
	/**
	 * method to multiply two complex numbers
	 * @param a for another complex number
	 * @return result of multiplication which is also a complex number
	 */
	public Complex mult(Complex a) {
		Complex b = new Complex(this.real * a.real - this.img * a.img, 
				this.real * a.img + this.img * a.real);
		return b;
	}
}
