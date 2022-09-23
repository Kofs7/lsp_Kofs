package org.howard.edu.lsp.assignment2;

/**
 * Yoofi Williams
 * 
 * @author Yoofi
 *
 */

public class Driver {

	public static void main(String[] args) {
		
		Combinations comb = new Combinations();
		comb.compute(new int[]{5,5,15,10}, 15);// test case 1
		comb.compute(new int[]{1,2,3,4,5,6}, 6);// test case 2
		comb.compute(new int[]{}, 0);
		comb.compute(new int[]{2,2,2}, 2);
		comb.compute(new int[]{2,4,5,6,1,10}, 50);
		comb.compute(new int[]{}, 10);
		comb.compute(new int[]{2,4,6,7,1,3}, -4);
		comb.compute(new int[]{1,2,3,4,5,6,7,8,9,10}, 10);
		comb.compute(new int[]{5,2,4,1,6,2,5}, 7);
		// More test cases

	}

}
