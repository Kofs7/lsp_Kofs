package org.howard.edu.lsp.assignment7;

/**
 * Yoofi Williams
 * 
 * @author Yoofi
 *
 */

import java.util.ArrayList;
import java.util.List;

public class DropTwoGradesAvgStrategy implements AverageStrategy {

	/**
	 * Calculates the average grade of the list of grades after dropping the lowest
	 * two grades.
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
		}
		// Check to see if list has too few numbers.
		else if (newgrades.size() <= 2) {
			throw new EmptyListException("List is too small to compute average!!");
		} else {
			int i = 0, sum = 0, avg;

			// Loop twice to remove two lowest grades.
			while (i < 2) {
				// Finding the lowest grade.
				int small = Integer.MAX_VALUE;
				int ind = 0;
				for (Integer n : newgrades) {
					if (n < small) {
						small = n;
						ind = newgrades.indexOf(small);
					}
				}
				newgrades.remove(ind);
				i++;
			}
			// Finding the sum of grades in list.
			for (Integer n : newgrades) {
				sum += n;
			}
			// Calculating the average of the grades.
			avg = sum / newgrades.size();
			return avg;
		}
	}

}
