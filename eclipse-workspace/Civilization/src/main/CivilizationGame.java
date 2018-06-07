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
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.KeyStroke;

import civilizations.Player;
import leaders.*;
import map.ForestTile;
import map.GrassTile;
import map.MountainTile;
import map.SandTile;
import map.Tile;
import map.WaterTile;
import sound.sounds;
import units.*;

public class CivilizationGame {
	public static int turns = 1;

	// CONSTANTS
	private final int SCROLL_SPEED = 5;

	// PLAYER INFO
	private Player player;

	// JGRAPHICS CONSTRUCTORS
	private JFrame frame = new JFrame("P'jephphrey B's : Society Simulator VII");
	private JLabel lblGold = new JLabel("Gold: ");
	private JLabel lblResearch = new JLabel("Research: ");
	private JLabel lblProduction = new JLabel("Production: ");
	private JLabel lblHappiness = new JLabel("Happiness: ");
	private JLabel lblTurns = new JLabel("Turns: " + turns);
	private JLabel lblFood = new JLabel("Food: ");

	private JButton btnEndTurn = new JButton("End Turn");
	private JButton btnShowInstructions = new JButton("How to Play the Game");
	private JPanel pnePlayerStats = new JPanel();

	private JFrame titleFrame = new JFrame("Civilization");
	private JLabel title = new JLabel("P'jephphrey B's : Society Simulator VII");
	private JButton btnCasimir = new JButton(iconCasimir);
	private JButton btnMussolini = new JButton(iconMussolini);
	private JButton btnGenghis = new JButton(iconGenghis);
	private JButton btnSejong = new JButton(iconSejong);
	private JButton btnWashington = new JButton(iconWashington);
	private JLabel lblGenghis = new JLabel("Genghis Khan"), lblWashington = new JLabel("Washington"),
			lblSejong = new JLabel("Sejong"), lblMussolini = new JLabel("Mussolini"),
			lblCasimir = new JLabel("Casimir III");

	private JPanel leftPanel = new JPanel(); // 200 from right
	private JPanel topPanel = new JPanel(); // 50 from top
	private JPanel mapPanel = new JPanel();
	private JScrollPane mapPane;
	private JButton[][] $mapButtons = new JButton[Tile.getMAP_SIZE()][Tile.getMAP_SIZE()];

	private JFrame frInstructions = new JFrame("Civilization");

	private ImageIcon cityImageIcon = new ImageIcon(
			CivilizationGame.class.getClassLoader().getResource("improvements/resources/cityOnGreen.png"));

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
		//title.setFont(new Font("Monospaced", Font.BOLD, 70));
		title.setFont(new Font("Monospaced", Font.BOLD, 45));
		//title.setForeground(Color.GREEN);
		//title.setBackground(Color.BLUE);
		title.setOpaque(true);
		title.setBorder(null);
		titleFrame.add(title);
		lblGenghis.setFont(new Font("Monospaced", Font.ITALIC, 20));
		lblGenghis.setBounds(250, 580, 165, 30);
		btnGenghis.setBounds(250, 605, 165, 251);
		btnGenghis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setPlayer(new Player(new Mongolia()));
				updatePlayerStats();
				titleFrame.setVisible(false);
				frame.setVisible(true);
				spawnInitialSettler();
				frame.pack();
			}
		});
		titleFrame.add(btnGenghis);
		titleFrame.add(lblGenghis);
		lblWashington.setFont(new Font("Monospaced", Font.ITALIC, 20));
		lblWashington.setBounds(504, 580, 200, 30);
		btnWashington.setBounds(504, 605, 165, 251);
		btnWashington.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setPlayer(new Player(new America()));
				updatePlayerStats();
				titleFrame.setVisible(false);
				frame.setVisible(true);
				spawnInitialSettler();
				frame.pack();
			}
		});
		titleFrame.add(btnWashington);
		titleFrame.add(lblWashington);
		lblSejong.setFont(new Font("Monospaced", Font.ITALIC, 20));
		lblSejong.setBounds(758, 580, 165, 30);
		btnSejong.setBounds(758, 605, 165, 251);
		btnSejong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setPlayer(new Player(new Korea()));
				updatePlayerStats();
				titleFrame.setVisible(false);
				frame.setVisible(true);
				spawnInitialSettler();
				frame.pack();
			}
		});
		titleFrame.add(btnSejong);
		titleFrame.add(lblSejong);
		lblMussolini.setFont(new Font("Monospaced", Font.ITALIC, 20));
		lblMussolini.setBounds(1012, 580, 165, 30);
		btnMussolini.setBounds(1012, 605, 165, 251);
		btnMussolini.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setPlayer(new Player(new Italy()));
				updatePlayerStats();
				titleFrame.setVisible(false);
				frame.setVisible(true);
				spawnInitialSettler();
				frame.pack();
			}
		});
		titleFrame.add(btnMussolini);
		titleFrame.add(lblMussolini);
		lblCasimir.setFont(new Font("Monospaced", Font.ITALIC, 20));
		lblCasimir.setBounds(1266, 580, 165, 30);
		btnCasimir.setBounds(1266, 605, 165, 251);
		btnCasimir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setPlayer(new Player(new Poland()));
				updatePlayerStats();
				titleFrame.setVisible(false);
				frame.setVisible(true);
				spawnInitialSettler();
				frame.pack();
			}
		});
		titleFrame.add(btnCasimir);
		titleFrame.add(lblCasimir);

		titleFrame.setVisible(true);

		// game GUI
		btnEndTurn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				endTurn();
				updateTurnText();
				// other things
			}
		});

		JTabbedPane tbpneInstructions = new JTabbedPane(JTabbedPane.LEFT, JTabbedPane.WRAP_TAB_LAYOUT);
		JTextArea panel1 = new JTextArea("Welcome to P'jephphrey B's : Society Simulator VII. " + "\n"
				+ "The aim of this game is to find a city and grow as much as " + "\n"
				+ "possible while staying out of debt. To begin the game, a settler" + "\n"
				+ "is given to you in a random place. If you would like, the settler" + "\n"
				+ "can be moved using the arrow keys and to make the city, press 'P'." + "\n"
				+ "After finding your city, you should give your city a task to build " + "\n"
				+ "to progress through the game. You can start to build units or buildings, " + "\n"
				+ "but it is recommended that you begin building a worker to make farms " + "\n"
				+ "and make the future of your city easy to maintain. After building the " + "\n"
				+ "worker, you should start to make the worker build farms or trading posts " + "\n"
				+ "or lumbermills. The lumbermills have to be built on forest tiles. " + "\n"
				+ "After making the worker, the rest of the game is spent growing the " + "\n"
				+ "city and making buildings.\n");
		tbpneInstructions.addTab("Starting the Game", panel1);
		JTextArea panel2 = new JTextArea("There are many different units, in the beginning you start with " + "\n"
				+ "a settler. To build a city with the " + "\n"
				+ "settler, press 'P'. Another unit is a scout which has the main " + "\n"
				+ "priority of looking through the map and finding things that are useful " + "\n"
				+ "for your society. The most important unit of all is the worker. " + "\n"
				+ "The worker is used to construct improvements on the tiles you own. " + "\n"
				+ "Some of these improvements are farms, lumbermills, and trading posts. " + "\n"
				+ "Farms are used to increase the food per turn that a city produces. " + "\n"
				+ "Lumbermills are strictly made in forests and can be used to increase " + "\n"
				+ "production per turn. Trading posts are used to increase gold per turn.");
		tbpneInstructions.addTab("Units", panel2);
		JTextArea panel3 = new JTextArea("Wonders are built by the player and can be used to benefit the "
				+ "player with a specific stat. Some stats that get benefits from the " + "\n"
				+ "wonders include happiness, research, production. To win the game, " + "\n"
				+ "the Apollo Program must be built to begin the space race. After " + "\n"
				+ "making it to the moon you win the game with a science victory. " + "\n"
				+ "This is one of the few ways to finish the game. Wonders can " + "\n"
				+ "only built once, and are a valuable resource for winning the " + "\n"
				+ "game via the science victory.");
		tbpneInstructions.addTab("Wonders", panel3);
		JTextArea panel4 = new JTextArea("Buildings, like wonders, are things built by the city only once " + "\n"
				+ "and provide many benefits to the player. For example a building " + "\n"
				+ "may increase the production of a city by a certain percentage or " + "\n"
				+ "increase the gold that a city produces by a number or percentage. " + "\n"
				+ "The benefits of a building depends on the building and ranges " + "\n"
				+ "in benefits from science to gold to production. Buildings are " + "\n"
				+ "important to make cities produce more buildings or wonders " + "\n"
				+ "faster, research technologies faster, and get enough money to " + "\n"
				+ "buy units. But, buildings cost money to maintain, thus showing " + "\n"
				+ "the importance of not making too many buildings of one type, as " + "\n"
				+ "they may slow your progress through the game. It is very important " + "\n"
				+ "to maintain a balanced society.");
		tbpneInstructions.addTab("Buildings", panel4);
		JTextArea panel5 = new JTextArea("A city can be built using settlers and is the beginning step to " + "\n"
				+ "evolving your society through the ages. Cities gain citizens " + "\n"
				+ "through the game and this is mainly dependent upon the amount " + "\n"
				+ "of food that your city can produce through farms. Having a " + "\n"
				+ "higher number of citizens increases science, production, and " + "\n"
				+ "gold. Ensure that you have enough food for your city to be " + "\n"
				+ "maintained and thrive. The growth of the border of your " + "\n"
				+ "city is a static growth that grows every 10 turns. That " + "\n"
				+ "newly owned tile can have an improvement built on it, either " + "\n"
				+ "being a farm, lumbermill, or trading post. Make sure that every " + "\n"
				+ "tile you own is used. The only tiles that cannot be used to " + "\n"
				+ "build an improvement is water and mountain. Water and mountains " + "\n"
				+ "are two types of tiles that should not be the majority of your " + "\n"
				+ "land space in a city. Too many are detrimental to the evolution " + "\n" + "of your society.");
		tbpneInstructions.addTab("City", panel5);
		panel1.setEditable(false);
		panel2.setEditable(false);
		panel3.setEditable(false);
		panel4.setEditable(false);
		panel5.setEditable(false);
		frInstructions.setPreferredSize(new Dimension(550, 550));
		frInstructions.setLayout(null);
		frInstructions.setVisible(false);
		frInstructions.setResizable(false);
		frInstructions.add(tbpneInstructions);
		tbpneInstructions.setBounds(0, 0, 550, 550);
		btnShowInstructions.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frInstructions.setVisible(true);
			}
		});
		btnShowInstructions.setBounds(1600, 0, 200, 50);
		frame.add(btnShowInstructions);
		pnePlayerStats.setBounds(0, 50, 200, 500);
		frame.add(pnePlayerStats);
		lblGold.setBounds(200, 0, 150, 50);
		frame.add(lblGold);
		lblResearch.setBounds(450, 0, 150, 50);
		frame.add(lblResearch);
		lblProduction.setBounds(700, 0, 150, 50);
		frame.add(lblProduction);
		lblHappiness.setBounds(950, 0, 150, 50);
		frame.add(lblHappiness);
		lblFood.setBounds(1200, 0, 150, 50);
		frame.add(lblFood);
		lblTurns.setBounds(1450, 0, 150, 50);
		frame.add(lblTurns);
		btnEndTurn.setBounds(0, 850, 200, 75);
		frame.add(btnEndTurn);

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
		frInstructions.pack();
		titleFrame.pack();
	}

	public void updateTurnText() {
		lblTurns.setText("Turns: " + turns);
	}

	public void updatePlayerStats() {
		// PLAYER NAME
		pnePlayerStats.add(new JLabel("Player Name: " + player.getLeader().getLeaderName() + "\n"));
		// PLAYER CITIES
		if (player.get$cities().size() != 0) {
			pnePlayerStats.add(new JLabel("Player City Name: " + player.get$cities().get(0).getName() + "\n"));
			// PLAYER BUILDINGS
			pnePlayerStats.add(new JLabel("Owned Buildings: \n"));
			for (int i = 0; i < player.get$cities().get(0).get$buildings().size(); i++)
				pnePlayerStats.add(new JLabel(player.get$cities().get(0).get$buildings().get(i).getName()));
			pnePlayerStats.add(new JLabel("Owned Wonders: "));
			if (player.get$cities().get(0).get$wonders().size() != 0)
				for (int i = 0; i < player.get$cities().get(0).get$wonders().size(); i++)
					pnePlayerStats.add(new JLabel(player.get$cities().get(0).get$wonders().get(i).getName()));
		}
		pnePlayerStats.add(new JLabel("Owned Units: \n"));
		if (player.get$units().size() != 0)
			for (int i = 0; i < player.get$units().size(); i++) {
				pnePlayerStats.add(new JLabel(player.get$units().get(i).getUnitName()));
			}

	}

	public void repaintTiles() {
		for (int i = 0; i < $mapButtons.length; i++) {
			for (int j = 0; j < $mapButtons[i].length; j++) {
				if (Tile.get$map()[i][j].getOwner() != null) {
					$mapButtons[i][j].setIcon(cityImageIcon);
				} else if (Tile.get$map()[i][j].getUnitOnTile() != null) {
					$mapButtons[i][j].setIcon(Tile.get$map()[i][j].getUnitOnTile().getUnitImageIcon());
				} else {
					$mapButtons[i][j].setIcon(Tile.get$map()[i][j].getTileImageIcon());
				}
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
		while (found) {
			int tempX = rand.nextInt(Tile.getMAP_SIZE() - 2) + 1;
			int tempY = rand.nextInt(Tile.getMAP_SIZE() - 2) + 1;
			if (Tile.get$map()[tempX][tempY].getTerrainID() == 1) {
				Tile.get$map()[tempX][tempY].setUnitOnTile(new Settler(player));
				Tile.get$map()[tempX][tempY].getUnitOnTile().setSelected(true);
				int[] temp = { tempX, tempY };
				Tile.get$map()[tempX][tempY].set$location(temp);
				Tile.get$map()[tempX][tempY].getUnitOnTile().setLocation(Tile.get$map()[tempX][tempY]);
				found = false;
				repaintTiles();
			}
		}
	}

	public void endTurn() {
		turns++;
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public JButton[][] get$mapButtons() {
		return $mapButtons;
	}

	public void set$mapButtons(JButton[][] $mapButtons) {
		this.$mapButtons = $mapButtons;
	}

	public class TileListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			// Click sound
			try {
				sounds.clickPlay();
			} catch (UnsupportedAudioFileException e1) {
				e1.printStackTrace();
			} catch (IOException e1) {
				e1.printStackTrace();
			} catch (LineUnavailableException e1) {
				e1.printStackTrace();
			}
			//SETTLER CHECK
			for (int i = 0; i < $mapButtons.length; i++) {
				for (int j = 0; j < $mapButtons[i].length; j++) {
					if (e.getSource() == $mapButtons[i][j]) {
						if (Tile.get$map()[i][j].getUnitOnTile() != null && Tile.get$map()[i][j].getUnitOnTile().getUnitID() == 18) {
							//$mapButtons[i][j].getIcon().equals(player.getOwnedUnitfromID(18).getUnitImageIcon())
							$mapButtons[i][j].getInputMap().put(KeyStroke.getKeyStroke("P"), "found");
							$mapButtons[i][j].getActionMap().put("found", new AbstractAction() {
								public void actionPerformed(ActionEvent e) {
									((Settler) getPlayer().getOwnedUnitfromID(18)).foundCity();
									repaintTiles();
								}
							});
						}
					}
				}
			}

			//UNIT MOVEMENT
			for (int i = 0; i < $mapButtons.length; i++) {
				for (int j = 0; j < $mapButtons[i].length; j++) {
					int x = i;
					int y = j;
					if (e.getSource() == $mapButtons[i][j]) {
						$mapButtons[i][j].getInputMap().put(KeyStroke.getKeyStroke("W"), "up");
						$mapButtons[i][j].getActionMap().put("up", new AbstractAction() {
							public void actionPerformed(ActionEvent e) {
								if(x > 1) {
									Tile.get$map()[x - 1][y].setUnitOnTile(Tile.get$map()[x][y].getUnitOnTile());
									Tile.get$map()[x - 1][y].getUnitOnTile().setLocation(Tile.get$map()[x - 1][y]);
									Tile.get$map()[x][y].setUnitOnTile(null);
									$mapButtons[x - 1][y].setSelected(true);
									$mapButtons[x][y].setSelected(false);
									$mapButtons[x][y].setse
								}
								repaintTiles();
							}
						});
						$mapButtons[i][j].getInputMap().put(KeyStroke.getKeyStroke("A"), "left");
						$mapButtons[i][j].getActionMap().put("left", new AbstractAction() {
							public void actionPerformed(ActionEvent e) {
								if(y > 1) {
									Tile.get$map()[x][y - 1].setUnitOnTile(Tile.get$map()[x][y].getUnitOnTile());
									Tile.get$map()[x][y - 1].getUnitOnTile().setLocation(Tile.get$map()[x][y - 1]);
									Tile.get$map()[x][y].setUnitOnTile(null);
									$mapButtons[x][y - 1].setSelected(true);
									$mapButtons[x][y].setSelected(false);
								}
								repaintTiles();
							}
						});
						$mapButtons[i][j].getInputMap().put(KeyStroke.getKeyStroke("S"), "down");
						$mapButtons[i][j].getActionMap().put("down", new AbstractAction() {
							public void actionPerformed(ActionEvent e) {
								if(x < Tile.getMAP_SIZE() - 2) {
									Tile.get$map()[x + 1][y].setUnitOnTile(Tile.get$map()[x][y].getUnitOnTile());
									Tile.get$map()[x + 1][y].getUnitOnTile().setLocation(Tile.get$map()[x + 1][y]);
									Tile.get$map()[x][y].setUnitOnTile(null);
									$mapButtons[x + 1][y].setSelected(true);
									$mapButtons[x][y].setSelected(false);
								}
								repaintTiles();
							}
						});
						$mapButtons[i][j].getInputMap().put(KeyStroke.getKeyStroke("D"), "right");
						$mapButtons[i][j].getActionMap().put("right", new AbstractAction() {
							public void actionPerformed(ActionEvent e) {
								if(y < Tile.getMAP_SIZE() - 2) {
									Tile.get$map()[x][y + 1].setUnitOnTile(Tile.get$map()[x][y].getUnitOnTile());
									Tile.get$map()[x][y + 1].getUnitOnTile().setLocation(Tile.get$map()[x][y + 1]);
									Tile.get$map()[x][y].setUnitOnTile(null);
									$mapButtons[x][y + 1].setSelected(true);
									$mapButtons[x][y].setSelected(false);
								}
								repaintTiles();
							}
						});
					}
				}
			}
		}
	}
}


