import java.util.Random;

class Separate
{
    static final int nTypes = 100;
    static final int nValues = 100;
    static int[] intArray = new int[nValues];

    public static void main(String args[])
    {

	Random rand = new Random();
	for (int i = 0; i < nValues; i++){
	    intArray[i] = rand.nextInt(nTypes)-nTypes/2;
	}
	printArray(intArray);


	//int iCount = 0;
	int iTop = 0;
	int iBottom = nValues-1;
	int topValue = 0;
	int bottomValue = 0;

	//Fortsätt tills alla tar har blivit jämförda med 0
	while(iBottom > iTop){
	    // System.out.println("iTop = " + iTop +
	    // 		       ", iBottom = " + iBottom +
	    // 		       ", iCount = " + iCount);

	    topValue = intArray[iTop];
	    bottomValue = intArray[iBottom];
	    // System.out.println("topValue = " + topValue +
	    // 		       ", bottomValue = " + bottomValue);

	    //Om det nuvarande översta värdet är mindre än 0 är det på rätt plats
	    //=> gå vidare till nästa (iTop++)
	    if (topValue < 0){
		iTop++;
		//iCount++;
	    }
	    //Annars: om det nuvarande understa värdet är mindre än 0 är båda på fel plats
	    //=> byt plats och gå vidare (iTop++ och iBottom--)
	    else if (bottomValue < 0){
		intArray[iTop] = bottomValue;
		intArray[iBottom] = topValue;
		iTop++;
		iBottom--;
		//iCount++;
	    }
	    //Annars: om det nuvarande understa värdet är större än 0 är det på rätt plats
	    //=> prova med nästa understa värde istället (iBottom--)
	    else{
		iBottom--;
		//iCount++;
	    }
	    // printArray(intArray);
	    // System.out.println("");
	}

	printArray(intArray);
	

    }

    private static void printArray(int[] intArray){
	System.out.print("{");
	for(int i = 0; i < intArray.length; i++){
	    System.out.printf("%d%s",
			      intArray[i],
			      (i < intArray.length-1 ? ", " : "}\n"));
 	}
    }

    // private static void checkTop(int indexToCheck){

    // 	if (intArray[indexToCheck] > 0 && indexToCheck < intArray.length/2){
    // 	    checkTop(indexToCheck+1);
    // 	}
    // 	else if (intArray[indexToCheck] <= 0 && indexToCheck < intArray.length/2){
    // 	    checkLast(indexToCheck);
    // 	    intArray[nValues - indexToCheck - 1] = intArray[indexToCheck];
    // 	}
		
	
    // }


    // private static void checkBottom(int indexToCheck){
	
    // 	if (intArray[indexToCheck] < 0)
    // 	    checkTop(indexToCheck+1);
    // 	else{
    // 	    checkBottom(indexToCheck);
    // 	    intArray[nValues - indexToCheck - 1] = intArray[indexToCheck];
    // 	}
		
	
    // }
}


