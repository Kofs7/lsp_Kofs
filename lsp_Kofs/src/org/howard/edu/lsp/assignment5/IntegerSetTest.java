package org.howard.edu.lsp.assignment5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Yoofi Williams
 * 
 * @author Yoofi
 *
 */

/**
 * Class to test the methods of the IntegerSet class
 */
public class IntegerSetTest {
	
	/**
	 * Test to check the clear() method functionality
	 * The clear() method clears the set
	 */
	@Test
	@DisplayName("Test case for clear")
	public void testClear() {
		IntegerSet set = new IntegerSet();
		assertEquals(0, set.length());
		assertTrue(set.isEmpty());
		set.add(0);
		assertEquals(1, set.length());
		assertFalse(set.isEmpty());
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		assertEquals(5, set.length());
		assertFalse(set.isEmpty());
		set.clear();
		assertTrue(set.isEmpty());
		set.add(2);
		set.add(10);
		set.add(10);
		set.add(10);
		set.clear();
		assertTrue(set.isEmpty());
		set.add(500);
		set.add(167);
		set.add(23);
		set.clear();
		assertTrue(set.isEmpty());
	}
	
	/**
	 * Test to check the length() method functionality
	 * The length() method returns the length of the set
	 */
	@Test
	@DisplayName("Test case for length")
	public void testLength() {
		IntegerSet set = new IntegerSet();
		assertEquals(0, set.length());
		set.add(0);
		assertEquals(1, set.length());
		set.add(1);
		assertEquals(2, set.length());
		set.add(2);
		set.add(3);
		set.add(4);
		assertEquals(5, set.length());
		set.add(2);
		assertEquals(5, set.length());
		set.add(10);
		set.add(10);
		assertEquals(6, set.length());
		set.add(500);
		set.add(167);
		set.add(11);
		set.add(23);
		assertEquals(10, set.length());
		set.remove(23);
		assertEquals(9, set.length());
		set.remove(2);
		set.remove(2);
		assertEquals(8, set.length());
		set.add(2);
		set.add(167);
		assertEquals(9, set.length());
	}
	
	/**
	 * Test to check the equals() method functionality
	 * The equals() method returns a boolean if set1 and set2 have the same elements in any order
	 */
	@Test
	@DisplayName("Test case for equals")
	public void testEquals() {
		IntegerSet set1 = new IntegerSet();
		IntegerSet set2 = new IntegerSet();
		assertTrue(set1.equals(set2));
		assertTrue(set2.equals(set1));
		set1.add(0);
		assertFalse(set1.equals(set2));
		set1.add(1);
		set2.add(2);
		set1.add(3);
		set1.add(4);
		assertFalse(set1.equals(set2));
		set1.remove(3);
		assertFalse(set2.equals(set1));
		set1.remove(19);
		set2.remove(3);
		assertFalse(set2.equals(set1));
		set2.add(0);
		set1.add(2);
		set2.add(4);
		set2.add(1);
		set2.add(3);
		assertFalse(set2.equals(set1));
		set1.remove(1);
		set2.remove(2);
		assertFalse(set2.equals(set1));
		set1.remove(0);
		set1.remove(-2);
		assertFalse(set2.equals(set1));
		set2.remove(4);
		set2.remove(0);
		assertFalse(set2.equals(set1));
		assertFalse(set1.equals(set2));
		set1.remove(3);
		set2.remove(3);
		set1.remove(4);
		set2.remove(1);
		assertFalse(set1.equals(set2));
		set2.add(2);
		assertTrue(set2.equals(set1));
		set1.add(2);
		assertTrue(set1.equals(set2));
		set1.add(10);
		set2.add(10);
		assertTrue(set2.equals(set1));
		set2.add(10);
		assertTrue(set2.equals(set1));
		set2.add(500);
		set1.add(167);
		assertFalse(set2.equals(set1));
		set1.remove(11);
		set2.remove(11);
		set1.remove(10);
		set2.remove(10);
		assertFalse(set2.equals(set1));
		set1.add(23);
		assertFalse(set2.equals(set1));
	}
	
