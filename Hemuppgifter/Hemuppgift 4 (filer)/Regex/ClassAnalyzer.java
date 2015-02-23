import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.regex.*;    

class ClassAnalyzer
{

    String[] atts;
    static int nAttributes;
    static int nMethods;

    public static void main(String[] args){
	Scanner sc = null;
	
	//Read file
	try {
	    sc = new Scanner(new File("Complex.java"));
	    //sc = new Scanner(new File("ClassAnalyzer.java"));
	}
	catch (FileNotFoundException e) {
	    System.err.println("Failed to open file");
	    e.printStackTrace();
	    System.exit(1);
	}


	String classRegex = "(\\w+\\s){0,2}class\\s\\w+";
	String attributeRegex = "(\\w+\\s){0,2}\\w+(\\[\\])?\\s\\w+(;|\\s?=\\s?\\w+;)";
	//String methodRegex = "(\\w+\\s){0,2}\\w+[(](\\w+(\\[\\])?\\s\\w+,\\s)*(\\w+(\\[\\])?\\s\\w+)?[){]";
	String methodRegex = "(\\w+\\s+){0,3}\\w+[(](\\w+(\\[\\])?\\s+\\w+)*[)]";

	Pattern classPattern = Pattern.compile(classRegex);
	Pattern attributePattern = Pattern.compile(attributeRegex);
	Pattern methodPattern = Pattern.compile(methodRegex);
	
	Pattern publicPattern = Pattern.compile("public");
	Pattern privatePattern = Pattern.compile("private");
	Pattern protectedPattern = Pattern.compile("protected");
	Pattern[] typePatterns= new Pattern[]{publicPattern, privatePattern, protectedPattern};
	
	Matcher m;
	String currentLine;
	nAttributes = 0;
	nMethods = 0;

	//Sök igenom varje rad
	while(sc.hasNext()){
	    currentLine = sc.nextLine();

	    //Kolla efter klass
	    if(classPattern.matcher(currentLine).find()){
		System.out.println("Class: " + currentLine.trim());
	 
		//Kolla igenom klassen
		while(sc.hasNext()){
		    currentLine = sc.nextLine();
		    
		    //Kolla efter attributmatchning
		    if(attributePattern.matcher(currentLine).find()){
			nAttributes++;
			System.out.println("Attribute: " + currentLine.trim());
			for(int i = 0; i < 3; i++){
			    //System.out.println(typePatterns[i].matcher(currentLine).find());
			}
			
		    }
		    
		    //Kolla efter metodmatchning
		    else if (methodPattern.matcher(currentLine).find()){
			nMethods++;
			System.out.println("Method: "+currentLine.trim());
			currentLine = sc.nextLine();			
			sc = goThroughMethod(sc, currentLine);
			
	
		    }
			    
		}
	
	    }

	}

	System.out.println("Number of attributes: " + nAttributes);
	System.out.println("Number of methods: " + nMethods);
	    
    }

    private static Scanner goThroughMethod(Scanner sc, String currentLine){
	//Scrollar igenom metoden och avslutar när avslutande måsvingen kommer
	int nBrackets = 1;


	// while ((!Pattern.compile("\\}").matcher(currentLine).find()||
	// 	nBrackets>0||
	// 	!Pattern.compile("\\{").matcher(currentLine).find()) 
	//        && sc.hasNext()){
	       //&& (!Pattern.compile("\\{").matcher(currentLine).find()||nBrackets>0)){
	while(nBrackets>0 && sc.hasNext()){
	    if(Pattern.compile("\\{").matcher(currentLine).find() &&
	       !Pattern.compile("\\}").matcher(currentLine).find()){
		nBrackets++;
		//System.out.println(nBrackets+"+");
	    }
	    else if (Pattern.compile("\\}").matcher(currentLine).find() &&
		     !Pattern.compile("\\{").matcher(currentLine).find()){
		nBrackets--;
		//System.out.println(nBrackets+"-");
	    }
	    currentLine = sc.nextLine();
	}
	return sc;
    }
	
}
