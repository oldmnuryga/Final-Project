package main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.security.acl.Owner;
import java.util.ArrayList;
import java.util.Random;
import java.util.PrimitiveIterator.OfDouble;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.AbstractAction;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.KeyStroke;

import civilizations.Building;
import civilizations.Player;
import civilizations.Wonder;
import civilizations.buildings.*;
import civilizations.wonders.ApolloProgram;
import civilizations.wonders.BachsCathedral;
import civilizations.wonders.CancerCure;
import civilizations.wonders.CopernicusObservatory;
import civilizations.wonders.DarwinsVoyage;
import civilizations.wonders.GreatLibrary;
import civilizations.wonders.HangingGardens;
import civilizations.wonders.MichelangelosChapel;
import civilizations.wonders.NewtonsCollege;
import civilizations.wonders.Oracle;
import leaders.America;
import leaders.Italy;
import leaders.Korea;
import leaders.Mongolia;
import leaders.Poland;
import map.ForestTile;
import map.GrassTile;
import map.MountainTile;
import map.SandTile;
import map.Tile;
import map.WaterTile;
import sound.sounds;
import technology.Technology;
import units.*;

public class CivilizationGame {
	public static int turns = 1;
	private int year;

	// CONSTANTS
	private final int SCROLL_SPEED = 10;

	// PLAYER INFO
	private Player player;
	private int researchTimeSpent = 1;
	private int unitProdTimeSpent = 1;
	private int buildingProdTimeSpent = 1;
	private int wonderProdTimeSpent = 1;

	private Object currentProd;

	private int movesToProd;
	private int movesToTech;

	// UNIT GENERATION:
	private int settlerTempX;
	private int settlerTempY;

