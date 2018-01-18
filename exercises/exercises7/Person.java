package exercises7;

/**
 * 
 * Identify the parts of this object:
 *      Constructor
 *      Instance variables
 *      Methods
 *         Accessors
 *         Mutators
 *         Other
 *
 */
public class Person {
	
	//instance variables
	private int height, age;
	
	//constructor
	public Person(int height) {
		this.height = height;
		this.age    = 0;
	}
	
	//method: mutator
	public void setHeight(int height) {
		this.height = height;
	}
	
	//method: other
	public void happyBirthday() {
		this.age = this.age + 1;
	}
	
	//method: getter
	public int getHeight() {
		return this.height;
	}
	
	//method: getter
	public int getAge() {
		return this.age;
	}
	

}
