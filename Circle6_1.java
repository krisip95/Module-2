package edu.smg04;

public class Circle6_1 extends GeometricObject6_1 {
	private int radius;
	
	Circle6_1(int radius){
		this.radius = radius;
	}
	
	public int max(Circle6_1 c) {
		return this.compareTo(c);
	}
	
	public int getArea () {
		return area = (int) (Math.PI * Math.pow(radius, 2));
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
}

