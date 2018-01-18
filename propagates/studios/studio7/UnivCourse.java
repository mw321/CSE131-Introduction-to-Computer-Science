package studio7;

public class UnivCourse {
	private int courseNum, numStudent;
	private String department;
	/**
	 * 
	 * @param courseNum, integer
	 * @param numStudent, integer
	 * @param department, String
	 */
	public UnivCourse (int courseNum, int numStudent, String department) {
		this.courseNum = courseNum;
		this.numStudent = numStudent;
		this.department = department;
	}
	/**
	 * 
	 * @return integer
	 */
	public int getCourseNum () {
		return this.courseNum;
	}
	/**
	 * 
	 * @return String
	 */
	public String getDepartment () {
		return this.department;
	}
	/**
	 * add student to course
	 */
	public void enroll () {
		this.numStudent = this.numStudent +1;
	}
	/**
	 * drop student from course
	 */
	public void drop () {
		this.numStudent = this.numStudent -1;
	}
	/**
	 * 
	 * @return integer
	 */
	public int getNumStudent () {
		return this.numStudent;
	}
	/**
	 * return string with UnivCourse info
	 */
	public String toString() {
		return getDepartment()+ getCourseNum()+ " has " + getNumStudent() +" students enrolled.";
	}
	
}
