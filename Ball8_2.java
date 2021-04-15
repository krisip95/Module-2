package edu.smg05;

import java.awt.Color;

class Ball8_2 implements Comparable<Ball>{
	int x = 0;
	int y = 0; //Current ball position
	int dx = 2; //Increment on ball's x-coordinate
	int dy = 2; //Increment on ball's y-coordinate
	int radius = (int) (Math.random() * 20); //Ball radius
	Color color = new Color((int) (Math.random() * 256), (int) (Math.random() * 256), (int) (Math.random() * 256)); 
	@Override
	public int compareTo(Ball arg0) {
		//TODO Auto-generated method stub
		if(radius - arg0.radius > 0) {
			return 1;
		} else if (radius - arg0.radius < 0) {
			return -1;
		}
		return 0;
		}
	}
