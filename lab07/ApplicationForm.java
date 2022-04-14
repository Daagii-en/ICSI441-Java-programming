package lab07;
import java.awt.*;
public class ApplicationForm extends Frame {

	ApplicationForm(){ 
		
		Label header = new Label("Application Form");
		header.setBounds(50,40, 200, 30);
		header.setFont(new Font("Whisper", Font.ITALIC, 18));
		Label firstName = new Label("First Name");  
		firstName.setBounds(20, 70, 80, 20);  
		  
		Label lastName = new Label("Last Name");  
		lastName.setBounds(20, 100, 80, 20);  
		  
		Label address = new Label("Address");  
		address.setBounds(20, 130, 80, 20);  
		Label email = new Label("E-MailID");  
		email.setBounds(20, 160, 80, 20);
		  
		TextField firstNameTF = new TextField();  
		firstNameTF.setBounds(120, 70, 100, 20);  
		  
		TextField lastNameTF = new TextField();  
		lastNameTF.setBounds(120, 100, 100, 20);  
		  
		TextField addressTF = new TextField();  
		addressTF.setBounds(120, 130, 100, 20); 
		TextField emailTF = new TextField();  
		emailTF.setBounds(120, 160, 100, 20);
		  
		Button sbmt = new Button("Submit");  
		sbmt.setBounds(20, 190, 60, 25); 
		Button clear = new Button("Clear");
		clear.setBounds(90, 190, 60, 25);
		  
		Button exit = new Button("Exit");  
		exit.setBounds(160,190,60,25);  
		exit.addActionListener(e -> {
	    	dispose();
		});
		
		Label l = new Label("Data");
		l.setBounds(350, 40, 100, 30);
		l.setFont(new Font("Serif", Font.ITALIC, 18));
		TextArea t = new TextArea();
		t.setBounds(250, 70, 250, 110);
		Button save= new Button("Save");
		save.setBounds(340, 190, 60, 25);
		setBackground(Color.LIGHT_GRAY);
		add(header);
		add(firstName);  
		add(lastName);  
		add(address);
		add(email);
		add(firstNameTF);  
		add(lastNameTF);  
		add(addressTF);
		add(emailTF);
		add(sbmt);
		add(clear);
		add(exit);  
		add(l);
		add(t);
		add(save);
		setSize(520,300);
		
		setLayout(null);  
		setVisible(true);  
		}  
		public static void main(String[] args) {  
		// TODO Auto-generated method stub  
			ApplicationForm awt = new ApplicationForm();    
		}  
}
