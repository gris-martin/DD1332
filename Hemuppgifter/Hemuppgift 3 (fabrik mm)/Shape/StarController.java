import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import java.awt.event.*;
import java.awt.Dimension;
import java.awt.GridLayout;

public class StarController extends JPanel implements ActionListener{
    private StarModel myModel;
    private StarView  myView;
    private JButton addButton = new JButton("Add random star");
    private JButton circleButton = new JButton("Add random circle");
    private JButton rectButton = new JButton("Add random rectangle");
    private JButton randomButton = new JButton("Add random shape");
    
    public StarController(StarModel sm, StarView sv){
	myModel = sm;
	myView  = sv;

	this.setLayout(new GridLayout(0,1));
	
	add(addButton);
	add(circleButton);
	add(rectButton);
	add(randomButton);
	
	addButton.addActionListener(this);
	circleButton.addActionListener(this);
	rectButton.addActionListener(this);
	randomButton.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e){
	System.out.println("add");
	if(e.getSource() == addButton)
	    myModel.addRandomStar();
	else if(e.getSource() == circleButton)
	    myModel.addRandomCircle();
	else if(e.getSource() == rectButton)
	    myModel.addRandomRectangle();
	else
	    myModel.addRandomShape();
	myView.repaint();
    }
}
