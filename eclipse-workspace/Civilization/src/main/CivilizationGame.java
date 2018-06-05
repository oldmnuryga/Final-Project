package main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.Random;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import civilizations.Player;
import leaders.*;
import map.ForestTile;
import map.GrassTile;
import map.MountainTile;
import map.SandTile;
import map.Tile;
import map.WaterTile;
import sound.sounds;
import units.Settler;

public class CivilizationGame {
	// CONSTANTS
	private final int SCROLL_SPEED = 5;

	// PLAYER INFO
	private Player player = new Player();

	// JGRAPHICS CONSTRUCTORS
	private JFrame frame = new JFrame("Civilization");

	private JFrame titleFrame = new JFrame("Civilization");
	private JLabel title = new JLabel("P'jephphrey B's : Society Simulator VII");
	private JButton btnCasimir = new JButton(iconCasimir);
	private JButton btnMussolini = new JButton(iconMussolini);
	private JButton btnGenghis = new JButton(iconGenghis);
	private JButton btnSejong = new JButton(iconSejong);
	private JButton btnWashington = new JButton(iconWashington);
	private JLabel lblGenghis = new JLabel("Genghis Khan"), lblWashington = new JLabel("George Washington"),
			lblSejong = new JLabel("Sejong"), lblMussolini = new JLabel("Mussolini"),
			lblCasimir = new JLabel("Casimir III");

	private JPanel leftPanel = new JPanel(); // 200 from right
	private JPanel topPanel = new JPanel(); // 50 from top
	private JPanel mapPanel = new JPanel();
	private JScrollPane mapPane;
	private JButton[][] $mapButtons = new JButton[Tile.getMAP_SIZE()][Tile.getMAP_SIZE()];

	// BUTTON LISTENERS
	private TileListener tileListener = new TileListener();

	// Import tile graphics
	/*
	 * static ImageIcon forestTileII = new
	 * ImageIcon(Tile.class.getResource("map/resources/forestTile.png")); static
	 * ImageIcon grassTileII = new
	 * ImageIcon(Tile.class.getResource("map/resources/grassTile.png")); static
	 * ImageIcon mountainTileII = new
	 * ImageIcon(Tile.class.getResource("src/map/resources/mountainTile.png"));
	 * static ImageIcon sandTileII = new
	 * ImageIcon(Tile.class.getResource("src/map/resources/sandTile.png")); static
	 * ImageIcon waterTileII = new
	 * ImageIcon(Tile.class.getResource("src/map/resources/waterTile.png"));
	 */

	static ImageIcon iconGenghis = new ImageIcon(
			CivilizationGame.class.getClassLoader().getResource("main/resources/genghisIcon.jpg"));
	static ImageIcon iconCasimir = new ImageIcon(
			CivilizationGame.class.getClassLoader().getResource("main/resources/casimirIcon.jpg"));
	static ImageIcon iconMussolini = new ImageIcon(
			CivilizationGame.class.getClassLoader().getResource("main/resources/mussoliniIcon.jpg"));
	static ImageIcon iconSejong = new ImageIcon(
			CivilizationGame.class.getClassLoader().getResource("main/resources/sejongIcon.jpg"));
	static ImageIcon iconWashington = new ImageIcon(
			CivilizationGame.class.getClassLoader().getResource("main/resources/washingtonIcon.jpg"));

	public CivilizationGame() {
		// ADD STUFF

	}

