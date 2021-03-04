package edu.smg04;

import java.util.ArrayList;
import java.util.Collections;

public class ImplementMethods6_2 {
	public static void main(String[] args) {
		
		ArrayList<Integer> intList = new ArrayList<Integer>();
		intList.add(10);
		intList.add(20);
		intList.add(30);
		shuffle(intList);
		sort(intList);
		
		System.out.println(min(intList));
	}
	public static <E> void shuffle(ArrayList<E> list) {
		Collections.shuffle(list);
		System.out.println(list);
	}
	
	public static <E extends Comparable<E>> void sort(ArrayList<E> list) {
		Collections.sort(list);
		System.out.println(list);
	}
	
	public static <E extends Comparable<E>> E min(ArrayList<E> list) {
		return Collections.min(list);
		
	}
}