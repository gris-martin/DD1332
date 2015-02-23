import java.util.Random;

class Typvarde{
    
    public static void main(String[] args){

        int nTypes = 0;
	int nValues = 0;
	
	try{
	    nTypes = Integer.parseInt(args[0]);
	    nValues = Integer.parseInt(args[1]);
	} catch(IndexOutOfBoundsException e){
	    System.out.println("Usage: Typvarde nTypes nValues");
	    System.exit(1);
	}
	
	int[] values = new int[nValues];

	Random rand = new Random();
	for (int i = 0; i < nValues; i++){
	    values[i] = rand.nextInt(nTypes);
	}
	
	System.out.println("\nTypvärde: " + hittaTypvarde(values, nTypes));
	
    }
    
    
    private static int hittaTypvarde(int[] values, int nTypes){
	
	//Put values in tree
	Tree srchTree = new Tree();
	for (int v : values){
	    srchTree.put(v);
	}
	
	//Make array where frequencies[value] = number of times 5 occures
	int[] frequencies = new int[nTypes];
	for (int v : values){
	    frequencies[v] += srchTree.exist(v);
	}

	int maxOccurences = 0;
	int typvarde = 0;
	for (int i = 0; i < nTypes; i++){
	    System.out.println(i + ": " + frequencies[i] + " gånger");
	    if (frequencies[i] > maxOccurences){
		typvarde = i;
		maxOccurences = frequencies[i];
	    }
	}
	return typvarde;	
    }
}