package com.labAssignments2;

import java.util.Arrays;

public class Student {

	private int sId;
	private String sName;
	private int[] marks;
	private float average;
	private char grade;

	public int getsId() {
		return sId;
	}

	public void setsId(int sId) {
		this.sId = sId;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public int[] getMarks() {
		return marks;
	}

	public void setMarks(int[] marks) {
		this.marks = marks;
	}

	public float getAverage() {
		return average;
	}

	public void setAverage(float average) {
		this.average = average;
	}

	public char getGrade() {
		return grade;
	}

	public void setGrade(char grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "sId=" + sId + ", sName=" + sName + ", marks=" + Arrays.toString(marks) + ", average=" + average
				+ ", grade=" + grade + "]\n";
	}

}
