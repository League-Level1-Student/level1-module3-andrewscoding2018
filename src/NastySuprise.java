import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NastySuprise implements ActionListener {
	JButton button;
	JPanel panel;
	JFrame frame;
	JButton button1;

	public static void main(String[] args) {
		NastySuprise n = new NastySuprise();
	}

	NastySuprise() {
		frame = new JFrame();
		frame.setVisible(true);
		panel = new JPanel();
		button = new JButton();
		button1 = new JButton();
		frame.add(panel);
		panel.add(button);
		panel.add(button1);
		button.setText("Trick");
		button.addActionListener(this);
		button1.addActionListener(this);
		button1.setText("Treat");
		frame.pack();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(button)) {
			showPictureFromTheInternet("http://team3128.org/assets/header/logo.png");
		} else if (e.getSource().equals(button1)) {
			showPictureFromTheInternet("http://team7159.org/static/RoboRavensLogo.png");
		}

	}

	private void showPictureFromTheInternet(String imageUrl) {
		try {
			URL url = new URL(imageUrl);
			Icon icon = new ImageIcon(url);
			JLabel imageLabel = new JLabel(icon);
			JFrame frame = new JFrame();
			frame.add(imageLabel);
			frame.setVisible(true);
			frame.pack();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}
}
