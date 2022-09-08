package StudentList;

import java.util.Objects;

public class Student implements Comparable<Student>{
	private String studentID;
	private String name;
	private int dateOfBirth;
	private float score;
	
	
	public Student(String studentID) {
		this.studentID = studentID;
	}

	public Student(String studentID, String name, int dateOfBirth, float score) {
		this.studentID = studentID;
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.score = score;
	}

	public String getstudentID() {
		return studentID;
	}

	public void setstudentIDn(String studentID) {
		this.studentID = studentID;
	}

	public String getname() {
		return name;
	}

	public void setname(String name) {
		this.name = name;
	}

	public int dateOfBirth() {
		return dateOfBirth;
	}

	public void setdateOfBirth(int dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public float getscore() {
		return score;
	}

	public void setscore(float score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Student [studentID=" + studentID + ", name=" + name + ", dateOfBirth=" + dateOfBirth
				+ ", score=" + score + "]";
	}

	@Override
	public int compareTo(Student o) {
		return  studentID.compareTo(o.studentID);
	}

	@Override
	public int hashCode() {
		return Objects.hash(score, name, studentID, dateOfBirth);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(studentID, other.studentID);
	}

	
}
	
	