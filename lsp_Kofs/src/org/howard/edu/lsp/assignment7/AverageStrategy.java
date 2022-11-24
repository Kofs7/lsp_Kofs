package org.howard.edu.lsp.assignment7;

/**
 * Yoofi Williams
 * 
 * @author Yoofi
 *
 */

import java.util.List;

public interface AverageStrategy {
	/**
	 * compute function used in interface to be overridden.
	 * 
	 * @param grades List of integers.
	 * @throws EmptyListException If the input list is empty.
	 *
	 */
	public int compute(List<Integer> grades) throws EmptyListException;

}