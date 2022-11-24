package org.howard.edu.lsp.assignment7;

/**
 * Yoofi Williams
 * 
 * @author Yoofi
 *
 */

import java.util.ArrayList;
import java.util.List;

public class NormalAvgStrategy implements AverageStrategy {

	/**
	 * Calculates the average grade of the list of grades.
	 * 
	 * @param grades List of integers.
	 * @return avg An integer representing the average of the grades.
	 * @throws EmptyListException If the input list is empty.
	 */
	@Override
	public int compute(List<Integer> grades) throws EmptyListException {

		// Creating a copy of the original list so that the original is left unmodified.
		List<Integer> newgrades = new ArrayList<Integer>(grades);

		// Check to see if list is empty.
		if (newgrades.size() == 0) {
			throw new EmptyListException("List is empty!!");
		} else {
			int sum = 0, avg;

			// Finding the sum of the grades.
			for (Integer n : newgrades) {
				sum += n;
			}
			// Calculating the average of the grades.
			avg = sum / newgrades.size();
			return avg;
		}
	}

}
