import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;
import java.awt.*;
import java.applet.Applet;
public class Frame2 extends Frame 
{
	
	MyActionListener m1 = new MyActionListener(this);
	void GridLayout(int x, int y)
	{
		JButton b1=new JButton("1");    
		JButton b2=new JButton("2");    
		JButton b3=new JButton("3");    
		JButton b4=new JButton("4");    
		JButton b5=new JButton("5");    
		JButton b6=new JButton("6");    
		JButton b7=new JButton("7");    
		JButton b8=new JButton("8");    
		JButton b9=new JButton("9"); 
		
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
		add(b7);
		add(b8);
		add(b9);
	
	
	}
	Frame2()
	{
		super("game");
		setLayout(new GridLayout(3,3));
		setBounds(0,0,1260,1000);
		
	
		
		addWindowListener(new WindowAdapter()
			{
				public void windowClosing(WindowEvent we)
				{
					System.exit(0);
				}
			});
	}
}