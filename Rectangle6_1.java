package edu.smg04;

public class Rectangle6_1 extends GeometricObject6_1{
	private int height;
	private int width;
	
	Rectangle6_1(int height, int width){
		this.height = height;
		this.width = width;
	}
	
	public int max(Rectangle6_1 r) {
		return this.compareTo(r);
	}
	
	public int getArea() {
		return area = height * width;
	}
	
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
}