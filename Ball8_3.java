package edu.smg05;

import java.awt.Color;

class Ball8_3 implements Comparable<Ball8_3>{
	int x = 0;
	int y = 0; // Current ball position
	int dx = 2; // Increment on ball's x-coordinate
	int dy = 2; // Increment on ball's y-coordinate
	int radius = (int) (Math.random()*19)+2; // Ball radius
	Color color = new Color((int) (Math.random() * 256), (int) (Math.random() * 256), (int) (Math.random() * 256));
	@Override
	public int compareTo(Ball8_3 o) {
		// TODO Auto-generated method stub
		return radius-o.radius;
	}
}