import static org.junit.Assert.*;

import org.junit.Test;

public class KomplexTest {

    //Tests the Conjugate method by conjugating (1 + 2i)
    @Test
    public void testConjugate() {
	Komplex k1 = new Komplex(1,2);
	Komplex k2 = new Komplex(1,-2);
	assertEquals(k1.conj().toString(), k2.toString());
    }

    //Tests the AddHeltal method by adding 1 to (1 + 2i)
    @Test
    public void testAddHeltal() {
	Komplex k1 = new Komplex(1,2);
	Heltal h1 = new Heltal(1);
	Komplex k2 = new Komplex (2,2);
	assertEquals(k1.addHeltal(h1).toString(), k2.toString());
    }

    //Tests the testAddKomplex method by adding (1 + 2i) to 1
    @Test
    public void testAddKomplex() {
	Heltal h1 = new Heltal(1);
	Komplex k1 = new Komplex(1,2);
	Komplex k2 = new Komplex (2,2);
	assertEquals(h1.addKomplex(k1).toString(), k2.toString());
    }
}
