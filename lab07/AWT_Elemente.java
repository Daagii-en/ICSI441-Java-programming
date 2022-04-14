package lab07;
import java.awt.*;
public class AWT_Elemente extends Frame  {
	private Label lbl; 
	private TextField text; 
	private Checkbox checkbox;
	private Button btn;
	/** Constructor to setup GUI components */
	public AWT_Elemente() {
		text = new TextField("TextField");
		text.setBounds(10, 30, 280, 25); 
		add(text);
		lbl = new Label("Label");
		lbl.setBounds(10, 60, 280, 25);
		add(lbl);
		btn = new Button("Button");
		btn.setBounds(10, 90, 280, 30);
	    add(btn);
	    btn.addActionListener(e -> {
	    	dispose();
		});
		checkbox = new Checkbox("Checkbox");
		checkbox.setBounds(10, 110, 280, 50);
		add(checkbox);
		 TextArea textarea = new TextArea("TextArea");
		 textarea.setBounds(10,160,280,100); 
		 add(textarea);
		setTitle("AWT-Elemente");
	    setSize(300, 300);
	    setBackground(Color.gray);
	    setLayout(null);
	    setVisible(true);
	}
	/** the entry main() method*/
	public static void main(String[] args) {
		AWT_Elemente app =new AWT_Elemente();
		
	}
}
