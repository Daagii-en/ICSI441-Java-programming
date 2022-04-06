package lab08;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
public class Counter extends Frame implements ActionListener {
		private Label lblCount; //declare component Label
		private TextField tfCount; //declare component TextField
		private Button btnCount; //declare component Button
		private int count = 0; //counter's value
		private Button btnClose;
		/** Constructor to setup GUI components */
		public Counter() {
			setLayout(new FlowLayout());
			lblCount = new Label("Counter");
			add(lblCount);
			tfCount = new TextField("0", 10);
			tfCount.setEditable(false);
		    add(tfCount);
		    btnCount = new Button("Count");
		    add(btnCount);
		    btnCount.addActionListener(this);
		    //btnClose nertei button uusgeed 
		    btnClose = new Button("Close");
		    add(btnClose);
		    btnClose.addActionListener(this);
		    //close hiih event uusgej bna
		    btnClose.addActionListener(e -> {
		    	dispose();
			});
		    setTitle("AWT Counter");
		    setSize(250, 100);
		    setVisible(true);
		}
		/** the entry main() method*/
		public static void main(String[] args) {
			Counter app =new Counter();
		}
		
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		count++;
		tfCount.setText(count + "");
	}
}
