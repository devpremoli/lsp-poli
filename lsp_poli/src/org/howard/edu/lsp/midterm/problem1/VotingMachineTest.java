package org.howard.edu.lsp.midterm.problem1;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class VotingMachineTest {

	// testing getVotes
	@Test
	@DisplayName("Test cases for getVotes")
	public void testgetVotes() throws VotingMachineException{
		VotingMachine machine = new VotingMachine(); 

		machine.addCandidate("Prem");
		machine.addCandidate("Raj");
		machine.addCandidate("Oli");
		
		machine.castVotes("Prem", 10);
		machine.castVotes("Raj", 20);
		machine.castVotes("Oli", 30);
		
		
		assertEquals("error found in getVotes()", 10, machine.getVotes("Prem"));
		assertNotEquals("error found in getVotes()", 100, machine.getVotes("Prem"));
    
		assertNotEquals("error found in getVotes()", 200, machine.getVotes("Raj"));
		assertEquals("error found in getVotes()", 20, machine.getVotes("Raj"));
    
		assertEquals("error found in getVotes()", 30, machine.getVotes("Oli"));
		assertNotEquals("error found in getVotes()", 300, machine.getVotes("Raj"));
	}

	
	// Testing Sum
	@Test
	@DisplayName("Testcases for Sum")
	public void testSum() {
		VotingMachine vm1 = new VotingMachine();
		// adding candidates
		vm1.addCandidate("Nick");
		vm1.addCandidate("Ram");
		vm1.castVotes("Nick", 10);
		vm1.castVotes("Ram", 20);
		
		assertNotEquals("error found in sum()", 100, vm1.sum());
		assertEquals("error found in sum()", 90, vm1.sum());
	}

	@Test
	@DisplayName("testgetVotes Exception")
	public void testgetVotes_THROWS_EXCEPTION() {
		VotingMachine vm2 = new VotingMachine();
		Exception exception = assertThrows(VotingMachineException.class, ()->{
			vm2.getVotes("Unknown");
		});
		String expectedMessage = "This is not a candidate!";
		String actualMessage = exception.getMessage();
		assertTrue(actualMessage.contains(expectedMessage));
	}
}
