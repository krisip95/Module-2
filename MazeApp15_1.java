package edu.smg06;

import java.awt.*;
import javax.swing.*;

public class MazeApp15_1  {
	public static void main(String[] args){
		JFrame frame = new JFrame();
		frame.setSize(400, 400);
		frame.add(new MazeControll15_1());
		frame.setTitle("Maze");
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}