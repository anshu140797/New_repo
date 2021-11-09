package Java_practise;

import javax.swing.JOptionPane;
public class JOption_Pane {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name =JOptionPane.showInputDialog("What is your name?");
		JOptionPane.showMessageDialog(null,"Hello "+ name);
		
		int age = Integer.parseInt(JOptionPane.showInputDialog("What is your age?"));
		JOptionPane.showMessageDialog(null,"Your age is " +age);
		
		double height = Double.parseDouble(JOptionPane.showInputDialog("What is your height?"));
		JOptionPane.showMessageDialog(null,"Your height is " +height);
		

	}

}
