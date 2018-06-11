package units;

import java.awt.event.KeyEvent;
import java.util.ArrayList;

import javax.swing.ImageIcon;

import civilizations.City;
import civilizations.Player;
import map.Tile;
//UNIT AND ITS PARAMETERS
public class Settler extends Unit {

	public Settler(Player player) {
		super.unitID = 18;
		super.owner = player;
		super.hitpoints = 15;
		super.attackRating = 0;
		super.productionCost = 106;
		super.location = null;
		super.ranged = false;
		super.alive = true;
		super.fortified = false;
		super.maxMovement = 2;
		super.movesLeft = 2;
		super.maintenance = 1;
		super.isAir = false;
		super.isGround = true;
		super.isNaval = false;
		super.isSelected = false;
		super.unitName = "Settler";
		super.unitImageIcon = new ImageIcon(Unit.class.getClassLoader().getResource("units/resources/Settler.png"));
		player.addUnit(this);
	}

	public Settler() {
		super.unitID = 18;
		super.hitpoints = 15;
		super.attackRating = 0;
		super.productionCost = 106;
		super.location = null;
		super.ranged = false;
		super.alive = true;
		super.fortified = false;
		super.maxMovement = 2;
		super.movesLeft = 2;
		super.maintenance = 1;
		super.isAir = false;
		super.isGround = true;
		super.isNaval = false;
		super.isSelected = false;
		super.unitName = "Settler";
		super.unitImageIcon = new ImageIcon(Unit.class.getClassLoader().getResource("units/resources/Settler.png"));
	}
	//Listens for P to find city
	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();
		// Checks if "P" is hit and checks to see if any tile next to it is owned
		if (key == KeyEvent.VK_P
				&& (Tile.get$map()[location.get$location()[0]][location.get$location()[1] - 1].getOwner() == null
						|| Tile.get$map()[location.get$location()[0] - 1][location.get$location()[1] - 1]
								.getOwner() == null
						|| Tile.get$map()[location.get$location()[0] + 1][location.get$location()[1] + 1]
								.getOwner() == null
						|| Tile.get$map()[location.get$location()[0] + 1][location.get$location()[1] - 1]
								.getOwner() == null
						|| Tile.get$map()[location.get$location()[0] - 1][location.get$location()[1] + 1]
								.getOwner() == null
						|| Tile.get$map()[location.get$location()[0]][location.get$location()[1] + 1].getOwner() == null
						|| Tile.get$map()[location.get$location()[0] - 1][location.get$location()[1]].getOwner() == null
						|| Tile.get$map()[location.get$location()[0] + 1][location.get$location()[1]]
								.getOwner() == null))
			this.foundCity(0);
	}

	//FINDS CITY AND SETS SURRONDING TILE TO PLAYER AS OWNER
	public void foundCity(int city) {
		ArrayList<Tile> $tempArr = new ArrayList<Tile>();

		Tile.get$map()[location.get$location()[0]][location.get$location()[1]].setIsCity(true);

		for (int i = -1; i <= 1; i++) {
			for (int j = -1; j <= 1; j++) {
				$tempArr.add(instantiateTileValues(i, j));
			}
		}
		// Sets surrounding tiles to the owner
		// $tempArr.add(Tile.get$map()[location.get$location()[0]][location.get$location()[1]]);
		// Tile.get$map()[location.get$location()[0]][location.get$location()[1] -
		// 1].setOwner(owner);
		// $tempArr.add(Tile.get$map()[location.get$location()[0]][location.get$location()[1]
		// - 1]);
		// Tile.get$map()[location.get$location()[0]][location.get$location()[1]].setOwner(owner);
		// $tempArr.add(Tile.get$map()[location.get$location()[0]][location.get$location()[1]]);
		// Tile.get$map()[location.get$location()[0]][location.get$location()[1] +
		// 1].setOwner(owner);
		// $tempArr.add(Tile.get$map()[location.get$location()[0]][location.get$location()[1]
		// + 1]);
		// Tile.get$map()[location.get$location()[0] - 1][location.get$location()[1] -
		// 1].setOwner(owner);
		// $tempArr.add(Tile.get$map()[location.get$location()[0] -
		// 1][location.get$location()[1] - 1]);
		// Tile.get$map()[location.get$location()[0] -
		// 1][location.get$location()[1]].setOwner(owner);
		// $tempArr.add(Tile.get$map()[location.get$location()[0] -
		// 1][location.get$location()[1]]);
		// Tile.get$map()[location.get$location()[0] - 1][location.get$location()[1] +
		// 1].setOwner(owner);
		// $tempArr.add(Tile.get$map()[location.get$location()[0] -
		// 1][location.get$location()[1] + 1]);
		// Tile.get$map()[location.get$location()[0] + 1][location.get$location()[1] -
		// 1].setOwner(owner);
		// $tempArr.add(Tile.get$map()[location.get$location()[0] +
		// 1][location.get$location()[1] - 1]);
		// Tile.get$map()[location.get$location()[0] +
		// 1][location.get$location()[1]].setOwner(owner);
		// $tempArr.add(Tile.get$map()[location.get$location()[0] +
		// 1][location.get$location()[1]]);
		// Tile.get$map()[location.get$location()[0] + 1][location.get$location()[1] +
		// 1].setOwner(owner);
		// $tempArr.add(Tile.get$map()[location.get$location()[0] +
		// 1][location.get$location()[1] + 1]);
		owner.addCity(new City(owner, Tile.get$map()[location.get$location()[0]][location.get$location()[1]]));
		owner.get$cities().get(city).set$cityTiles($tempArr);

	}

	//SETS THE TILE OWNER
	public Tile instantiateTileValues(int x, int y) {
		Tile.get$map()[location.get$location()[0] + x][location.get$location()[1] + y].setOwner(owner);
		return Tile.get$map()[location.get$location()[0] + x][location.get$location()[1] + y];
	}

	/*
	 * public void expandCity(int city) { ArrayList<Tile> $tempArr = new
	 * ArrayList<Tile>();
	 * 
	 * Tile.get$map()[location.get$location()[0]][location.get$location()[1]].
	 * setIsCity(true);
	 * 
	 * for(int i = -2; i <= 2; i++) { for (int j = -2; j <= 2; j++) {
	 * $tempArr.add(instantiateTileValues(i, j)); } }
	 * owner.get$cities().get(city).set$cityTiles($tempArr); }
	 */
}
