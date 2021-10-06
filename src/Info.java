import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Info {

	private static JFrame info_frame;
	private static JLabel shrek;
	private static ImageIcon shreksy;

	Info() {
		info_frame = new JFrame("Yes or No");
		info_frame.setSize(720, 480);
		info_frame.setResizable(false);
		info_frame.setLayout(null);
		info_frame.getContentPane().setBackground(Color.LIGHT_GRAY);

		shreksy = new ImageIcon("shrek.jpg");
		shrek = new JLabel();
		shrek.setBounds(-15, 0, 720, 480);
		shrek.setIcon(shreksy);
		info_frame.add(shrek);

		info_frame.setVisible(true);
	}
}
