package com.datastruct;

import java.util.LinkedList;
import java.util.List;

public class InsertSort {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		/*
		 * int arr[],key,prev;
		next: for (int i = 1; i < arr.length; i++)
					for (int j = 0; j < arr.length; j++)
						if(prev > key)
							arr[i]=arr[j];
		*/
		
		
		List<Integer> n = new LinkedList<Integer>();
		int j[]= { 9,7,5,3,2,1 };

		for (int i : j) {
			Integer num = new Integer(i);
			n.add(num);
			System.out.println(num);
		}
		
		System.out.println(insertSort(n));
		
		int K[]={4,9,3,0,5,2,1};
		for(int num:K){
		System.out.print(num + " ");}
		System.out.print("\ninsert sort int[] array:\n");
		for(int num:insertSort(K)){
		System.out.print(num + " ");}
	}
	
	//===========================(int[])Array
	public static int[] insertSort(int A[]){

		for(int i=1; i<A.length;i++){
			int tmp=0;
				for(int j=i-1;j>=0;j--){
					if(A[j+1]<A[j]){
						tmp=A[j+1];
						A[j+1]=A[j];
						A[j]=tmp;}
							}
						}

			return A; }
	
	//=====================================Collection
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