	/**
	 * Test to check the contains() method functionality
	 * The contains() method returns a boolean if an element is in the set or not
	 */
	@Test
	@DisplayName("Test case for contains")
	public void testContains() {
		IntegerSet set = new IntegerSet();
		assertFalse(set.contains(0));
		set.add(0);
		assertTrue(set.contains(0));
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		assertFalse(set.contains(5));
		assertTrue(set.contains(1));
		assertTrue(set.contains(3));
		set.remove(3);
		assertFalse(set.contains(3));
		set.remove(19);
		assertFalse(set.contains(19));
		set.remove(3);
		assertFalse(set.contains(3));
		set.remove(1);
		set.remove(2);
		assertFalse(set.contains(2));
		set.remove(0);
		set.remove(-2);
		assertFalse(set.contains(-2));
		set.remove(4);
		set.remove(0);
		assertFalse(set.contains(1));
		assertFalse(set.contains(3));
		set.add(2);
		assertTrue(set.contains(2));
		set.add(10);
		set.add(10);
		set.add(10);
		assertTrue(set.contains(10));
		set.add(500);
		set.add(167);
		assertTrue(set.contains(500));
		set.remove(11);
		assertFalse(set.contains(11));
		set.remove(11);
		set.remove(10);
		set.remove(10);
		assertFalse(set.contains(10));
		set.add(23);
		assertTrue(set.contains(23));
		set.remove(23);
		assertFalse(set.contains(23));
		set.remove(2);
		set.remove(2);
		assertFalse(set.contains(2));
	}
	
	/**
	 * Test to check the largest() method functionality
	 * The largest() method returns an the largest integer in the set 
	 * @throws IntegerSetException if set is empty
	 */
	@Test
	@DisplayName("Test case for largest")
	public void testLargest() throws IntegerSetException {
		IntegerSet set = new IntegerSet();
		assertThrows(IntegerSetException.class, () -> set.largest()); // error message
		set.add(0);
		assertEquals(0, set.largest());
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		assertEquals(4, set.largest());
		set.remove(0);
		assertEquals(4, set.largest());
		set.remove(19);
		set.remove(3);
		assertEquals(4, set.largest());
		set.remove(4);
		set.remove(2);
		assertEquals(1, set.largest());
		set.remove(0);
		set.remove(-2);
		set.remove(1);
		assertThrows(IntegerSetException.class, () -> set.largest()); // error message
		set.remove(3);
		set.remove(1);
		set.add(1);
		assertEquals(1, set.largest());
		assertEquals(1, set.largest());
		set.add(2);
		assertEquals(2, set.largest());
		set.add(10);
		set.add(-10);
		set.add(10);
		assertEquals(10, set.largest());
		set.add(-500);
		set.add(167);
		assertEquals(167, set.largest());
		set.remove(11);
		assertEquals(167, set.largest());
		set.remove(167);
		set.remove(10);
		set.add(-1);
		set.add(0);
		assertEquals(2, set.largest());
		set.add(23);
		assertEquals(23, set.largest());
		set.remove(23);
		assertEquals(2, set.largest());
		set.remove(2);
		set.remove(2);
		assertEquals(1, set.largest());
	}
	
	/**
	 * Test to check the smallest() method functionality
	 * The smallest() method returns an the smallest integer in the set 
	 * @throws IntegerSetException if set is empty
	 */
	@Test
	@DisplayName("Test case for smallest")
	public void testSmallest() throws IntegerSetException {
		IntegerSet set = new IntegerSet();
		assertThrows(IntegerSetException.class, () -> set.smallest()); // error message
		set.add(0);
		assertEquals(0, set.smallest());
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		assertEquals(0, set.smallest());
		set.remove(0);
		assertEquals(1, set.smallest());
		set.remove(19);
		set.remove(3);
		assertEquals(1, set.smallest());
		set.remove(1);
		set.remove(2);
		assertEquals(4, set.smallest());
		set.remove(0);
		set.remove(-2);
		assertEquals(4, set.smallest());
		set.remove(4);
		set.remove(0);
		assertThrows(IntegerSetException.class, () -> set.smallest()); // error message
		assertThrows(IntegerSetException.class, () -> set.smallest()); // error message
		set.add(2);
		assertEquals(2, set.smallest());
		set.add(10);
		set.add(-10);
		set.add(10);
		assertEquals(-10, set.smallest());
		set.add(-500);
		set.add(167);
		assertEquals(-500, set.smallest());
		set.remove(11);
		assertEquals(-500, set.smallest());
		set.remove(-500);
		set.remove(10);
		set.add(-1);
		set.add(0);
		assertEquals(-10, set.smallest());
		set.add(23);
		assertEquals(-10, set.smallest());
		set.remove(-1);
		set.remove(-10);
		assertEquals(0, set.smallest());
		set.remove(2);
		set.remove(2);
		assertEquals(0, set.smallest());
	}
	
