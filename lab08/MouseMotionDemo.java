package lab08;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowEvent;

public class MouseMotionDemo extends Frame 
         implements MouseListener, MouseMotionListener{

	private TextField tfMouseClickX;
	private TextField tfMouseClickY;
	private TextField tfMousePositionX;
	private TextField tfMousePositionY;
	public MouseMotionDemo() {
		setLayout(new FlowLayout());
		add(new Label("X-Click: "));
		tfMouseClickX = new TextField(10);
		tfMouseClickX.setEditable(false);
		add(tfMouseClickX);
		add(new Label("Y-Click: "));
		tfMouseClickY = new TextField(10);
		tfMouseClickY.setEditable(false);
		add(tfMouseClickY);
		
		add(new Label("X-Position: "));
		tfMousePositionX = new TextField(10);
		tfMousePositionX.setEditable(false);
		add(tfMouseClickX);
		add(new Label("Y-Position: "));
		tfMousePositionY = new TextField(10);
		tfMousePositionY.setEditable(false);
		add(tfMousePositionY);
		addMouseListener(this);
		addMouseMotionListener(this);
		setTitle("MouseMotion Demo");
		setSize(400, 120);
		setVisible(true);
	}
	public static void main(String[] args) {
		new MouseMotionDemo();
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		tfMouseClickX.setText(e.getX()+"");
		tfMouseClickY.setText(e.getY()+"");
	}
	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Point temp_point = new Point(mouse_x,mouse_y);");
	}
	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		tfMousePositionX.setText(e.getX()+"");
		tfMousePositionY.setText(e.getY()+"");
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Mouse daragdlaa");
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("mouse  darsan uyd released hiigdej bna");
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Mouse object ruu orj irlee.");
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Mouse object oos garsan bna");
	}
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		System.exit(0);
	}
}