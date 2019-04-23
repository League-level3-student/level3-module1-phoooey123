package _04_HangMan;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class HangMan implements KeyListener{
	JFrame f;
	JPanel p;
	JLabel l;
	String word;
	public static void main(String[] args) {
		
		
			
		new HangMan().start();
	}
	
	void start() {
		Utilities u = new Utilities();
		String words = JOptionPane.showInputDialog("How mahy words would you like to guess?");
		word = u.readRandomLineFromFile("dictionary.txt");
		f = new JFrame();
		p = new JPanel();
		l = new JLabel();
		f.add(p);
		p.add(l);
		f.addKeyListener(this);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		char c = e.getKeyChar();
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
 