package edu.smg04;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class SierpinskiTraingleFrame_Task1 extends JFrame {
	private SierpinskiTrianglePanel_3 trianglePanel = new SierpinskiTrianglePanel_3();
	
	private JButton plusButton= new JButton("+");
	private JButton minusButton = new JButton("-");


	public SierpinskiTraingleFrame_Task1() {
// Panel to hold label, text field, and a button
		JPanel panel = new JPanel();
		panel.add(plusButton);
		panel.add(minusButton);
	//	PlusOrder.setHorizontalAlignment(SwingConstants.LEFT);
		//MinusOrder.setHorizontalAlignment(SwingConstants.RIGHT);
// Add a Sierpinski triangle panel to the frame
		add(trianglePanel);
		add(panel, BorderLayout.SOUTH);
// Register a listener
		plusButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed (ActionEvent arg0) {
				//TODO Auto-generated method stub
				 trianglePanel.increaseOrder(); //uveli4ava order na panela i vika repaint
			}
		});
		
		minusButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
			//TODO Auto-generated method stub
			trianglePanel.decreaseOrder(); //ako order = 0 -> stop
		}
	});
	}
}