package org.howard.edu.lsp.assignment7;

/**
 * Yoofi Williams
 * 
 * @author Yoofi
 *
 */

import java.util.List;

public class AverageContext {

	/**
	 * Creating strategy object of type AverageStrategy.
	 */
	private AverageStrategy strategy;

	/**
	 * Function for setting the AverageStrategy.
	 * 
	 * @param strategy An object of type AverageStrategy.
	 */
	public void setAverageStrategy(AverageStrategy strategy) {
		this.strategy = strategy;
	}

	/**
	 * Calculates the average grade of the list of grades before or after dropping
	 * the lowest two grades.
	 * 
	 * @param grades List of integers.
	 * @return avg An integer representing the average of the grades.
	 * @throws EmptyListException If the input list is empty.
	 */
	public int executeAverage(List<Integer> grades) throws EmptyListException {
		int avg = strategy.compute(grades);
		return avg;
	}

}
