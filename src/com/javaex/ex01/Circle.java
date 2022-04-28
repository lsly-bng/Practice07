package com.javaex.ex01;

public class Circle extends Shape {

	// field
	private int radius;

	// constructor
	public Circle() {
	}

	public Circle(String fillColor, int radius) {
		super(fillColor);
		this.radius = radius;
	}

	// method g/s
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	//method - general
	public void draw() {
		System.out.println("[원]#면색:" + super.fillColor + "  #반지름:" + radius + " 그렸습니다.");
	}
}
