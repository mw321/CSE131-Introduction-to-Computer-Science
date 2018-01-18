package lab7;

public class Course {
	/**
	 * Instance variables
	 */
	private String Name;
	private int Credits;
	private int RemainingSeats;
	private String[] RosterOfStudents;
	private double[] RosterOfGPA;

	/**
	 * Constructor
	 * @param name
	 * @param credits
	 * @param remainingSeats
	 */
	public Course(String name, int credits, int remainingSeats) {
		this.Name = name;
		this.Credits = credits;
		this.RemainingSeats = remainingSeats;
		this.RosterOfStudents = new String[this.RemainingSeats];
		this.RosterOfGPA = new double[this.RemainingSeats];
	}

	/**
	 * Getters 
	 * @return
	 */
	public String getName() {
		return this.Name;
	}
	public int getRemainingSeats() {
		return this.RemainingSeats;
	}

	/**
	 * Method: addStudent
	 * @param s
	 * @return whether the student is added successfully
	 */
	int i = 0;
	public boolean addStudent(Student s) {
		for (int i = 0; i < this.RosterOfStudents.length; i++) {
			if (this.RosterOfStudents[i] == s.getName()) {
				return false;
			}
		}
		if (this.RemainingSeats == 0) {
			return false;
		}
		else {
			if (i < this.RosterOfStudents.length) {
				this.RosterOfStudents[i] = s.getName();
				this.RosterOfGPA[i] = s.getGPA();
			}
			i++;
			this.RemainingSeats--;
			return true;
		}
	}
	/**
	 * Method: generateRoster
	 * @return generate Roster as a string
	 */
	public String generateRoster() {
		String roster = "";
		for (int i = 0; i < this.RosterOfStudents.length; i++) {
			if (this.RosterOfStudents[i] != null) {
				roster = RosterOfStudents[i] + " ";
			}
		}
		return roster;
	}
	/**
	 * Method: calculate the average GPA
	 * @return the calculated average GPA
	 */
	public double averageGPA() {
		double sum = 0;
		int num = 0;
		for (int i = 0; i < this.RosterOfGPA.length; i++) {
			if (this.RosterOfStudents[i] != null) {
				num++;
				sum += this.RosterOfGPA[i];
			}
		}
		double average = sum / num;
		return average;
	}
	
	/**
	 * Method: toString
	 */
	public String toString() {
		return Name + Credits;
	}
}
