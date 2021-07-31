import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Gui implements ActionListener {
	private static JFrame frame;
	private static JPanel panel;
	private static JLabel label,label2,label3;
	private static JTextField textfield,textfield2;
	private static JButton button;
	public static void main(String args[])
	{
	frame = new JFrame();
	frame.setSize(300,300);
	frame.setTitle("Log in");
	frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
	panel = new JPanel();
	panel.setSize(200,200);
	panel.setLayout(null);
	frame.add(panel);
	label =new JLabel("Username");
	label.setBounds(10, 20, 80, 25);
	panel.add(label);
	textfield = new JTextField(20);
	textfield.setBounds(90, 20, 80, 25);
	panel.add(textfield);
	label2 = new JLabel("Password");
	label2.setBounds(10, 50, 80, 25);
	panel.add(label2);
    textfield2 =new JTextField(20);
	textfield2.setBounds(90, 50, 80, 25);
	panel.add(textfield2);
    button = new JButton("log in");
	button.setBounds(50, 100, 150, 25);
	panel.add(button);
	label3 = new JLabel();
	label3.setBounds(70, 130,150, 25);
	panel.add(label3);
	button.addActionListener(new Gui());
	frame.setVisible(true);
	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String username =textfield.getText();
		String password = textfield2.getText();
		if(username.equals("Waqas")& password.equals("abeysaley"))
		{
		    label3.setText("login succesfully");
		}
		else
		{
			label3.setText("Incorrect password");
		}
		
	}

}
