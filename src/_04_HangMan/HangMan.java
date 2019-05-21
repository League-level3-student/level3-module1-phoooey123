package _04_HangMan;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
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
	String str1 = "";
	String str2 = "";
	String current = "";
	int cur = 0;
	int lives = 10;
	ArrayList <Character> used = new ArrayList <Character>();
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
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		current = Wstack.pop();
		cur = current.length();
		
		for (int i = 0; i < cur; i++) {
			display+="_";
			
			
		}
		l1.setText(display + "  " + "Lives Remaining: " + lives);
		
		
	}
		void finish() {
		if(current.equals(display) && !Wstack.isEmpty()) {
			current = Wstack.pop();
			cur = current.length();
			display = "";
			
			for (int i = 0; i < cur; i++) {
				display+="_";
				
			}
			lives = 10;
			l1.setText(display + "  " + "Lives Remaining: " + lives);
		}
		else if (lives == 1) {
			System.exit(0);
		}
		else if (current.equals(display) && Wstack.isEmpty()) {
			JOptionPane.showMessageDialog(null, "You Win");
			System.exit(0);
		}
		 
		
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
		
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		finish();
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		char c = e.getKeyChar();
		for (int i = 0; i < cur; i++) {
			if(current.charAt(i) == c) {
				str1 = display.substring(0,i);
				str2 = display.substring(i+1, cur);
				display = str1 + c + str2 ;
				
			}
			else if (current.charAt(i) != c && !used.contains(c) && !word.contains(""+c)) {
				lives--;
				used.add(c);
				
			}
			l1.setText(display + "  " + "Lives Remaining: " + lives);
		}
	
	}
	
}
 