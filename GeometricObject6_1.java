package edu.smg04;

 abstract public class GeometricObject6_1 implements Comparable <GeometricObject6_1>{
	private String color = "white";
	private boolean filled;
	private java.util.Date dateCreated;
	public int area;
	
	public GeometricObject6_1() {
		dateCreated = new java.util.Date();
	}
	
	public GeometricObject6_1(String color, boolean filled) {
		dateCreated = new java.util.Date();
		this.setColor(color);
		this.setFilled(filled);
	}
	public static void max(GeometricObject6_1 object) {
	}
	
	public int compareTo(GeometricObject6_1 object) {
		return object.getArea() - area;
	}
	
	public abstract int getArea();

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isFilled() {
		return filled;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	public java.util.Date getDateCreated() {
		return dateCreated;
	}
	
	public abstract String toString();
 }
	