
public class InvalidGradeException extends Exception {
	

	private int grade;
	private int index;

	public InvalidGradeException(int i, int i2) {
		setGrade(i);
		setIndex(i2);
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}
	
	@Override
	public String toString() {
		return "InvalidGradeException [Grade=" + grade + ", Index=" + index + "]";
	}

}
