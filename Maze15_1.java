package edu.smg06;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;

public class Maze15_1 {
	public int[][] maze;
	public Stack<Position15_1> path = new Stack<Position15_1>();
	public Position15_1 start;

	public Maze15_1(String filePath) throws FileNotFoundException {

		Scanner in = new Scanner(new File(filePath));
		int rows = Integer.parseInt(in.nextLine());
		this.maze = new int[rows][];

		for (int i = 0; i < rows; i++) {
			String line = in.nextLine();
			String[] numbers = line.split(", ");
			this.maze[i] = new int[numbers.length];
			for (int j = 0; j < numbers.length; j++) {
				this.maze[i][j] = Integer.parseInt(numbers[j]);
			}
		}

		this.start = new Position15_1(Integer.parseInt(in.nextLine()), Integer.parseInt(in.nextLine()));
	}
}