/*
 * Copyright (c) 1997, 2014, Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */
package javax.swing;

import sun.reflect.misc.ReflectUtil;
import sun.swing.SwingUtilities2;
import sun.swing.UIAction;

import java.applet.*;

import java.awt.*;
import java.awt.event.*;
import java.awt.dnd.DropTarget;

import java.lang.reflect.*;

import javax.accessibility.*;
import javax.swing.event.MenuDragMouseEvent;
import javax.swing.plaf.UIResource;
import javax.swing.text.View;
import java.security.AccessController;
import sun.security.action.GetPropertyAction;

import sun.awt.AppContext;

/**
 * A collection of utility methods for Swing.
 *
 * @author unknown
 * @since 1.2
 */
public class SwingUtilities implements SwingConstants
{
    // These states are system-wide, rather than AppContext wide.
    private static boolean canAccessEventQueue = false;
    private static boolean eventQueueTested = false;

    /**
     * Indicates if we should change the drop target when a
     * {@code TransferHandler} is set.
     */
    private static boolean suppressDropSupport;

    /**
     * Indiciates if we've checked the system property for suppressing
     * drop support.
     */
    private static boolean checkedSuppressDropSupport;


    /**
     * Returns true if <code>setTransferHandler</code> should change the
     * <code>DropTarget</code>.
     */
    private static boolean getSuppressDropTarget() {
        if (!checkedSuppressDropSupport) {
            suppressDropSupport = Boolean.valueOf(
                AccessController.doPrivileged(
                    new GetPropertyAction("suppressSwingDropSupport")));
            checkedSuppressDropSupport = true;
        }
        return suppressDropSupport;
    }

    /**
     * Installs a {@code DropTarget} on the component as necessary for a
     * {@code TransferHandler} change.
     */
    static void installSwingDropTargetAsNecessary(Component c,
                                                         TransferHandler t) {

        if (!getSuppressDropTarget()) {
            DropTarget dropHandler = c.getDropTarget();
            if ((dropHandler == null) || (dropHandler instanceof UIResource)) {
                if (t == null) {
                    c.setDropTarget(null);
                } else if (!GraphicsEnvironment.isHeadless()) {
                    c.setDropTarget(new TransferHandler.SwingDropTarget(c));
                }
            }
        }
    }

    /**
     * Return {@code true} if @{code a} contains {@code b}
     *
     * @param a the first rectangle
     * @param b the second rectangle
     *
     * @return {@code true} if @{code a} contains {@code b}
     */
    public static final boolean isRectangleContainingRectangle(Rectangle a,Rectangle b) {
        return b.x >= a.x && (b.x + b.width) <= (a.x + a.width) &&
                b.y >= a.y && (b.y + b.height) <= (a.y + a.height);
    }

    /**
     * Return the rectangle (0,0,bounds.width,bounds.height) for the component {@code aComponent}
     *
     * @param aComponent a component
     * @return the local bounds for the component {@code aComponent}
     */
    public static Rectangle getLocalBounds(Component aComponent) {
        Rectangle b = new Rectangle(aComponent.getBounds());
        b.x = b.y = 0;
        return b;
    }


    /**
     * Returns the first <code>Window </code> ancestor of <code>c</code>, or
     * {@code null} if <code>c</code> is not contained inside a <code>Window</code>.
     *
     * @param c <code>Component</code> to get <code>Window</code> ancestor
     *        of.
     * @return the first <code>Window </code> ancestor of <code>c</code>, or
     *         {@code null} if <code>c</code> is not contained inside a
     *         <code>Window</code>.
     * @since 1.3
     */
    public static Window getWindowAncestor(Component c) {
        for(Container p = c.getParent(); p != null; p = p.getParent()) {
            if (p instanceof Window) {
                return (Window)p;
            }
        }
        return null;
    }

    /**
     * Converts the location <code>x</code> <code>y</code> to the
     * parents coordinate system, returning the location.
     */
    static Point convertScreenLocationToParent(Container parent,int x, int y) {
        for (Container p = parent; p != null; p = p.getParent()) {
            if (p instanceof Window) {
                Point point = new Point(x, y);

                SwingUtilities.convertPointFromScreen(point, parent);
                return point;
            }
        }
        throw new Error("convertScreenLocationToParent: no window ancestor");
    }

