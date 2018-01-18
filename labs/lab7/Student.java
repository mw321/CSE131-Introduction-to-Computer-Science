package lab7;

public class Student {
	/**
	 * instance variables
	 */
	private String Name;
	private int StudentID;
	private int Credits;
	private double GPA;
	private String ClassStanding;
	private double qualityScore;

	/**
	 * constructor 1
	 * @param firstName
	 * @param lastName
	 * @param studentID
	 */
	public Student(String firstName, String lastName, int studentID) {
		this(firstName, lastName, studentID, 0, 0);
		this.setClassStanding("FirstYear");
		this.qualityScore = 0;
	}
	/**
	 * constructor 2
	 * @param firstName
	 * @param lastName
	 * @param studentID
	 * @param GPA
	 * @param credits
	 */
	private Student(String firstName, String lastName, int studentID, double GPA, int credits) {
		this.Name = firstName + " " + lastName;
		this.StudentID = studentID;
		this.GPA = GPA;
		this.Credits = credits;
	}

	/**
	 * getters and setters needed for the unit test
	 */
	private void setClassStanding(String ClassStanding) {
		this.ClassStanding = ClassStanding;
	}
	public String getName() {
		return this.Name;
	}
	public int getStudentID() {
		return this.StudentID;
	}
	public int getCredits() {
		return this.Credits;
	}
	public double getGPA() {
		return this.GPA;
	}
	private void setGPA(double GPA) {
		this.GPA = GPA;
	}

	/**
	 * Method: submitGrade
	 * @param grade
	 * @param credits
	 */
	public void submitGrade(double grade, int credits) {
		this.Credits += credits;
		this.qualityScore += grade * credits;
		this.setGPA(this.qualityScore / this.Credits);
		this.setGPA((Math.round(this.GPA * 1000)) / 1000.0);
	}

	/**
	 * Method: getClassStanding
	 * @return ClassStanding
	 */
	public String getClassStanding() {
		if (Credits < 30) {
			this.setClassStanding("FirstYear");
		}
		else if (Credits >= 30 && Credits < 60) {
			this.setClassStanding("Sophomore");
		}
		else if (Credits >= 60 && Credits < 90) {
			this.setClassStanding("Junior");
		}
		else {
			this.setClassStanding("Senior");
		}
		return this.ClassStanding;
	}

	/**
	 * Method: createLegacy
	 * @param otherParent
	 * @return an object: child
	 */
	public Student createLegacy(Student otherParent) {
		Student child = new Student(this.getName(), otherParent.getName(), 
				(this.getStudentID()+ otherParent.getStudentID()), 
				0.5 * (this.getGPA() + otherParent.getGPA()),
				Math.max(this.getCredits(), otherParent.getCredits()));
		return child;
	}

	/**
	 * Method: toString
	 */
	public String toString() {
		return this.Name + this.StudentID;
	}

	/**
	 * Extra getters and setters for the functionality of the object
	 */
	public void setName(String firstName, String lastName) {
		this.Name = firstName + " " + lastName; 
	}
	private void setCredits(int credits) {
		this.Credits = credits;
	}
	
}
