package org.howard.edu.lsp.assignment7;

/**
 * Yoofi Williams
 * 
 * @author Yoofi
 *
 */

import java.util.List;

public class NewGrading {

	/**
	 * Sets and calls implements the average calculation executeAverage after
	 * dropping two lowest grades.
	 * 
	 * @param grades List of integers.
	 * @throws EmptyListException If the input list is empty.
	 */
	public static void main(List<Integer> grades) throws EmptyListException {
		AverageContext avg = new AverageContext();

		avg.setAverageStrategy(new DropTwoGradesAvgStrategy());

		avg.executeAverage(grades);
	}

}