	/**
	 * Test to check the add() method functionality
	 * The add() method adds an element to the set
	 */
	@Test
	@DisplayName("Test case for add")
	public void testAdd() {
		IntegerSet set = new IntegerSet();
		set.add(2);
		set.add(10);
		set.add(10);
		set.add(500);
		set.add(167);
		set.add(11);
		set.add(23);
		set.add(-21);
		assertEquals(-21, set.getValue(set.length()-1));
		set.add(20);
		set.add(200);
		set.add(3);
		assertEquals(3, set.getValue(set.length()-1));
		set.add(0);
		set.add(-10);
		set.add(50);
		set.add(200);
		set.add(5);
		set.add(0);
		set.add(20);
		
		assertEquals(2, set.getValue(0));
		assertEquals(10, set.getValue(1));
		assertEquals(20, set.getValue(7));
		assertEquals(5, set.getValue(13));
		assertEquals(5, set.getValue(set.length()-1));
		assertEquals(23, set.getValue(5));
		assertEquals(50, set.getValue(12));
	}
	
	/**
	 * Test to check the remove() method functionality
	 * The remove() method removes an element from the set
	 */
	@Test
	@DisplayName("Test case for remove")
	public void testRemove() {
		IntegerSet set = new IntegerSet();
		assertEquals(0, set.length());
		set.add(0);
		assertEquals(1, set.length());
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		assertEquals(5, set.length());
		set.remove(3);
		assertEquals(4, set.length());
		set.remove(19);
		set.remove(3);
		assertEquals(4, set.length());
		set.remove(1);
		set.remove(2);
		assertEquals(2, set.length());
		set.remove(0);
		set.remove(-2);
		assertEquals(1, set.length());
		set.remove(4);
		set.remove(0);
		assertEquals(0, set.length());
		assertEquals(0, set.length());
		set.add(2);
		assertEquals(1, set.length());
		set.add(10);
		set.add(10);
		set.add(10);
		assertEquals(2, set.length());
		set.add(500);
		set.add(167);
		assertEquals(4, set.length());
		set.remove(11);
		assertEquals(4, set.length());
		set.remove(11);
		set.remove(10);
		set.remove(10);
		assertEquals(3, set.length());
		set.add(23);
		assertEquals(4, set.length());
		set.remove(23);
		assertEquals(3, set.length());
		set.remove(2);
		set.remove(2);
		assertEquals(2, set.length());
	}
	
