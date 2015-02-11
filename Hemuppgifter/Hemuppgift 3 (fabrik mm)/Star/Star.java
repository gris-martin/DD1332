import java.awt.Graphics;
import java.awt.Color;
public class Star{
    private int x, y;
    private int heigth, width;
    private Color c;
    
    public Star(int x,int y, int heigth, int width, int r, int g, int b){
	this.x = x;
	this.y = y;
	this.heigth = heigth;
	this.width = width;

	this.c = new Color(r,g,b); //Ny kod
    }
    
    public void paint(Graphics g){
	//Ritar en femhorning stjarna som ryms inom kvadraten med horn i (x,y) och (x+width,y+heigth)

	g.setColor(c); //Ny kod
	
	g.drawLine(x+0       ,y+heigth  ,x+width/2,y+0);
	g.drawLine(x+width/2 ,y+0       ,x+width  ,y+heigth);
	g.drawLine(x+width   ,y+heigth  ,x+0      ,y+heigth/3);
	g.drawLine(x+0       ,y+heigth/3,x+width  ,y+heigth/3);
	g.drawLine(x+width   ,y+heigth/3,x+0      ,y+heigth);
    }
    
}
