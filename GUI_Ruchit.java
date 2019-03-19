/*
 * Name: Ruchit Patel
 *  
 * NetID: rpate329
 * CS342 Project 5
 * ACCC account: rpatel1
 * 
 * */


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;



public class GUI_Ruchit implements UserInterface, ActionListener
{
	
	// Declare Frame, Output area
	private JFrame rucframe;
	private JTextArea areaOut;
	private String universalText;
    private boolean stopScreen;
    private JScrollPane scroll;
    private JTextArea userCommand;
    private JLabel label1, label2, label3, label4, welcomelabel;
        
    public GUI_Ruchit()
    {
    	rucframe = new JFrame();
    	rucframe.setSize(1000,1000);            // Define size
    	rucframe.setTitle("Ruchit's Interface");  // Name to the Frame
    	rucframe.setVisible(true);
    	rucframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   // when user press close button then terminate from program
    	rucframe.getContentPane().setBackground(Color.BLUE);      // Back ground color of frame
    	stopScreen = false;
    	
    	
    	// All the labels
    	label1 = new JLabel("Press THIS If you want exit");
    	label2 = new JLabel("This are all action Buttons");
    	label3 = new JLabel("This is Command Enter window >  ");
    	label4 = new JLabel("< This is output window");
    	welcomelabel = new JLabel("Welcome to the My Game");
    	
    	// Change size and font color of text
    	label1.setFont(new Font("Serif",Font.BOLD,15));
    	label1.setFont(new Font("Serif",Font.BOLD,17));
    	label3.setFont(new Font("Serif",Font.BOLD,25));
    	label3.setForeground(Color.CYAN);
    	label4.setFont(new Font("Serif",Font.BOLD,25));
    	label4.setForeground(Color.CYAN);
    	
    	// Define new panels
    	Panel p1,p2,p3;
    	 
    	// Set panel Layout and size then add label
    	p1 = new Panel(new GridLayout(2,1,30,20));
     	
    	p1.setSize(80,80);
   
    	p1.add(label1);
    	
     	// Set panel Layout and size then add label
    	p2 = new Panel(new GridLayout(5,5,20,15));
    	p2.setSize(500,500);
    	p2.add(label2);
    	
     	// Set panel Layout and size then add label
    	p3 = new Panel(new GridLayout(2,2,10,20));
    	p3.setSize(400,500);
    	p3.add(welcomelabel);
    	
    	// set background of created panels
    	rucframe.getContentPane().setLayout(new FlowLayout(FlowLayout.RIGHT,10,15));
    	rucframe.getContentPane().add(p1).setBackground(Color.WHITE);
    	rucframe.getContentPane().setLayout(new FlowLayout(FlowLayout.LEFT,10,20));
    	rucframe.getContentPane().add(p2).setBackground(Color.CYAN);
    	
    	
    	
    	// Create user command window
    	userCommand = new JTextArea();
    	   	
    	// Set size 
    	areaOut = new JTextArea("",40,40);
    	
    	// Set layout
    	areaOut.setLayout(new FlowLayout(FlowLayout.RIGHT,15,5));
    	
    	//Set font
    	areaOut.setFont(areaOut.getFont().deriveFont(18f));
    	
    	// Add scrolls
    	scroll = new JScrollPane(areaOut);
    	scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
    	
  
    	// Define buttons
    	JButton b1, b2, b3,b4,b5,b6;
    	
    	// Add Name, size then add to frame all buttons
    	b1 = new JButton("INVENTORY");
    	b1.setSize(800,800);
    	b1.addActionListener(this);
    	rucframe.add(b1);
    	p2.add(b1);
    	
    	b2 = new JButton("EXIT");
    	b2.setSize(100,100);
    	b2.addActionListener(this);
    	rucframe.add(b2);
    	p1.add(b2);
    	
    	b3 = new JButton("GET");
    	b3.setSize(400,400);
    	b3.addActionListener(this);
    	rucframe.add(b3);
    	p2.add(b3);
    	
    	b4 = new JButton("DROP");
    	b4.setSize(400,400);
    	b4.addActionListener(this);
    	rucframe.add(b4);
    	p2.add(b4);
    	
    	b6 = new JButton("USE");
    	b6.setSize(400,400);
    	b6.addActionListener(this);
    	rucframe.add(b6);
    	p2.add(b6);
    	
    	// Get input from user they typed in
    	userCommand = new JTextArea(8,10);
    	rucframe.add(label3);
    	rucframe.add(userCommand);
    	
    	b5 = new JButton("SUBMIT");
    	b5.setSize(100,100);
    	b5.addActionListener(this);
    	rucframe.add(b5);
    	//p2.add(b5);
    	
    	// Add to JFrame
    	rucframe.add(areaOut);
    	rucframe.add(label4);
    	    	
    	
    	
    }

	@Override
	public void display(String toDisplay) {
		// Display output
		areaOut.append(toDisplay+"\n");
		
	}

	@Override
	public String getLine() {
		// Infinite loop when userclick button and return universal button
		while(true)
		{
			System.out.print("");
			if(stopScreen)
			{
				System.out.print("");
				stopScreen = false;
				return universalText;
			}
		}
	}
	
	
	@Override
	public void actionPerformed(ActionEvent arg0)
	{
		String buttonName = arg0.getActionCommand();
		String commandText = null;
		
		// Action performed when user press different buttons
		if("GET".equalsIgnoreCase(buttonName) || "USE".equalsIgnoreCase(buttonName) || "DROP".equalsIgnoreCase(buttonName))
		{
			commandText = buttonName + " " + userCommand.getText();
			universalText = commandText;
			System.out.println(universalText);
			stopScreen = true;
		}
		else if("EXIT".equalsIgnoreCase(buttonName))
		{
			System.out.println(buttonName);
			universalText = buttonName;
			System.out.println(universalText);
			
			stopScreen = true;	
		}
		else
		{
			// command window typed in command
			System.out.println(buttonName);
			universalText = userCommand.getText();
			System.out.println(universalText);
			
			stopScreen = true;
		}
		
	}
	
}

