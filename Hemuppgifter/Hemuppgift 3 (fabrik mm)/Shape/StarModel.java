import java.util.LinkedList;
import java.awt.Dimension;

public class StarModel{
    private int width, heigth;
    private LinkedList<Shape> shapes; //Ändrad kod
    
    public StarModel(int w, int h){
	width = w;
	heigth = h;
	shapes = new LinkedList<Shape>();
    }
    
    public LinkedList<Shape> getShapes(){
	return shapes;
    }
    
    public void addStar(Star s){
	shapes.add(s);
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
	addStar(s);
    }

    public void addRandomCircle(){
	int x = (int)(Math.random()*width);
	int y = (int)(Math.random()*heigth);

	int radius = (int)(Math.random()*100);
	
	int r = (int)(Math.random()*256);
	int g = (int)(Math.random()*256);
	int b = (int)(Math.random()*256);

	Circle cir = new Circle (x,y,radius,r,g,b);
	shapes.add(cir);
    }

    public void addRandomRectangle(){
	int x = (int)(Math.random()*width);
	int y = (int)(Math.random()*heigth);
	int w = (int)(Math.random()*100);
	int h = (int)(Math.random()*100);

	//Ny kod
	int r = (int)(Math.random()*256);
	int g = (int)(Math.random()*256);
	int b = (int)(Math.random()*256);

	Rectangle rect = new Rectangle(x,y,w,h,r,g,b);
	shapes.add(rect);
    }


    public void addRandomShape(){
	int r = (int)(Math.random()*3);
	if (r < 1)
	    addRandomStar();
	else if (r < 2)
	    addRandomCircle();
	else
	    addRandomRectangle();
    }
    

    public int nShapes(){
	return shapes.size();
    }
    
}
