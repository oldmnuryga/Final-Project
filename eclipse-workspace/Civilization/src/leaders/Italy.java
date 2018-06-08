package leaders;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.ImageIcon;

import main.CivilizationGame;

public class Italy extends Leader {
	// mussolini
	// +2 food
	// +1 production

	public Italy() {
		super.civName = "Italy";
		super.leaderName = "Mussolini";
		super.abbrevLeaderName = "The Italians";
		super.leaderID = 1;
		super.color = Color.MAGENTA;
		super.cityNames = new ArrayList<String>(Arrays.asList("Rome", "Milan", "Turin", "Florence", "Naples", "Venice"));
		super.grassTile = new ImageIcon(CivilizationGame.class.getClassLoader().getResource("map/resources/grassTileItaly.png"));
		super.forestTile = new ImageIcon(CivilizationGame.class.getClassLoader().getResource("map/resources/forestTileItaly.png"));
		super.forest2Tile = new ImageIcon(CivilizationGame.class.getClassLoader().getResource("map/resources/forestTile2Italy.png"));
		super.mountainTile = new ImageIcon(CivilizationGame.class.getClassLoader().getResource("map/resources/mountainTileItaly.png"));
		super.sandTile = new ImageIcon(CivilizationGame.class.getClassLoader().getResource("map/resources/sandTileItaly.png"));
		super.waterTile = new ImageIcon(CivilizationGame.class.getClassLoader().getResource("map/resources/waterTileItaly.png"));
		super.farmImprovement = new ImageIcon(CivilizationGame.class.getClassLoader().getResource("improvements/resources/farmImprovementItaly.png"));
		super.cityOnGreenImprovement = new ImageIcon(CivilizationGame.class.getClassLoader().getResource("improvements/resources/cityOnGreenItaly.png"));
		super.cityOnSandImprovement = new ImageIcon(CivilizationGame.class.getClassLoader().getResource("improvements/resources/cityOnSandItaly.png"));
	}
}
