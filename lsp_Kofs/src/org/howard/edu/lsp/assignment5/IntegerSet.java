package org.howard.edu.lsp.assignment5;

import java.util.ArrayList;
import java.util.List;

/**
 * Yoofi Williams
 * 
 * @author Yoofi
 *
 */

public class IntegerSet {
	
	private List<Integer> set = new ArrayList<Integer> ();
	
	/**
	 * Default Constructor 
	 * Creates an IntegerSet object
	 */
	public IntegerSet() {
		set = new ArrayList<Integer> ();		
	}
	
	/**
	 * Returns the value at the index in the set
	 * @return value at the index in the set of type int
	 * @param index, an integer representing the index of a value
	 */
	public int getValue(int index) {
		return set.get(index);
	}
	
	/**
	 * Clears the internal representation of the set
	 */
	public void clear() {
		set.clear();
	} 
	
	/**
	 * Returns the length of the set
	 * @return length of the set of type int
	 */
	public int length() {
		return set.size();
	}
	
	/**
	 * Returns true if the sets are equal, flase otherwise
	 * Two sets are equal if they contain all the same values in ANY order
	 * @return true if the sets are equal, false otherwise of type boolean
	 * @param b, an IntgerSet object of class IntegerSet
	 */
	public boolean equals(IntegerSet b) {		
		if (set.size() != b.length()) {
			return false;
		}
		
		for (Integer x: set) {
			if (!b.contains(x)) {
				return false;
			}
		}
		return true;
	}
	
	/**
	 * Returns true if the set contains the value, flase otherwise
	 * @return true if the set contains the value, false otherwise of type boolean
	 * @param value, a value of type int
	 */
	
	public boolean contains(int value) {
		return set.contains(value);		
	}
	
	/**
	 * Returns the largest item in the set
	 * @return the largest number in the set of type int
	 * @throws IntegerSetException if the set is empty
	 */
	public int largest() throws IntegerSetException {
		if (set.isEmpty()) {
			throw new IntegerSetException("Set is Empty!");
		}
		else {
			int big = set.get(0);
			
			for (Integer x: set) {
				if (x > big) {
					big = x;
				}
			}
			return big;
		}
	}
	
	/**
	 * Returns the smallest item in the set
	 * @return the smallest number in the set of type int
	 * @throws IntegerSetException if the set is empty
	 */
	public int smallest() throws IntegerSetException {
		if (set.isEmpty()) {
			throw new IntegerSetException("Set is Empty!");
		}
		else {
			int small = set.get(0);
			
			for (Integer x: set) {
				if (x < small) {
					small = x;
				}
			}
			return small;
		}
	}
	
	/**
	 * Adds an item to the set or does nothing if it is already there
	 * @param item, a number of type int
	 */
	public void add(int item) {
		if (!set.contains(item)) {
			set.add(item);
		}
	}
	
	/**
	 * Remove an item to the set or does nothing if it is already there
	 * @param item, a number of type int
	 */
	public void remove(int item) {
		if (set.contains(item)) {
			set.remove(Integer.valueOf(item));
		}
	}
	
	/**
	 * Set union. 
	 * Add set2 to set1
	 * @param intSetb, an IntegerSet object
	 */
	public void union(IntegerSet intSetb) {
		for(int i = 0; i < intSetb.length(); i++) {
			if (!set.contains(intSetb.getValue(i))) {
				set.add(intSetb.getValue(i));
			}		
		}
	}
	
	/**
	 * Set intersection. 
	 * Put the items that appear in both set1 and set2 into set1
	 * @param intSetb, an IntegerSet object
	 */
	public void intersect(IntegerSet intSetb) {		
		IntegerSet temp_set = new IntegerSet();
		
		for(int i = 0; i < set.size(); i++) {
			if (intSetb.contains(set.get(i))) {
				temp_set.add(set.get(i));
			}
		}
		set.clear();
		for(int x = 0; x < temp_set.length(); x++) {
			set.add(temp_set.getValue(x));
		}
	}
	
	/**
	 * Set difference. 
	 * Remove all the items in set1 that are in set2
	 * @param intSetb, an  IntegerSet object
	 */
	public void diff(IntegerSet intSetb) {
		IntegerSet temp_set = new IntegerSet();
		
		for(int i = 0; i < set.size(); i++) {
			if (!intSetb.contains(set.get(i))) {
				temp_set.add(set.get(i));
			}
		}
		set.clear();
		for(int x = 0; x < temp_set.length(); x++) {
			set.add(temp_set.getValue(x));
		}
	}
	 
	/**
	 * Returns true if the set is empty, false otherwise
	 * @return true if set is empty, otherwise false
	 */
	public boolean isEmpty() {
		return set.isEmpty();
	}
	
	/**
	 * Return String representation of your set
	 * @return set of type String
	 */
	
	public String toString() {
		return set.toString();	
	}
	
}

