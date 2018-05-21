package main;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class CivilizationGame {
	//JGRAPHICS CONSTRUCTORS
	private JFrame frame = new JFrame("Civilization");
	private JScrollPane mapPane = new JScrollPane();
	private JPanel leftPanel = new JPanel(); //200 from right
	private JPanel topPanel = new JPanel(); //50 from top
	
	
	public CivilizationGame(){
		//ADD STUFF
	}
	
	public void display(){
		//JFrame
		frame.setPreferredSize(new Dimension(1920, 1080));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setResizable(false);
		
		//mapPane
		mapPane.setBounds(200, 50, 1720, 1030);
		
		
		
		frame.pack();
	}
}
