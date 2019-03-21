import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class MyPaint extends WindowAdapter
{
	JFrame f;
	JPanel p;
	Label l;
	Line line;
	Rect rect;
	MyPaint()
	{
	f=new JFrame();
	f.addWindowListener(this);
	line=new Line();
	rect=new Rect();
	line.setBounds(10,40,20,20);
	rect.setBounds(10,65,20,20);

	p=new JPanel();
	p.setLayout(null);
	p.add(line);
	p.add(rect);
	l=new Label("0,0");
	l.setFont(new Font("Arial",1,24));
	f.add(p);
	f.add(l,BorderLayout.SOUTH);
	f.setVisible(true);
	f.setSize(400,400);
	}
	public void windowClosing(WindowEvent e)
	{
		f.dispose();
	}

}
