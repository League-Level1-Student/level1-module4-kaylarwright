package extra;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PracticeTest implements ActionListener{
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	JTextField tf = new JTextField(10);
	JButton button = new JButton();
	JButton BUTTON = new JButton();
public static void main(String[] args) {
	PracticeTest pt = new PracticeTest();
}
PracticeTest(){
	frame.setVisible(true);
	frame.setSize(500, 500);
	frame.add(panel);
	label.setText("I have a neck, but no head, and I wear a cap. What am I? A");
	panel.add(label);
	panel.add(tf);
	button.addActionListener(this);
	button.setText("Submit");
	panel.add(button);
	BUTTON.addActionListener(this);
	BUTTON.setText("Hint");
	panel.add(BUTTON);
	frame.pack();
}
@Override
public void actionPerformed(ActionEvent e) {
	JButton buttonPressed = (JButton) e.getSource();
	if(buttonPressed == button) {
	String value = tf.getText();
	String answer = "Bottle";
	if(answer.equalsIgnoreCase(value)) {
		JOptionPane.showMessageDialog(null, "Correct");
	}else {
		JOptionPane.showMessageDialog(null, "Incorrect");
	}
	}
	
	if(buttonPressed == BUTTON) {
		JOptionPane.showMessageDialog(null, "You drink out of them.");
	}
}
}
