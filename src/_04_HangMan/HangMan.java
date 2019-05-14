package _04_HangMan;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class HangMan implements KeyListener{
	JFrame f;
	JPanel p;
	JLabel l1;
	String word;
	String display = "";
	int cur = 0;
	Stack<String> Wstack = new Stack<String>();
	public static void main(String[] args) {
		
		
			
		new HangMan().start();
	}
	
	void start() {
		Utilities u = new Utilities();
		String words1 = JOptionPane.showInputDialog("How many words would you like to guess?(Under 267)");
		int words = Integer.parseInt(words1);
		for (int i = 0; i < words; i++) {
		word = u.readRandomLineFromFile("dictionary.txt");
		Wstack.push(word);
		}
		f = new JFrame();
		p = new JPanel();
		l1 = new JLabel();
		f.add(p);
		p.add(l1);
		f.setVisible(true);
		f.setSize(200, 50);
		f.addKeyListener(this);
		String current = Wstack.pop();
		cur = current.length();
		
		for (int i = 0; i < cur; i++) {
			display+="_";
			
			
		}
		l1.setText(display + "  " + "Lives Remaining: ");
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		char c = e.getKeyChar();
		
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		for (int i = 0; i < cur; i++) {
			
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
 