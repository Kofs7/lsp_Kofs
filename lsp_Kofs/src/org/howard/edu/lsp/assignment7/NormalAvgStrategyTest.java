package org.howard.edu.lsp.assignment7;

/**
 * Yoofi Williams
 * 
 * @author Yoofi
 *
 */

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class NormalAvgStrategyTest {

	/**
	 * Test to check the executeAverage() functionality. The executeAverage()
	 * function returns the average of the list of grades.
	 * 
	 * @throws EmptyListException If the input list is empty.
	 */
	@Test
	@DisplayName("Test case for executeAverage")
	void testcompute() throws EmptyListException {
		AverageContext avg = new AverageContext();
		avg.setAverageStrategy(new NormalAvgStrategy());

		List<Integer> grades1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
		List<Integer> grades2 = new ArrayList<>(Arrays.asList(20, 30, 50, 90, 50, 20, 100));
		List<Integer> grades3 = new ArrayList<>(
				Arrays.asList(100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100));
		List<Integer> grades4 = new ArrayList<>(Arrays.asList(28, 94));
		List<Integer> grades5 = new ArrayList<>(Arrays.asList(40, 56, 28, 50, 90, 94, 12, 28, 73, 40, 77, 33));
		List<Integer> grades6 = new ArrayList<>(
				Arrays.asList(89, 90, 93, 89, 88, 92, 95, 91, 89, 90, 91, 100, 96, 100, 97, 100));
		List<Integer> grades7 = new ArrayList<>();
		List<Integer> grades8 = new ArrayList<>(Arrays.asList(100));

		int sum1 = grades1.stream().mapToInt(Integer::intValue).sum();
		int sum2 = grades2.stream().mapToInt(Integer::intValue).sum();
		int sum3 = grades3.stream().mapToInt(Integer::intValue).sum();
		int sum4 = grades4.stream().mapToInt(Integer::intValue).sum();
		int sum5 = grades5.stream().mapToInt(Integer::intValue).sum();
		int sum6 = grades6.stream().mapToInt(Integer::intValue).sum();
		int sum7 = grades8.stream().mapToInt(Integer::intValue).sum();

		assertEquals(sum1 / grades1.size(), avg.executeAverage(grades1));
		assertEquals(sum2 / grades2.size(), avg.executeAverage(grades2));
		assertEquals(sum3 / grades3.size(), avg.executeAverage(grades3));
		assertEquals(sum4 / grades4.size(), avg.executeAverage(grades4));
		assertEquals(sum5 / grades5.size(), avg.executeAverage(grades5));
		assertEquals(sum6 / grades6.size(), avg.executeAverage(grades6));
		assertThrows(EmptyListException.class, () -> avg.executeAverage(grades7));
		assertEquals(sum7 / grades8.size(), avg.executeAverage(grades8));
	}

}
