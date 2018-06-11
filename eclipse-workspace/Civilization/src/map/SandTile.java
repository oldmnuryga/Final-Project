package map;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class SandTile extends Tile {
	public SandTile() {
		super.terrainID = 2;
		super.movesRequired = 1;
		super.productionBase = 1.0;
		super.productionPotential = 3.0;
		super.foodBase = 0.25;
		super.foodPotential = 1.0;
		super.goldBase = 1.0;
		super.goldPotential = 3.0;
		super.happinessBase = -0.5;
		super.happinessPotential = 1.5;
		super.scienceBase = 2.0;
		super.sciencePotential = 4.0;
		super.crossable = true;
		super.defaultCrossable = true;
		super.occupied = false;
		super.improved = false;
		super.owner = null;
		super.tileImageIcon = new ImageIcon(Tile.class.getClassLoader().getResource("map/resources/sandTile.png"));
		super.tileLabel = new JLabel(super.tileImageIcon);
	}
}
