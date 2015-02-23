//Martin Törnqvist

/**
 * This class represents whole numbers.
 * @author dicander
 *
 */
public class Heltal {
    private long value;
    
    /**
     * Create an Integer with the specified value.
     * @param value
     */
    public Heltal(long value) {
	this.value = value;
    }
    /**
     * Create an Integer with default value 0.
     */
    public Heltal() {
	this(0);
    }
    
    /**
     * returns 
     */
    public String toString() {
	return ""+this.value;
    }
    
    /**
     * returns the value of this Heltal.
     * @return
     */
    public long getValue() {
	return this.value;
    }
    
    /**
     * Returns a new Heltal which is the sum of this and rhs.
     * @param rhs
     * @return
     */
    public Heltal add(Heltal rhs) {
	return new Heltal(this.value + rhs.value);
    }
    
    /**
     * Returns a new Heltal which is the difference of this and rhs.
     * @param rhs
     * @return
     */
    public Heltal sub(Heltal rhs) {
	return new Heltal(this.value - rhs.value);
    }
    
    /**
     * Returns a new Heltal which is the product of this and rhs.
     * @param rhs
     * @return
     */
    public Heltal mul(Heltal rhs) {
	return new Heltal(this.value * rhs.value);
    }
    
    /**
     * Returns a new Heltal which is the quotinent of this and rhs.
     * @param rhs
     * @return
     */
    public Heltal div(Heltal rhs) {
	return new Heltal(this.value / rhs.value);
    }

    // Nya metoder (av Martin Törnqvist)
    /**
     * Adderar ett Komplex till ett Heltal
     */
    public Komplex add(Komplex rhs){
	return rhs.add(new Komplex(this));
    }   
}
