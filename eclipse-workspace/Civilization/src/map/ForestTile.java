package map;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class ForestTile extends Tile{	
	public ForestTile() {
		super.terrainID = 4;
		super.movesRequired = 2;
		super.productionBase = 2.0;
		super.productionPotential = 4.0;
		super.foodBase = 1.0;
		super.foodPotential = 2.0;
		super.goldBase = 1.0;
		super.goldPotential = 2.0;
		super.crossable = true;
		super.occupied = false;
		super.improved = false;
		super.owner = null;
		super.tileImageIcon = new ImageIcon(Tile.class.getClassLoader().getResource("map/resources/forestTile.png"));
		super.tileLabel = new JLabel(super.tileImageIcon);
	}
}