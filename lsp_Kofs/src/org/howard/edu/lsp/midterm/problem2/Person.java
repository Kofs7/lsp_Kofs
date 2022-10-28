package org.howard.edu.lsp.midterm.problem2;

/**
 * Yoofi Williams
 * 
 * @author Yoofi
 *
 */

public class Person {

	private String name; 
	private int age; 
	private String socialSecurityNumber;
	
	/**
	 * Default constructor to create the Person object
	 * @param name a string representing the name of the person
	 * @param socialSecurityNumber, a string representing the person's social security number
	 * @param age integer representing the age of the person
	 */
	public Person(String name, String socialSecurityNumber, int age) {
		// initialize private variables
		this.name = name;
		this.age = age;
		this.socialSecurityNumber = socialSecurityNumber;
	}
	
	/**
	 * Returns a string representation of the person's name, age, and social security number
	 * @return a string representation of the person's name, age, and social security number
	 */
	public String toString() {
		// Returns a string representation of the person's name, age, and social security number
		String info = "";
		info += "Name: " + name  + "\nSocial Security Number: " + socialSecurityNumber + "\nAge: " + String.valueOf(age);
		return info;
	}
	
	/**
	 * Prints a message to verify if person1 and person2 have the same social security number
	 */
	public boolean equals(Person other) {
		// Returns true if person1 and person2 have the same social security number, otherwise false
		return this.socialSecurityNumber == other.socialSecurityNumber;
	}

}


