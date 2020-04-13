package com.one;

class Shape2{
	protected String name;
	public void paint() {
		draw();
	}
	public void draw() {
		System.out.println("Shape");
	}
}
public class CircleTest extends Shape2 {
	public void draw() {
		System.out.println("CircleTest");
	}
	public static void main(String[] args) {
		Shape2 b=new CircleTest();
		b.paint();
		
	}
}
