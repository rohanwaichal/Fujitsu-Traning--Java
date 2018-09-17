import java.awt.*;
import java.awt.event.*;
class gui extends Frame implements ActionListener
{
	TextField t1,t2,t3;
	Button b;
	gui()
	{
		b =new Button("Calculate");
		t1=new TextField();
		t2=new TextField();
		t3=new TextField();
		add(t1);
		add(t2);
		add(b);
		add(t3);
		
		b.addActionListener(this);
		setLayout(null);
		
		t1.setBounds(50,50,150,30);
		t2.setBounds(50,100,150,30);
		b.setBounds(50,150,70,30);
		t3.setBounds(50,200,150,30);
		setSize(300,300);
		setVisible(true);
		
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b)
		{
			xyz x=new xyz();
			String a=t1.getText();
			int a1=Integer.parseInt(a);
			String b=t2.getText();
			int b1=Integer.parseInt(b);
			int re=x.show(a1,b1);
			String c=String.valueOf(re);
			t3.setText(c);
		}
	}
	public static void main(String args[])
	{
		gui g=new gui();
	}
}