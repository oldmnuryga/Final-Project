package map;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class WaterTile extends Tile {
	public WaterTile() {
		super.terrainID = 0;
		super.movesRequired = 1;
		super.productionBase = 0.0;
		super.productionPotential = 1.0;
		super.foodBase = 0.0;
		super.foodPotential = 2.0;
		super.goldBase = 0.25;
		super.goldPotential = 2.0;
		super.happinessBase = -1.0;
		super.happinessPotential = 1.0;
		super.scienceBase = 1.5;
		super.sciencePotential = 3.0;
		super.crossable = false;
		super.occupied = false;
		super.improved = false;
		super.owner = null;
		super.tileImageIcon = new ImageIcon(Tile.class.getClassLoader().getResource("map/resources/waterTile.png"));
		super.tileLabel = new JLabel(super.tileImageIcon);
	}
}