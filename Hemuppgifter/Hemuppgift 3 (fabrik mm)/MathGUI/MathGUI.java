//Martin Törnqvist

import javax.swing.JFrame;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.event.*;

public class MathGUI extends JFrame implements ActionListener{

    IntegerClass number;

    JLabel inLabel;
    JButton primeButton;
    JButton factButton;

    JTextField inField;
    JTextField primeField;
    JTextField factField;
    
    public MathGUI(){
	super("Math Program 20000");

	//Framen består av två paneler bredvid varandra
	//med 3 rader var
	JPanel buttonPanel = new JPanel();
	JPanel textPanel = new JPanel();
	buttonPanel.setLayout(new GridLayout(0,1));
	textPanel.setLayout(new GridLayout(0,1));

	//Vänstra panelen
	inLabel = new JLabel("Input number:");
	inLabel.setHorizontalAlignment(JLabel.CENTER);
	
	primeButton = new JButton("Is it a prime number?");
	primeButton.addActionListener(this);

	factButton = new JButton("Factorial:");
	factButton.addActionListener(this);

	buttonPanel.add(inLabel);
	buttonPanel.add(primeButton);
	buttonPanel.add(factButton);

	//Högra panelen
	inField = new JTextField(20);
	inField.addActionListener(this);
	
	primeField = new JTextField(20);
	primeField.setEditable(false);
	
	factField = new JTextField(20);
	factField.setEditable(false);

	textPanel.add(inField);
	textPanel.add(primeField);
	textPanel.add(factField);

	//Lägg till panelerna i framen
	add(buttonPanel,"West");
	add(textPanel,"Center");

	//Lite design
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	pack();
	setVisible(true);
    }

    //Till ActionListener
    public void actionPerformed(ActionEvent e){

	// Hämta numret från textrutan (inField)
	try{
	number = new IntegerClass(Long.parseLong(inField.getText()));
	} catch (NumberFormatException nfe){
	    if (e.getSource() == primeButton)
		primeField.setText("Input a positive integer");
	    else if (e.getSource() == factButton)
		factField.setText("Input a positive integer");
		}

	// Om primtalsknappen trycks skrivs primtalet ut
	try{
	    if(e.getSource() == primeButton){
		if (number.getNumber() < 0)
		    primeField.setText("No negative numbers...");
		else if(number.isPrime())
		    primeField.setText("Yes!! :)");
		else
		    primeField.setText("No... :(");
	    }
	    
	    //Om fakultetsknappen trycks in räknas fakulteten ut
	    else if (e.getSource() == factButton){
		if (number.getNumber() < 0)
		    factField.setText("No negative numbers...");
		else if (number.getNumber() > 20)
		    factField.setText("Too big :( :(");
		else
		    factField.setText(""+number.factorial());
	    }
	} catch(NullPointerException npe) {}
    }

    //Main
    public static void main(String[] args){
	MathGUI matty = new MathGUI();
    }
}
