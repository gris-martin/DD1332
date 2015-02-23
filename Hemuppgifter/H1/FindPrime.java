//Av Martin Törnqvist

public class FindPrime {
	public static void main(String[] args) {
		//0 och 1 är inte primtal
		if (Integer.parseInt(args[0]) <= 1){
			System.out.println(false);
			return;
		}
		
		IntegerClass testInt = new IntegerClass(Integer.parseInt(args[0]));
		boolean primeBool = testInt.isPrime();
		System.out.println(primeBool);
		return;
	}

}
