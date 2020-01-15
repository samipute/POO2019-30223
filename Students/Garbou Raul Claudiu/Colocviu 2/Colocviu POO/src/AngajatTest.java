import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.junit.jupiter.api.Test;

class AngajatTest {
	
	@SuppressWarnings("deprecation")
	Angajat testAngajat = new Angajat("Guta Mirel", new Date(2019, 5, 22) , new Long(5), new Double(0.4), new Long(5));
	@Test
	void testNume() {
		assertEquals(testAngajat.getNume(), "Guta Mirel");
	}
	
	@Test
	void testDataAngajarii(){
		assertEquals(testAngajat.getDataAngajarii(), new Date(2019,5,22));
	}
	@Test
	void testBonusSalariu(){
		assertEquals(testAngajat.getBonusSalariu(), new Double(6.2));
	}

}