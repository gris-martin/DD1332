import static org.junit.Assert.*;

import org.junit.Test;

public class KomplexTest {

    //Testar conj() för positiv imaginärdel genom att konjugera (1 + 2i)
    @Test
    public void testPosConjugate() {
	Komplex k1 = new Komplex(1,2);
	Komplex k2 = new Komplex(1,-2);
	assertEquals(k1.conj().toString(), k2.toString());
    }

    //Testar conj() för negativ imaginärdel genom att konjugera (1 - 2i)
    @Test
    public void testNegConjugate() {
	Komplex k1 = new Komplex(1,-2);
	Komplex k2 = new Komplex(1,2);
	assertEquals(k1.conj().toString(), k2.toString());
    }

    //Testar conj() för enbart realdel genom att konjugera (1 + 0i)
    @Test
    public void testZeroConjugate() {
	Komplex k1 = new Komplex(1,0);
	assertEquals(k1.conj().toString(), k1.toString());
    }


    
    //Testar add(Heltal) för Komplex genom att addera 1 till (1 + 2i)
    @Test
    public void testAddPosHeltal() {
	Komplex k1 = new Komplex(1,2);
	Heltal h1 = new Heltal(1);
	Komplex k2 = new Komplex (2,2);
	assertEquals(k1.add(h1).toString(), k2.toString());
    }

    //Testar add(Heltal) för Komplex genom att addera -1 till (-1 + 2i)
    @Test
    public void testAddNegHeltal() {
	Komplex k1 = new Komplex(-1,2);
	Heltal h1 = new Heltal(-1);
	Komplex k2 = new Komplex (-2,2);
	assertEquals(k1.add(h1).toString(), k2.toString());
    }
    


    //Testar add(Komplex) för Heltal genom att addera (1 + 2i) till 1
    @Test
    public void testAddPosKomplex() {
	Heltal h1 = new Heltal(1);
	Komplex k1 = new Komplex(1,2);
	Komplex k2 = new Komplex (2,2);
	assertEquals(h1.add(k1).toString(), k2.toString());
    }

    //Testar add(Komplex) för Heltal genom att addera (-1 + 2i) till -1
    @Test
    public void testAddNegKomplex() {
	Heltal h1 = new Heltal(-1);
	Komplex k1 = new Komplex(-1,2);
	Komplex k2 = new Komplex (-2,2);
	assertEquals(h1.add(k1).toString(), k2.toString());
    }
}
