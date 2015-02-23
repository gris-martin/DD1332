import java.io.File;
import java.io.RandomAccessFile;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

class MP3Analyzer
{
    public static void main(String args[])
    {
	
	File f = null;
	try {
	    f = new File(args[0]);
	}
	catch (Throwable e) {
	    System.out.println("Usage: MP3Analyzer file.mp3");
	    System.exit(1);
	    //printStackTrace();
	}

	RandomAccessFile raf = null;
	
	try{
	    raf = new RandomAccessFile(f, "r");
	} catch (FileNotFoundException e){
	    System.err.println("Unable to read file \"" + args[0] + "\"");
	    System.exit(1);
	}



	
	try{
	    raf.seek(raf.length()-128);
	    
	    int off = 0;//(int)raf.length()-128;
	    byte[] b = new byte[128];
	    int len = b.length;
	    
	    int nBytes = raf.read(b, off, len);

	    String title = new String(Arrays.copyOfRange(b, 3, 33));
	    String artist = new String(Arrays.copyOfRange(b, 33, 63));
	    String album = new String(Arrays.copyOfRange(b, 63, 93));
	    String year = new String(Arrays.copyOfRange(b, 93, 97));
	    String comment = new String(Arrays.copyOfRange(b, 97, 127));
	    String genre = new String(Arrays.copyOfRange(b, 127, 128));

	    //String[] tag = {title, artist, album, year, comment, genre};

	    System.out.println("Title: " + title);
	    System.out.println("Artist: " + artist);
	    System.out.println("Album: " + album);
	    System.out.println("Year: " + year);

	    
	    
				    
	} catch (IOException e){
	    System.out.println("??");
	}
    }
}
