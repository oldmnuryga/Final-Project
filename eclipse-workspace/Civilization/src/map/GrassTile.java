package map;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class GrassTile extends Tile{	
	public GrassTile() {
		super.terrainID = 1;
		super.movesRequired = 1;
		super.productionBase = 1.0;
		super.productionPotential = 3.0;
		super.foodBase = 1.0;
		super.foodPotential = 2.0;
		super.goldBase = 1.0;
		super.goldPotential = 2.0;
		super.crossable = true;
		super.occupied = false;
		super.improved = false;
		super.owner = null;
		super.tileLabel = new JLabel(new ImageIcon(Tile.class.getResource("src/map/resources/waterTile.png")));
	}
}
