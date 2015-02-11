import java.awt.Graphics;
import java.awt.Color;

public class Rectangle extends Shape{
    int w;
    int h;
    
    public Rectangle(int x, int y, int w, int h, int r, int g, int b){
	this.x = x;
	this.y = y;
	this.w = w;
	this.h = h;
	
	this.c = new Color(r,g,b);
    }

    public void paint(Graphics g){
	//Ritar en rektangel

	g.setColor(c);
	g.drawRect(x,y,w,h);
    
    }
}
