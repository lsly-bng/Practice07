package com.javaex.ex02;

public abstract class Bird {

	// field
	protected String name;

	// constructor
	public Bird() {
		super();
	}

	public Bird(String name) {
		super();
		this.name = name;
	}

	// method - g/s
	protected String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// method - general
	public abstract void sing();

	public abstract void fly();

	public abstract void showName();

	@Override
	public String toString() {
		return "Bird [name=" + name + "]";
	}

}
