import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Event;

import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

import java.util.*;
import java.lang.*;
import java.io.*;

public class GUIforP {
	
	

	public JFrame frmPascalsTriangle;
	public JTextField input;
	public JTextField output;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIforP window = new GUIforP();
					window.frmPascalsTriangle.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public GUIforP() {
		initialize();
	}

	
	private void initialize() {
		frmPascalsTriangle = new JFrame();
		frmPascalsTriangle.setForeground(new Color(0, 0, 0));
		frmPascalsTriangle.setTitle("Pascal's Triangle");
		frmPascalsTriangle.setBackground(new Color(255, 240, 245));
		frmPascalsTriangle.getContentPane().setBackground(new Color(230, 230, 250));
		frmPascalsTriangle.setBounds(100, 100, 450, 300);
		frmPascalsTriangle.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPascalsTriangle.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Input a number", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(16, 34, 160, 55);
		frmPascalsTriangle.getContentPane().add(panel);
		panel.setLayout(null);
		
		input = new JTextField();
		input.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		input.setBounds(6, 18, 145, 29);
		panel.add(input);
		input.setColumns(10);
		
		
		JLabel labelrow = new JLabel("Row");
		labelrow.setBounds(22, 120, 56, 16);
		frmPascalsTriangle.getContentPane().add(labelrow);
		
		JButton calc = new JButton("Calculate");
		calc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		calc.setBounds(188, 51, 97, 25);
		frmPascalsTriangle.getContentPane().add(calc);
		
		JButton exit = new JButton("Exit");
		exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		exit.setForeground(new Color(0, 0, 0));
		exit.setBackground(new Color(255, 69, 0));
		exit.setBounds(323, 215, 97, 25);
		frmPascalsTriangle.getContentPane().add(exit);
		
		output = new JTextField();
		output.setEditable(false);
		output.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		output.setBounds(32, 158, 212, 22);
		frmPascalsTriangle.getContentPane().add(output);
		output.setColumns(10);
		{
class tri {
	public void main(String[] args) throws java.lang.Exception
	   {
		number = input.getText();
		int n = Integer.valueOf(number);
	      
	      	    		  
	   }
	public ArrayList<Integer> nthRow(int n)
	{
		ArrayList<Integer> res = new ArrayList<Integer>();
		res.add(1);       for (int i = 1; i <= n; i++) {
	           res.add(i, (res.get(i - 1) * (n - i + 1)) / (i));
	}
		return res;
	}
}

}
	}
}