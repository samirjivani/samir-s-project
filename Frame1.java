import java.awt.*;
import java.awt.event.*;
import java.awt.AWTEvent.*;
class Frame1 extends Frame 
{
	TextField t1,t2;
	Label p1, p2,n1,n2;
	Button b1;
	
	MyActionListener m1 = new MyActionListener(this);
	Frame1()
	{
		super("DATA");
		setBounds(0,0,1000,800);
		setLayout(null);
		
		t1 = new TextField();
		t2 = new TextField();
		p1 = new Label("PLAYER_1");
		p2 = new Label("PLAYER_2");
		n1 = new Label("name");
		n2 = new Label("name");
		b1 = new Button("SAVE");
		
		p1.setBounds(50,50,525,200);
		//n1.setBounds(100,100,425,200);
		
		t1.setBounds(50,200,425,50);
		
		p2.setBounds(50,180,525,200);
		t2.setBounds(50,310,425,50);
		
		b1.setBounds(50,500,275,200);
		
		Font f1 = new Font("Arial", Font.BOLD, 50);
		
		t1.setFont(f1);
		t2.setFont(f1);
		p1.setFont(f1);
		p2.setFont(f1);
		n1.setFont(f1);
		n2.setFont(f1);
		b1.setFont(f1);
		
		add(t1);
		add(t2);
		add(p1);
		add(p2);
		add(b1);
		add(n1);
		add(n2);
		
		b1.addActionListener(m1);
		addWindowListener(new WindowAdapter()
			{
				public void windowClosing(WindowEvent we)
				{
					System.exit(0);
				}
			});
		
	}
}