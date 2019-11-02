package com.datastruct;

import java.util.LinkedList;
import java.util.List;

public class InsertSort {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		List<Integer> n = new LinkedList<Integer>();
		int j[]= { 9,7,5,3,2,1 };

		for (int i : j) {
			Integer num = new Integer(i);
			n.add(num);
			System.out.println(num);
		}
		
		System.out.println(insertSort(n));
	}
	
	public static List<Integer> insertSort( List<Integer> numbers){
		List<Integer> sortedList = new LinkedList<>();
		int loop=0;
		
		originalList: for (Integer number : numbers) {
			
			for (int i = 0; i < sortedList.size(); i++) {
			
					if (number < sortedList.get(i) ) {
						loop++;
						sortedList.add(i,number);
						continue originalList;
					}
				loop++;
				
				}
			
			sortedList.add(sortedList.size(), number);
			}
		System.out.println("loop :"+loop);
		return sortedList;
		}

}
