import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.regex.*;    

class RegexTester{
    public static void main(String[] args){
	String currentLine = "	// 	!Pattern.compile(\"\\{\").matcher(currentLine).find()) ";
	    System.out.println(Pattern.compile("(\\w+\\s){0,2}\\w+[(](\\w+(\\[\\])?\\s\\w+,\\s)*(\\w+(\\[\\])?\\s\\w+)?[){]").matcher(currentLine).find());
    }


}
