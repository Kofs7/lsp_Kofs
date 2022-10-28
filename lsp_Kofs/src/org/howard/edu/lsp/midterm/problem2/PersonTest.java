package org.howard.edu.lsp.midterm.problem2;

/**
 * Yoofi Williams
 * 
 * @author Yoofi
 *
 */

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PersonTest {
	
	/**
	 * Test to check the toString() method functionality.
	 * The toString() method returns a string representation of the person's information.
	 */
	@Test
	@DisplayName("Test case for toString")
	void testToString() {
		Person per1 = new Person ("kofi gyan", "123-456-789", 20);
		Person per2 = new Person ("Tunde Nge", "123-416-739", 25);
		Person per3 = new Person ("cyllas ching", "123-416-739", 30);
		Person per4 = new Person ("kofi gyan", "123-456-789", 50);
		Person per5 = new Person ("kofi gyan", "123-456-799", 20);
		
		assertEquals("Name: kofi gyan\nSocial Security Number: 123-456-789\nAge: 20", per1.toString());
		assertEquals("Name: Tunde Nge\nSocial Security Number: 123-416-739\nAge: 25", per2.toString());
		assertEquals("Name: cyllas ching\nSocial Security Number: 123-416-739\nAge: 30", per3.toString());
		assertEquals("Name: kofi gyan\nSocial Security Number: 123-456-799\nAge: 20", per5.toString());
		assertEquals("Name: kofi gyan\nSocial Security Number: 123-456-789\nAge: 50", per4.toString());
	}
	
	/**
	 * Test to check the equalsPerson() method functionality.
	 * The equalsPerson() method returns a boolean if person1 and person2 have the same social security number.
	 */
	@Test
	@DisplayName("Test case for equalsPerson")
	void testEqualsPerson() {
		Person per1 = new Person ("kofi gyan", "123-456-789", 20);
		Person per2 = new Person ("Tunde Nge", "123-416-739", 25);
		Person per3 = new Person ("cyllas ching", "123-416-739", 50);
		Person per4 = new Person ("kofi gyan", "123-456-789", 50);
		Person per5 = new Person ("kofi gyan", "123-456-799", 20);
		
		assertFalse(per1.equals(per5));
		assertTrue(per1.equals(per4));
		assertFalse(per1.equals(per2));
		assertTrue(per1.equals(per1));
		assertTrue(per3.equals(per2));
		assertFalse(per4.equals(per3));
	}

}
