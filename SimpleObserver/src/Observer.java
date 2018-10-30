import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;


public class Observer {
	JFrame frame;
	
	public static void main(String[] args) {

		Observer example = new Observer();
		
		example.go();
	}	
	
	public void go() {
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton button = new JButton("Should I do it?");
		button.addActionListener(new AngelListener());
		button.addActionListener(new DevilListener());
		frame.getContentPane().add(BorderLayout.CENTER, button);
		frame.pack();
		frame.setVisible(true);
	}
	
	class AngelListener implements ActionListener {
		
		public void actionPerformed(ActionEvent event) {
			System.out.println("Don't do it, you might regret it");
		}
	}
	
	class DevilListener implements ActionListener {

		public void actionPerformed(ActionEvent event) {
			System.out.println("Go ahead and do it");
		}
	}

}
