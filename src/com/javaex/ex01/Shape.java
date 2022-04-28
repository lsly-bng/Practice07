package com.javaex.ex01;

public class Shape {

	// field
	protected String fillColor;

	// constructor
	public Shape() {
	}

	public Shape(String fillColor) {
		this.fillColor = fillColor;
	}

	// method - gs
	public String getFillColor() {
		return fillColor;
	}

	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}

	// method - general
	public void draw() {

	}
}
