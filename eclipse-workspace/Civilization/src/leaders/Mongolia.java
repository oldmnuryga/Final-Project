package leaders;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.ImageIcon;

import main.CivilizationGame;

public class Mongolia extends Leader {
	// Genghis Khan
	// military strength +10%
	// +20 hit points per unit
	public Mongolia() {
		super.civName = "Mongolia";
		super.leaderName = "Genghis Khan";
		super.abbrevLeaderName = "The Mongols";
		super.leaderID = 3;
		super.color = Color.ORANGE;
		super.cityNames = new ArrayList<String>(
				Arrays.asList("Karakorum", "Beshbalik", "Turfan", "Hsia", "Old Sarai", "New Sarai"));// would change city name if >1 city
		super.grassTile = new ImageIcon(CivilizationGame.class.getClassLoader().getResource("map/resources/grassTileMongolia.png"));
		super.forestTile = new ImageIcon(CivilizationGame.class.getClassLoader().getResource("map/resources/forestTileMongolia.png"));
		super.forest2Tile = new ImageIcon(CivilizationGame.class.getClassLoader().getResource("map/resources/forestTile2Mongolia.png"));
		super.mountainTile = new ImageIcon(CivilizationGame.class.getClassLoader().getResource("map/resources/mountainTileMongolia.png"));
		super.sandTile = new ImageIcon(CivilizationGame.class.getClassLoader().getResource("map/resources/sandTileMongolia.png"));
		super.waterTile = new ImageIcon(CivilizationGame.class.getClassLoader().getResource("map/resources/waterTileMongolia.png"));
		super.farmImprovement = new ImageIcon(CivilizationGame.class.getClassLoader().getResource("improvements/resources/farmImprovementMongolia.png"));
		super.cityOnGreenImprovement = new ImageIcon(CivilizationGame.class.getClassLoader().getResource("improvements/resources/cityOnGreenMongolia.png"));
		super.cityOnSandImprovement = new ImageIcon(CivilizationGame.class.getClassLoader().getResource("improvements/resources/cityOnSandMongolia.png"));
	}
}
