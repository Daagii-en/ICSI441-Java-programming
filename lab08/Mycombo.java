package lab08;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class Mycombo extends Applet implements ItemListener {//comment A

	Choice c1;//comment B
	Label l1; //comment C
	Color col = Color.orange;//comment D
	public void init() {
		setBackground(col);
		l1 = new Label("Select the background color from the Choice");
		c1 = new Choice();// comment E
		c1.addItem("Red");
		c1.addItem("Green");
		c1.addItem("Yellow");
		c1.addItem("Pink");
		c1.addItemListener(this);//comment F
		add(l1);//commetn G
		add(c1);
	}
	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		String s= (String)e.getItem();//comment H
		if(s=="Red")
			col = Color.red;
		else if(s=="Green")
			col = Color.green;
		else if(s=="Yellow")
			col = Color.yellow;
		else if(s=="Pink")
			col = Color.pink;
		setBackground(col);
		l1.setBackground(col);
	}
}
