package map;
//Class for tile to be called to be added to the map which has certain yields
import javax.swing.ImageIcon;

public class ForestTile extends Tile {
	public ForestTile() {
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
		super.defaultCrossable = true;
		super.occupied = false;
		super.improved = false;
		super.owner = null;
		super.tileImageIcon = new ImageIcon(Tile.class.getClassLoader().getResource("map/resources/forestTile.png"));
	}
}
