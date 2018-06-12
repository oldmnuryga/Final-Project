package leaders;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.ImageIcon;

import main.CivilizationGame;

public class Korea extends Leader {
	// Sejong
	// +10% science
	// +1 science from universities
	public Korea() {
		super.civName = "Korea";
		super.leaderName = "Sejong";
		super.abbrevLeaderName = "The Koreans";
		super.leaderID = 2;
		super.color = Color.YELLOW;
		super.cityNames = new ArrayList<String>(Arrays.asList("Seoul", "Busan", "Pyongyang", "Jeonju", "Daegu", "Kaesong"));// would change city name if >1 city
		super.grassTile = new ImageIcon(CivilizationGame.class.getClassLoader().getResource("map/resources/grassTileKorea.png"));
		super.forestTile = new ImageIcon(CivilizationGame.class.getClassLoader().getResource("map/resources/forestTileKorea.png"));
		super.forest2Tile = new ImageIcon(CivilizationGame.class.getClassLoader().getResource("map/resources/forestTile2Korea.png"));
		super.mountainTile = new ImageIcon(CivilizationGame.class.getClassLoader().getResource("map/resources/mountainTileKorea.png"));
		super.sandTile = new ImageIcon(CivilizationGame.class.getClassLoader().getResource("map/resources/sandTileKorea.png"));
		super.waterTile = new ImageIcon(CivilizationGame.class.getClassLoader().getResource("map/resources/waterTileKorea.png"));
		super.farmImprovement = new ImageIcon(CivilizationGame.class.getClassLoader().getResource("improvements/resources/farmImprovementKorea.png"));
		super.cityOnGreenImprovement = new ImageIcon(CivilizationGame.class.getClassLoader().getResource("improvements/resources/cityOnGreenKorea.png"));
		super.cityOnSandImprovement = new ImageIcon(CivilizationGame.class.getClassLoader().getResource("improvements/resources/cityOnSandKorea.png"));
	}
}
