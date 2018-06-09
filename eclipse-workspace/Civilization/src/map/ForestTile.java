package map;

import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class ForestTile extends Tile {
	public ForestTile() {
		Random rand = new Random();
		super.terrainID = 4;
		super.movesRequired = 2;
		super.productionBase = 2.0;
		super.productionPotential = 4.0;
		super.foodBase = 1.0;
		super.foodPotential = 2.0;
		super.goldBase = 1.0;
		super.goldPotential = 2.0;
		super.happinessBase = 0.5;
		super.happinessPotential = 1.5;
		super.scienceBase = 1.5;
		super.sciencePotential = 3.5;
		super.crossable = true;
		super.occupied = false;
		super.improved = false;
		super.owner = null;
		if (rand.nextInt(10) + 1 > 5)
			super.tileImageIcon = new ImageIcon(
					Tile.class.getClassLoader().getResource("map/resources/forestTile.png"));
		else
			super.tileImageIcon = new ImageIcon(
					Tile.class.getClassLoader().getResource("map/resources/forestTile2.png"));
		super.tileLabel = new JLabel(super.tileImageIcon);
	}
}