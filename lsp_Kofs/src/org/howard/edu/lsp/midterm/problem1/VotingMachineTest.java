package org.howard.edu.lsp.midterm.problem1;

/**
 * Yoofi Williams
 * 
 * @author Yoofi
 *
 */

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class VotingMachineTest {
	
	/**
	 * Test to check the getVotes() method functionality.
	 * The getVotes() method returns the number of votes a candidate has.
	 */
	@Test
	@DisplayName("Test case for getVotes")
	void testGetVotes() throws UnknownCandidateException {
		VotingMachine voters = new VotingMachine ();
		voters.addCandidate("Mark");
		voters.addCandidate("Tunde");
		voters.addCandidate("Ama");
		voters.addCandidate("Kofi");
		voters.addCandidate("Kofi");
		voters.addCandidate("Trey");
		voters.addCandidate("Xoli");
		voters.addCandidate("Mark");
		voters.addCandidate("Owethu");
		voters.addCandidate("Ndlathu");
		voters.addCandidate("mark");
		voters.addCandidate("Xoli Mfeka");
		
		assertEquals(0, voters.getVotes("mark"));
		assertEquals(0, voters.getVotes("Tunde"));
		voters.castVotes("Tunde", 0);
		assertEquals(0, voters.getVotes("Tunde"));
		assertThrows(UnknownCandidateException.class, () -> voters.getVotes("jack"));
		voters.castVotes("Mark", 1);
		voters.castVotes("Tunde", 20);
		voters.castVotes("Ama", 5);
		assertThrows(UnknownCandidateException.class, () -> voters.getVotes("ama ama"));
		assertEquals(1, voters.getVotes("mark"));
		voters.castVotes("Kofi", 100);
		voters.castVotes("Xoli mfeka", 30);
		assertEquals(100, voters.getVotes("Kofi"));
		voters.castVotes("Kofi", 30);
		voters.castVotes("Trey", 0);
		assertEquals(0, voters.getVotes("Trey"));
		voters.castVotes("Trey", 50);
		assertEquals(50, voters.getVotes("Trey"));
		assertEquals(130, voters.getVotes("Kofi"));
		assertEquals(30, voters.getVotes("xoli MfEka"));
		assertThrows(UnknownCandidateException.class, () -> voters.getVotes("jim"));
		voters.castVotes("Mark", 4);
		voters.castVotes("Owethu", 10);
		assertEquals(10, voters.getVotes("Owethu"));
		assertEquals(0, voters.getVotes("Xoli"));
		voters.castVotes("Ndlathu", 31);
		assertEquals(31, voters.getVotes("Ndlathu"));
		assertThrows(UnknownCandidateException.class, () -> voters.getVotes("tony"));
	}
	
	/**
	 * Test to check the sum() method functionality.
	 * The sum() method returns the sum of all votes in the list.
	 */
	@Test
	@DisplayName("Test case for sum")
	void testSum() throws UnknownCandidateException {
		VotingMachine voters = new VotingMachine ();
		voters.addCandidate("Mark");
		voters.addCandidate("Tunde");
		voters.addCandidate("Ama");
		voters.addCandidate("Kofi");
		voters.addCandidate("Kofi");
		voters.addCandidate("Trey");
		voters.addCandidate("Xoli");
		voters.addCandidate("Mark");
		voters.addCandidate("Xoli Mfeka");
		voters.addCandidate("Owethu");
		voters.addCandidate("Ndlathu");
		voters.addCandidate("mark");
		
		assertEquals(0, voters.sum());
		voters.castVotes("Mark", 0);
		voters.castVotes("Xoli", 0);
		voters.castVotes("ndlathu", 0);
		assertEquals(0, voters.sum());
		voters.castVotes("Tunde", 320);
		assertEquals(320, voters.sum());
		voters.castVotes("Ama", 15);
		assertEquals(335, voters.sum());
		voters.castVotes("Kofi", 100);
		voters.castVotes("Kofi", 30);
		voters.castVotes("Trey", 0);
		voters.castVotes("XOLI MFEKA", 200);
		assertEquals(665, voters.sum());
		assertEquals(665, voters.sum());
		voters.castVotes("Xoli", 200);
		voters.castVotes("Mark", 4);
		voters.castVotes("Owethu", 9);
		assertEquals(878, voters.sum());
		assertThrows(UnknownCandidateException.class, () -> voters.castVotes("jojo", 1000));
		assertEquals(878, voters.sum()); 
		voters.castVotes("Ndlathu", 1);
		assertEquals(879, voters.sum());
		assertThrows(UnknownCandidateException.class, () -> voters.castVotes("tony", 999999));
		assertEquals(879, voters.sum());
	}

}
