import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.regex.*;    

class ClassAnalyzer
{
    String[] atts;

    public static void main(String args[])
    {
		Scanner sc = null;
	
	//Read file
	try {
	    sc = new Scanner(new File("Complex.java"));
	}
	catch (FileNotFoundException e) {
	    System.err.println("Failed to open file");
	    e.printStackTrace();
	    System.exit(1);
	}


	String classRegex = "(\\w+\\s){0,2}class\\s\\w+[{]";
	String attributeRegex = "(\\w+\\s){0,2}\\w+\\s\\w+(;|\\s?=\\s?\\w+;)";
	String methodRegex = "(\\w+\\s){0,2}\\w+[(](\\w+(\\[\\])?\\s\\w+,\\s)*(\\w+(\\[\\])?\\s\\w+)?[){]";

	Pattern classPattern = Pattern.compile(classRegex);
	Pattern attributePattern = Pattern.compile(attributeRegex);
	Pattern methodPattern = Pattern.compile(methodRegex);

	Matcher matcher;
	String currentLine;
	int nAttributes = 0;
	int nMethods = 0;

	//Sök igenom varje rad
	while(sc.hasNext()){
	    currentLine = sc.nextLine();

	    //Kolla efter klass
	    if(classPattern.matcher(currentLine).find()){
	 
		//Kolla igenom klassen
		while(sc.hasNext()){
		    currentLine = sc.nextLine();
		    
		    //Kolla efter attributmatchning
		    if(attributePattern.matcher(currentLine).find()){
			nAttributes++;
		    }

		    //Kolla eftermetodmatchning
		    else if (methodPattern.matcher(currentLine).find()){
			nMethods++;
			System.out.println(currentLine);
			currentLine = sc.nextLine();

			int nBrackets = 0;
			while (((!Pattern.compile("[}]").matcher(currentLine).find())||nBrackets>0) 
			       && sc.hasNext()){
			    if(Pattern.compile("[{]").matcher(currentLine).find())
			       nBrackets++;
			    else if (Pattern.compile("[}]").matcher(currentLine).find())
				nBrackets--;
			    currentLine = sc.nextLine();
			}
		    }
			    
		}
	
	    }

	}

	System.out.println("Number of attributes: " + nAttributes);
	System.out.println("Number of methods: " + nMethods);
	    
    }
}
