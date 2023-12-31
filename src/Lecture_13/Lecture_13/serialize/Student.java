package Lecture_13.Lecture_13.serialize;

import java.io.Serializable;

class Student implements Serializable {
	private static final long serialVersionUID = 1L;

	protected static String bachelor;
	private int id;
	private String name;
	private transient String password;

	public Student(String bachelor, int id, String name, String password) {
		Student.bachelor = bachelor;
		this.id = id;
		this.name = name;
		this.password = password;
	}

	public void setId(final int id) {
		this.id = id;
	}

	public String toString() {
		return "Student: bachelor: " + bachelor 
				+ ", id: " + id 
				+ ", name: " + name 
				+ ", pas: " + password;
	}
}