	public void display() {
		// JFrame
		frame.setPreferredSize(new Dimension(1920, 1015));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(false);
		// frame.setResizable(false);

		// Title screen
		titleFrame.setPreferredSize(new Dimension(1920, 1015));
		titleFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		titleFrame.setLayout(null);
		title.setBounds(400, 200, 1200, 150);
		title.setFont(new Font("Monospaced", Font.BOLD, 70));
		title.setForeground(Color.GREEN);
		title.setBackground(Color.BLUE);
		title.setOpaque(true);
		title.setBorder(null);
		titleFrame.add(title);
		lblGenghis.setFont(new Font("Monospaced", Font.ITALIC, 20));
		lblGenghis.setBounds(250, 580, 165, 30);
		btnGenghis.setBounds(250, 605, 165, 251);
		btnGenghis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				player.setLeader(new Mongolia());
				titleFrame.setVisible(false);
				frame.setVisible(true);
			}
		});
		titleFrame.add(btnGenghis);
		titleFrame.add(lblGenghis);
		lblWashington.setFont(new Font("Monospaced", Font.ITALIC, 15));
		lblWashington.setBounds(504, 580, 200, 30);
		btnWashington.setBounds(504, 605, 165, 251);
		btnWashington.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				player.setLeader(new America());
				titleFrame.setVisible(false);
				frame.setVisible(true);
			}
		});
		titleFrame.add(btnWashington);
		titleFrame.add(lblWashington);
		lblSejong.setFont(new Font("Monospaced", Font.ITALIC, 20));
		lblSejong.setBounds(758, 580, 165, 30);
		btnSejong.setBounds(758, 605, 165, 251);
		btnSejong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				player.setLeader(new Korea());
				titleFrame.setVisible(false);
				frame.setVisible(true);
			}
		});
		titleFrame.add(btnSejong);
		titleFrame.add(lblSejong);
		lblMussolini.setFont(new Font("Monospaced", Font.ITALIC, 20));
		lblMussolini.setBounds(1012, 580, 165, 30);
		btnMussolini.setBounds(1012, 605, 165, 251);
		btnMussolini.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				player.setLeader(new Italy());
				titleFrame.setVisible(false);
				frame.setVisible(true);
			}
		});
		titleFrame.add(btnMussolini);
		titleFrame.add(lblMussolini);
		lblCasimir.setFont(new Font("Monospaced", Font.ITALIC, 20));
		lblCasimir.setBounds(1266, 580, 165, 30);
		btnCasimir.setBounds(1266, 605, 165, 251);
		btnCasimir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				player.setLeader(new Poland());
				titleFrame.setVisible(false);
				frame.setVisible(true);
			}
		});
		titleFrame.add(btnCasimir);
		titleFrame.add(lblCasimir);

		titleFrame.setVisible(true);

		// mapPane
		mapPanel.setPreferredSize(new Dimension(50 * Tile.getMAP_SIZE(), 50 * Tile.getMAP_SIZE()));
		mapPanel.setLayout(null);
		mapPane = new JScrollPane(mapPanel);
		mapPane.setBounds(200, 50, 1705, 927);
		mapPane.setAutoscrolls(true);
		mapPane.getVerticalScrollBar().setUnitIncrement(SCROLL_SPEED);
		mapPane.getHorizontalScrollBar().setUnitIncrement(SCROLL_SPEED);
		// mapPane.setPreferredSize(new Dimension(2000, 2000));
		// mapPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		// mapPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		// mapPane.setBackground(Color.red);
		frame.add(mapPane);

		for (int i = 0; i < $mapButtons.length; i++) {
			for (int j = 0; j < $mapButtons[i].length; j++) {
				$mapButtons[i][j] = new JButton(Tile.get$map()[i][j].getTileImageIcon());
				$mapButtons[i][j].addActionListener(tileListener);
				$mapButtons[i][j].setBounds(j * Tile.getTEXTURE_SIZE(), i * Tile.getTEXTURE_SIZE(),
						Tile.getTEXTURE_SIZE(), Tile.getTEXTURE_SIZE());
				// $mapButtons[i][j].setBorder(BorderFactory.createEmptyBorder());
				/*
				 * $mapButtons[i][j].setBorder(null); $mapButtons[i][j].setBorderPainted(false);
				 */
				mapPanel.add($mapButtons[i][j]);
			}
		}
		spawnInitialSettler();

		frame.pack();
		titleFrame.pack();
	}

	public void repaintTiles() {
		for (int i = 0; i < $mapButtons.length; i++) {
			for (int j = 0; j < $mapButtons[i].length; j++) {
				$mapButtons[i][j].setIcon(Tile.get$map()[i][j].getTileImageIcon());
			}
		}
	}

	public void changeTile(int i, int j) {
		if (Tile.get$map()[i][j].getTerrainID() == 4)
			Tile.get$map()[i][j] = new WaterTile();
		else if (Tile.get$map()[i][j].getTerrainID() == 0)
			Tile.get$map()[i][j] = new GrassTile();
		else if (Tile.get$map()[i][j].getTerrainID() == 1)
			Tile.get$map()[i][j] = new SandTile();
		else if (Tile.get$map()[i][j].getTerrainID() == 2)
			Tile.get$map()[i][j] = new MountainTile();
		else if (Tile.get$map()[i][j].getTerrainID() == 3)
			Tile.get$map()[i][j] = new ForestTile();
		repaintTiles();
	}

	public void spawnInitialSettler() {
		Random rand = new Random();
		boolean found = true;
		while(found) {
			int tempX = rand.nextInt(Tile.getMAP_SIZE());
			int tempY = rand.nextInt(Tile.getMAP_SIZE());
			if(Tile.get$map()[tempX][tempY].getTerrainID() == 1) {
				$mapButtons[tempX][tempY].setIcon(Settler.getUnitImageIcon());
				Tile.get$map()[tempX][tempY].setUnitOnTile(new Settler());
				Tile.get$map()[tempX][tempY].getUnitOnTile().setSelected(true);
				found = false;
			}
		}
	}

	public class TileListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			// Click sound
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

			for (int i = 0; i < $mapButtons.length; i++) {
				for (int j = 0; j < $mapButtons[i].length; j++) {
					if (e.getSource() == $mapButtons[i][j]) {
						changeTile(i, j);
					}
				}
			}
		}
	}
}
