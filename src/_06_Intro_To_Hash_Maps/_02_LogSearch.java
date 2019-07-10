package _06_Intro_To_Hash_Maps;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _02_LogSearch implements ActionListener {
	/*
	 * Crate a HashMap of Integers for the keys and Strings for the values. Create a
	 * GUI with three buttons. Button 1: Add Entry When this button is clicked, use
	 * an input dialog to ask the user to enter an ID number. After an ID is
	 * entered, use another input dialog to ask the user to enter a name. Add this
	 * information as a new entry to your HashMap. n-1 n-i-1
	 *
	 * j>j+1 Button 2: Search by ID When this button is clicked, use an input dialog
	 * to ask the user to enter an ID number. If that ID exists, display that name
	 * to the user. Otherwise, tell the user that that entry does not exist.
	 * 
	 * Button 3: View List When this button is clicked, display the entire list in a
	 * message dialog in the following format: ID: 123 Name: Harry Howard ID: 245
	 * Name: Polly Powers ID: 433 Name: Oliver Ortega etc...
	 * 
	 * When this is complete, add a fourth button to your window. Button 4: Remove
	 * Entry When this button is clicked, prompt the user to enter an ID using an
	 * input dialog. If this ID exists in the HashMap, remove it. Otherwise, notify
	 * the user that the ID is not in the list.
	 *
	 *
	 */

	static HashMap<Integer, String> hm = new HashMap<Integer, String>();
	JFrame f = new JFrame();
	JPanel p = new JPanel();
	JButton b1 = new JButton();
	JButton b2 = new JButton();
	JButton b3 = new JButton();

	public static void main(String[] args) {
		_02_LogSearch ls = new _02_LogSearch();
		ls.JStuff();
	}

	void JStuff() {
		f.add(p);
		p.add(b1);
		p.add(b2);
		p.add(b3);

		f.setVisible(true);
		b1.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource().equals(b1)) {
			String ID1 = JOptionPane.showInputDialog("Enter an ID Number");
			String name = JOptionPane.showInputDialog("Enter a Name");
			int ID = Integer.parseInt(ID1);
			hm.put(ID, name);
		}
		if(e.getSource().equals(b2)) {
			String ID21 = JOptionPane.showInputDialog("Enter an ID Number");
			int ID2 = Integer.parseInt(ID21);
			if(hm.containsKey(ID2)) {
				JOptionPane.showMessageDialog(null, hm.get(ID2));
			}
			else {
				JOptionPane.showMessageDialog(null, "User does not exist");
			}
		}
		String show = "";
		if(e.getSource().equals(b3)) {
			for(int s : hm.keySet()) {
				
				show+= "ID: " + s + " Name: " + hm.get(s) + '\n';
				JOptionPane.showMessageDialog(null, show);
			}
		}
	}
}
