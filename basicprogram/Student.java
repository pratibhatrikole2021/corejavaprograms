package com.csi.basicprogram;

public class Student {

	private String name;
	private String collegeName;

	public Student(String name, String collegeName) {
		// TODO Auto-generated constructor stub
		super();
		this.name = name;
		this.collegeName = collegeName;
		
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", collegeName=" + collegeName + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public static void main(String[] args) {

		Student s1 = new Student("pratibha","pratibha college");
		System.out.println(s1.toString());
		

	}

}
