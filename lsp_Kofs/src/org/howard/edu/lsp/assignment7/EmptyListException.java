package org.howard.edu.lsp.assignment7;

/**
 * Yoofi Williams
 * 
 * @author Yoofi
 *
 */

public class EmptyListException extends Exception {

	/**
	 * Exception to handle if an empty list has been passed as an argument.
	 */
	private static final long serialVersionUID = 1L;

	public EmptyListException(String message) {

		super(message);

	}

}
