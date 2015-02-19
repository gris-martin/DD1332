import static java.lang.Math.sqrt;

public class IntegerClass {
    private long number;
    
    //Konstruktor
    public IntegerClass(long n){
	number = n;
    }
    
    //Getter
    public long getNumber(){
	return number;
    }

    //Metod som returnerar fakulteten
    public long factorial(){	
	long finalProduct = 1;
	for (long i = number; i>1; i--){
	    finalProduct *= i;
	}
	return finalProduct;
    }
    
    //Metod som kollar om talet är ett primtal eller inte
    public boolean isPrime(){
	for (int i=(int)sqrt((double)number); i>1; i--){
	    if (number % i == 0)
		return false;
	}
	return true;
    }
}
