package main;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
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
	private JLabel title = new JLabel("Pjephphrey B's : Society IV");
	private JButton btnCasimir = new JButton(iconCasimir);
	private JButton btnMussolini = new JButton(iconMussolini);
	private JButton btnGenghis = new JButton(iconGenghis);
	private JButton btnSejong = new JButton(iconSejong);
	private JButton btnWashington = new JButton(iconWashington);
	private JLabel lblGenghis = new JLabel("Genghis Khan"), lblWashington = new JLabel("George Washington"), lblSejong = new JLabel("Sejong"), lblMussolini = new JLabel("Mussolini"), lblCasimir = new JLabel("Casimir III");
	
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
	
	static ImageIcon iconGenghis = new ImageIcon(CivilizationGame.class.getClassLoader().getResource("main/resources/genghisIcon.jpg"));
	static ImageIcon iconCasimir = new ImageIcon(CivilizationGame.class.getClassLoader().getResource("main/resources/casimirIcon.jpg"));
	static ImageIcon iconMussolini = new ImageIcon(CivilizationGame.class.getClassLoader().getResource("main/resources/mussoliniIcon.jpg"));
	static ImageIcon iconSejong = new ImageIcon(CivilizationGame.class.getClassLoader().getResource("main/resources/sejongIcon.jpg"));
	static ImageIcon iconWashington = new ImageIcon(CivilizationGame.class.getClassLoader().getResource("main/resources/washingtonIcon.jpg"));
	
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
		title.setBounds((1920/2) - 150, 100, 500,150);
		titleFrame.add(title);
		lblGenghis.setBounds(250, 590, 165, 15);
		btnGenghis.setBounds(250, 605, 165, 251);
		titleFrame.add(btnGenghis);
		titleFrame.add(lblGenghis);
		lblWashington.setBounds(504, 590, 165, 15);
		btnWashington.setBounds(504, 605, 165, 251);
		titleFrame.add(btnWashington);
		titleFrame.add(lblWashington);
		lblSejong.setBounds(758, 590, 165, 15);
		btnSejong.setBounds(758, 605, 165, 251);
		titleFrame.add(btnSejong);
		titleFrame.add(lblSejong);
		lblMussolini.setBounds(1012, 590, 165, 15);
		btnMussolini.setBounds(1012, 605, 165, 251);
		titleFrame.add(btnMussolini);
		titleFrame.add(lblMussolini);
		lblCasimir.setBounds(1266, 590, 165, 15);
		btnCasimir.setBounds(1266, 605, 165, 251);
		titleFrame.add(btnCasimir);
		titleFrame.add(lblCasimir);
		
		titleFrame.setVisible(true);
		
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
		titleFrame.pack();
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