    /**
     * Convert a <code>aPoint</code> in <code>source</code> coordinate system to
     * <code>destination</code> coordinate system.
     * If <code>source</code> is {@code null}, <code>aPoint</code> is assumed to be in <code>destination</code>'s
     * root component coordinate system.
     * If <code>destination</code> is {@code null}, <code>aPoint</code> will be converted to <code>source</code>'s
     * root component coordinate system.
     * If both <code>source</code> and <code>destination</code> are {@code null}, return <code>aPoint</code>
     * without any conversion.
     *
     * @param source the source component
     * @param aPoint the point
     * @param destination the destination component
     *
     * @return the converted coordinate
     */
    public static Point convertPoint(Component source,Point aPoint,Component destination) {
        Point p;

        if(source == null && destination == null)
            return aPoint;
        if(source == null) {
            source = getWindowAncestor(destination);
            if(source == null)
                throw new Error("Source component not connected to component tree hierarchy");
        }
        p = new Point(aPoint);
        convertPointToScreen(p,source);
        if(destination == null) {
            destination = getWindowAncestor(source);
            if(destination == null)
                throw new Error("Destination component not connected to component tree hierarchy");
        }
        convertPointFromScreen(p,destination);
        return p;
    }

    /**
     * Convert the point <code>(x,y)</code> in <code>source</code> coordinate system to
     * <code>destination</code> coordinate system.
     * If <code>source</code> is {@code null}, <code>(x,y)</code> is assumed to be in <code>destination</code>'s
     * root component coordinate system.
     * If <code>destination</code> is {@code null}, <code>(x,y)</code> will be converted to <code>source</code>'s
     * root component coordinate system.
     * If both <code>source</code> and <code>destination</code> are {@code null}, return <code>(x,y)</code>
     * without any conversion.
     *
     * @param source the source component
     * @param x the x-coordinate of the point
     * @param y the y-coordinate of the point
     * @param destination the destination component
     *
     * @return the converted coordinate
     */
    public static Point convertPoint(Component source,int x, int y,Component destination) {
        Point point = new Point(x,y);
        return convertPoint(source,point,destination);
    }

    /**
     * Convert the rectangle <code>aRectangle</code> in <code>source</code> coordinate system to
     * <code>destination</code> coordinate system.
     * If <code>source</code> is {@code null}, <code>aRectangle</code> is assumed to be in <code>destination</code>'s
     * root component coordinate system.
     * If <code>destination</code> is {@code null}, <code>aRectangle</code> will be converted to <code>source</code>'s
     * root component coordinate system.
     * If both <code>source</code> and <code>destination</code> are {@code null}, return <code>aRectangle</code>
     * without any conversion.
     *
     * @param source the source component
     * @param aRectangle a rectangle
     * @param destination the destination component
     *
     * @return the converted rectangle
     */
    public static Rectangle convertRectangle(Component source,Rectangle aRectangle,Component destination) {
        Point point = new Point(aRectangle.x,aRectangle.y);
        point =  convertPoint(source,point,destination);
        return new Rectangle(point.x,point.y,aRectangle.width,aRectangle.height);
    }

    /**
     * Convenience method for searching above <code>comp</code> in the
     * component hierarchy and returns the first object of class <code>c</code> it
     * finds. Can return {@code null}, if a class <code>c</code> cannot be found.
     *
     * @param c the class of a component
     * @param comp the component
     *
     * @return the ancestor of the {@code comp},
     *         or {@code null} if {@code c} cannot be found.
     */
    public static Container getAncestorOfClass(Class<?> c, Component comp)
    {
        if(comp == null || c == null)
            return null;

        Container parent = comp.getParent();
        while(parent != null && !(c.isInstance(parent)))
            parent = parent.getParent();
        return parent;
    }

    /**
     * Convenience method for searching above <code>comp</code> in the
     * component hierarchy and returns the first object of <code>name</code> it
     * finds. Can return {@code null}, if <code>name</code> cannot be found.
     *
     * @param name the name of a component
     * @param comp the component
     *
     * @return the ancestor of the {@code comp},
     *         or {@code null} if {@code name} cannot be found.
     */
    public static Container getAncestorNamed(String name, Component comp) {
        if(comp == null || name == null)
            return null;

        Container parent = comp.getParent();
        while(parent != null && !(name.equals(parent.getName())))
            parent = parent.getParent();
        return parent;
    }

    /**
     * Returns the deepest visible descendent Component of <code>parent</code>
     * that contains the location <code>x</code>, <code>y</code>.
     * If <code>parent</code> does not contain the specified location,
     * then <code>null</code> is returned.  If <code>parent</code> is not a
     * container, or none of <code>parent</code>'s visible descendents
     * contain the specified location, <code>parent</code> is returned.
     *
     * @param parent the root component to begin the search
     * @param x the x target location
     * @param y the y target location
     *
     * @return the deepest component
     */
    public static Component getDeepestComponentAt(Component parent, int x, int y) {
        if (!parent.contains(x, y)) {
            return null;
        }
        if (parent instanceof Container) {
            Component components[] = ((Container)parent).getComponents();
            for (Component comp : components) {
                if (comp != null && comp.isVisible()) {
                    Point loc = comp.getLocation();
                    if (comp instanceof Container) {
                        comp = getDeepestComponentAt(comp, x - loc.x, y - loc.y);
                    } else {
                        comp = comp.getComponentAt(x - loc.x, y - loc.y);
                    }
                    if (comp != null && comp.isVisible()) {
                        return comp;
                    }
                }
            }
        }
        return parent;
    }


    /**
     * Returns a MouseEvent similar to <code>sourceEvent</code> except that its x
     * and y members have been converted to <code>destination</code>'s coordinate
     * system.  If <code>source</code> is {@code null}, <code>sourceEvent</code> x and y members
     * are assumed to be into <code>destination</code>'s root component coordinate system.
     * If <code>destination</code> is <code>null</code>, the
     * returned MouseEvent will be in <code>source</code>'s coordinate system.
     * <code>sourceEvent</code> will not be changed. A new event is returned.
     * the <code>source</code> field of the returned event will be set
     * to <code>destination</code> if destination is non-{@code null}
     * use the translateMouseEvent() method to translate a mouse event from
     * one component to another without changing the source.
     *
     * @param source the source component
     * @param sourceEvent the source mouse event
     * @param destination the destination component
     *
     * @return the new mouse event
     */
    @SuppressWarnings("deprecation")
    public static MouseEvent convertMouseEvent(Component source,
                                               MouseEvent sourceEvent,
                                               Component destination) {
        Point p = convertPoint(source,new Point(sourceEvent.getX(),
                                                sourceEvent.getY()),
                               destination);
        Component newSource;

        if(destination != null)
            newSource = destination;
        else
            newSource = source;

        MouseEvent newEvent;
        if (sourceEvent instanceof MouseWheelEvent) {
            MouseWheelEvent sourceWheelEvent = (MouseWheelEvent)sourceEvent;
            newEvent = new MouseWheelEvent(newSource,
                                           sourceWheelEvent.getID(),
                                           sourceWheelEvent.getWhen(),
                                           sourceWheelEvent.getModifiers()
                                                   | sourceWheelEvent.getModifiersEx(),
                                           p.x,p.y,
                                           sourceWheelEvent.getXOnScreen(),
                                           sourceWheelEvent.getYOnScreen(),
                                           sourceWheelEvent.getClickCount(),
                                           sourceWheelEvent.isPopupTrigger(),
                                           sourceWheelEvent.getScrollType(),
                                           sourceWheelEvent.getScrollAmount(),
                                           sourceWheelEvent.getWheelRotation(),
                                           sourceWheelEvent.getPreciseWheelRotation());
        }
        else if (sourceEvent instanceof MenuDragMouseEvent) {
            MenuDragMouseEvent sourceMenuDragEvent = (MenuDragMouseEvent)sourceEvent;
            newEvent = new MenuDragMouseEvent(newSource,
                                              sourceMenuDragEvent.getID(),
                                              sourceMenuDragEvent.getWhen(),
                                              sourceMenuDragEvent.getModifiers()
                                                      | sourceMenuDragEvent.getModifiersEx(),
                                              p.x,p.y,
                                              sourceMenuDragEvent.getXOnScreen(),
                                              sourceMenuDragEvent.getYOnScreen(),
                                              sourceMenuDragEvent.getClickCount(),
                                              sourceMenuDragEvent.isPopupTrigger(),
                                              sourceMenuDragEvent.getPath(),
                                              sourceMenuDragEvent.getMenuSelectionManager());
        }
        else {
            newEvent = new MouseEvent(newSource,
                                      sourceEvent.getID(),
                                      sourceEvent.getWhen(),
                                      sourceEvent.getModifiers()
                                              | sourceEvent.getModifiersEx(),
                                      p.x,p.y,
                                      sourceEvent.getXOnScreen(),
                                      sourceEvent.getYOnScreen(),
                                      sourceEvent.getClickCount(),
                                      sourceEvent.isPopupTrigger(),
                                      sourceEvent.getButton());
        }
        return newEvent;
    }


    /**
     * Convert a point from a component's coordinate system to
     * screen coordinates.
     *
     * @param p  a Point object (converted to the new coordinate system)
     * @param c  a Component object
     */
    @SuppressWarnings("deprecation")
    public static void convertPointToScreen(Point p,Component c) {
            Rectangle b;
            int x,y;

            do {
                if(c instanceof JComponent) {
                    x = c.getX();
                    y = c.getY();
                } else if(c instanceof java.applet.Applet ||
                          c instanceof java.awt.Window) {
                    try {
                        Point pp = c.getLocationOnScreen();
                        x = pp.x;
                        y = pp.y;
                    } catch (IllegalComponentStateException icse) {
                        x = c.getX();
                        y = c.getY();
                    }
                } else {
                    x = c.getX();
                    y = c.getY();
                }

                p.x += x;
                p.y += y;

                if(c instanceof java.awt.Window || c instanceof java.applet.Applet)
                    break;
                c = c.getParent();
            } while(c != null);
        }

    /**
     * Convert a point from a screen coordinates to a component's
     * coordinate system
     *
     * @param p  a Point object (converted to the new coordinate system)
     * @param c  a Component object
     */
    @SuppressWarnings("deprecation")
    public static void convertPointFromScreen(Point p,Component c) {
        Rectangle b;
        int x,y;

        do {
            if(c instanceof JComponent) {
                x = c.getX();
                y = c.getY();
            }  else if(c instanceof java.applet.Applet ||
                       c instanceof java.awt.Window) {
                try {
                    Point pp = c.getLocationOnScreen();
                    x = pp.x;
                    y = pp.y;
                } catch (IllegalComponentStateException icse) {
                    x = c.getX();
                    y = c.getY();
                }
            } else {
                x = c.getX();
                y = c.getY();
            }

            p.x -= x;
            p.y -= y;

            if(c instanceof java.awt.Window || c instanceof java.applet.Applet)
                break;
            c = c.getParent();
        } while(c != null);
    }

    /**
     * Returns the first <code>Window </code> ancestor of <code>c</code>, or
     * {@code null} if <code>c</code> is not contained inside a <code>Window</code>.
     * <p>
     * Note: This method provides the same functionality as
     * <code>getWindowAncestor</code>.
     *
     * @param c <code>Component</code> to get <code>Window</code> ancestor
     *        of.
     * @return the first <code>Window </code> ancestor of <code>c</code>, or
     *         {@code null} if <code>c</code> is not contained inside a
     *         <code>Window</code>.
     */
    public static Window windowForComponent(Component c) {
        return getWindowAncestor(c);
    }

