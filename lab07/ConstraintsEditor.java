package lab07;

import java.awt.*;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;


public class ConstraintsEditor extends Frame{
	
	public ConstraintsEditor() {
		setLayout(null);
		setTitle("Constraints Editor");
		setSize(430, 430);
		setVisible(true);
		Button ok = new Button("OK");  
		ok.setBounds(100,340,60,25);  
		
		Button help = new Button("Help");  
		help.setBounds(170,340,60,25);  
		
		Button exit = new Button("Cancel");  
		exit.setBounds(240,340,60,25);  
		exit.addActionListener(e -> {
	    	dispose();
		});
		Label l = new Label("Grid Position");
		l.setLocation(20, 35);
		l.setSize(107, 20);
		Label x = new Label("X: ");
		x.setBounds(25, 62,40, 18);
		TextField xt = new TextField("0");  
		xt.setBounds(85, 60, 40, 20);
		Label y = new Label("Y: ");
		y.setBounds(25, 90,40, 18);
		TextField yt = new TextField("0");  
		yt.setBounds(85, 90, 40, 20);
		
		Label w = new Label("Width: ");
		w.setBounds(25, 120,40, 18);
		TextField wt = new TextField("1");  
		wt.setBounds(85, 120, 40, 20);
		Label h = new Label("Height: ");
		h.setBounds(25, 150,40, 18);
		TextField ht = new TextField("1");  
		ht.setBounds(85, 150, 40, 20);
		
		
		add(ok);
		add(help);
		add(exit);
		add(x);
		add(xt);
		add(y);
		add(yt);
		add(w);
		add(wt);
		add(h);
		add(ht);
		add(l);
		
		//-----------------------------------------
		Label E = new Label("External Insets");
		E.setLocation(160, 35);
		E.setSize(103, 20);
		Label t = new Label("Top: ");
		t.setBounds(165, 62,40, 18);
		TextField tt = new TextField("0");  
		tt.setBounds(220, 60, 40, 20);
		Label le = new Label("Left: ");
		le.setBounds(165, 90,40, 18);
		TextField let = new TextField("0");  
		let.setBounds(220, 90, 40, 20);
		
		Label b = new Label("Bottom: ");
		b.setBounds(165, 120,40, 18);
		TextField bt = new TextField("0");  
		bt.setBounds(220, 120, 40, 20);
		Label r = new Label("Right: ");
		r.setBounds(165, 150,40, 18);
		TextField rt = new TextField("0");  
		rt.setBounds(220, 150, 40, 20);
		
		add(t);
		add(tt);
		add(le);
		add(let);
		add(b);
		add(bt);
		add(r);
		add(rt);
		add(E);
		
		//---------------------------------
		Label s = new Label("Size Padding");
		s.setLocation(290, 35);
		s.setSize(107, 20);
		Label W = new Label("Width: ");
		W.setBounds(295, 62,40, 18);
		TextField Wt = new TextField("0");  
		Wt.setBounds(350, 60, 44, 20);
		Label H = new Label("Height: ");
		H.setBounds(295, 90,40, 18);
		TextField Ht = new TextField("0");  
		Ht.setBounds(350, 90, 44, 20);
		
		add(W);
		add(H);
		add(Wt);
		add(Ht);
		add(s);
		//--------------------------------
		
		
		//-------------------------------------
				Label weight = new Label("Weight");
				weight.setLocation(20, 185);
				weight.setSize(107, 20);
				Label X = new Label("X: ");
				X.setBounds(25, 210,20, 18);
				TextField Xt = new TextField("0.0");  
				Xt.setBounds(64, 210, 60, 20);
				Label Y = new Label("Y: ");
				Y.setBounds(25, 240,20, 18);
				TextField Yt = new TextField("0.0");  
				Yt.setBounds(64, 240, 60, 20);
				add(X);
				add(Xt);
				add(Y);
				add(Yt);
				add(weight);
				//-------------
				Label a = new Label("Anchor");
				a.setBounds(160, 185, 210, 20);
				CheckboxGroup d = new CheckboxGroup();
				Checkbox d1 = new Checkbox("NW",d, false);
				d1.setBounds(164, 210, 65, 18);
				Checkbox d2 = new Checkbox("W",d, false);
				d2.setBounds(164, 235, 65, 18);
				Checkbox d3 = new Checkbox("SW",d, false);
				d3.setBounds(164, 260, 65, 18);
				Checkbox d4 = new Checkbox("N",d, false);
				d4.setBounds(250, 210, 30, 18);
				Checkbox d5 = new Checkbox("C",d, true);
				d5.setBounds(250, 235, 30, 18);
				Checkbox d6 = new Checkbox("S",d, false);
				d6.setBounds(250, 260, 30, 18);
				Checkbox d7 = new Checkbox("NE",d, false);
				d7.setBounds(326, 210, 30, 18);
				Checkbox d8 = new Checkbox("E",d, false);
				d8.setBounds(326, 235, 30, 18);
				Checkbox d9 = new Checkbox("SE",d, false);
				d9.setBounds(326, 260, 30, 18);
				add(d1);
				add(d2);
				add(d3);
				add(d4);
				add(d5);
				add(d6);
				add(d7);
				add(d8);
				add(d9);
				add(a);
				
				//-------
				Label f = new Label("Fill");
				f.setLocation(20, 280);
				f.setSize( 380 , 20);
				CheckboxGroup c = new CheckboxGroup();
				Checkbox c1 = new Checkbox("None",c, true);
				c1.setBounds(25, 300, 85, 30);
				Checkbox c2 = new Checkbox("Horizontal",c, false);
				c2.setBounds(110, 300, 90, 30);
				Checkbox c3 = new Checkbox("Vertical",c, false);
				c3.setBounds(205, 300, 90, 30);
				Checkbox c4 = new Checkbox("Both",c, false);
				c4.setBounds(300, 300, 90, 30);
				add(c1);
				add(c2);
				add(c3);
				add(c4);
				add(f);
//				
				
				
	}
	
	public static void main(String[] args) {
		ConstraintsEditor c =  new  ConstraintsEditor();
	}
}
