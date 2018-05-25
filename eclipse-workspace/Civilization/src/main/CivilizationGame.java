package main;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import map.Tile;
import sound.sounds;

public class CivilizationGame {
	//CONSTANTS
	private final int SCROLL_SPEED = 5;
	
	//JGRAPHICS CONSTRUCTORS
	private JFrame frame = new JFrame("Civilization");
	private JFrame titleFrame = new JFrame("Civilization");
	private JPanel leftPanel = new JPanel(); //200 from right
	private JPanel topPanel = new JPanel(); //50 from top
	private JPanel mapPanel = new JPanel();
	private JScrollPane mapPane;
	private JButton[][] $mapButtons = new JButton[Tile.getMAP_SIZE()][Tile.getMAP_SIZE()];
	
	//BUTTON LISTENERS
	private TileListener tileListener = new TileListener();
	
	//Import tile graphics
	/*static ImageIcon forestTileII = new ImageIcon(Tile.class.getResource("map/resources/forestTile.png"));	
	static ImageIcon grassTileII = new ImageIcon(Tile.class.getResource("map/resources/grassTile.png"));
	static ImageIcon mountainTileII = new ImageIcon(Tile.class.getResource("src/map/resources/mountainTile.png"));
	static ImageIcon sandTileII = new ImageIcon(Tile.class.getResource("src/map/resources/sandTile.png"));
	static ImageIcon waterTileII = new ImageIcon(Tile.class.getResource("src/map/resources/waterTile.png"));*/
	
	public CivilizationGame(){
		//ADD STUFF
		
	}
	
	public void display(){
		//JFrame
		frame.setPreferredSize(new Dimension(1920, 1015));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);
		//frame.setResizable(false);
		
		//Title screen
		titleFrame.setPreferredSize(new Dimension(1920, 1015));
		titleFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		titleFrame.setLayout(null);
		//titleFrame.setVisible(true);
		
		//mapPane
		mapPanel.setPreferredSize(new Dimension(50 * Tile.getMAP_SIZE(),50 * Tile.getMAP_SIZE()));
		mapPanel.setLayout(null);
		mapPane = new JScrollPane(mapPanel);
		mapPane.setBounds(200, 50, 1705, 927);
		mapPane.setAutoscrolls(true);
		mapPane.getVerticalScrollBar().setUnitIncrement(SCROLL_SPEED);
		mapPane.getHorizontalScrollBar().setUnitIncrement(SCROLL_SPEED);
		//mapPane.setPreferredSize(new Dimension(2000, 2000));
		//mapPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		//mapPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		//mapPane.setBackground(Color.red);
		frame.add(mapPane);

		for (int i = 0; i < $mapButtons.length; i++) {
			for (int j = 0; j < $mapButtons[i].length; j++) {
				$mapButtons[i][j] = new JButton(Tile.get$map()[i][j].getTileImageIcon());
				$mapButtons[i][j].addActionListener(tileListener);
				$mapButtons[i][j].setBounds(j*Tile.getTEXTURE_SIZE(), i*Tile.getTEXTURE_SIZE(), Tile.getTEXTURE_SIZE(), Tile.getTEXTURE_SIZE());
				//$mapButtons[i][j].setBorder(BorderFactory.createEmptyBorder());
				/*$mapButtons[i][j].setBorder(null);
				$mapButtons[i][j].setBorderPainted(false);*/
				mapPanel.add($mapButtons[i][j]);
			}
		}
		
		frame.pack();
	}
	
	public class TileListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			//if (e.getSource() == ) { 
			try {
				sounds.clickPlay();
			} catch (UnsupportedAudioFileException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (LineUnavailableException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}
}