    /**
     * Return {@code true} if a component {@code a} descends from a component {@code b}
     *
     * @param a the first component
     * @param b the second component
     * @return {@code true} if a component {@code a} descends from a component {@code b}
     */
    public static boolean isDescendingFrom(Component a,Component b) {
        if(a == b)
            return true;
        for(Container p = a.getParent();p!=null;p=p.getParent())
            if(p == b)
                return true;
        return false;
    }


    /**
     * Convenience to calculate the intersection of two rectangles
     * without allocating a new rectangle.
     * If the two rectangles don't intersect,
     * then the returned rectangle begins at (0,0)
     * and has zero width and height.
     *
     * @param x       the X coordinate of the first rectangle's top-left point
     * @param y       the Y coordinate of the first rectangle's top-left point
     * @param width   the width of the first rectangle
     * @param height  the height of the first rectangle
     * @param dest    the second rectangle
     *
     * @return <code>dest</code>, modified to specify the intersection
     */
    public static Rectangle computeIntersection(int x,int y,int width,int height,Rectangle dest) {
        int x1 = (x > dest.x) ? x : dest.x;
        int x2 = ((x+width) < (dest.x + dest.width)) ? (x+width) : (dest.x + dest.width);
        int y1 = (y > dest.y) ? y : dest.y;
        int y2 = ((y + height) < (dest.y + dest.height) ? (y+height) : (dest.y + dest.height));

        dest.x = x1;
        dest.y = y1;
        dest.width = x2 - x1;
        dest.height = y2 - y1;

        // If rectangles don't intersect, return zero'd intersection.
        if (dest.width < 0 || dest.height < 0) {
            dest.x = dest.y = dest.width = dest.height = 0;
        }

        return dest;
    }

    /**
     * Convenience method that calculates the union of two rectangles
     * without allocating a new rectangle.
     *
     * @param x the x-coordinate of the first rectangle
     * @param y the y-coordinate of the first rectangle
     * @param width the width of the first rectangle
     * @param height the height of the first rectangle
     * @param dest  the coordinates of the second rectangle; the union
     *    of the two rectangles is returned in this rectangle
     * @return the <code>dest</code> <code>Rectangle</code>
     */
    public static Rectangle computeUnion(int x,int y,int width,int height,Rectangle dest) {
        int x1 = (x < dest.x) ? x : dest.x;
        int x2 = ((x+width) > (dest.x + dest.width)) ? (x+width) : (dest.x + dest.width);
        int y1 = (y < dest.y) ? y : dest.y;
        int y2 = ((y+height) > (dest.y + dest.height)) ? (y+height) : (dest.y + dest.height);

        dest.x = x1;
        dest.y = y1;
        dest.width = (x2 - x1);
        dest.height= (y2 - y1);
        return dest;
    }

    /**
     * Convenience returning an array of rect representing the regions within
     * <code>rectA</code> that do not overlap with <code>rectB</code>. If the
     * two Rects do not overlap, returns an empty array
     *
     * @param rectA the first rectangle
     * @param rectB the second rectangle
     *
     * @return an array of rectangles representing the regions within {@code rectA}
     *         that do not overlap with {@code rectB}.
     */
    public static Rectangle[] computeDifference(Rectangle rectA,Rectangle rectB) {
        if (rectB == null || !rectA.intersects(rectB) || isRectangleContainingRectangle(rectB,rectA)) {
            return new Rectangle[0];
        }

        Rectangle t = new Rectangle();
        Rectangle a=null,b=null,c=null,d=null;
        Rectangle result[];
        int rectCount = 0;

        /* rectA contains rectB */
        if (isRectangleContainingRectangle(rectA,rectB)) {
            t.x = rectA.x; t.y = rectA.y; t.width = rectB.x - rectA.x; t.height = rectA.height;
            if(t.width > 0 && t.height > 0) {
                a = new Rectangle(t);
                rectCount++;
            }

            t.x = rectB.x; t.y = rectA.y; t.width = rectB.width; t.height = rectB.y - rectA.y;
            if(t.width > 0 && t.height > 0) {
                b = new Rectangle(t);
                rectCount++;
            }

            t.x = rectB.x; t.y = rectB.y + rectB.height; t.width = rectB.width;
            t.height = rectA.y + rectA.height - (rectB.y + rectB.height);
            if(t.width > 0 && t.height > 0) {
                c = new Rectangle(t);
                rectCount++;
            }

            t.x = rectB.x + rectB.width; t.y = rectA.y; t.width = rectA.x + rectA.width - (rectB.x + rectB.width);
            t.height = rectA.height;
            if(t.width > 0 && t.height > 0) {
                d = new Rectangle(t);
                rectCount++;
            }
        } else {
            /* 1 */
            if (rectB.x <= rectA.x && rectB.y <= rectA.y) {
                if ((rectB.x + rectB.width) > (rectA.x + rectA.width)) {

                    t.x = rectA.x; t.y = rectB.y + rectB.height;
                    t.width = rectA.width; t.height = rectA.y + rectA.height - (rectB.y + rectB.height);
                    if(t.width > 0 && t.height > 0) {
                        a = t;
                        rectCount++;
                    }
                } else if ((rectB.y + rectB.height) > (rectA.y + rectA.height)) {
                    t.setBounds((rectB.x + rectB.width), rectA.y,
                                (rectA.x + rectA.width) - (rectB.x + rectB.width), rectA.height);
                    if(t.width > 0 && t.height > 0) {
                        a = t;
                        rectCount++;
                    }
                } else {
                    t.setBounds((rectB.x + rectB.width), rectA.y,
                                (rectA.x + rectA.width) - (rectB.x + rectB.width),
                                (rectB.y + rectB.height) - rectA.y);
                    if(t.width > 0 && t.height > 0) {
                        a = new Rectangle(t);
                        rectCount++;
                    }

                    t.setBounds(rectA.x, (rectB.y + rectB.height), rectA.width,
                                (rectA.y + rectA.height) - (rectB.y + rectB.height));
                    if(t.width > 0 && t.height > 0) {
                        b = new Rectangle(t);
                        rectCount++;
                    }
                }
            } else if (rectB.x <= rectA.x && (rectB.y + rectB.height) >= (rectA.y + rectA.height)) {
                if ((rectB.x + rectB.width) > (rectA.x + rectA.width)) {
                    t.setBounds(rectA.x, rectA.y, rectA.width, rectB.y - rectA.y);
                    if(t.width > 0 && t.height > 0) {
                        a = t;
                        rectCount++;
                    }
                } else {
                    t.setBounds(rectA.x, rectA.y, rectA.width, rectB.y - rectA.y);
                    if(t.width > 0 && t.height > 0) {
                        a = new Rectangle(t);
                        rectCount++;
                    }
                    t.setBounds((rectB.x + rectB.width), rectB.y,
                                (rectA.x + rectA.width) - (rectB.x + rectB.width),
                                (rectA.y + rectA.height) - rectB.y);
                    if(t.width > 0 && t.height > 0) {
                        b = new Rectangle(t);
                        rectCount++;
                    }
                }
            } else if (rectB.x <= rectA.x) {
                if ((rectB.x + rectB.width) >= (rectA.x + rectA.width)) {
                    t.setBounds(rectA.x, rectA.y, rectA.width, rectB.y - rectA.y);
                    if(t.width>0 && t.height > 0) {
                        a = new Rectangle(t);
                        rectCount++;
                    }

                    t.setBounds(rectA.x, (rectB.y + rectB.height), rectA.width,
                                (rectA.y + rectA.height) - (rectB.y + rectB.height));
                    if(t.width > 0 && t.height > 0) {
                        b = new Rectangle(t);
                        rectCount++;
                    }
                } else {
                    t.setBounds(rectA.x, rectA.y, rectA.width, rectB.y - rectA.y);
                    if(t.width > 0 && t.height > 0) {
                        a = new Rectangle(t);
                        rectCount++;
                    }

                    t.setBounds((rectB.x + rectB.width), rectB.y,
                                (rectA.x + rectA.width) - (rectB.x + rectB.width),
                                rectB.height);
                    if(t.width > 0 && t.height > 0) {
                        b = new Rectangle(t);
                        rectCount++;
                    }

                    t.setBounds(rectA.x, (rectB.y + rectB.height), rectA.width,
                                (rectA.y + rectA.height) - (rectB.y + rectB.height));
                    if(t.width > 0 && t.height > 0) {
                        c = new Rectangle(t);
                        rectCount++;
                    }
                }
            } else if (rectB.x <= (rectA.x + rectA.width) && (rectB.x + rectB.width) > (rectA.x + rectA.width)) {
                if (rectB.y <= rectA.y && (rectB.y + rectB.height) > (rectA.y + rectA.height)) {
                    t.setBounds(rectA.x, rectA.y, rectB.x - rectA.x, rectA.height);
                    if(t.width > 0 && t.height > 0) {
                        a = t;
                        rectCount++;
                    }
                } else if (rectB.y <= rectA.y) {
                    t.setBounds(rectA.x, rectA.y, rectB.x - rectA.x,
                                (rectB.y + rectB.height) - rectA.y);
                    if(t.width > 0 && t.height > 0) {
                        a = new Rectangle(t);
                        rectCount++;
                    }

                    t.setBounds(rectA.x, (rectB.y + rectB.height), rectA.width,
                                (rectA.y + rectA.height) - (rectB.y + rectB.height));
                    if(t.width > 0 && t.height > 0) {
                        b = new Rectangle(t);
                        rectCount++;
                    }
                } else if ((rectB.y + rectB.height) > (rectA.y + rectA.height)) {
                    t.setBounds(rectA.x, rectA.y, rectA.width, rectB.y - rectA.y);
                    if(t.width > 0 && t.height > 0) {
                        a = new Rectangle(t);
                        rectCount++;
                    }

                    t.setBounds(rectA.x, rectB.y, rectB.x - rectA.x,
                                (rectA.y + rectA.height) - rectB.y);
                    if(t.width > 0 && t.height > 0) {
                        b = new Rectangle(t);
                        rectCount++;
                    }
                } else {
                    t.setBounds(rectA.x, rectA.y, rectA.width, rectB.y - rectA.y);
                    if(t.width > 0 && t.height > 0) {
                        a = new Rectangle(t);
                        rectCount++;
                    }

                    t.setBounds(rectA.x, rectB.y, rectB.x - rectA.x,
                                rectB.height);
                    if(t.width > 0 && t.height > 0) {
                        b = new Rectangle(t);
                        rectCount++;
                    }

                    t.setBounds(rectA.x, (rectB.y + rectB.height), rectA.width,
                                (rectA.y + rectA.height) - (rectB.y + rectB.height));
                    if(t.width > 0 && t.height > 0) {
                        c = new Rectangle(t);
                        rectCount++;
                    }
                }
            } else if (rectB.x >= rectA.x && (rectB.x + rectB.width) <= (rectA.x + rectA.width)) {
                if (rectB.y <= rectA.y && (rectB.y + rectB.height) > (rectA.y + rectA.height)) {
                    t.setBounds(rectA.x, rectA.y, rectB.x - rectA.x, rectA.height);
                    if(t.width > 0 && t.height > 0) {
                        a = new Rectangle(t);
                        rectCount++;
                    }
                    t.setBounds((rectB.x + rectB.width), rectA.y,
                                (rectA.x + rectA.width) - (rectB.x + rectB.width), rectA.height);
                    if(t.width > 0 && t.height > 0) {
                        b = new Rectangle(t);
                        rectCount++;
                    }
                } else if (rectB.y <= rectA.y) {
                    t.setBounds(rectA.x, rectA.y, rectB.x - rectA.x, rectA.height);
                    if(t.width > 0 && t.height > 0) {
                        a = new Rectangle(t);
                        rectCount++;
                    }

                    t.setBounds(rectB.x, (rectB.y + rectB.height),
                                rectB.width,
                                (rectA.y + rectA.height) - (rectB.y + rectB.height));
                    if(t.width > 0 && t.height > 0) {
                        b = new Rectangle(t);
                        rectCount++;
                    }

                    t.setBounds((rectB.x + rectB.width), rectA.y,
                                (rectA.x + rectA.width) - (rectB.x + rectB.width), rectA.height);
                    if(t.width > 0 && t.height > 0) {
                        c = new Rectangle(t);
                        rectCount++;
                    }
                } else {
                    t.setBounds(rectA.x, rectA.y, rectB.x - rectA.x, rectA.height);
                    if(t.width > 0 && t.height > 0) {
                        a = new Rectangle(t);
                        rectCount++;
                    }

                    t.setBounds(rectB.x, rectA.y, rectB.width,
                                rectB.y - rectA.y);
                    if(t.width > 0 && t.height > 0) {
                        b = new Rectangle(t);
                        rectCount++;
                    }

                    t.setBounds((rectB.x + rectB.width), rectA.y,
                                (rectA.x + rectA.width) - (rectB.x + rectB.width), rectA.height);
                    if(t.width > 0 && t.height > 0) {
                        c = new Rectangle(t);
                        rectCount++;
                    }
                }
            }
        }

        result = new Rectangle[rectCount];
        rectCount = 0;
        if(a != null)
            result[rectCount++] = a;
        if(b != null)
            result[rectCount++] = b;
        if(c != null)
            result[rectCount++] = c;
        if(d != null)
            result[rectCount++] = d;
        return result;
    }

