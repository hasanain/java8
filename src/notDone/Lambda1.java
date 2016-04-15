package notDone;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

public class Lambda1 {
	JFrame f;
	JPanel p;
	JLabel l;
	JButton b;
	int i;

	public Lambda1() {
		i = 0;
		f = new JFrame("Lambdas Demo");
		p = new JPanel(new GridLayout(2, 1));
		l = new JLabel(String.valueOf(i), SwingConstants.CENTER);
		b = new JButton("Increment");

		b.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				l.setText(String.valueOf(++i));

			}
		});

		p.add(l);
		p.add(b);

		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.add(p);
		f.pack();
		f.setVisible(true);
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				new Lambda1();

			}
		});
	}

}
