package lab08;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class Mycombo extends Applet implements ItemListener {//comment A

	//Mycombo class ийн fields
	Choice c1;//comment B Choice төрлийн c1 хувьсагчийг зарлаж байна. Choice class нь сонголтуудын pop-up цэсийг харуулдаг. 
	Label l1; //comment C Label төрлийн l1 хувьсагчийг зарлаж байна. Label объект нь агуулахад текст байрлуулах бүрэлдэхүүн хэсэг юм.
	Color col = Color.orange;//comment D Color төрлийн col хувьсагчид  Color class аар oronge өнгийг оноож өгч байна.
	public void init() {
		setBackground(col);
		l1 = new Label("Select the background color from the Choice");
		c1 = new Choice();// comment E c1 хувьсагчид Choice() method оор шинэ объект үүсгэж байна.
		c1.addItem("Red");
		c1.addItem("Green");
		c1.addItem("Yellow");
		c1.addItem("Pink");
		c1.addItemListener(this);//comment F c1 cонголт цэснээс itemEvents хүлээн авахын тулд заасан зүйл сонсогчийг нэмнэ.
		add(l1);//commetn G l1 объектийг заасан бүрэлдэхүүн хэсэгт Appends хийж байна.
		add(c1);
	}
	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		String s= (String)e.getItem();//comment H String төрлийн s хувьсагчид ItemEvent ээр дамжин ирсэн event-г нь буцаах. 
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
