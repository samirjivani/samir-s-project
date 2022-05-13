import java.awt.*;
import java.awt.event.*;
import java.awt.AWTEvent.*;
class MyFrame extends Frame
{
	Button start;
	MyActionListener m1 = new MyActionListener(this);
	MyFrame(String s)
	{
		super(s);
		this.setBounds(0,0,1000,800);
		setLayout(null);
		
		start = new Button("START");
		
		// SET COMPONENT
		start.setBounds(500,300,400,100);
		Font f1 = new Font("Arial",Font.BOLD,100);
		start.setFont(f1);
		add(start);
		start.addActionListener(m1);
		// when Frames X Button pressed 
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
	}
	public static void main(String args[])
	{
		MyFrame fm = new MyFrame("GAME");
		fm.setVisible(true);
	}
}
