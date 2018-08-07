package extra;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class test implements ActionListener{
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	JTextField tf = new JTextField(5);
	JButton button = new JButton();
	JButton Button = new JButton();
public static void main(String[] args) {
	
	test t = new test();
}
test(){
	frame.setVisible(true);
	frame.add(panel);
	label.setText("When you want to use me, "
			+ "you throw me away. When you're done using me, "
			+ "you bring me in. What am I?");
	panel.add(label);
	panel.add(tf);
	button.setText("Submit");
	Button.setText("Hint");
	panel.add(button);
	panel.add(Button);
	button.addActionListener(this);
	Button.addActionListener(this);
	frame.pack();
}
@Override
public void actionPerformed(ActionEvent e) {
	String value = tf.getText();
	String answer = "An anchor";
	if (value.equalsIgnoreCase(answer)) {
		JOptionPane.showMessageDialog(null, "Correct");
	}else {
		JOptionPane.showMessageDialog(null, "Incorrect");
	}
	
}

}

