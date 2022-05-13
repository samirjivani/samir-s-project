import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;
class MyActionListener implements ActionListener
{
	MyFrame fm;
	Frame1 fm1;
	Frame2 fm2;
	MyActionListener(MyFrame f)
	{
		this.fm = f;
	}
	MyActionListener(Frame1 g)
	{
		this.fm1 = g;
	}MyActionListener(Frame2 m)
	{
		this.fm2 = m;
	}
	public void actionPerformed( ActionEvent e)
	{
	   if(e.getActionCommand().equals("START"))
	   {
		   fm1 = new Frame1();
		   this.fm1.setVisible(true);
		   this.fm.setVisible(false);
		   this.fm2.setVisible(false);
	   }
	   if(e.getActionCommand().equals("SAVE"))
	   {
		   fm2 = new Frame2();
		  this.fm2.setVisible(true);
		    this.fm1.setVisible(false);
		   this.fm.setVisible(false);
	   }
	}
}