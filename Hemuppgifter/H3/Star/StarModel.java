import java.util.LinkedList;
import java.awt.Dimension;

public class StarModel{
    private int width, heigth;
    private LinkedList<Star> stars;
    
    public StarModel(int w, int h){
	width = w;
	heigth = h;
	stars = new LinkedList<Star>();
    }
    
    public LinkedList<Star> getStars(){
	return stars;
    }
    
    public void addStar(Star s){
	stars.add(s);
    }
    
    public Dimension getDimension(){
	return new Dimension(width,heigth);
    }
    
    public void addRandomStar(){
	int x = (int)(Math.random()*width);
	int y = (int)(Math.random()*heigth);
	int w = (int)(Math.random()*100);

	//Ny kod
	int r = (int)(Math.random()*256);
	int g = (int)(Math.random()*256);
	int b = (int)(Math.random()*256);
	
	Star s = new Star(x,y,w,w,r,g,b);
	stars.add(s);
    }
    
}
