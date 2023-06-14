package com.labAssignments2;

import java.util.Arrays;

public class Theatre {

	private int t_id;
	private String t_name;
	private Movie m[];

	public int getT_id() {
		return t_id;
	}

	public void setT_id(int t_id) {
		this.t_id = t_id;
	}

	public String getT_name() {
		return t_name;
	}

	public void setT_name(String t_name) {
		this.t_name = t_name;
	}

	public Movie[] getM() {
		return m;
	}

	public void setM(Movie[] m) {
		this.m = m;
	}

	@Override
	public String toString() {
		return "Theatre [t_id=" + t_id + ", t_name=" + t_name + ", m=" + Arrays.toString(m) + "]";
	}

}