    /**
     * Check whether MouseEvent contains speficied mouse button or
     * mouse button down mask based on MouseEvent ID.
     *
     * @param anEvent  a MouseEvent object
     * @param mouseButton mouse button type
     * @param mouseButtonDownMask mouse button down mask event modifier
     *
     * @return true if the anEvent contains speficied mouseButton or
     * mouseButtonDownMask based on MouseEvent ID.
     */
    private static boolean checkMouseButton(MouseEvent anEvent,
                                            int mouseButton,
                                            int mouseButtonDownMask)
    {
        switch (anEvent.getID()) {
        case MouseEvent.MOUSE_PRESSED:
        case MouseEvent.MOUSE_RELEASED:
        case MouseEvent.MOUSE_CLICKED:
            return (anEvent.getButton() == mouseButton);

        case MouseEvent.MOUSE_ENTERED:
        case MouseEvent.MOUSE_EXITED:
        case MouseEvent.MOUSE_DRAGGED:
            return ((anEvent.getModifiersEx() & mouseButtonDownMask) != 0);

        default:
            return ((anEvent.getModifiersEx() & mouseButtonDownMask) != 0 ||
                    anEvent.getButton() == mouseButton);
        }
    }

    /**
     * Returns true if the mouse event specifies the left mouse button.
     *
     * @param anEvent  a MouseEvent object
     * @return true if the left mouse button was active
     */
    public static boolean isLeftMouseButton(MouseEvent anEvent) {
        return checkMouseButton(anEvent, MouseEvent.BUTTON1,
                                InputEvent.BUTTON1_DOWN_MASK);
    }

    /**
     * Returns true if the mouse event specifies the middle mouse button.
     *
     * @param anEvent  a MouseEvent object
     * @return true if the middle mouse button was active
     */
    public static boolean isMiddleMouseButton(MouseEvent anEvent) {
        return checkMouseButton(anEvent, MouseEvent.BUTTON2,
                                InputEvent.BUTTON2_DOWN_MASK);
    }

    /**
     * Returns true if the mouse event specifies the right mouse button.
     *
     * @param anEvent  a MouseEvent object
     * @return true if the right mouse button was active
     */
    public static boolean isRightMouseButton(MouseEvent anEvent) {
        return checkMouseButton(anEvent, MouseEvent.BUTTON3,
                                InputEvent.BUTTON3_DOWN_MASK);
    }

    /**
     * Compute the width of the string using a font with the specified
     * "metrics" (sizes).
     *
     * @param fm   a FontMetrics object to compute with
     * @param str  the String to compute
     * @return an int containing the string width
     */
    public static int computeStringWidth(FontMetrics fm,String str) {
        // You can't assume that a string's width is the sum of its
        // characters' widths in Java2D -- it may be smaller due to
        // kerning, etc.
        return SwingUtilities2.stringWidth(null, fm, str);
    }

    /**
     * Compute and return the location of the icons origin, the
     * location of origin of the text baseline, and a possibly clipped
     * version of the compound labels string.  Locations are computed
     * relative to the viewR rectangle.
     * The JComponents orientation (LEADING/TRAILING) will also be taken
     * into account and translated into LEFT/RIGHT values accordingly.
     *
     * @param c the component
     * @param fm the instance of {@code FontMetrics}
     * @param text the text
     * @param icon the icon
     * @param verticalAlignment the vertical alignment
     * @param horizontalAlignment the horizontal alignment
     * @param verticalTextPosition the vertical text position
     * @param horizontalTextPosition the horizontal text position
     * @param viewR the available rectangle
     * @param iconR the rectangle for the icon
     * @param textR the rectangle for the text
     * @param textIconGap the gap between text and icon
     *
     * @return the possibly clipped version of the compound labels string
     */
    public static String layoutCompoundLabel(JComponent c,
                                             FontMetrics fm,
                                             String text,
                                             Icon icon,
                                             int verticalAlignment,
                                             int horizontalAlignment,
                                             int verticalTextPosition,
                                             int horizontalTextPosition,
                                             Rectangle viewR,
                                             Rectangle iconR,
                                             Rectangle textR,
                                             int textIconGap)
    {
        boolean orientationIsLeftToRight = true;
        int     hAlign = horizontalAlignment;
        int     hTextPos = horizontalTextPosition;

        if (c != null) {
            if (!(c.getComponentOrientation().isLeftToRight())) {
                orientationIsLeftToRight = false;
            }
        }

        // Translate LEADING/TRAILING values in horizontalAlignment
        // to LEFT/RIGHT values depending on the components orientation
        switch (horizontalAlignment) {
        case LEADING:
            hAlign = (orientationIsLeftToRight) ? LEFT : RIGHT;
            break;
        case TRAILING:
            hAlign = (orientationIsLeftToRight) ? RIGHT : LEFT;
            break;
        }

        // Translate LEADING/TRAILING values in horizontalTextPosition
        // to LEFT/RIGHT values depending on the components orientation
        switch (horizontalTextPosition) {
        case LEADING:
            hTextPos = (orientationIsLeftToRight) ? LEFT : RIGHT;
            break;
        case TRAILING:
            hTextPos = (orientationIsLeftToRight) ? RIGHT : LEFT;
            break;
        }

        return layoutCompoundLabelImpl(c,
                                       fm,
                                       text,
                                       icon,
                                       verticalAlignment,
                                       hAlign,
                                       verticalTextPosition,
                                       hTextPos,
                                       viewR,
                                       iconR,
                                       textR,
                                       textIconGap);
    }

    /**
     * Compute and return the location of the icons origin, the
     * location of origin of the text baseline, and a possibly clipped
     * version of the compound labels string.  Locations are computed
     * relative to the viewR rectangle.
     * This layoutCompoundLabel() does not know how to handle LEADING/TRAILING
     * values in horizontalTextPosition (they will default to RIGHT) and in
     * horizontalAlignment (they will default to CENTER).
     * Use the other version of layoutCompoundLabel() instead.
     *
     * @param fm the instance of {@code FontMetrics}
     * @param text the text
     * @param icon the icon
     * @param verticalAlignment the vertical alignment
     * @param horizontalAlignment the horizontal alignment
     * @param verticalTextPosition the vertical text position
     * @param horizontalTextPosition the horizontal text position
     * @param viewR the available rectangle
     * @param iconR the rectangle for the icon
     * @param textR the rectangle for the text
     * @param textIconGap the gap between text and icon
     *
     * @return the possibly clipped version of the compound labels string
     */
    public static String layoutCompoundLabel(
        FontMetrics fm,
        String text,
        Icon icon,
        int verticalAlignment,
        int horizontalAlignment,
        int verticalTextPosition,
        int horizontalTextPosition,
        Rectangle viewR,
        Rectangle iconR,
        Rectangle textR,
        int textIconGap)
    {
        return layoutCompoundLabelImpl(null, fm, text, icon,
                                       verticalAlignment,
                                       horizontalAlignment,
                                       verticalTextPosition,
                                       horizontalTextPosition,
                                       viewR, iconR, textR, textIconGap);
    }

