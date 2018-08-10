import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Chuckle implements ActionListener {
	static JFrame frame;
	static JPanel panel;
	static JButton button;
	static JButton button2;

	public static void main(String[] args) {
		Chuckle c = new Chuckle();
		c.makeButton();
	}

	public void makeButton() {
		frame = new JFrame();
		frame.setVisible(true);
		JPanel panel = new JPanel();
		frame.add(panel);
		button = new JButton();
		button.setText("Joke");
		button2 = new JButton();
		button2.setText("Punchline");
		panel.add(button);
		button.addActionListener(this);
		button2.addActionListener(this);
		panel.add(button2);
		frame.pack();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(button)) {
			JOptionPane.showMessageDialog(null, "Why couldn't the blonde add 10 and 7 on the calculator?");
		} else if (e.getSource().equals(button2)) {
			JOptionPane.showMessageDialog(null, "She couldn't find the 10 button.");
			System.exit(0);
		}
	}
}
