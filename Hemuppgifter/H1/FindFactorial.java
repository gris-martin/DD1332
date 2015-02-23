//Av Martin Törnqvist

public class FindFactorial {

	public static void main(String[] args) {
		int inInt;
		//Testa att inputen är en integer
		try{
			inInt = Integer.parseInt(args[0]);
		}

		catch (NumberFormatException e){
			System.out.println("Input needs to be an integer.");
			return;
		}
		
		//Testa att inputen ligger mellan godkända värden (större än 12 ger för stora tal för int)
		if (inInt > 12 || inInt < 0){
			System.out.println("Input needs to be between 0 and 12");
			return;
		}
		
		IntegerClass testInteger = new IntegerClass(inInt);
		int testFactorial = testInteger.factorial();
		System.out.println(testFactorial);
	}

}