    /**
     * Compute and return the location of the icons origin, the
     * location of origin of the text baseline, and a possibly clipped
     * version of the compound labels string.  Locations are computed
     * relative to the viewR rectangle.
     * This layoutCompoundLabel() does not know how to handle LEADING/TRAILING
     * values in horizontalTextPosition (they will default to RIGHT) and in
     * horizontalAlignment (they will default to CENTER).
     * Use the other version of layoutCompoundLabel() instead.
     */
    private static String layoutCompoundLabelImpl(
        JComponent c,
        FontMetrics fm,
        String text,
        Icon icon,
        int verticalAlignment,
        int horizontalAlignment,
        int verticalTextPosition,
        int horizontalTextPosition,
        Rectangle viewR,
        Rectangle iconR,
        Rectangle textR,
        int textIconGap)
    {
        /* Initialize the icon bounds rectangle iconR.
         */

        if (icon != null) {
            iconR.width = icon.getIconWidth();
            iconR.height = icon.getIconHeight();
        }
        else {
            iconR.width = iconR.height = 0;
        }

        /* Initialize the text bounds rectangle textR.  If a null
         * or and empty String was specified we substitute "" here
         * and use 0,0,0,0 for textR.
         */

        boolean textIsEmpty = (text == null) || text.equals("");
        int lsb = 0;
        int rsb = 0;
        /* Unless both text and icon are non-null, we effectively ignore
         * the value of textIconGap.
         */
        int gap;

        View v;
        if (textIsEmpty) {
            textR.width = textR.height = 0;
            text = "";
            gap = 0;
        }
        else {
            int availTextWidth;
            gap = (icon == null) ? 0 : textIconGap;

            if (horizontalTextPosition == CENTER) {
                availTextWidth = viewR.width;
            }
            else {
                availTextWidth = viewR.width - (iconR.width + gap);
            }
            v = (c != null) ? (View) c.getClientProperty("html") : null;
            if (v != null) {
                textR.width = Math.min(availTextWidth,
                                       (int) v.getPreferredSpan(View.X_AXIS));
                textR.height = (int) v.getPreferredSpan(View.Y_AXIS);
            } else {
                textR.width = SwingUtilities2.stringWidth(c, fm, text);
                lsb = SwingUtilities2.getLeftSideBearing(c, fm, text);
                if (lsb < 0) {
                    // If lsb is negative, add it to the width and later
                    // adjust the x location. This gives more space than is
                    // actually needed.
                    // This is done like this for two reasons:
                    // 1. If we set the width to the actual bounds all
                    //    callers would have to account for negative lsb
                    //    (pref size calculations ONLY look at width of
                    //    textR)
                    // 2. You can do a drawString at the returned location
                    //    and the text won't be clipped.
                    textR.width -= lsb;
                }
                if (textR.width > availTextWidth) {
                    text = SwingUtilities2.clipString(c, fm, text,
                                                      availTextWidth);
                    textR.width = SwingUtilities2.stringWidth(c, fm, text);
                }
                textR.height = fm.getHeight();
            }
        }


        /* Compute textR.x,y given the verticalTextPosition and
         * horizontalTextPosition properties
         */

        if (verticalTextPosition == TOP) {
            if (horizontalTextPosition != CENTER) {
                textR.y = 0;
            }
            else {
                textR.y = -(textR.height + gap);
            }
        }
        else if (verticalTextPosition == CENTER) {
            textR.y = (iconR.height / 2) - (textR.height / 2);
        }
        else { // (verticalTextPosition == BOTTOM)
            if (horizontalTextPosition != CENTER) {
                textR.y = iconR.height - textR.height;
            }
            else {
                textR.y = (iconR.height + gap);
            }
        }

        if (horizontalTextPosition == LEFT) {
            textR.x = -(textR.width + gap);
        }
        else if (horizontalTextPosition == CENTER) {
            textR.x = (iconR.width / 2) - (textR.width / 2);
        }
        else { // (horizontalTextPosition == RIGHT)
            textR.x = (iconR.width + gap);
        }

        // WARNING: DefaultTreeCellEditor uses a shortened version of
        // this algorithm to position it's Icon. If you change how this
        // is calculated, be sure and update DefaultTreeCellEditor too.

        /* labelR is the rectangle that contains iconR and textR.
         * Move it to its proper position given the labelAlignment
         * properties.
         *
         * To avoid actually allocating a Rectangle, Rectangle.union
         * has been inlined below.
         */
        int labelR_x = Math.min(iconR.x, textR.x);
        int labelR_width = Math.max(iconR.x + iconR.width,
                                    textR.x + textR.width) - labelR_x;
        int labelR_y = Math.min(iconR.y, textR.y);
        int labelR_height = Math.max(iconR.y + iconR.height,
                                     textR.y + textR.height) - labelR_y;

        int dx, dy;

        if (verticalAlignment == TOP) {
            dy = viewR.y - labelR_y;
        }
        else if (verticalAlignment == CENTER) {
            dy = (viewR.y + (viewR.height / 2)) - (labelR_y + (labelR_height / 2));
        }
        else { // (verticalAlignment == BOTTOM)
            dy = (viewR.y + viewR.height) - (labelR_y + labelR_height);
        }

        if (horizontalAlignment == LEFT) {
            dx = viewR.x - labelR_x;
        }
        else if (horizontalAlignment == RIGHT) {
            dx = (viewR.x + viewR.width) - (labelR_x + labelR_width);
        }
        else { // (horizontalAlignment == CENTER)
            dx = (viewR.x + (viewR.width / 2)) -
                 (labelR_x + (labelR_width / 2));
        }

        /* Translate textR and glypyR by dx,dy.
         */

        textR.x += dx;
        textR.y += dy;

        iconR.x += dx;
        iconR.y += dy;

        if (lsb < 0) {
            // lsb is negative. Shift the x location so that the text is
            // visually drawn at the right location.
            textR.x -= lsb;

            textR.width += lsb;
        }
        if (rsb > 0) {
            textR.width -= rsb;
        }

        return text;
    }


    /**
     * Paints a component to the specified <code>Graphics</code>.
     * This method is primarily useful to render
     * <code>Component</code>s that don't exist as part of the visible
     * containment hierarchy, but are used for rendering.  For
     * example, if you are doing your own rendering and want to render
     * some text (or even HTML), you could make use of
     * <code>JLabel</code>'s text rendering support and have it paint
     * directly by way of this method, without adding the label to the
     * visible containment hierarchy.
     * <p>
     * This method makes use of <code>CellRendererPane</code> to handle
     * the actual painting, and is only recommended if you use one
     * component for rendering.  If you make use of multiple components
     * to handle the rendering, as <code>JTable</code> does, use
     * <code>CellRendererPane</code> directly.  Otherwise, as described
     * below, you could end up with a <code>CellRendererPane</code>
     * per <code>Component</code>.
     * <p>
     * If <code>c</code>'s parent is not a <code>CellRendererPane</code>,
     * a new <code>CellRendererPane</code> is created, <code>c</code> is
     * added to it, and the <code>CellRendererPane</code> is added to
     * <code>p</code>.  If <code>c</code>'s parent is a
     * <code>CellRendererPane</code> and the <code>CellRendererPane</code>s
     * parent is not <code>p</code>, it is added to <code>p</code>.
     * <p>
     * The component should either descend from <code>JComponent</code>
     * or be another kind of lightweight component.
     * A lightweight component is one whose "lightweight" property
     * (returned by the <code>Component</code>
     * <code>isLightweight</code> method)
     * is true. If the Component is not lightweight, bad things map happen:
     * crashes, exceptions, painting problems...
     *
     * @param g  the <code>Graphics</code> object to draw on
     * @param c  the <code>Component</code> to draw
     * @param p  the intermediate <code>Container</code>
     * @param x  an int specifying the left side of the area draw in, in pixels,
     *           measured from the left edge of the graphics context
     * @param y  an int specifying the top of the area to draw in, in pixels
     *           measured down from the top edge of the graphics context
     * @param w  an int specifying the width of the area draw in, in pixels
     * @param h  an int specifying the height of the area draw in, in pixels
     *
     * @see CellRendererPane
     * @see java.awt.Component#isLightweight
     */
    public static void paintComponent(Graphics g, Component c, Container p, int x, int y, int w, int h) {
        getCellRendererPane(c, p).paintComponent(g, c, p, x, y, w, h,false);
    }

    /**
     * Paints a component to the specified <code>Graphics</code>.  This
     * is a cover method for
     * {@link #paintComponent(Graphics,Component,Container,int,int,int,int)}.
     * Refer to it for more information.
     *
     * @param g  the <code>Graphics</code> object to draw on
     * @param c  the <code>Component</code> to draw
     * @param p  the intermediate <code>Container</code>
     * @param r  the <code>Rectangle</code> to draw in
     *
     * @see #paintComponent(Graphics,Component,Container,int,int,int,int)
     * @see CellRendererPane
     */
    public static void paintComponent(Graphics g, Component c, Container p, Rectangle r) {
        paintComponent(g, c, p, r.x, r.y, r.width, r.height);
    }


    /*
     * Ensures that cell renderer <code>c</code> has a
     * <code>ComponentShell</code> parent and that
     * the shell's parent is p.
     */
    private static CellRendererPane getCellRendererPane(Component c, Container p) {
        Container shell = c.getParent();
        if (shell instanceof CellRendererPane) {
            if (shell.getParent() != p) {
                p.add(shell);
            }
        } else {
            shell = new CellRendererPane();
            shell.add(c);
            p.add(shell);
        }
        return (CellRendererPane)shell;
    }

    /**
     * A simple minded look and feel change: ask each node in the tree
     * to <code>updateUI()</code> -- that is, to initialize its UI property
     * with the current look and feel.
     *
     * @param c the component
     */
    public static void updateComponentTreeUI(Component c) {
        updateComponentTreeUI0(c);
        c.invalidate();
        c.validate();
        c.repaint();
    }

    private static void updateComponentTreeUI0(Component c) {
        if (c instanceof JComponent) {
            JComponent jc = (JComponent) c;
            jc.updateUI();
            JPopupMenu jpm =jc.getComponentPopupMenu();
            if(jpm != null) {
                updateComponentTreeUI(jpm);
            }
        }
        Component[] children = null;
        if (c instanceof JMenu) {
            children = ((JMenu)c).getMenuComponents();
        }
        else if (c instanceof Container) {
            children = ((Container)c).getComponents();
        }
        if (children != null) {
            for (Component child : children) {
                updateComponentTreeUI0(child);
            }
        }
    }


    /**
     * Causes <i>doRun.run()</i> to be executed asynchronously on the
     * AWT event dispatching thread.  This will happen after all
     * pending AWT events have been processed.  This method should
     * be used when an application thread needs to update the GUI.
     * In the following example the <code>invokeLater</code> call queues
     * the <code>Runnable</code> object <code>doHelloWorld</code>
     * on the event dispatching thread and
     * then prints a message.
     * <pre>
     * Runnable doHelloWorld = new Runnable() {
     *     public void run() {
     *         System.out.println("Hello World on " + Thread.currentThread());
     *     }
     * };
     *
     * SwingUtilities.invokeLater(doHelloWorld);
     * System.out.println("This might well be displayed before the other message.");
     * </pre>
     * If invokeLater is called from the event dispatching thread --
     * for example, from a JButton's ActionListener -- the <i>doRun.run()</i> will
     * still be deferred until all pending events have been processed.
     * Note that if the <i>doRun.run()</i> throws an uncaught exception
     * the event dispatching thread will unwind (not the current thread).
     * <p>
     * Additional documentation and examples for this method can be
     * found in
     * <A HREF="http://docs.oracle.com/javase/tutorial/uiswing/concurrency/index.html">Concurrency in Swing</a>.
     * <p>
     * As of 1.3 this method is just a cover for <code>java.awt.EventQueue.invokeLater()</code>.
     * <p>
     * Unlike the rest of Swing, this method can be invoked from any thread.
     *
     * @param doRun the instance of {@code Runnable}
     * @see #invokeAndWait
     */
    public static void invokeLater(Runnable doRun) {
        EventQueue.invokeLater(doRun);
    }


    /**
     * Causes <code>doRun.run()</code> to be executed synchronously on the
     * AWT event dispatching thread.  This call blocks until
     * all pending AWT events have been processed and (then)
     * <code>doRun.run()</code> returns. This method should
     * be used when an application thread needs to update the GUI.
     * It shouldn't be called from the event dispatching thread.
     * Here's an example that creates a new application thread
     * that uses <code>invokeAndWait</code> to print a string from the event
     * dispatching thread and then, when that's finished, print
     * a string from the application thread.
     * <pre>
     * final Runnable doHelloWorld = new Runnable() {
     *     public void run() {
     *         System.out.println("Hello World on " + Thread.currentThread());
     *     }
     * };
     *
     * Thread appThread = new Thread() {
     *     public void run() {
     *         try {
     *             SwingUtilities.invokeAndWait(doHelloWorld);
     *         }
     *         catch (Exception e) {
     *             e.printStackTrace();
     *         }
     *         System.out.println("Finished on " + Thread.currentThread());
     *     }
     * };
     * appThread.start();
     * </pre>
     * Note that if the <code>Runnable.run</code> method throws an
     * uncaught exception
     * (on the event dispatching thread) it's caught and rethrown, as
     * an <code>InvocationTargetException</code>, on the caller's thread.
     * <p>
     * Additional documentation and examples for this method can be
     * found in
     * <A HREF="http://docs.oracle.com/javase/tutorial/uiswing/concurrency/index.html">Concurrency in Swing</a>.
     * <p>
     * As of 1.3 this method is just a cover for
     * <code>java.awt.EventQueue.invokeAndWait()</code>.
     *
     * @param doRun the instance of {@code Runnable}
     * @exception  InterruptedException if we're interrupted while waiting for
     *             the event dispatching thread to finish executing
     *             <code>doRun.run()</code>
     * @exception  InvocationTargetException  if an exception is thrown
     *             while running <code>doRun</code>
     *
     * @see #invokeLater
     */
    public static void invokeAndWait(final Runnable doRun)
        throws InterruptedException, InvocationTargetException
    {
        EventQueue.invokeAndWait(doRun);
    }

