import java.awt.Graphics;
import java.awt.Color;
public class Star extends Shape{
    private int height;
    private int width;
    
    public Star(int x,int y, int height, int width, int r, int g, int b){
	this.x = x;
	this.y = y;
	this.height = height;
	this.width = width;

	//Ny kod
	this.c = new Color(r,g,b);
    }
    
    public void paint(Graphics g){
	//Ritar en femhorning stjarna som ryms inom kvadraten med horn i (x,y) och (x+width,y+height)

	//Ny kod
	g.setColor(c);

	g.drawLine(x+0       ,y+height  ,x+width/2,y+0);
	g.drawLine(x+width/2 ,y+0       ,x+width  ,y+height);
	g.drawLine(x+width   ,y+height  ,x+0      ,y+height/3);
	g.drawLine(x+0       ,y+height/3,x+width  ,y+height/3);
	g.drawLine(x+width   ,y+height/3,x+0      ,y+height);
    }
    
}
