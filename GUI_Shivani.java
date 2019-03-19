import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GUI_Shivani implements UserInterface, ActionListener
{
	private JFrame myFrame;
    private JTextArea area;
    private static JTextArea panel2BoxArea;
    private String globalButton;
    private boolean stopProcess;
    private Panel panel1;
    private Panel panel2;
    private Panel panel3;
    private JScrollPane scroll;
    JButton button1;
	JButton button2;
	JButton button3;
	JButton button4;
	JButton button5;
    JCheckBox button6;
    JCheckBox button7;
    JCheckBox button8;
    JCheckBox button9;
	JCheckBox button10;
	JCheckBox button11;
	JCheckBox button12;
	JCheckBox button13;
	JCheckBox button14;
	JCheckBox button15;
	JCheckBox button16;
	JCheckBox button17;
	JCheckBox button18;
	JButton button19;

    public GUI_Shivani(){
    	myFrame = new JFrame();
    	myFrame.setSize(1000, 1000);
    	myFrame.setTitle("Shivani's Interface");
    	myFrame.setVisible(true);
    	//myFrame.getContentPane().setBackground(Color.magenta);
    	myFrame.setDefaultCloseOperation(myFrame.EXIT_ON_CLOSE);
		stopProcess = false;
	
		panel1 = new Panel();		
		panel2 = new Panel();
		panel3 = new Panel();
		myFrame.getContentPane().setLayout ( new GridLayout());
		myFrame.getContentPane().add(panel1).setBackground(Color.cyan);
		myFrame.getContentPane().add(panel2).setBackground(Color.cyan);
		myFrame.getContentPane().add(panel3).setBackground(Color.cyan);
		
		button7 = new JCheckBox("N");
		myFrame.add(button7);
		panel1.add(button7);
		
		button8 = new JCheckBox("S");
		myFrame.add(button8);
		panel1.add(button8);
		
		button9 = new JCheckBox("E");
		myFrame.add(button9);
		panel1.add(button9);
		
		button10 = new JCheckBox("W");
		myFrame.add(button10);
		panel1.add(button10);
		
		button11 = new JCheckBox("UP");
		myFrame.add(button11);
		panel1.add(button11);
		
		button12 = new JCheckBox("DOWN");
		myFrame.add(button12);
		panel1.add(button12);
		
		button13 = new JCheckBox("SE");
		myFrame.add(button13);
		panel1.add(button13);
		
		button14 = new JCheckBox("SW");
		myFrame.add(button14);
		panel1.add(button14);
		
		button15 = new JCheckBox("NE");
		myFrame.add(button15);
		panel1.add(button15);
		
		button16 = new JCheckBox("NW");
		myFrame.add(button16);
		panel1.add(button16);
		
		button17 = new JCheckBox("NONE");
		myFrame.add(button17);
		panel1.add(button17);
		
		button3 = new JButton ("GET");
		button3.setSize(100, 100);
		button3.addActionListener(this);
		myFrame.add(button3);
		panel2.add(button3);
		
		button4 = new JButton ("USE");
		button4.setSize(100, 100);
		button4.addActionListener(this);
		myFrame.add(button4);
		panel2.add(button4);
		
		button5 = new JButton ("DROP");
		button5.setSize(100, 100);
		button5.addActionListener(this);
		myFrame.add(button5);
		panel2.add(button5);
		
		button2 = new JButton ("EXIT");
		button2.setSize(100, 100);
		button2.addActionListener(this);
		myFrame.add(button2);
		panel3.add(button2);
		
		button1 = new JButton ("GO");
		button1.setSize(100, 100);
		button1.addActionListener(this);
		myFrame.add(button1);
		panel1.add(button1);
		
		button6 = new JCheckBox("LOOK");
		myFrame.add(button6);
		panel3.add(button6);
		
		button18 = new JCheckBox("INVENTORY");
		myFrame.add(button18);
		panel3.add(button18);
		
		button19 = new JButton ("SUBMIT");
		button19.setSize(100, 100);
		button19.addActionListener(this);
		myFrame.add(button19);
		panel3.add(button19);
		
		panel2BoxArea = new JTextArea (7,7);
		myFrame.add(panel2BoxArea);
		panel2.add(panel2BoxArea);
		
		area = new JTextArea();
		area.setSize(500, 500);
		area.setBounds(300, 300, 500, 500);
		area.setFont(area.getFont().deriveFont(16f));
		scroll = new JScrollPane(area, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scroll.setBounds(300, 300, 400, 400);
		scroll.setVisible(true);
		myFrame.getContentPane().add(scroll);
}
	@Override
	public void display(String toDisplay) {
		// TODO Auto-generated method stub	
		area.append(toDisplay+"\n");
	}

	@Override
	public String getLine() {
		// TODO Auto-generated method stub
		while(true)
		{
			System.out.print("");
			if(stopProcess)
			{
				System.out.print("");
				stopProcess = false;
				return globalButton;
			}
		}
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		String buttonName = arg0.getActionCommand();
		String commandText = "";
		if("GO".equalsIgnoreCase(buttonName)) {
			if(button7.isSelected())
			commandText += "N";
			if(button8.isSelected())
				commandText += "S";
			if(button9.isSelected())
				commandText += "E";
			if(button10.isSelected())
				commandText += "W";
			if(button11.isSelected())
				commandText += "UP";
			if(button12.isSelected())
				commandText += "DOWN";
			if(button13.isSelected())
				commandText += "SE";
			if(button14.isSelected())
				commandText += "SW";
			if(button15.isSelected())
				commandText += "NE";
			if(button16.isSelected())
				commandText += "NW";
			if(button17.isSelected())
				commandText += "NONE";
			globalButton = commandText;
			System.out.println(globalButton);
			stopProcess = true;
		}
		else if("SUBMIT".equalsIgnoreCase(buttonName)) {
			if(button6.isSelected())
				commandText += "LOOK";
			if(button18.isSelected())
				commandText += "INVENTORY";
			globalButton = commandText;
			System.out.println(globalButton);
			stopProcess = true;
		}
		else if("GET".equalsIgnoreCase(buttonName) || "USE".equalsIgnoreCase(buttonName) || "DROP".equalsIgnoreCase(buttonName))
		{
			commandText = buttonName + " " + panel2BoxArea.getText();
			globalButton = commandText;
			System.out.println(globalButton);
			stopProcess = true;
		}
		else{
			System.out.println(buttonName);
			globalButton = buttonName;
			//System.out.println(globalButton);
			stopProcess = true;
		}
	}
}