    /**
     * Returns true if the current thread is an AWT event dispatching thread.
     * <p>
     * As of 1.3 this method is just a cover for
     * <code>java.awt.EventQueue.isDispatchThread()</code>.
     *
     * @return true if the current thread is an AWT event dispatching thread
     */
    public static boolean isEventDispatchThread()
    {
        return EventQueue.isDispatchThread();
    }


    /*
     * --- Accessibility Support ---
     *
     */

    /**
     * Get the index of this object in its accessible parent.<p>
     *
     * Note: as of the Java 2 platform v1.3, it is recommended that developers call
     * Component.AccessibleAWTComponent.getAccessibleIndexInParent() instead
     * of using this method.
     *
     * @param c the component
     * @return -1 of this object does not have an accessible parent.
     * Otherwise, the index of the child in its accessible parent.
     */
    public static int getAccessibleIndexInParent(Component c) {
        return c.getAccessibleContext().getAccessibleIndexInParent();
    }

    /**
     * Returns the <code>Accessible</code> child contained at the
     * local coordinate <code>Point</code>, if one exists.
     * Otherwise returns <code>null</code>.
     *
     * @param c the component
     * @param p the local coordinate
     * @return the <code>Accessible</code> at the specified location,
     *    if it exists; otherwise <code>null</code>
     */
    public static Accessible getAccessibleAt(Component c, Point p) {
        if (c instanceof Container) {
            return c.getAccessibleContext().getAccessibleComponent().getAccessibleAt(p);
        } else if (c instanceof Accessible) {
            Accessible a = (Accessible) c;
            if (a != null) {
                AccessibleContext ac = a.getAccessibleContext();
                if (ac != null) {
                    AccessibleComponent acmp;
                    Point location;
                    int nchildren = ac.getAccessibleChildrenCount();
                    for (int i=0; i < nchildren; i++) {
                        a = ac.getAccessibleChild(i);
                        if ((a != null)) {
                            ac = a.getAccessibleContext();
                            if (ac != null) {
                                acmp = ac.getAccessibleComponent();
                                if ((acmp != null) && (acmp.isShowing())) {
                                    location = acmp.getLocation();
                                    Point np = new Point(p.x-location.x,
                                                         p.y-location.y);
                                    if (acmp.contains(np)){
                                        return a;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return (Accessible) c;
        }
        return null;
    }

    /**
     * Get the state of this object. <p>
     *
     * Note: as of the Java 2 platform v1.3, it is recommended that developers call
     * Component.AccessibleAWTComponent.getAccessibleIndexInParent() instead
     * of using this method.
     *
     * @param c the component
     * @return an instance of AccessibleStateSet containing the current state
     * set of the object
     * @see AccessibleState
     */
    public static AccessibleStateSet getAccessibleStateSet(Component c) {
        return c.getAccessibleContext().getAccessibleStateSet();
    }

    /**
     * Returns the number of accessible children in the object.  If all
     * of the children of this object implement Accessible, than this
     * method should return the number of children of this object. <p>
     *
     * Note: as of the Java 2 platform v1.3, it is recommended that developers call
     * Component.AccessibleAWTComponent.getAccessibleIndexInParent() instead
     * of using this method.
     *
     * @param c the component
     * @return the number of accessible children in the object.
     */
    public static int getAccessibleChildrenCount(Component c) {
        return c.getAccessibleContext().getAccessibleChildrenCount();
    }

    /**
     * Return the nth Accessible child of the object. <p>
     *
     * Note: as of the Java 2 platform v1.3, it is recommended that developers call
     * Component.AccessibleAWTComponent.getAccessibleIndexInParent() instead
     * of using this method.
     *
     * @param c the component
     * @param i zero-based index of child
     * @return the nth Accessible child of the object
     */
    public static Accessible getAccessibleChild(Component c, int i) {
        return c.getAccessibleContext().getAccessibleChild(i);
    }

    /**
     * Return the child <code>Component</code> of the specified
     * <code>Component</code> that is the focus owner, if any.
     *
     * @param c the root of the <code>Component</code> hierarchy to
     *        search for the focus owner
     * @return the focus owner, or <code>null</code> if there is no focus
     *         owner, or if the focus owner is not <code>comp</code>, or a
     *         descendant of <code>comp</code>
     *
     * @see java.awt.KeyboardFocusManager#getFocusOwner
     * @deprecated As of 1.4, replaced by
     *   <code>KeyboardFocusManager.getFocusOwner()</code>.
     */
    @Deprecated
    public static Component findFocusOwner(Component c) {
        Component focusOwner = KeyboardFocusManager.
            getCurrentKeyboardFocusManager().getFocusOwner();

        // verify focusOwner is a descendant of c
        for (Component temp = focusOwner; temp != null;
             temp = (temp instanceof Window) ? null : temp.getParent())
        {
            if (temp == c) {
                return focusOwner;
            }
        }

        return null;
    }

    /**
     * If c is a JRootPane descendant return its JRootPane ancestor.
     * If c is a RootPaneContainer then return its JRootPane.
     *
     * @param c the component
     * @return the JRootPane for Component c or {@code null}.
     */
    public static JRootPane getRootPane(Component c) {
        if (c instanceof RootPaneContainer) {
            return ((RootPaneContainer)c).getRootPane();
        }
        for( ; c != null; c = c.getParent()) {
            if (c instanceof JRootPane) {
                return (JRootPane)c;
            }
        }
        return null;
    }


    /**
     * Returns the root component for the current component tree.
     *
     * @param c the component
     * @return the first ancestor of c that's a Window or the last Applet ancestor
     */
    @SuppressWarnings("deprecation")
    public static Component getRoot(Component c) {
        Component applet = null;
        for(Component p = c; p != null; p = p.getParent()) {
            if (p instanceof Window) {
                return p;
            }
            if (p instanceof Applet) {
                applet = p;
            }
        }
        return applet;
    }

    static JComponent getPaintingOrigin(JComponent c) {
        Container p = c;
        while ((p = p.getParent()) instanceof JComponent) {
            JComponent jp = (JComponent) p;
            if (jp.isPaintingOrigin()) {
                return jp;
            }
        }
        return null;
    }

    /**
     * Process the key bindings for the <code>Component</code> associated with
     * <code>event</code>. This method is only useful if
     * <code>event.getComponent()</code> does not descend from
     * <code>JComponent</code>, or your are not invoking
     * <code>super.processKeyEvent</code> from within your
     * <code>JComponent</code> subclass. <code>JComponent</code>
     * automatically processes bindings from within its
     * <code>processKeyEvent</code> method, hence you rarely need
     * to directly invoke this method.
     *
     * @param event KeyEvent used to identify which bindings to process, as
     *              well as which Component has focus.
     * @return true if a binding has found and processed
     * @since 1.4
     */
    @SuppressWarnings("deprecation")
    public static boolean processKeyBindings(KeyEvent event) {
        if (event != null) {
            if (event.isConsumed()) {
                return false;
            }

            Component component = event.getComponent();
            boolean pressed = (event.getID() == KeyEvent.KEY_PRESSED);

            if (!isValidKeyEventForKeyBindings(event)) {
                return false;
            }
            // Find the first JComponent in the ancestor hierarchy, and
            // invoke processKeyBindings on it
            while (component != null) {
                if (component instanceof JComponent) {
                    return ((JComponent)component).processKeyBindings(
                                                   event, pressed);
                }
                if ((component instanceof Applet) ||
                    (component instanceof Window)) {
                    // No JComponents, if Window or Applet parent, process
                    // WHEN_IN_FOCUSED_WINDOW bindings.
                    return JComponent.processKeyBindingsForAllComponents(
                                  event, (Container)component, pressed);
                }
                component = component.getParent();
            }
        }
        return false;
    }

    /**
     * Returns true if the <code>e</code> is a valid KeyEvent to use in
     * processing the key bindings associated with JComponents.
     */
    static boolean isValidKeyEventForKeyBindings(KeyEvent e) {
        return true;
    }

    /**
     * Invokes {@code actionPerformed} on {@code action} if {@code action}
     * is non-{@code null} and accepts the sender object.
     * The command for the ActionEvent is determined by:
     * <ol>
     *   <li>If the action was registered via
     *       <code>registerKeyboardAction</code>, then the command string
     *       passed in ({@code null} will be used if {@code null} was passed in).
     *   <li>Action value with name Action.ACTION_COMMAND_KEY, unless {@code null}.
     *   <li>String value of the KeyEvent, unless <code>getKeyChar</code>
     *       returns KeyEvent.CHAR_UNDEFINED..
     * </ol>
     * This will return true if <code>action</code> is non-{@code null} and
     * actionPerformed is invoked on it.
     *
     * @param action an action
     * @param ks a key stroke
     * @param event a key event
     * @param sender a sender
     * @param modifiers action modifiers
     * @return {@code true} if {@code action} is non-{@code null} and
     *         actionPerformed is invoked on it.
     * @see javax.swing.Action#accept
     *
     * @since 1.3
     */
    public static boolean notifyAction(Action action, KeyStroke ks,
                                       KeyEvent event, Object sender,
                                       int modifiers) {

        if (action == null || !action.accept(sender)) {
            return false;
        }

        Object commandO;
        boolean stayNull;

        // Get the command object.
        commandO = action.getValue(Action.ACTION_COMMAND_KEY);
        if (commandO == null && (action instanceof JComponent.ActionStandin)) {
            // ActionStandin is used for historical reasons to support
            // registerKeyboardAction with a null value.
            stayNull = true;
        }
        else {
            stayNull = false;
        }

        // Convert it to a string.
        String command;

        if (commandO != null) {
            command = commandO.toString();
        }
        else if (!stayNull && event.getKeyChar() != KeyEvent.CHAR_UNDEFINED) {
            command = String.valueOf(event.getKeyChar());
        }
        else {
            // Do null for undefined chars, or if registerKeyboardAction
            // was called with a null.
            command = null;
        }
        action.actionPerformed(new ActionEvent(sender,
                        ActionEvent.ACTION_PERFORMED, command, event.getWhen(),
                        modifiers));
        return true;
    }


    /**
     * Convenience method to change the UI InputMap for <code>component</code>
     * to <code>uiInputMap</code>. If <code>uiInputMap</code> is {@code null},
     * this removes any previously installed UI InputMap.
     *
     * @param component a component
     * @param type a type
     * @param uiInputMap an {@code InputMap}
     * @since 1.3
     */
    public static void replaceUIInputMap(JComponent component, int type,
                                         InputMap uiInputMap) {
        InputMap map = component.getInputMap(type, (uiInputMap != null));

        while (map != null) {
            InputMap parent = map.getParent();
            if (parent == null || (parent instanceof UIResource)) {
                map.setParent(uiInputMap);
                return;
            }
            map = parent;
        }
    }


    /**
     * Convenience method to change the UI ActionMap for <code>component</code>
     * to <code>uiActionMap</code>. If <code>uiActionMap</code> is {@code null},
     * this removes any previously installed UI ActionMap.
     *
     * @param component a component
     * @param uiActionMap an {@code ActionMap}
     * @since 1.3
     */
    public static void replaceUIActionMap(JComponent component,
                                          ActionMap uiActionMap) {
        ActionMap map = component.getActionMap((uiActionMap != null));

        while (map != null) {
            ActionMap parent = map.getParent();
            if (parent == null || (parent instanceof UIResource)) {
                map.setParent(uiActionMap);
                return;
            }
            map = parent;
        }
    }


    /**
     * Returns the InputMap provided by the UI for condition
     * <code>condition</code> in component <code>component</code>.
     * <p>This will return {@code null} if the UI has not installed an InputMap
     * of the specified type.
     *
     * @param component a component
     * @param condition a condition
     * @return the {@code ActionMap} provided by the UI for {@code condition}
     *         in the component, or {@code null} if the UI has not installed
     *         an InputMap of the specified type.
     * @since 1.3
     */
    public static InputMap getUIInputMap(JComponent component, int condition) {
        InputMap map = component.getInputMap(condition, false);
        while (map != null) {
            InputMap parent = map.getParent();
            if (parent instanceof UIResource) {
                return parent;
            }
            map = parent;
        }
        return null;
    }

    /**
     * Returns the ActionMap provided by the UI
     * in component <code>component</code>.
     * <p>This will return {@code null} if the UI has not installed an ActionMap.
     *
     * @param component a component
     * @return the {@code ActionMap} provided by the UI in the component,
     *         or {@code null} if the UI has not installed an ActionMap.
     * @since 1.3
     */
    public static ActionMap getUIActionMap(JComponent component) {
        ActionMap map = component.getActionMap(false);
        while (map != null) {
            ActionMap parent = map.getParent();
            if (parent instanceof UIResource) {
                return parent;
            }
            map = parent;
        }
        return null;
    }


    // Don't use String, as it's not guaranteed to be unique in a Hashtable.
    private static final Object sharedOwnerFrameKey =
       new StringBuffer("SwingUtilities.sharedOwnerFrame");

    @SuppressWarnings("serial") // JDK-implementation class
    static class SharedOwnerFrame extends Frame implements WindowListener {
        public void addNotify() {
            super.addNotify();
            installListeners();
        }

        /**
         * Install window listeners on owned windows to watch for displayability changes
         */
        void installListeners() {
            Window[] windows = getOwnedWindows();
            for (Window window : windows) {
                if (window != null) {
                    window.removeWindowListener(this);
                    window.addWindowListener(this);
                }
            }
        }

        /**
         * Watches for displayability changes and disposes shared instance if there are no
         * displayable children left.
         */
        public void windowClosed(WindowEvent e) {
            synchronized(getTreeLock()) {
                Window[] windows = getOwnedWindows();
                for (Window window : windows) {
                    if (window != null) {
                        if (window.isDisplayable()) {
                            return;
                        }
                        window.removeWindowListener(this);
                    }
                }
                dispose();
            }
        }
        public void windowOpened(WindowEvent e) {
        }
        public void windowClosing(WindowEvent e) {
        }
        public void windowIconified(WindowEvent e) {
        }
        public void windowDeiconified(WindowEvent e) {
        }
        public void windowActivated(WindowEvent e) {
        }
        public void windowDeactivated(WindowEvent e) {
        }

        @SuppressWarnings("deprecation")
        public void show() {
            // This frame can never be shown
        }
        public void dispose() {
            try {
                getToolkit().getSystemEventQueue();
                super.dispose();
            } catch (Exception e) {
                // untrusted code not allowed to dispose
            }
        }
    }

    /**
     * Returns a toolkit-private, shared, invisible Frame
     * to be the owner for JDialogs and JWindows created with
     * {@code null} owners.
     * @exception HeadlessException if GraphicsEnvironment.isHeadless()
     * returns true.
     * @see java.awt.GraphicsEnvironment#isHeadless
     */
    static Frame getSharedOwnerFrame() throws HeadlessException {
        Frame sharedOwnerFrame =
            (Frame)SwingUtilities.appContextGet(sharedOwnerFrameKey);
        if (sharedOwnerFrame == null) {
            sharedOwnerFrame = new SharedOwnerFrame();
            SwingUtilities.appContextPut(sharedOwnerFrameKey,
                                         sharedOwnerFrame);
        }
        return sharedOwnerFrame;
    }

    /**
     * Returns a SharedOwnerFrame's shutdown listener to dispose the SharedOwnerFrame
     * if it has no more displayable children.
     * @exception HeadlessException if GraphicsEnvironment.isHeadless()
     * returns true.
     * @see java.awt.GraphicsEnvironment#isHeadless
     */
    static WindowListener getSharedOwnerFrameShutdownListener() throws HeadlessException {
        Frame sharedOwnerFrame = getSharedOwnerFrame();
        return (WindowListener)sharedOwnerFrame;
    }

    /* Don't make these AppContext accessors public or protected --
     * since AppContext is in sun.awt in 1.2, we shouldn't expose it
     * even indirectly with a public API.
     */
    // REMIND(aim): phase out use of 4 methods below since they
    // are just private covers for AWT methods (?)

    static Object appContextGet(Object key) {
        return AppContext.getAppContext().get(key);
    }

    static void appContextPut(Object key, Object value) {
        AppContext.getAppContext().put(key, value);
    }

    static void appContextRemove(Object key) {
        AppContext.getAppContext().remove(key);
    }


    static Class<?> loadSystemClass(String className) throws ClassNotFoundException {
        ReflectUtil.checkPackageAccess(className);
        return Class.forName(className, true, Thread.currentThread().
                             getContextClassLoader());
    }


   /*
     * Convenience function for determining ComponentOrientation.  Helps us
     * avoid having Munge directives throughout the code.
     */
    static boolean isLeftToRight( Component c ) {
        return c.getComponentOrientation().isLeftToRight();
    }
    private SwingUtilities() {
        throw new Error("SwingUtilities is just a container for static methods");
    }

    /**
     * Returns true if the Icon <code>icon</code> is an instance of
     * ImageIcon, and the image it contains is the same as <code>image</code>.
     */
    static boolean doesIconReferenceImage(Icon icon, Image image) {
        Image iconImage = (icon != null && (icon instanceof ImageIcon)) ?
                           ((ImageIcon)icon).getImage() : null;
        return (iconImage == image);
    }

    /**
     * Returns index of the first occurrence of <code>mnemonic</code>
     * within string <code>text</code>. Matching algorithm is not
     * case-sensitive.
     *
     * @param text The text to search through, may be {@code null}
     * @param mnemonic The mnemonic to find the character for.
     * @return index into the string if exists, otherwise -1
     */
    static int findDisplayedMnemonicIndex(String text, int mnemonic) {
        if (text == null || mnemonic == '\0') {
            return -1;
        }

        char uc = Character.toUpperCase((char)mnemonic);
        char lc = Character.toLowerCase((char)mnemonic);

        int uci = text.indexOf(uc);
        int lci = text.indexOf(lc);

        if (uci == -1) {
            return lci;
        } else if(lci == -1) {
            return uci;
        } else {
            return (lci < uci) ? lci : uci;
        }
    }

    /**
     * Stores the position and size of
     * the inner painting area of the specified component
     * in <code>r</code> and returns <code>r</code>.
     * The position and size specify the bounds of the component,
     * adjusted so as not to include the border area (the insets).
     * This method is useful for classes
     * that implement painting code.
     *
     * @param c  the JComponent in question; if {@code null}, this method returns {@code null}
     * @param r  the Rectangle instance to be modified;
     *           may be {@code null}
     * @return {@code null} if the Component is {@code null};
     *         otherwise, returns the passed-in rectangle (if non-{@code null})
     *         or a new rectangle specifying position and size information
     *
     * @since 1.4
     */
    public static Rectangle calculateInnerArea(JComponent c, Rectangle r) {
        if (c == null) {
            return null;
        }
        Rectangle rect = r;
        Insets insets = c.getInsets();

        if (rect == null) {
            rect = new Rectangle();
        }

        rect.x = insets.left;
        rect.y = insets.top;
        rect.width = c.getWidth() - insets.left - insets.right;
        rect.height = c.getHeight() - insets.top - insets.bottom;

        return rect;
    }

    static void updateRendererOrEditorUI(Object rendererOrEditor) {
        if (rendererOrEditor == null) {
            return;
        }

        Component component = null;

        if (rendererOrEditor instanceof Component) {
            component = (Component)rendererOrEditor;
        }
        if (rendererOrEditor instanceof DefaultCellEditor) {
            component = ((DefaultCellEditor)rendererOrEditor).getComponent();
        }

        if (component != null) {
            SwingUtilities.updateComponentTreeUI(component);
        }
    }

    /**
     * Returns the first ancestor of the {@code component}
     * which is not an instance of {@link JLayer}.
     *
     * @param component {@code Component} to get
     * the first ancestor of, which is not a {@link JLayer} instance.
     *
     * @return the first ancestor of the {@code component}
     * which is not an instance of {@link JLayer}.
     * If such an ancestor can not be found, {@code null} is returned.
     *
     * @throws NullPointerException if {@code component} is {@code null}
     * @see JLayer
     *
     * @since 1.7
     */
    public static Container getUnwrappedParent(Component component) {
        Container parent = component.getParent();
        while(parent instanceof JLayer) {
            parent = parent.getParent();
        }
        return parent;
    }

    /**
     * Returns the first {@code JViewport}'s descendant
     * which is not an instance of {@code JLayer}.
     * If such a descendant can not be found, {@code null} is returned.
     *
     * If the {@code viewport}'s view component is not a {@code JLayer},
     * this method is equivalent to {@link JViewport#getView()}
     * otherwise {@link JLayer#getView()} will be recursively
     * called on all descending {@code JLayer}s.
     *
     * @param viewport {@code JViewport} to get the first descendant of,
     * which in not a {@code JLayer} instance.
     *
     * @return the first {@code JViewport}'s descendant
     * which is not an instance of {@code JLayer}.
     * If such a descendant can not be found, {@code null} is returned.
     *
     * @throws NullPointerException if {@code viewport} is {@code null}
     * @see JViewport#getView()
     * @see JLayer
     *
     * @since 1.7
     */
    public static Component getUnwrappedView(JViewport viewport) {
        Component view = viewport.getView();
        while (view instanceof JLayer) {
            view = ((JLayer)view).getView();
        }
        return view;
    }

   /**
     * Retrieves the validate root of a given container.
     *
     * If the container is contained within a {@code CellRendererPane}, this
     * method returns {@code null} due to the synthetic nature of the {@code
     * CellRendererPane}.
     * <p>
     * The component hierarchy must be displayable up to the toplevel component
     * (either a {@code Frame} or an {@code Applet} object.) Otherwise this
     * method returns {@code null}.
     * <p>
     * If the {@code visibleOnly} argument is {@code true}, the found validate
     * root and all its parents up to the toplevel component must also be
     * visible. Otherwise this method returns {@code null}.
     *
     * @return the validate root of the given container or null
     * @see java.awt.Component#isDisplayable()
     * @see java.awt.Component#isVisible()
     * @since 1.7
     */
    @SuppressWarnings("deprecation")
    static Container getValidateRoot(Container c, boolean visibleOnly) {
        Container root = null;

        for (; c != null; c = c.getParent())
        {
            if (!c.isDisplayable() || c instanceof CellRendererPane) {
                return null;
            }
            if (c.isValidateRoot()) {
                root = c;
                break;
            }
        }

        if (root == null) {
            return null;
        }

        for (; c != null; c = c.getParent()) {
            if (!c.isDisplayable() || (visibleOnly && !c.isVisible())) {
                return null;
            }
            if (c instanceof Window || c instanceof Applet) {
                return root;
            }
        }

        return null;
    }
}
