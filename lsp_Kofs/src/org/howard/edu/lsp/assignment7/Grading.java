package org.howard.edu.lsp.assignment7;

/**
 * Yoofi Williams
 * 
 * @author Yoofi
 *
 */

import java.util.List;

public class Grading {

	/**
	 * Sets and calls implements the normal average calculation executeAverage.
	 * 
	 * @param grades List of integers.
	 * @throws EmptyListException If the input list is empty.
	 */
	public static void main(List<Integer> grades) throws EmptyListException {
		AverageContext avg = new AverageContext();

		avg.setAverageStrategy(new NormalAvgStrategy());

		avg.executeAverage(grades);
	}

}
