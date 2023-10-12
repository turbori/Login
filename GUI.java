import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class GUI implements ActionListener {
	
	private static JLabel userLabel;
	private static JTextField userText;
	private static JLabel passwordLabel;
	private static JPasswordField passwordText;
	private static JButton button;
	private static JLabel success;
	
	

	public static void main(String[] args) {
		JPanel panel = new JPanel();
		JFrame frame = new JFrame();
		frame.setSize(350, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.add(panel);
		
		panel.setLayout(null);
		
		userLabel = new JLabel("User"); //will say user and the box will be to the right of it so the user can type it. 
		userLabel.setBounds(10, 20, 80, 25);
		panel.add(userLabel);
		
		 userText = new JTextField(20); //box where the user types
		userText.setBounds(100, 20, 165, 25);
		panel.add(userText);
		
		 passwordLabel = new JLabel("Password"); //will print out password. make sure it is alligned with the text box. 
		passwordLabel.setBounds(10, 50, 80, 25); //we have to lower the y axis so it does not sit on top of usertext
		panel.add(passwordLabel);
		
		 passwordText = new JPasswordField(); //box where the user types
		passwordText.setBounds(100, 50, 165, 25); //we have to lower the y axis so it does not sit on top of usertext
		panel.add(passwordText);
		
		 button = new JButton("Login");
		button.setBounds(10, 80, 80, 25);
		button.addActionListener(new GUI());
		panel.add(button);
		
		 success = new JLabel("");
		success.setBounds(10, 110, 300, 25);
		panel.add(success);
		
		
		frame.setVisible(true); //this is so you can see the box around the text field
		

		

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String user = userText.getText();
		String password = passwordText.getText();
		System.out.println(user + ", " + password);
		
		if (user.equals("Riyad") && password.equals("Tesla123")) {
			success.setText("Welcome in!");
		}
		
		
	}

}
