package org.howard.edu.lsp.assignment4.test;

import org.howard.edu.lsp.assignment4.implementation.IntegerSet;
import org.howard.edu.lsp.assignment4.implementation.IntegerSetException;

/**
 * Yoofi Williams
 * 
 * @author Yoofi
 *
 */

public class Driver {

	public static void main(String[] args) throws IntegerSetException {
		
		// Initialization of sets
		IntegerSet set1 = new IntegerSet();
		IntegerSet set2 = new IntegerSet();
		IntegerSet set3 = new IntegerSet();
		IntegerSet set4 = new IntegerSet();
		IntegerSet set5 = new IntegerSet();

		
		// Test to add to the set
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		set1.add(2);
		set1.add(10);
		set1.add(10);
		set1.add(500);
		set1.add(167);
		set1.add(11);
		set1.add(23);
		
		set2.add(-21);
		set2.add(200);
		set2.add(3);
		set2.add(0);
		set2.add(-10);
		
		set3.add(50);
		set3.add(200);
		set3.add(5);
		set3.add(0);
		set3.add(20);
		
		set4.add(50);
		set4.add(200);
		set4.add(5);
		set4.add(0);
		set4.add(20);
		
		set5.add(200);
		set5.add(5);
		set5.add(20);
		set5.add(50);
		set5.add(0);
		
		System.out.println("Length of set1 is: " + String.valueOf(set1.length()));
		System.out.println("String value of set1 is: " + set1.toString());
		System.out.println("\n");
		
		System.out.println("Length of set2 is: " + String.valueOf(set2.length()));
		System.out.println("String value of set2 is: " + set2.toString());
		System.out.println("\n");
		
		System.out.println("Length of set3 is: " + String.valueOf(set3.length()));
		System.out.println("String value of set3 is: " + set3.toString());
		System.out.println("\n");
		
		System.out.println("Length of set4 is: " + String.valueOf(set4.length()));
		System.out.println("String value of set4 is: " + set4.toString());
		System.out.println("\n");
		
		System.out.println("Length of set5 is: " + String.valueOf(set5.length()));
		System.out.println("String value of set5 is: " + set5.toString());
		System.out.println("\n");
		
		// Test to remove from the set
		set1.remove(23);
		set1.remove(4);
		set1.remove(100);
		set1.remove(1);
		set1.remove(20);
		
		set2.remove(20);
		set2.remove(-21);
		set2.remove(7);
		
		System.out.println("Length of set1 is: " + String.valueOf(set1.length()));
		System.out.println("Value of set1 is: " + set1.toString());
		System.out.println("\n");
		
		System.out.println("Length of set2 is: " + String.valueOf(set2.length()));
		System.out.println("String value of set2 is: " + set2.toString());
		System.out.println("\n");
		
		// Test if set contains value
		boolean one = set1.contains(100);
		boolean two = set1.contains(2);
		boolean three = set2.contains(0);
		boolean four = set3.contains(200);
		boolean five = set3.contains(1);
		boolean six = set4.contains(1);
		
		System.out.println("Set1 contains " + String.valueOf(100) + ": " + one);
		System.out.println("Set1 contains " + String.valueOf(2) + ": " + two);
		System.out.println("Set2 contains " + String.valueOf(0) + ": " + three);
		System.out.println("Set3 contains " + String.valueOf(200) + ": " + four);
		System.out.println("Set3 contains " + String.valueOf(1) + ": " + five);
		System.out.println("Set5 contains " + String.valueOf(1) + ": " + six);
		System.out.println("\n");
		
		// Test if set is empty
		set1.isEmpty();
		
		set2.isEmpty();
		set2.clear();
		set2.isEmpty();
		set2.remove(4); 
		
		System.out.println("Length of set1 is: " + String.valueOf(set1.length()));
		System.out.println("Value of set1 is: " + set1.toString());
		System.out.println("\n");
		
		System.out.println("Length of set2 is: " + String.valueOf(set2.length()));
		System.out.println("String value of set2 is: " + set2.toString());
		System.out.println("\n");
		
		// Test for equality of sets		
		boolean a = set1.equals(set2);
		boolean b = set1.equals(set5);
		boolean c = set3.equals(set4);
		boolean d = set3.equals(set5);
		
		System.out.println("Set1 equals set2 " + ": " + a);
		System.out.println("Set1 equals set5 " + ": " + b);
		System.out.println("Set3 equals set4 " + ": " + c);
		System.out.println("Set3 equals set5 " + ": " + d);
		
		// Test for union of set1 and set2
		set1.union(set2);
		set1.union(set1);
		set2.union(set5);
		set5.union(set3);
		set3.union(set4);
		
		System.out.println("Length of set1 is: " + String.valueOf(set1.length()));
		System.out.println("Value of set1 is: " + set1.toString());
		System.out.println("\n");
		
		System.out.println("Length of set2 is: " + String.valueOf(set2.length()));
		System.out.println("Value of set2 is: " + set2.toString());
		System.out.println("\n");
		
		System.out.println("Length of set3 is: " + String.valueOf(set3.length()));
		System.out.println("Value of set3 is: " + set3.toString());
		System.out.println("\n");
		
		System.out.println("Length of set5 is: " + String.valueOf(set5.length()));
		System.out.println("Value of set5 is: " + set5.toString());
		System.out.println("\n");
		
		// Test for intersection of set1 and set2
		set1.intersect(set2);
		set1.intersect(set1);
		set2.intersect(set5);
		set3.intersect(set5);
		set3.intersect(set4);
		
		System.out.println("Length of set1 is: " + String.valueOf(set1.length()));
		System.out.println("Value of set1 is: " + set1.toString());
		System.out.println("\n");

		System.out.println("Length of set2 is: " + String.valueOf(set2.length()));
		System.out.println("Value of set2 is: " + set2.toString());
		System.out.println("\n");
		
		System.out.println("Length of set3 is: " + String.valueOf(set3.length()));
		System.out.println("Value of set3 is: " + set3.toString());
		System.out.println("\n");
		
		// Test for difference of set1 and set2
		set2.diff(set5);
		set1.diff(set2);
		set1.diff(set1);
		set3.diff(set4);		
		set4.diff(set5);
		
		System.out.println("Length of set1 is: " + String.valueOf(set1.length()));
		System.out.println("Value of set1 is: " + set1.toString());
		System.out.println("\n");

		System.out.println("Length of set2 is: " + String.valueOf(set2.length()));
		System.out.println("Value of set2 is: " + set2.toString());
		System.out.println("\n");
		
		System.out.println("Length of set3 is: " + String.valueOf(set3.length()));
		System.out.println("Value of set3 is: " + set3.toString());
		System.out.println("\n");
		
		System.out.println("Length of set4 is: " + String.valueOf(set4.length()));
		System.out.println("Value of set4 is: " + set4.toString());
		System.out.println("\n");
		
		// Test for smallest number in set
		int small1 = set1.smallest();
		int small2 = set2.smallest();
		int small3 = set4.smallest();
		int small4 = set5.smallest();
		
		System.out.println("Smallest value in set1 is: " + String.valueOf(small1));
		System.out.println("Smallest value in set2 is: " + String.valueOf(small2));
		System.out.println("Smallest value in set4 is: " + String.valueOf(small3));
		System.out.println("Smallest value in set5 is: " + String.valueOf(small4));
		System.out.println("\n");
		
		// Test for largest number in set
		int big1 = set1.largest();
		int big2 = set2.largest();
		int big3 = set4.largest();
		int big4 = set3.largest();
		
		System.out.println("Largest value in set1 is: " + String.valueOf(big1));
		System.out.println("Largest value in set2 is: " + String.valueOf(big2));
		System.out.println("Largest value in set4 is: " + String.valueOf(big3));
		System.out.println("Largest value in set3 is: " + String.valueOf(big4));

	}

}
