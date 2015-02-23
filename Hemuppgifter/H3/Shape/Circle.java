import java.awt.Graphics;
import java.awt.Color;

public class Circle extends Shape{
    int r;
    
    public Circle(int x, int y, int radius, int r, int g, int b){
	this.x = x;
	this.y = y;
	this.r = radius;

	this.c = new Color(r,g,b);
    }

    public void paint(Graphics g){
	//Ritar en cirkel

	g.setColor(c);
	g.drawOval(x,y,r,r);
    
    }
}
