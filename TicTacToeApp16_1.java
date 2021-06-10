package edu.smg06;

import java.awt.*;
import javax.swing.*;

public class TicTacToeApp16_1 {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(500, 400);
		frame.add(new TicTacToeControll16_1());
		frame.setTitle("Tic Tac Toe");
		frame.setLocationRelativeTo(null); // Center the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}