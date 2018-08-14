package extra;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Practice implements ActionListener{
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	JTextField tf = new JTextField(10);
	JButton button = new JButton();
	JButton BUTTON = new JButton();
public static void main(String[] args) {
	Practice p = new Practice();
}
Practice(){
	frame.setVisible(true);
	frame.add(panel);
	label.setText("What is you name");
	panel.add(label);
	panel.add(tf);
	button.addActionListener(this);
	BUTTON.addActionListener(this);
	button.setText("Greeting");
	BUTTON.setText("Goodbye");
	panel.add(button);
	panel.add(BUTTON);
	frame.pack();

}
@Override
public void actionPerformed(ActionEvent e) {
	JButton buttonPressed = (JButton) e.getSource();
	String value = tf.getText();
	if(buttonPressed == button) {
JOptionPane.showMessageDialog(null, "Hi " + value);
	}
	if (buttonPressed == BUTTON) {
		JOptionPane.showMessageDialog(null, "Bye " + value);
	}
}
}
