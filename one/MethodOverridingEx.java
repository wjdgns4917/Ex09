package com.one;

public class MethodOverridingEx {
	static void paint(Shape p) {
		p.draw();
	}
	public static void main(String[] args) {
		Line ln=new Line();
		
		paint(ln);
		paint(new Shape());
		paint(new Line());
		paint(new Rect());
		paint(new Circle());

	}

}
