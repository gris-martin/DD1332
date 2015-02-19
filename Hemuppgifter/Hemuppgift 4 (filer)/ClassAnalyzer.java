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

	Pattern pattern = Pattern.compile("public\\s\\w+\\s\\w+[(]\\w*\\s*\\w*[){]");
	Matcher matcher;
	String currentLine;
	
	while(sc.hasNext()){
	    currentLine = sc.nextLine();
	    matcher = pattern.matcher(currentLine);
	    if(matcher.find())
		System.out.println(currentLine);
	}
	    
    }
}
