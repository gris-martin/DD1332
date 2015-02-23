import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;

public class StarView extends JPanel{
    private StarModel myModel;
    
    public StarView(StarModel sm){
	myModel = sm;
	setBackground(Color.black);
	setPreferredSize(myModel.getDimension());
    }
    
    public void paintComponent(Graphics g){
	super.paintComponent(g);
	for(Star s: myModel.getStars()){
	    s.paint(g);
	}
    }
    
}
