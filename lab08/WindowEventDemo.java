package lab08;

import java.awt.*;
import java.awt.event.*;

public class WindowEventDemo extends Frame implements ActionListener,WindowListener{

	private TextField tfCount;
	private int count =0 ;
	/**Constructor to setup the GUI */
	
	public WindowEventDemo() {
		setLayout(new FlowLayout()); //this frame sets to flowlayout
		add(new Label("Counter"));
		tfCount = new TextField("0",10);
		tfCount.setEditable(false);
		add(tfCount);
		Button btnCount = new Button("Count");
		add(btnCount);
		btnCount.addActionListener(this);
		addWindowListener(this);
		setTitle("WindowEvent Demo");
		setSize(250,100);
		setVisible(true);
	}
	public static void main(String[] args) {
		new WindowEventDemo();
	}
	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Window-iig neeh event ajillaj baina.");
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		System.exit(0);
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("windowClosed: haah");
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("windowIconified: Minimize boloh");
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("windowDeiconified: Maximize boloh");
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("windowActivated: tsonh haragdaj baina");
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("windowDeactivated: tsonh haragdahgui baina.");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		count++;
		tfCount.setText(count+ "");
	}
		
	
}
