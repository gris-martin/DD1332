//Exempel på hur klassen Complex kan se ut
public class Complex{
    private int re;
    private int im;
    
    public Complex(int re, int im){
	this.re = re;
	this.im = im;
    }
    
    public Complex add(Complex h){
	return new Complex(this.re+h.re, this.im+h.im);
    }
    
    public Complex sub(Complex h){
	return new Complex(this.re-h.re, this.im-h.im);
    }
    
    public Complex mul(Complex h){
	int a = re;
	int b = im;
	int c = h.re;
	int d = h.im;
	return new Complex(a*c-b*d, b*c+a*d);
    }
    
    public Complex div(Complex h){
	int a = re;
	int b = im;
	int c = h.re;
	int d = h.im;
	return new Complex((a*c+b*d)/(c*c+d*d), (b*c-a*d)/(c*c+d*d));
    }
    
    public String toString(){
	return re +" + " +im +"i";
    }

    public static void main(String[] args){
	//litet test...
	Complex c1 = new Complex(5,1);
	Complex c2 = new Complex(5,0);
	System.out.printf("c1 = %s, c2 = %s\n", c1, c2);
	System.out.printf("c1 + c2 = %s\n", c1.add(c2) );
	System.out.printf("c1 - c2 = %s\n", c1.sub(c2) );
	System.out.printf("c1 * c2 = %s\n", c1.mul(c2) );
	System.out.printf("c1 / c2 = %s\n", c1.div(c2) );
    }
    
}
