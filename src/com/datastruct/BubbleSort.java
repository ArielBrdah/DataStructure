package com.datastruct;

public class BubbleSort {

	public static void main(String[] args) {
		int j[]= { 9,7,5,3,2,1 };

		bubbleSort(j);
	}
	
	
	public static void bubbleSort(int[] numbers) {

		boolean numberSwitched;
		int loop = 0;
		
		do {
			numberSwitched=false;
			
			for (int i = 0; i < numbers.length - 1 ; i++) {
				
				if( numbers[ i + 1 ] < numbers[i] ) {
					int tmp = numbers[i+1];
					numbers[i+1]=numbers[i];
					numbers[i]=tmp;
					numberSwitched=true;
				}
				loop++;
			}
		}while(numberSwitched);
		
		for (int j = 0; j < numbers.length; j++) 
			System.out.print(numbers[j]+" ");
			
		System.out.println(loop);
		}
	}


