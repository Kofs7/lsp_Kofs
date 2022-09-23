package org.howard.edu.lsp.assignment2;

/**
 * Yoofi Williams
 * 
 * @author Yoofi
 * 
 * Reference material: https://stackoverflow.com/questions/72359166/find-the-sum-of-custom-number-of-elements-in-an-array-of-integers
 *
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Combinations {
	// A Stack to hold the Array elements which sum to the desired Target Sum.
    private Stack<Integer> stack = new Stack<>();
    
    // A Stack to hold the Array elements indexes which sum to the desired Target Sum.
    private Stack<Integer> indexStack = new Stack<>();

    // Store the summation of current elements held in stack.
    private int sumInStack = 0;
    
    // Store the indexes of the elements held in stack
    private List<Integer[]> indexOfNumbers = new ArrayList<>();
    
    /* A List Interface of Integer[] array to hold all the 
       combinations of array elements which sum to target. */
//    private List<Integer[]> combinationsList = new ArrayList<>();
    
    private int numbersLimit = 3;
    
    public static void main(int[] input, int sum) {
        new Combinations().compute(input, sum);
    }
	public void compute(int[] input, int sum) {           
        /* See which array elements can acquire the desired 
           Target Sum with the maximum number of array elements 
           specified in the numbersLimit member variable.     */
        getSums(input, 0, input.length, sum);
        
        // Display the found results to Console window...
//        for (Integer[] intArray : combinationsList) {
//            // System.out.println(Arrays.toString(intArray).replaceAll("[\\[\\]]", ""));
//            System.out.println(Arrays.toString(intArray));
//        }
     // Display the found results to Console window...
        for (Integer[] intArray : indexOfNumbers) {
            System.out.println(Arrays.toString(intArray));
        }
    }
	
	// Note: This method is recursive...
    public void getSums(int[] data, int startIndex, int endIndex, int target) {
        /* Check to see if the sum of array elements stored in the
           Stack is equal to the desired Target Sum. If it is then 
           convert the array elements in the Stack to an Integer[] 
           Array and add it to the combinationsList List.       */
        if (sumInStack == target) {
            if (stack.size() <= numbersLimit) {
//                combinationsList.add(stack.toArray(new Integer[stack.size()]));
                indexOfNumbers.add(indexStack.toArray(new Integer[stack.size()]));
            }
        }

        for (int currIndex = startIndex; currIndex < endIndex; currIndex++) {
            if (sumInStack + data[currIndex] <= target) {
                stack.push(data[currIndex]);
                indexStack.push(currIndex);
                sumInStack += data[currIndex];

                // Make the currentIndex +1, and then use recursion to carry on.
                getSums(data, currIndex + 1, endIndex, target);
                sumInStack -= stack.pop();
                indexStack.pop();
            }
        }
    } 
}