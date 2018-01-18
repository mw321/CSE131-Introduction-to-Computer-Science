package studio7;

public class Die {
	/**
	 * instance variables
	 */
	private int sides;
	private int value;
	/**
	 * constructor
	 * @param sides
	 */
	public Die(int sides) {
		this.sides = sides;
	}
	/**
	 * getters and setters
	 * @return
	 */
	public int getValue() {
		return this.value;
	}
	public int getSides() {
		return this.sides;
	}
	public void setSides(int sides) {
		this.sides = sides;
	}
	/**
	 * method to throw a die
	 * @return value of the die
	 */
	public int thrown() {
		this.value = (int) (Math.random() * (this.sides - 1) + 1);
		return this.value;
	}
}
