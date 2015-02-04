 public class Komplex {
     private double re;
     private double im;

n   
     /**
      * Create a new Komplex object.
      * @param re The real part of the number
      * @param im The imaginary part of the number
      */
     public Komplex(double re, double im){
	 this.re = re;
	 this.im = im;
     }

     /**
      * Create an object with the specified real part
      * @param re
      */
     public Komplex(double re) {
	 this(re, 0.0);
     }

     /**
      * Creates a default Komplex with re = 0 im = 0.
      */
     public Komplex() {
	 this(0.0);
     }

     /**
      * create a Komplex object from a Heltal.
      * @param a
      */
     public Komplex(Heltal a) {
	 this((double)a.getValue());
     }

     /**
      * 
      */
     public String toString() {
	 return "" + this.re + (this.im>=0?" + ":" - ") + Math.abs(this.im) + "i";
     }

     /**
      * Returns a new Komplex which is the sum of 2 Komplex.
      * @param rhs
      * @return
      */
     public Komplex add(Komplex rhs) {
	 return new Komplex(this.re+rhs.re, this.im+rhs.im);

     }

     /**
      * Returns the difference between 2 Komplex.
      * @param rhs
      * @return
      */
     public Komplex sub(Komplex rhs) {
	 return new Komplex(this.re-rhs.re, this.im-rhs.im);

     }

     /**
      * Multiplies two Komplex numbers.
      * @param rhs
      * @return
      */
     public Komplex mul(Komplex rhs) {
	 return new Komplex(this.re*rhs.re-this.im*rhs.im,
			    this.re*rhs.im+this.im*rhs.re);
     }

     /**
      * Divides this Komplex with denominator rhs.
      * @param rhs
      * @return
      */
     public Komplex div(Komplex rhs) {
	 double denominator = rhs.re*rhs.re + rhs.im*rhs.im;
	 return new Komplex((this.re*rhs.re + this.im*rhs.im)/denominator,
			    (this.im*rhs.re-this.re*rhs.im)/denominator);

     }

     // Nya metoder (av Martin Törnqvist)
     /**
      * Konjugerar komplextalet.
      */
     public Komplex conj() {
     	 return new Komplex(this.re, 0-this.im);
     }

     /**
      * Adderar ett Heltal till ett Komplex.
      */
     public Komplex add(Heltal rhs) {
	 return new Komplex(this.re+rhs.getValue(), this.im);
     }
 }
