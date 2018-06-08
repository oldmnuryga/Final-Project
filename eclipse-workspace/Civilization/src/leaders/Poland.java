package leaders;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.ImageIcon;

import main.CivilizationGame;

public class Poland extends Leader {
	// Casimir III
	// winged hussar (unit) replace lancer
	// +2 food from cathedral
	public Poland() {
		super.civName = "Poland";
		super.leaderName = "Casimir III";
		super.abbrevLeaderName = "The Polish";
		super.leaderID = 4;
		super.color = Color.RED;
		super.cityNames = new ArrayList<String>(Arrays.asList("Warsaw", "Krakow", "Lodz", "Wroclaw", "Poznan", "Gdansk"));
		super.grassTile = new ImageIcon(CivilizationGame.class.getClassLoader().getResource("map/resources/grassTilePoland.png"));
		super.forestTile = new ImageIcon(CivilizationGame.class.getClassLoader().getResource("map/resources/forestTilePoland.png"));
		super.forest2Tile = new ImageIcon(CivilizationGame.class.getClassLoader().getResource("map/resources/forestTile2Poland.png"));
		super.mountainTile = new ImageIcon(CivilizationGame.class.getClassLoader().getResource("map/resources/mountainTilePoland.png"));
		super.sandTile = new ImageIcon(CivilizationGame.class.getClassLoader().getResource("map/resources/sandTilePoland.png"));
		super.waterTile = new ImageIcon(CivilizationGame.class.getClassLoader().getResource("map/resources/waterTilePoland.png"));
		super.farmImprovement = new ImageIcon(CivilizationGame.class.getClassLoader().getResource("improvements/resources/farmImprovementPoland.png"));
		super.cityOnGreenImprovement = new ImageIcon(CivilizationGame.class.getClassLoader().getResource("improvements/resources/cityOnGreenPoland.png"));
		super.cityOnSandImprovement = new ImageIcon(CivilizationGame.class.getClassLoader().getResource("improvements/resources/cityOnSandPoland.png"));
	}
}