	// JGRAPHICS CONSTRUCTORS
	private JScrollPane pickUnit = new JScrollPane(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
			JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
	private JScrollPane pickWonder = new JScrollPane(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
			JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
	private JScrollPane pickBuilding = new JScrollPane(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
			JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
	private JFrame frame = new JFrame("Society Simulator VII");
	private JLabel lblGold = new JLabel("Gold: ");
	private JLabel lblResearch = new JLabel("Research: ");
	private JLabel lblProduction = new JLabel("Production: ");
	private JLabel lblHappiness = new JLabel("Happiness: ");
	private JLabel lblTurns = new JLabel("Turns: " + turns);
	private JLabel lblFood = new JLabel("Food: ");
	private JLabel lblYear = new JLabel("3000 BC");
	private JFrame frPickResearch = new JFrame("Research");
	private JPanel paPickProduction = new JPanel();
	private JFrame frPickProduction = new JFrame("Production");
	private ImageIcon fog = new ImageIcon(Tile.class.getClassLoader().getResource("map/resources/fog.png"));

	private JButton btnEndTurn = new JButton("End Turn");
	private JButton btnShowInstructions = new JButton("How to Play the Game");
	private JPanel pnePlayerStats = new JPanel();
	private boolean check = false;

	private JFrame titleFrame = new JFrame("Society Simulator VII");
	private JButton btnCasimir = new JButton(iconCasimir);
	private JButton btnMussolini = new JButton(iconMussolini);
	private JButton btnGenghis = new JButton(iconGenghis);
	private JButton btnSejong = new JButton(iconSejong);
	private JButton btnWashington = new JButton(iconWashington);
	private JLabel lblGenghis = new JLabel("MONGOLIA"), lblWashington = new JLabel("AMERICA"),
			lblSejong = new JLabel("KOREA"), lblMussolini = new JLabel("ITALY"), lblCasimir = new JLabel("POLAND");
	private JPanel mapPanel = new JPanel();
	private JScrollPane mapPane;
	private JButton[][] $mapButtons = new JButton[Tile.getMAP_SIZE()][Tile.getMAP_SIZE()];

	private JFrame frInstructions = new JFrame("Civilization");

	private JFrame cityScreen = new JFrame("City View");
	private JLabel cityName;

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
	static ImageIcon iconTrophy = new ImageIcon(
			CivilizationGame.class.getClassLoader().getResource("main/resources/trophy.png"));
	static ImageIcon background1 = new ImageIcon(
			CivilizationGame.class.getClassLoader().getResource("main/resources/background1.png"));

	private Technology currentResearchedTech;

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

		// Research screen
		frPickResearch.setPreferredSize(new Dimension(500, 1000));
		frPickResearch.setLayout(null);
		frPickResearch.setVisible(false);
		frPickResearch.setAlwaysOnTop(true);
		frPickResearch.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

		// Title screen
		titleFrame.setPreferredSize(new Dimension(1920, 1015));
		titleFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		titleFrame.setLayout(null);
		// title.setFont(new Font("Monospaced", Font.BOLD, 70));
		// title.setForeground(Color.GREEN);
		// title.setBackground(Color.BLUE);
		JLabel background = new JLabel();
		lblGenghis.setFont(new Font("Monospaced", Font.ITALIC, 20));
		lblGenghis.setForeground(Color.WHITE);
		lblGenghis.setBounds(300, 580, 165, 30);
		btnGenghis.setBounds(300, 605, 165, 251);
		btnGenghis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setPlayer(new Player(new Mongolia()));
				titleFrame.setVisible(false);
				frame.setVisible(true);
				spawnInitialSettler();
				spawnInitialWarrior();
				updatePlayerStats();
/*				try {
					sounds.genghisSoundPlay();
				} catch (UnsupportedAudioFileException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (LineUnavailableException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}*/
				frame.pack();
			}
		});
		titleFrame.add(btnGenghis);
		titleFrame.add(lblGenghis);
		lblWashington.setFont(new Font("Monospaced", Font.ITALIC, 20));
		lblWashington.setForeground(Color.WHITE);
		lblWashington.setBounds(600, 580, 200, 30);
		btnWashington.setBounds(600, 605, 165, 251);
		btnWashington.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setPlayer(new Player(new America()));
				titleFrame.setVisible(false);
				frame.setVisible(true);
				spawnInitialSettler();
				spawnInitialWarrior();
				updatePlayerStats();
				frame.pack();
			}
		});
		titleFrame.add(btnWashington);
		titleFrame.add(lblWashington);
		lblSejong.setFont(new Font("Monospaced", Font.ITALIC, 20));
		lblSejong.setForeground(Color.WHITE);
		lblSejong.setBounds(900, 580, 165, 30);
		btnSejong.setBounds(900, 605, 165, 251);
		btnSejong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setPlayer(new Player(new Korea()));
				titleFrame.setVisible(false);
				frame.setVisible(true);
				spawnInitialSettler();
				spawnInitialWarrior();
				updatePlayerStats();
				frame.pack();
			}
		});
		titleFrame.add(btnSejong);
		titleFrame.add(lblSejong);
		lblMussolini.setFont(new Font("Monospaced", Font.ITALIC, 20));
		lblMussolini.setForeground(Color.WHITE);
		lblMussolini.setBounds(1200, 580, 165, 30);
		btnMussolini.setBounds(1200, 605, 165, 251);
		btnMussolini.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setPlayer(new Player(new Italy()));
				titleFrame.setVisible(false);
				frame.setVisible(true);
				spawnInitialSettler();
				spawnInitialWarrior();
				updatePlayerStats();
				frame.pack();
			}
		});
		titleFrame.add(btnMussolini);
		titleFrame.add(lblMussolini);
		lblCasimir.setFont(new Font("Monospaced", Font.ITALIC, 20));
		lblCasimir.setForeground(Color.WHITE);
		lblCasimir.setBounds(1500, 580, 165, 30);
		btnCasimir.setBounds(1500, 605, 165, 251);
		btnCasimir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setPlayer(new Player(new Poland()));
				titleFrame.setVisible(false);
				frame.setVisible(true);
				spawnInitialSettler();
				spawnInitialWarrior();
				updatePlayerStats();
				frame.pack();
			}
		});
		titleFrame.add(btnCasimir);
		titleFrame.add(lblCasimir);
		background.setIcon(background1);
		background.setBounds(0, 0, 1920, 1015);
		titleFrame.add(background);
		titleFrame.setVisible(true);

		// Game GUI
		btnEndTurn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				endTurn();
				updateTurnText();
				// other things
			}
		});

		JTabbedPane tbpneInstructions = new JTabbedPane(JTabbedPane.LEFT, JTabbedPane.WRAP_TAB_LAYOUT);
		JTextArea panel1 = new JTextArea("Welcome to Society Simulator VII. " + "\n"
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
				+ "science per turn. Trading posts are used to increase gold per turn.");
		tbpneInstructions.addTab("Units", panel2);
		JTextArea panel3 = new JTextArea("Wonders are built by the player and can be used to benefit the "
				+ "player with a specific stat. Some stats that get benefits from the " + "\n"
				+ "wonders include happiness, research, science. To win the game, " + "\n"
				+ "the Apollo Program must be built to begin the space race. After " + "\n"
				+ "making it to the moon you win the game with a science victory. " + "\n"
				+ "This is one of the few ways to finish the game. Wonders can " + "\n"
				+ "only built once, and are a valuable resource for winning the " + "\n"
				+ "game via the science victory.");
		tbpneInstructions.addTab("Wonders", panel3);
		JTextArea panel4 = new JTextArea("Buildings, like wonders, are things built by the city only once " + "\n"
				+ "and provide many benefits to the player. For example a building " + "\n"
				+ "may increase the science of a city by a certain percentage or " + "\n"
				+ "increase the gold that a city produces by a number or percentage. " + "\n"
				+ "The benefits of a building depends on the building and ranges " + "\n"
				+ "in benefits from science to gold to science. Buildings are " + "\n"
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
				+ "higher number of citizens increases science, science, and " + "\n"
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
		btnShowInstructions.setBounds(1700, 0, 200, 50);
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
		lblYear.setBounds(1600, 0, 150, 50);
		frame.add(lblYear);
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
				$mapButtons[i][j].setEnabled(false);
				$mapButtons[i][j].setDisabledIcon(fog);
				mapPanel.add($mapButtons[i][j]);
			}
		}
		frPickProduction.setPreferredSize(new Dimension(1200, 900));
		frPickProduction.setLayout(null);
		frPickProduction.setResizable(false);

		frInstructions.pack();
		titleFrame.pack();
	}

	public void displayCityInfo() {
		cityScreen.setPreferredSize(new Dimension(600, 800));
		cityScreen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		cityScreen.setLayout(null);
		cityName.setFont(new Font("Monospaced", Font.ITALIC, 32));
		cityName.setBounds(6, 12, 165, cityScreen.getPreferredSize().width - 12);
	}

	public void updateTurnText() {
		lblTurns.setText("Turns: " + turns);
	}

	public void updateYearText() {
		lblYear.setText("Year: " + Math.abs(year) + ((year < 0) ? " BC" : " AD"));
	}

	public void updateFoodText() {
		int foodTotal = 0;
		for (int i = 0; i < player.get$cities().size(); i++) {
			int foodVal = 0;
			for (int j = 0; j < player.get$cities().get(i).get$cityTiles().size(); j++) {
				foodVal += player.get$cities().get(i).get$cityTiles().get(j).getFoodBase();
			}
			player.get$cities().get(i).setFoodTotal(player.get$cities().get(i).getFoodTotal() + foodVal);
			foodTotal += player.get$cities().get(i).getFoodTotal();
		}
		lblFood.setText("Food: " + foodTotal);
	}

	public void updateGoldText() {
		int goldTotal = 0;
		for (int i = 0; i < player.get$cities().size(); i++) {
			int goldVal = 0;
			for (int j = 0; j < player.get$cities().get(i).get$cityTiles().size(); j++) {
				goldVal += player.get$cities().get(i).get$cityTiles().get(j).getGoldBase();
			}
			player.get$cities().get(i).setGoldTotal(player.get$cities().get(i).getGoldTotal() + goldVal);
			goldTotal += player.get$cities().get(i).getGoldTotal();
		}
		lblGold.setText("Gold: " + goldTotal);
	}

	public void updateProductionText() {
		int scienceTotal = 0;
		for (int i = 0; i < player.get$cities().size(); i++) {
			int scienceVal = 0;
			for (int j = 0; j < player.get$cities().get(i).get$cityTiles().size(); j++) {
				scienceVal += player.get$cities().get(i).get$cityTiles().get(j).getProductionBase();
			}
			player.get$cities().get(i).setProductionTotal(player.get$cities().get(i).getProductionTotal() + scienceVal);
			scienceTotal += player.get$cities().get(i).getProductionTotal();
		}
		lblProduction.setText("Production: " + scienceTotal);
	}

	// AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA
	// SHOULD BE PRODUCTION ABOVE! SOMEONE FIX!
	//////// ^^^^^^^^^^^^^^^^^^^^^^^^^^

	public void updateScienceText() {
		int scienceTotal = 0;
		for (int i = 0; i < player.get$cities().size(); i++) {
			int scienceVal = 0;
			for (int j = 0; j < player.get$cities().get(i).get$cityTiles().size(); j++) {
				scienceVal += player.get$cities().get(i).get$cityTiles().get(j).getScienceBase();
			}
			player.get$cities().get(i).setScienceTotal(player.get$cities().get(i).getScienceTotal() + scienceVal);
			scienceTotal += player.get$cities().get(i).getScienceTotal();
		}
		lblResearch.setText("Science: " + scienceTotal);
	}

	public void updateHappinessText() {
		int happinessTotal = 0;
		for (int i = 0; i < player.get$cities().size(); i++) {
			int HappinessVal = 0;
			for (int j = 0; j < player.get$cities().get(i).get$cityTiles().size(); j++) {
				HappinessVal += player.get$cities().get(i).get$cityTiles().get(j).getHappinessBase();
			}
			happinessTotal += player.get$cities().get(i).getHappinessTotal();
		}
		lblHappiness.setText("Happiness: " + happinessTotal);
	}

	public void updatePlayerStats() {
		pnePlayerStats.removeAll();
		// PLAYER NAME
		pnePlayerStats.add(new JLabel("Player Name: " + player.getLeader().getLeaderName() + "\n\n"));
		// PLAYER CITIES
		if (player.get$cities().size() != 0) {
			pnePlayerStats.add(new JLabel("Player City Name: " + player.get$cities().get(0).getName() + "\n\n"));
			// PLAYER BUILDINGS
			pnePlayerStats.add(new JLabel("Owned Buildings: \n\n"));
			for (int i = 0; i < player.get$cities().get(0).get$buildings().size(); i++)
				pnePlayerStats.add(new JLabel(player.get$cities().get(0).get$buildings().get(i).getName()));
			pnePlayerStats.add(new JLabel("Owned Wonders: \n\n"));
			if (player.get$cities().get(0).get$wonders().size() != 0)
				for (int i = 0; i < player.get$cities().get(0).get$wonders().size(); i++)
					pnePlayerStats.add(new JLabel(player.get$cities().get(0).get$wonders().get(i).getName()));
		}
		pnePlayerStats.add(new JLabel("Owned Units: \n\n"));
		if (player.get$units().size() != 0)
			for (int i = 0; i < player.get$units().size(); i++) {
				if (player.get$units().size() > 1 && i < player.get$units().size() - 1)
					pnePlayerStats.add(new JLabel(player.get$units().get(i).getUnitName() + ", "));
				else
					pnePlayerStats.add(new JLabel(player.get$units().get(i).getUnitName()));
			}

	}

	public int getSettlerTempX() {
		return settlerTempX;
	}

	public void setSettlerTempX(int settlerTempX) {
		this.settlerTempX = settlerTempX;
	}

	public int getSettlerTempY() {
		return settlerTempY;
	}

	public void setSettlerTempY(int settlerTempY) {
		this.settlerTempY = settlerTempY;
	}

	public void repaintTiles() {
		for (int i = 0; i < $mapButtons.length; i++) {
			for (int j = 0; j < $mapButtons[i].length; j++) {
				if (Tile.get$map()[i][j].getUnitOnTile() != null) {
					$mapButtons[i][j].setIcon(Tile.get$map()[i][j].getUnitOnTile().getUnitImageIcon());
				} else if (Tile.get$map()[i][j].isCity() == true) {
					if (Tile.get$map()[i][j].getTerrainID() == 2) {
						$mapButtons[i][j].setIcon(player.getLeader().getCityOnSandImprovement());
					} else {
						$mapButtons[i][j].setIcon(player.getLeader().getCityOnGreenImprovement());
					}
				} else if (Tile.get$map()[i][j].getOwner() == null) {
					$mapButtons[i][j].setIcon(Tile.get$map()[i][j].getTileImageIcon());
				} else {
					$mapButtons[i][j]
							.setIcon(player.getLeader().getTileIconFromID(Tile.get$map()[i][j].getTerrainID()));
				}
			}
		}
		repaintFog();
		frame.repaint();
	}

	private void repaintFog() {
		for (int i = 0; i < $mapButtons.length; i++) {
			for (int j = 0; j < $mapButtons[i].length; j++) {
				if (Tile.get$map()[i][j].getUnitOnTile() != null || Tile.get$map()[i][j].isCity()
						|| Tile.get$map()[i][j].getOwner() != null) {
					for (int x = -2; x <= 2; x++) {
						for (int y = -2; y <= 2; y++) {
							try {
								$mapButtons[i + x][j + y].setEnabled(true);
							} catch (Exception e) {
							}
						}
					}
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
			int tempX = rand.nextInt(Tile.getMAP_SIZE() - 4) + 2;
			int tempY = rand.nextInt(Tile.getMAP_SIZE() - 4) + 2;
			if (Tile.get$map()[tempX][tempY].getTerrainID() == 1) {
				Tile.get$map()[tempX][tempY].setUnitOnTile(new Settler(player));
				Tile.get$map()[tempX][tempY].getUnitOnTile().setSelected(true);
				setSettlerTempX(tempX);
				setSettlerTempY(tempY);
				int[] temp = { tempX, tempY };
				Tile.get$map()[tempX][tempY].set$location(temp);
				Tile.get$map()[tempX][tempY].getUnitOnTile().setLocation(Tile.get$map()[tempX][tempY]);
				found = false;
				repaintTiles();
			}
		}
	}

	public boolean spawnInitialWarrior() {
		for (int i = 0; i < $mapButtons.length; i++) {
			for (int j = 0; j < $mapButtons[i].length; j++) {
				if (Tile.get$map()[i][j].getUnitOnTile() != null
						&& Tile.get$map()[i][j].getUnitOnTile().getUnitID() == 12) {
					for (int x = -2; x <= 2; x++) {
						for (int y = -2; y <= 2; y++) {
							if ((x != 0 || y != 0) && Tile.get$map()[i + x][j + y].getTerrainID() == 1) {
								Tile.get$map()[i + x][j + y].setUnitOnTile(new Warrior(player));
								int[] temp = { i + x, j + y };
								Tile.get$map()[i + x][j + y].set$location(temp);
								Tile.get$map()[i + x][j + y].getUnitOnTile().setLocation(Tile.get$map()[i + x][j + y]);
								repaintTiles();
								return true;
							}
						}
					}
				}
			}
		}
		return false;
	}

	public void endTurn() {
		turns++;
		changeYear();
		updateYearText();
		updateFoodText();
		updateGoldText();
		updateHappinessText();
		updateProductionText();
		updateScienceText();
		updatePlayerStats();
		for (int i = 0; i < $mapButtons.length; i++) {
			for (int j = 0; j < $mapButtons[i].length; j++) {
				if (Tile.get$map()[i][j].getUnitOnTile() != null)
					Tile.get$map()[i][j].getUnitOnTile()
							.setMovesLeft(Tile.get$map()[i][j].getUnitOnTile().getMaxMovement());
				if (Tile.get$map()[i][j].isCity()) {
					researchTimeSpent++;
				}
			}
		}
		if (currentProd instanceof Building)
			if (currentProd != null) {
				buildingProdTimeSpent++;
				if (buildingProdTimeSpent >= (int) calculateMovesBuildingProd(((Building) currentProd).getBuildingID(),
						player.get$cities().get(0).getProductionRate()))
					finishBuildingProd((Building) currentProd);
			}
		if (currentProd instanceof Unit)
			if (currentProd != null) {
				unitProdTimeSpent++;
				if (unitProdTimeSpent >= (int) calculateMovesUnitProd(((Unit) currentProd).getUnitID(),
						player.get$cities().get(0).getProductionRate()))
					finishUnitProd((Unit) currentProd);
			}
		if (currentProd instanceof Wonder)
			if (currentProd != null) {
				wonderProdTimeSpent++;
				if (wonderProdTimeSpent >= (int) calculateMovesWonderProd(((Wonder) currentProd).getWonderID(),
						player.get$cities().get(0).getProductionRate()))
					finishWonderProd((Wonder) currentProd);
			}

		growCity();
		if (researchTimeSpent >= movesToTech) {
			finishResearch(currentResearchedTech);
		}
	}

	public void changeYear() {
		if (turns == 1)
			year = -3000;
		else
			year = (int) (962 * Math.log(turns) - 479) - 3000;
		updateTurnText();
		if (turns > 303)
			endGame();
	}

	public void endGame() {
		// custom title, custom icon
		JOptionPane.showMessageDialog(frame, "You have won the game.", "Congrats.", JOptionPane.INFORMATION_MESSAGE,
				iconTrophy);
		frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
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

	public void growCity() {
		for (int i = 0; i < $mapButtons.length; i++) {
			for (int j = 0; j < $mapButtons[i].length; j++) {
				if (Tile.get$map()[i][j].isCity() == true) {
					if (turns % 10 == 0) {
						Random g = new Random();
						int min = -2;
						int max = 2;

						try {
							if (Tile.get$map()[i - 2][j - 2].getOwner() == (player)
									&& Tile.get$map()[i - 2][j - 1].getOwner() == (player)
									&& Tile.get$map()[i - 2][j].getOwner() == (player)
									&& Tile.get$map()[i - 2][j + 1].getOwner() == (player)
									&& Tile.get$map()[i - 2][j + 2].getOwner() == (player)
									&& Tile.get$map()[i - 1][j - 2].getOwner() == (player)
									&& Tile.get$map()[i - 1][j + 2].getOwner() == (player)
									&& Tile.get$map()[i][j - 2].getOwner() == (player)
									&& Tile.get$map()[i][j + 2].getOwner() == (player)
									&& Tile.get$map()[i + 1][j - 2].getOwner() == (player)
									&& Tile.get$map()[i + 1][j + 2].getOwner() == (player)
									&& Tile.get$map()[i + 2][j - 2].getOwner() == (player)
									&& Tile.get$map()[i + 2][j - 1].getOwner() == (player)
									&& Tile.get$map()[i + 2][j].getOwner() == (player)
									&& Tile.get$map()[i + 2][j + 1].getOwner() == (player)
									&& Tile.get$map()[i + 2][j + 2].getOwner() == (player)) {
								min--;
								max++;
							}

							int tempX = g.nextInt(max + 1 - min) + min;
							int tempY = g.nextInt(max + 1 - min) + min;
							while (Tile.get$map()[i + tempX][j + tempY].getOwner() != null) {
								tempX = g.nextInt(max + 1 - min) + min;
								tempY = g.nextInt(max + 1 - min) + min;
							}
							Tile.get$map()[i + tempX][j + tempY].setOwner(player);
							repaintTiles();
							player.get$cities().get(0).get$cityTiles().add(Tile.get$map()[i + tempX][j + tempY]);
							player.get$cities().get(0).setFoodTotal(0);
							updateFoodText();
						} catch (Exception e) {
							// System.out.println("growCity() failed.");
						}
					}
				}
			}
		}
	}

	public void uniqueLeaderAbility() {
		if (player.getLeader().getLeaderID() == 0) {
			// america
			// all land units have +1 movement
			// +2 gpt
			player.setGoldPerTurn(player.getGoldPerTurn() + 2);
			for (int z = 0; z < player.get$units().size(); z++) {
				player.get$units().get(z).setMaxMovement(player.get$units().get(z).getMaxMovement() + 2);
			}
		} else if (player.getLeader().getLeaderID() == 1) {
			// italy
			// +2 food
			// +1 production
			for (int i = 0; i < player.get$cities().size(); i++) {
				player.get$cities().get(i).setFoodRate(player.get$cities().get(i).getFoodRate() + 2);
				player.get$cities().get(i).setProductionRate(player.get$cities().get(i).getProductionRate() + 1);
			}
		} else if (player.getLeader().getLeaderID() == 2) {
			// korea
			// +10% science
			// university gold maintenance is 1 not 3
			player.setSciencePerTurn((player.getSciencePerTurn() * 1.1));
			for (int i = 0; i < player.get$cities().size(); i++) {
				if (player.get$cities().get(i).getCertainBuilding(13).isBuilt())
					player.get$cities().get(i).getCertainBuilding(13).setGoldMaintenance(
							player.get$cities().get(i).getCertainBuilding(13).getGoldMaintenance() - 2);
			}
		} else if (player.getLeader().getLeaderID() == 3) {
			// mongolia
			// military strength +10%
			// +20 hit points per unit
			for (int i = 0; i < player.get$units().size(); i++) {
				player.get$units().get(i).setAttackRating((int) (player.get$units().get(i).getAttackRating() * 1.1));
				player.get$units().get(i).setHitpoints(player.get$units().get(i).getHitpoints() + 20);
			}

		} else if (player.getLeader().getLeaderID() == 4) {
			// poland
			// +2 prod
			// cathedral costs no maintenance
			for (int z = 0; z < player.get$cities().size(); z++) {
				player.get$cities().get(z).getCertainBuilding(3).setGoldMaintenance(0);
				player.get$cities().get(z).setProductionRate(player.get$cities().get(z).getProductionRate() + 2);
			}

		}
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

			// SETTLER CHECK
			for (int i = 0; i < $mapButtons.length; i++) {
				for (int j = 0; j < $mapButtons[i].length; j++) {
					if (e.getSource() == $mapButtons[i][j]) {
						if (Tile.get$map()[i][j].getUnitOnTile() != null
								&& Tile.get$map()[i][j].getUnitOnTile().getUnitID() == 12) {
							// $mapButtons[i][j].getIcon().equals(player.getOwnedUnitfromID(18).getUnitImageIcon())
							int x = i;
							int y = j;
							$mapButtons[i][j].getInputMap().put(KeyStroke.getKeyStroke("P"), "found");
							$mapButtons[i][j].getActionMap().put("found", new AbstractAction() {
								public void actionPerformed(ActionEvent e) {
									try {
										((Settler) getPlayer().getOwnedUnitfromID(12))
												.foundCity(player.get$cities().size());
										removeUnit(x, y);
										repaintTiles();
										/*
										 * City c = new City(player, Tile.get$map()[x][y]); ArrayList<City> $city = new
										 * ArrayList<City>(); $city.add(c); player.set$cities($city);
										 */
										displayResearch();
										frPickResearch.setVisible(true);
										frPickResearch.pack();
										researchTimeSpent = 0;
									} catch (Exception ef) {
										JOptionPane.showMessageDialog(frame, "There is no settler to found a city");
									}
								}
							});

							// Found City mk2

							$mapButtons[i][j].addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent arg0) {
									if (Tile.get$map()[x][y].isCity() == true
											&& Tile.get$map()[x][y].getUnitOnTile() == null)
										displayProduction();
								}
							});

						}
					}
				}
			}

			// UNIT MOVEMENT
			for (int i = 0; i < $mapButtons.length; i++)
				for (int j = 0; j < $mapButtons[i].length; j++) {
					int x = i;
					int y = j;
					if (e.getSource() == $mapButtons[i][j]) {
						$mapButtons[i][j].getInputMap().put(KeyStroke.getKeyStroke("W"), "up");
						$mapButtons[i][j].getActionMap().put("up", new AbstractAction() {
							public void actionPerformed(ActionEvent e) {
								if (x > 1) {
									if (canMove(Tile.get$map()[x][y].getUnitOnTile(), x, y, -1, 0)) {
										calculateMovesLeft(Tile.get$map()[x][y].getUnitOnTile(), x, y, -1, 0);
										Tile.get$map()[x - 1][y].setUnitOnTile(Tile.get$map()[x][y].getUnitOnTile());
										Tile.get$map()[x - 1][y].getUnitOnTile().setLocation(Tile.get$map()[x - 1][y]);
										Tile.get$map()[x][y].setUnitOnTile(null);
										// $mapButtons[x - 1][y].setSelected(true);
										// $mapButtons[x][y].setSelected(false);
									}
								}
								repaintTiles();
							}
						});
						$mapButtons[i][j].getInputMap().put(KeyStroke.getKeyStroke("A"), "left");
						$mapButtons[i][j].getActionMap().put("left", new AbstractAction() {
							public void actionPerformed(ActionEvent e) {
								if (y > 1) {
									if (canMove(Tile.get$map()[x][y].getUnitOnTile(), x, y, 0, -1)) {
										calculateMovesLeft(Tile.get$map()[x][y].getUnitOnTile(), x, y, 0, -1);
										Tile.get$map()[x][y - 1].setUnitOnTile(Tile.get$map()[x][y].getUnitOnTile());
										Tile.get$map()[x][y - 1].getUnitOnTile().setLocation(Tile.get$map()[x][y - 1]);
										Tile.get$map()[x][y].setUnitOnTile(null);
										// $mapButtons[x][y - 1].setSelected(true);
										// $mapButtons[x][y].setSelected(false);
									}
								}
								repaintTiles();
							}
						});
						$mapButtons[i][j].getInputMap().put(KeyStroke.getKeyStroke("S"), "down");
						$mapButtons[i][j].getActionMap().put("down", new AbstractAction() {
							public void actionPerformed(ActionEvent e) {
								if (x < Tile.getMAP_SIZE() - 2) {
									if (canMove(Tile.get$map()[x][y].getUnitOnTile(), x, y, 1, 0)) {
										calculateMovesLeft(Tile.get$map()[x][y].getUnitOnTile(), x, y, 1, 0);
										Tile.get$map()[x + 1][y].setUnitOnTile(Tile.get$map()[x][y].getUnitOnTile());
										Tile.get$map()[x + 1][y].getUnitOnTile().setLocation(Tile.get$map()[x + 1][y]);
										Tile.get$map()[x][y].setUnitOnTile(null);
										// $mapButtons[x + 1][y].setSelected(true);
										// $mapButtons[x][y].setSelected(false);
									}
								}
								repaintTiles();
							}
						});
						$mapButtons[i][j].getInputMap().put(KeyStroke.getKeyStroke("D"), "right");
						$mapButtons[i][j].getActionMap().put("right", new AbstractAction() {
							public void actionPerformed(ActionEvent e) {
								if (y < Tile.getMAP_SIZE() - 2) {
									if (canMove(Tile.get$map()[x][y].getUnitOnTile(), x, y, 0, 1)) {
										calculateMovesLeft(Tile.get$map()[x][y].getUnitOnTile(), x, y, 0, 1);
										Tile.get$map()[x][y + 1].setUnitOnTile(Tile.get$map()[x][y].getUnitOnTile());
										Tile.get$map()[x][y + 1].getUnitOnTile().setLocation(Tile.get$map()[x][y + 1]);
										Tile.get$map()[x][y].setUnitOnTile(null);
										// $mapButtons[x][y + 1].setSelected(true);
										// $mapButtons[x][y].setSelected(false);
									}
								}
								repaintTiles();
							}
						});
					}
				}

			// CITY SCREEN
			/*
			 * for (int k = 0; k < $mapButtons.length; k++) { for (int k2 = 0; k2 <
			 * $mapButtons.length; k2++) { if (e.getSource() == $mapButtons[k][k2]) { if
			 * (condition) {
			 * 
			 * } } }
			 * 
			 * }
			 */
		}
	}

	public void finishResearch(Technology finished) {
		player.get$cities().get(0).setScienceTotal(0);
		updateScienceText();
		researchTimeSpent = 1;
		currentResearchedTech = null;
		frPickResearch.getContentPane().removeAll();
		try {
			player.addTechnology(finished.getTechnologyID());
			player.get$technologies().get(player.get$technologies().size() - 1).setResearched(true);
			JOptionPane.showMessageDialog(frame, "You finished " + finished.getName(), "Completed Research",
					JOptionPane.INFORMATION_MESSAGE);
			check = false;
			displayResearch();
			frPickResearch.setVisible(true);
		} catch (Exception e) {
		}
	}

	public double calculateMovesUnitProd(int unitID, double prodPerTurn) {
		double moves = 1;
		for (int i = 0; i < Unit.get$allUnits().size(); i++) {
			if (Unit.get$allUnits().get(i) == Unit.get$allUnits().get(unitID)) {
				int cost = Unit.get$allUnits().get(unitID).getProductionCost();
				moves = (cost / prodPerTurn) + 1;
			}
		}
		return moves;
	}

	public void finishUnitProd(Unit finished) {
		unitProdTimeSpent = 1;
		if (finished instanceof Archer)
			player.get$cities().get(0).spawnUnit((Archer) (new Archer(player)));
		else if (finished instanceof Artillery)
			player.get$cities().get(0).spawnUnit((Artillery) (new Artillery(player)));
		else if (finished instanceof Cannon)
			player.get$cities().get(0).spawnUnit((Cannon) (new Cannon(player)));
		else if (finished instanceof Catapult)
			player.get$cities().get(0).spawnUnit((Catapult) (new Catapult(player)));
		else if (finished instanceof Cavalry)
			player.get$cities().get(0).spawnUnit((Cavalry) (new Cavalry(player)));
		else if (finished instanceof Knight)
			player.get$cities().get(0).spawnUnit((Knight) (new Knight(player)));
		else if (finished instanceof Legion)
			player.get$cities().get(0).spawnUnit((Legion) (new Legion(player)));
		else if (finished instanceof Marine)
			player.get$cities().get(0).spawnUnit((Marine) (new Marine(player)));
		else if (finished instanceof Musketman)
			player.get$cities().get(0).spawnUnit((Musketman) (new Musketman(player)));
		else if (finished instanceof Pikeman)
			player.get$cities().get(0).spawnUnit((Pikeman) (new Pikeman(player)));
		else if (finished instanceof Rifleman)
			player.get$cities().get(0).spawnUnit((Rifleman) (new Rifleman(player)));
		else if (finished instanceof Scout)
			player.get$cities().get(0).spawnUnit((Scout) (new Scout(player)));
		else if (finished instanceof Settler)
			player.get$cities().get(0).spawnUnit((Settler) (new Settler(player)));
		else if (finished instanceof Spearman)
			player.get$cities().get(0).spawnUnit((Spearman) (new Spearman(player)));
		else if (finished instanceof Tank)
			player.get$cities().get(0).spawnUnit((Tank) (new Tank(player)));
		else if (finished instanceof Warrior)
			player.get$cities().get(0).spawnUnit((Warrior) (new Warrior(player)));

		repaintTiles();
		player.get$cities().get(0).setProductionTotal(0);
		updateProductionText();
		JOptionPane.showMessageDialog(frame, "You finished " + finished.getUnitName(), "Completed Unit",
				JOptionPane.INFORMATION_MESSAGE);

		currentProd = null;
	}

	public double calculateMovesBuildingProd(int buildID, double prodPerTurn) {
		double moves = 1;
		for (int i = 0; i < Building.get$allBuildings().size(); i++) {
			if (Building.get$allBuildings().get(i) == Building.get$allBuildings().get(buildID)) {
				int cost = (int) (Building.get$allBuildings().get(i).getProductionRequirement() + .5);
				moves = (cost / prodPerTurn) + 1;
			}
		}
		return moves;
	}

	public void finishBuildingProd(Building e) {
		buildingProdTimeSpent = 1;
		if (e instanceof Aqueduct)
			player.get$cities().get(0).buildBuilding(new Aqueduct(player.get$cities().get(0)));
		else if (e instanceof Bank)
			player.get$cities().get(0).buildBuilding(new Bank(player.get$cities().get(0)));
		else if (e instanceof Barracks)
			player.get$cities().get(0).buildBuilding(new Barracks(player.get$cities().get(0)));
		else if (e instanceof Cathedral)
			player.get$cities().get(0).buildBuilding(new Cathedral(player.get$cities().get(0)));
		else if (e instanceof Colosseum)
			player.get$cities().get(0).buildBuilding(new Colosseum(player.get$cities().get(0)));
		else if (e instanceof Factory)
			player.get$cities().get(0).buildBuilding(new Factory(player.get$cities().get(0)));
		else if (e instanceof Granary)
			player.get$cities().get(0).buildBuilding(new Granary(player.get$cities().get(0)));
		else if (e instanceof HydroPlant)
			player.get$cities().get(0).buildBuilding(new HydroPlant(player.get$cities().get(0)));
		else if (e instanceof Library)
			player.get$cities().get(0).buildBuilding(new Library(player.get$cities().get(0)));
		else if (e instanceof ManufacturingPlant)
			player.get$cities().get(0).buildBuilding(new ManufacturingPlant(player.get$cities().get(0)));
		else if (e instanceof Market)
			player.get$cities().get(0).buildBuilding(new Market(player.get$cities().get(0)));
		else if (e instanceof NuclearPlant)
			player.get$cities().get(0).buildBuilding(new NuclearPlant(player.get$cities().get(0)));
		else if (e instanceof SpaceshipCockpit) {
			player.get$cities().get(0).buildBuilding(new SpaceshipCockpit(player.get$cities().get(0)));
			player.addSpaceshipPart(new SpaceshipCockpit(player.get$cities().get(0)));
		} else if (e instanceof SpaceshipEngine) {
			player.get$cities().get(0).buildBuilding(new SpaceshipEngine(player.get$cities().get(0)));
			player.addSpaceshipPart(new SpaceshipEngine(player.get$cities().get(0)));
		} else if (e instanceof SpaceshipFuselage) {
			player.get$cities().get(0).buildBuilding(new SpaceshipFuselage(player.get$cities().get(0)));
			player.addSpaceshipPart(new SpaceshipFuselage(player.get$cities().get(0)));
		} else if (e instanceof Temple)
			player.get$cities().get(0).buildBuilding(new Temple(player.get$cities().get(0)));
		else if (e instanceof University)
			player.get$cities().get(0).buildBuilding(new University(player.get$cities().get(0)));
		else if (e instanceof Walls)
			player.get$cities().get(0).buildBuilding(new Walls(player.get$cities().get(0)));
		player.get$cities().get(0).get$buildings().get(player.get$cities().get(0).get$buildings().size() - 1)
				.setBuilt(true);
		
		player.get$cities().get(0).setProductionTotal(0);
		updateProductionText();
		JOptionPane.showMessageDialog(frame, "You finished " + e.getName() + ": " + e.getDescription(),
				"Completed Building", JOptionPane.INFORMATION_MESSAGE);
		currentProd = null;
	}
 
	public double calculateMovesWonderProd(int wonderID, double prodPerTurn) {
		double moves = 1;
		for (int i = 0; i < Wonder.get$allWonders().size(); i++) {
			if (Wonder.get$allWonders().get(i) == Wonder.get$allWonders().get(wonderID)) {
				int cost = (int) (Wonder.get$allWonders().get(wonderID).getProductionRequirement() + .5);
				moves = (cost / prodPerTurn) + 1;
			}
		}
		return moves;
	}

	public void finishWonderProd(Wonder e) {
		wonderProdTimeSpent = 1;
		if (e instanceof ApolloProgram)
			player.get$cities().get(0).buildWonder((ApolloProgram) (e));
		else if (e instanceof BachsCathedral)
			player.get$cities().get(0).buildWonder((BachsCathedral) (e));
		else if (e instanceof CancerCure)
			player.get$cities().get(0).buildWonder((CancerCure) (e));
		else if (e instanceof CopernicusObservatory)
			player.get$cities().get(0).buildWonder((CopernicusObservatory) (e));
		else if (e instanceof DarwinsVoyage)
			player.get$cities().get(0).buildWonder((DarwinsVoyage) (e));
		else if (e instanceof GreatLibrary)
			player.get$cities().get(0).buildWonder((GreatLibrary) (e));
		else if (e instanceof HangingGardens)
			player.get$cities().get(0).buildWonder((HangingGardens) (e));
		else if (e instanceof MichelangelosChapel)
			player.get$cities().get(0).buildWonder((MichelangelosChapel) (e));
		else if (e instanceof NewtonsCollege)
			player.get$cities().get(0).buildWonder((NewtonsCollege) (e));
		else if (e instanceof Oracle)
			player.get$cities().get(0).buildWonder((Oracle) (e));
		
		player.get$cities().get(0).setProductionTotal(0);
		updateProductionText();
		JOptionPane.showMessageDialog(frame, "You finished " + e.getName() + ": " + e.getDescription(),
				"Completed Wonder", JOptionPane.INFORMATION_MESSAGE);
	}

	public double calculateMovesTech(int techID, double sciPerTurn) {
		double moves = 1;
		for (int i = 0; i < Technology.get$technologies().size(); i++) {
			if (Technology.get$technologies().get(i).getTechnologyID() == techID) {
				int cost = Technology.get$technologies().get(i).getScienceCost();
				moves = (cost / sciPerTurn) + 1;
			}
		}
		return moves;
	}

	public boolean canMove(Unit unit, int x, int y, int horizontalMod, int verticalMod) {
		try {
			if (unit.getMovesLeft() - Tile.get$map()[x + horizontalMod][y + verticalMod].getMovesRequired() >= 0) {
				if (Tile.get$map()[x + horizontalMod][y + verticalMod].isCrossable()
						&& Tile.get$map()[x + horizontalMod][y + verticalMod].getUnitOnTile() == null) {
					return true;
				} else {
					JOptionPane.showMessageDialog(frame, "You cannot cross this terrain");
					return false;
				}
			} else {
				JOptionPane.showMessageDialog(frame, "No moves left");
				return false;
			}
		} catch (Exception e) {

		}
		return false;
	}

	public void calculateMovesLeft(Unit unit, int x, int y, int horizontalMod, int verticalMod) {
		unit.setMovesLeft(unit.getMovesLeft() - Tile.get$map()[x + horizontalMod][y + verticalMod].getMovesRequired());
	}

	public void removeUnit(int x, int y) {
		// Tile.get$map()[x][y].getUnitOnTile().removeUnit();
		ArrayList<Unit> $tempArr = Tile.get$map()[x][y].getUnitOnTile().getOwner().get$units();
		$tempArr.remove(Tile.get$map()[x][y].getUnitOnTile());
		Tile.get$map()[x][y].getUnitOnTile().getOwner().set$units($tempArr);
		Tile.get$map()[x][y].setUnitOnTile(null);
	}

	public void displayResearch() {
		try {
			btnEndTurn.setEnabled(false);
			player.findPotentialTechs();
			if (check == false) {
				btnEndTurn.setEnabled(false);
				ArrayList<Technology> $potentialTechs = player.get$potentialTechs();
				ArrayList<JButton> $research = new ArrayList<JButton>();
				int tx = 15, ty = 15;
				for (int i = 0; i < $potentialTechs.size(); i++) {
					$research.add(new JButton($potentialTechs.get(i).getName()));
					$research.get($research.size() - 1).setBounds(tx, ty, 455, 75);
					frPickResearch.add($research.get($research.size() - 1));
					ty += 90;
					int z = i;
					$research.get(i).addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
							for (int j = 0; j < $potentialTechs.size(); j++)
								if ($potentialTechs.get(j).getName().equals(((JButton) arg0.getSource()).getText()))
									currentResearchedTech = $potentialTechs.get(j);
							$research.remove(((JButton) arg0.getSource()));
							frPickResearch.setVisible(false);
							check = true;
							btnEndTurn.setEnabled(true);
							movesToTech = (int) (calculateMovesTech($potentialTechs.get(z).getTechnologyID(),
									player.getSciencePerTurn()) + .5);
							btnEndTurn.setEnabled(true);
						}
					});
				}
			}
		} catch (Exception e) {
		}
	}

	public void displayProduction() {
		try {
			frPickProduction.repaint();
			btnEndTurn.setEnabled(false);
			player.get$cities().get(0).findPotentialUnits();
			player.get$cities().get(0).findPotentialBuildings();
			player.get$cities().get(0).findPotentialWonders();
			ArrayList<Unit> $potentialUnits = player.get$cities().get(0).get$potentialUnits();
			ArrayList<Building> $potentialBuildings = player.get$cities().get(0).get$potentialBuildings();
			ArrayList<Wonder> $potentialWonders = player.get$cities().get(0).get$potentialWonders();
			ArrayList<JButton> $buildingBtns = new ArrayList<JButton>();
			ArrayList<JButton> $unitBtns = new ArrayList<JButton>();
			ArrayList<JButton> $wonderBtns = new ArrayList<JButton>();
			pickUnit.removeAll();
			pickBuilding.removeAll();
			pickWonder.removeAll();
			pickUnit.setLayout(null);
			pickWonder.setLayout(null);
			pickBuilding.setLayout(null);
			pickUnit.setBounds(0, 0, 400, 1000);
			pickWonder.setBounds(400, 0, 400, 1000);
			pickBuilding.setBounds(800, 0, 400, 1000);
			JLabel lblUnit = new JLabel("Units: ");
			lblUnit.setBounds(20, 0, 300, 30);
			pickUnit.add(lblUnit);
			JLabel lblWonder = new JLabel("Wonders: ");
			lblWonder.setBounds(20, 0, 300, 30);
			pickWonder.add(lblWonder);
			JLabel lblBuilding = new JLabel("Buildings: ");
			lblBuilding.setBounds(20, 0, 300, 30);
			pickBuilding.add(lblBuilding);
			int z = 30, x = 20;
			for (int i = 0; i < $potentialUnits.size(); i++) {
				$unitBtns.add(new JButton($potentialUnits.get(i).getUnitName()));
				$unitBtns.get($unitBtns.size() - 1).setBounds(x, z, 360, 35);
				pickUnit.add($unitBtns.get($unitBtns.size() - 1));
				z += 50;
				int y = i;
				$unitBtns.get(i).addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						frPickProduction.setVisible(false);
						currentProd = $potentialUnits.get(y);
						$unitBtns.remove(((JButton) arg0.getSource()));
						btnEndTurn.setEnabled(true);
					}
				});
			}
			int q = 30, h = 20;
			for (int i = 0; i < $potentialWonders.size(); i++) {
				$wonderBtns.add(new JButton($potentialWonders.get(i).getName()));
				pickWonder.add($wonderBtns.get($wonderBtns.size() - 1));
				$wonderBtns.get($wonderBtns.size() - 1).setBounds(h, q, 360, 35);
				q += 50;
				int y = i;
				$wonderBtns.get(i).addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						frPickProduction.setVisible(false);
						currentProd = $potentialWonders.get(y);
						$wonderBtns.remove(((JButton) arg0.getSource()));
						btnEndTurn.setEnabled(true);
					}
				});
			}
			int r = 30, w = 30;
			for (int i = 0; i < $potentialBuildings.size(); i++) {
				$buildingBtns.add(new JButton($potentialBuildings.get(i).getName()));
				pickBuilding.add($buildingBtns.get($buildingBtns.size() - 1));
				$buildingBtns.get($buildingBtns.size() - 1).setBounds(w, r, 360, 35);
				r += 50;
				int y = i;
				$buildingBtns.get(i).addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						frPickProduction.setVisible(false);
						currentProd = $potentialBuildings.get(y);
						$buildingBtns.remove(((JButton) arg0.getSource()));
						btnEndTurn.setEnabled(true);
					}
				});
			}
			frPickProduction.setVisible(true);
			frPickProduction.add(pickUnit);
			frPickProduction.add(pickWonder);
			frPickProduction.add(pickBuilding);
			frPickProduction.repaint();
			frPickProduction.pack();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