	/**
	 * Test to check the union() method functionality
	 * The union() method adds the element in set2 to set1 if they are not in set1
	 */
	@Test
	@DisplayName("Test case for union")
	public void testUnion() {
		IntegerSet set1 = new IntegerSet();
		IntegerSet set2 = new IntegerSet();
		set1.union(set2);
		assertTrue(set1.toString().equals("[]"));
		set2.union(set1);
		assertTrue(set2.toString().equals("[]"));
		set1.add(0);
		set1.union(set2);
		assertTrue(set1.toString().equals("[0]"));
		set1.add(1);
		set2.add(2);
		set1.add(3);
		set1.add(4);
		set2.union(set1);
		assertTrue(set2.toString().equals("[2, 0, 1, 3, 4]"));
		set1.union(set2);
		assertTrue(set1.toString().equals("[0, 1, 3, 4, 2]"));
		set1.remove(3);
		set1.union(set2);
		assertTrue(set1.toString().equals("[0, 1, 4, 2, 3]"));
		set1.remove(19);
		set2.remove(3);
		set1.union(set2);
		assertTrue(set1.toString().equals("[0, 1, 4, 2, 3]"));
		set2.add(50);
		set1.add(11);
		set2.add(4);
		set2.add(11);
		set2.add(3);
		set2.union(set1);
		assertTrue(set2.toString().equals("[2, 0, 1, 4, 50, 11, 3]"));
		set1.remove(1);
		set2.remove(2);
		set1.remove(0);
		set1.remove(-2);
		set2.add(104);
		set2.add(-10);
		set1.union(set2);
		assertTrue(set1.toString().equals("[4, 2, 3, 11, 0, 1, 50, 104, -10]"));
		set2.add(2);
		set1.add(10);
		set2.union(set1);
		assertTrue(set2.toString().equals("[0, 1, 4, 50, 11, 3, 104, -10, 2, 10]"));
		set2.union(set2);
		assertTrue(set2.toString().equals("[0, 1, 4, 50, 11, 3, 104, -10, 2, 10]"));
		set1.clear();
		set2.union(set1);
		assertTrue(set2.toString().equals("[0, 1, 4, 50, 11, 3, 104, -10, 2, 10]"));
		set1.union(set2);
		assertTrue(set1.toString().equals("[0, 1, 4, 50, 11, 3, 104, -10, 2, 10]"));
	}
	
	/**
	 * Test to check the intersect() method functionality
	 * The intersect() method puts the elements that exist in both set1 and set2 into set1
	 */
	@Test
	@DisplayName("Test case for intersect")
	public void testIntersect() {
		IntegerSet set1 = new IntegerSet();
		IntegerSet set2 = new IntegerSet();
		set1.intersect(set2);
		assertTrue(set1.toString().equals("[]"));
		set2.intersect(set1);
		assertTrue(set2.toString().equals("[]"));
		set1.add(0);
		set1.intersect(set2);
		assertTrue(set1.toString().equals("[]"));
		set1.add(1);
		set2.add(2);
		set1.add(3);
		set1.add(4);
		set2.intersect(set1);
		assertTrue(set2.toString().equals("[]"));
		set1.intersect(set2);
		assertTrue(set1.toString().equals("[]"));
		set1.remove(3);
		set1.intersect(set2);
		assertTrue(set1.toString().equals("[]"));
		set1.remove(19);
		set2.remove(3);
		set1.intersect(set2);
		assertTrue(set1.toString().equals("[]"));
		set1.add(1);
		set2.add(2);
		set1.add(3);
		set2.add(1);
		set1.add(2);
		set2.add(3);
		set1.add(4);
		set2.add(4);
		set2.intersect(set1);
		assertTrue(set2.toString().equals("[2, 1, 3, 4]"));
		set2.add(50);
		set1.add(11);
		set2.add(4);
		set2.add(11);
		set2.add(3);
		set1.remove(4);
		set1.remove(2);
		set1.intersect(set2);
		assertTrue(set1.toString().equals("[1, 3, 11]"));
		set1.remove(1);
		set2.remove(2);
		set1.remove(0);
		set1.remove(-2);
		set2.add(104);
		set2.add(-10);
		set2.intersect(set1);
		assertTrue(set2.toString().equals("[3, 11]"));
		set2.add(2);
		set1.add(10);
		set1.clear();
		set2.intersect(set1);
		assertTrue(set2.toString().equals("[]"));
	}
	
