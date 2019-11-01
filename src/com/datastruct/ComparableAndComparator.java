package com.datastruct;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import java.util.*;
import org.junit.jupiter.api.Test;


public class ComparableAndComparator {
	@Test
	public static void main(String[] args) {
		
		final int[] numbers = { -3, -5, 1, 7, 4, -2 };
		final int[] expected = { -5, -3, -2, 1,4,7};
		
		Arrays.sort(numbers);
		assertArrayEquals(expected,numbers);
		customSorting();
		
	}

	@Test
	public static void customSorting() {
		final List<Integer> numbers = Arrays.asList(4,7,1,6,3,5,2);
		final List<Integer> expected = Arrays.asList(7,6,5,4,3,2,1);
		
		Collections.sort(numbers, new ComparableAndComparator().new ReverseNumericalOrder());
		
		assertEquals(expected, numbers);
	}
	
	public class ReverseNumericalOrder implements Comparator<Integer> {

		@Override
		public int compare(Integer o1, Integer o2) {
			return o2 - o1;
		}

	}

}
