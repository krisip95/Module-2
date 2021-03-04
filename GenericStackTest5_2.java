package edu.smg04;
import java.util.Scanner;

public class GenericStackTest5_2 {

	public static void main(String[] args) {
		//Create Scanner
		Scanner sc = new Scanner(System.in);
		GenericStack5_2<String> stack1 = new GenericStack5_2<>();
		for(int i = 0; i < 5; i++) {
			
			stack1.push(sc.next());
		}
		
		for(int i = 0; i < 5; i++) {
			System.out.println(stack1.pop());
		}
	}
}