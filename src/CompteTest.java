import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CompteTest {

	@Test
	void testDeposer() {
		// Vouvele compte
		Compte c = new Compte(100, "Gabana", 5);
		// deposer 25$
		c.Deposer(25);
			
		//assert true si 25+5 = 30
		assertTrue(c.GetSolde()== 30);
	}

	@Test
	void testRetirer() {
		// Vouvele compte
		Compte c = new Compte(100, "Nike", 20);
		
		// Retirer 5$
		c.Retirer(5);
			
		//assert true si 20-5 = 15
		assertTrue(c.GetSolde()== 15);
	}
}
