package org.howard.edu.lsp.midterm.problem1;

/**
 * Yoofi Williams
 * 
 * @author Yoofi
 *
 */

import java.util.HashMap;

/**
 * A class representing a simplified voting machine.
 *
 */
public class VotingMachine {
	
	private HashMap<String, Integer> voters = new HashMap<String, Integer> ();
	
	/**
	 * Default Constructor.
	 * Creates a VotingMachine object.
	 */
	public VotingMachine() {
		voters = new HashMap<String, Integer> ();		
	}
	
	/**
	 * Add a candidate to the list, initialize number of votes to 0.
	 * @param name a String representing the name of the candidate.
	 */
	public void addCandidate(String name) {
		// Add a candidate to the list, initialize number of votes to 0.
		voters.put(name.toLowerCase(), 0);
	} 
	
	/**
	 * Cast votes to the candidate with the given name.
	 * @param name a String representing the name of the candidate.
	 * @param votes an integer representing the number of votes.
	 * @throws UnknownCandidateException if candidate name not present.
	 */
	public void castVotes(String name, int votes) throws UnknownCandidateException {
		// Cast votes to the candidate with the given name. Throws
		// UnknownCandidateException if name not present.
		if (voters.get(name.toLowerCase())== null) {
			throw new UnknownCandidateException ("Voter name not in system!");
		}
		voters.merge(name.toLowerCase(), votes, Integer::sum);
	}
	
	/**
	 * Return the number of votes for a given candidate.
	 * @param name a String representing the name of the candidate.
	 * @throws UnknownCandidateException if candidate name not present.
	 * @return number of votes a candidate has.
	 */
	public int getVotes(String name)  throws UnknownCandidateException {
		// Return the number of votes for a given candidate.  Throws
		// UnknownCandidateException if name not present.  Make this a 
		// checked exception.
		if (voters.get(name.toLowerCase()) == null) {
			throw new UnknownCandidateException ("Voter name not in system!");
		}
		else {
			return voters.get(name.toLowerCase());
		}
	}
	
	/**
	 * Return the total number of votes for all candidates.
	 * @return total number of votes.
	 */
	public int sum() {
		// Return the total number of votes for all candidates.	
		int sum = 0;
		for (int vote : voters.values()) {
		    sum += vote;
		}
		return sum;
	}

	/**
	 * Return true if candidate is present in list, otherwise false. 
	 * @param name a string representing the name of the candidate.
	 * @return true is candidate is in list, otherwise false.
	 */
	public boolean present(String name) {
		// Return true if candidate is present in list, otherwise false. 
		return voters.containsKey(name.toLowerCase());
	}

}
