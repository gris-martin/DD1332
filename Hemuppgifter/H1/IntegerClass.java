//Av Martin Törnqvist
import static java.lang.Math.sqrt;

public class IntegerClass {
	private int number;
	
	//Konstruktor
	public IntegerClass(int n){
		number = n;
		}
	
	//Metod som returnerar fakulteten
	public int factorial(){	
		int finalProduct = 1;
		for (int i = number; i>1; i--){
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
