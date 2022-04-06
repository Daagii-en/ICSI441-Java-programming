package lab08;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
public class KeyEventDemo extends Frame implements KeyListener {

	private TextField tfInput;
	private TextArea taDisplay;
	
	public KeyEventDemo() {
		setLayout(new FlowLayout());
		add(new Label("Enter Text: "));
		tfInput = new TextField(10);
		add(tfInput);
		taDisplay = new TextArea(5,40);
		add(taDisplay);
		tfInput.addKeyListener(this);
		setTitle("KeyEvent Demo");
		setSize(400, 200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new KeyEventDemo();
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		taDisplay.append("You have typed" +e.getKeyChar()+"\n");
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("key daragdaj baih uy");
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("key daragdasnii daraa ");
	}

}
