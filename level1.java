package extra;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class level1 implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JTextField tf = new JTextField(5);
	JLabel label = new JLabel();
	JButton button = new JButton();
	JTextField TF = new JTextField(5);
	JLabel L = new JLabel();
	public static void main(String[] args) {
		
		level1 l = new level1();
		
	}
	level1(){
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.add(panel);
		panel.setVisible(true);
		panel.add(tf);
		label.setText("Celsius");
		panel.add(label);
		button.setText("Convert");
		panel.add(button);
		panel.add(TF);
		L.setText("Fahrenheit");
		panel.add(L);
		button.addActionListener(this);
		frame.pack();
		
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		String value = tf.getText();
		int f = Integer.parseInt(value);
		double c = (5.0/9.0)*f-32;
		TF.setText(""+c);
		
	}
	}


