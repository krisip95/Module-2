package edu.smg06;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MazeControll15_1 extends JPanel {
	private MazePanel15_1 mazePanel = new MazePanel15_1();
	private JButton findPathBtn = new JButton("Find Path");
	private JButton cleanPathBtn = new JButton("Reset");
	
	public MazeControll15_1(){
		setLayout(new BorderLayout());
		add(mazePanel, BorderLayout.CENTER);
		JPanel buttonPanel = new JPanel();
		buttonPanel.add(findPathBtn);
		buttonPanel.add(cleanPathBtn);
		add(buttonPanel, BorderLayout.SOUTH);
		
		findPathBtn.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				mazePanel.findPath();
			}
			
		});
		
		cleanPathBtn.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				mazePanel.cleanPath();
			}
			
		});
		
	}
	
	

}