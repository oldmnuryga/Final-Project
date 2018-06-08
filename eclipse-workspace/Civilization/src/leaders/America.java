package leaders;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.ImageIcon;

import main.CivilizationGame;

public class America extends Leader {
	// george washington
	// all land units have +1 movement
	// +2 gpt
	public America() {
		super.civName = "America";
		super.leaderName = "Washington";
		super.abbrevLeaderName = "The Americans";
		super.leaderID = 0;
		super.color = Color.BLUE;
		super.cityNames = new ArrayList<String>(
				Arrays.asList("Washington", "New York", "Boston", "Philadelphia", "Atlanta", "Chicago"));
		super.grassTile = new ImageIcon(CivilizationGame.class.getClassLoader().getResource("map/resources/grassTileAmerica.png"));
		super.forestTile = new ImageIcon(CivilizationGame.class.getClassLoader().getResource("map/resources/forestTileAmerica.png"));
		super.forest2Tile = new ImageIcon(CivilizationGame.class.getClassLoader().getResource("map/resources/forestTile2America.png"));
		super.mountainTile = new ImageIcon(CivilizationGame.class.getClassLoader().getResource("map/resources/mountainTileAmerica.png"));
		super.sandTile = new ImageIcon(CivilizationGame.class.getClassLoader().getResource("map/resources/sandTileAmerica.png"));
		super.waterTile = new ImageIcon(CivilizationGame.class.getClassLoader().getResource("map/resources/waterTileAmerica.png"));
		super.farmImprovement = new ImageIcon(CivilizationGame.class.getClassLoader().getResource("improvements/resources/farmImprovementAmerica.png"));
		super.cityOnGreenImprovement = new ImageIcon(CivilizationGame.class.getClassLoader().getResource("improvements/resources/cityOnGreenAmerica.png"));
		super.cityOnSandImprovement = new ImageIcon(CivilizationGame.class.getClassLoader().getResource("improvements/resources/cityOnSandAmerica.png"));
	}
}