	/**
	 * Test to check the diff() method functionality
	 * The diff() method removes the elements common to both set1 and set2 from set1
	 */
	@Test
	@DisplayName("Test case for difference")
	public void testDiff() {
		IntegerSet set1 = new IntegerSet();
		IntegerSet set2 = new IntegerSet();
		set1.diff(set2);
		assertTrue(set1.toString().equals("[]"));
		set2.diff(set1);
		assertTrue(set2.toString().equals("[]"));
		set1.add(0);
		set1.diff(set2);
		assertTrue(set1.toString().equals("[0]"));
		set1.add(1);
		set2.add(2);
		set1.add(3);
		set1.add(4);
		set2.diff(set1);
		assertTrue(set2.toString().equals("[2]"));
		set1.diff(set2);
		assertTrue(set1.toString().equals("[0, 1, 3, 4]"));
		set1.remove(3);
		set1.diff(set2);
		assertTrue(set1.toString().equals("[0, 1, 4]"));
		set1.remove(19);
		set2.remove(3);
		set1.diff(set2);
		assertTrue(set1.toString().equals("[0, 1, 4]"));
		set1.add(10);
		set2.add(-2);
		set1.add(13);
		set1.add(111);
		set1.add(22);
		set2.add(37);
		set1.add(4);
		set2.add(4);
		set2.diff(set1);
		assertTrue(set2.toString().equals("[2, -2, 37]"));
		set2.add(50);
		set1.add(11);
		set2.add(4);
		set2.add(11);
		set2.add(3);
		set1.remove(4);
		set1.remove(2);
		set1.diff(set2);
		assertTrue(set1.toString().equals("[0, 1, 10, 13, 111, 22]"));
		set1.remove(1);
		set2.remove(2);
		set1.remove(0);
		set1.remove(-2);
		set2.add(104);
		set2.add(-10);
		set2.diff(set1);
		assertTrue(set2.toString().equals("[-2, 37, 50, 4, 11, 3, 104, -10]"));
		set2.add(2);
		set1.add(-10);
		set1.add(104);
		set2.diff(set1);
		assertTrue(set2.toString().equals("[-2, 37, 50, 4, 11, 3, 2]"));
	}
	
	/**
	 * Test to check the isEmpty() method functionality
	 * The isEmpty() method returns a boolean if set1 is empty or not
	 */
	@Test
	@DisplayName("Test case for isEmpty")
	public void testIsEmpty() {
		IntegerSet set = new IntegerSet();
		assertTrue(set.isEmpty());
		set.add(-21);
		assertFalse(set.isEmpty());
		set.add(200);
		set.add(3);
		assertFalse(set.isEmpty());
		set.remove(0);
		assertFalse(set.isEmpty());
		set.remove(-21);
		set.remove(3);
		set.remove(200);
		assertTrue(set.isEmpty());
		set.remove(0);
		assertTrue(set.isEmpty());
		set.add(5);
		set.add(0);
		set.add(20);
		assertFalse(set.isEmpty());
	}
	
	/**
	 * Test to check the toString() method functionality
	 * The toString() method returns a string representation of the set
	 */
	@Test
	@DisplayName("Test case for toString")
	public void testToString() {
		IntegerSet set = new IntegerSet();
		assertTrue(set.toString().equals("[]"));
		set.add(0);
		assertTrue(set.toString().equals("[0]"));
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		assertTrue(set.toString().equals("[0, 1, 2, 3, 4]"));
		set.remove(3);
		assertTrue(set.toString().equals("[0, 1, 2, 4]"));
		set.remove(19);
		set.remove(3);
		assertTrue(set.toString().equals("[0, 1, 2, 4]"));
		set.remove(1);
		set.remove(2);
		assertTrue(set.toString().equals("[0, 4]"));
		set.remove(0);
		set.remove(-2);
		assertTrue(set.toString().equals("[4]"));
		set.remove(4);
		set.remove(0);
		assertTrue(set.toString().equals("[]"));
		assertTrue(set.toString().equals("[]"));
		set.add(2);
		assertTrue(set.toString().equals("[2]"));
		set.add(10);
		set.add(10);
		set.add(10);
		assertTrue(set.toString().equals("[2, 10]"));
		set.add(500);
		set.add(167);
		assertTrue(set.toString().equals("[2, 10, 500, 167]"));
		set.remove(11);
		assertTrue(set.toString().equals("[2, 10, 500, 167]"));
		set.remove(11);
		set.remove(10);
		set.remove(10);
		assertTrue(set.toString().equals("[2, 500, 167]"));
		set.add(23);
		assertTrue(set.toString().equals("[2, 500, 167, 23]"));
		set.remove(23);
		assertTrue(set.toString().equals("[2, 500, 167]"));
		set.remove(2);
		set.remove(2);
		assertTrue(set.toString().equals("[500, 167]"));
	}

}
