package units;

import java.awt.event.KeyEvent;
import java.util.ArrayList;

import javax.swing.ImageIcon;

import civilizations.City;
import civilizations.Player;
import map.Tile;

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

	public void foundCity(int city) {
		ArrayList<Tile> $tempArr = new ArrayList<Tile>();
		// Sets surrounding tiles to the owner
		Tile.get$map()[location.get$location()[0]][location.get$location()[1]].setIsCity(true);
		$tempArr.add(Tile.get$map()[location.get$location()[0]][location.get$location()[1]]);
		Tile.get$map()[location.get$location()[0]][location.get$location()[1] - 1].setOwner(owner);
		$tempArr.add(Tile.get$map()[location.get$location()[0]][location.get$location()[1] - 1]);
		Tile.get$map()[location.get$location()[0]][location.get$location()[1]].setOwner(owner);
		$tempArr.add(Tile.get$map()[location.get$location()[0]][location.get$location()[1]]);
		Tile.get$map()[location.get$location()[0]][location.get$location()[1] + 1].setOwner(owner);
		$tempArr.add(Tile.get$map()[location.get$location()[0]][location.get$location()[1] + 1]);
		Tile.get$map()[location.get$location()[0] - 1][location.get$location()[1] - 1].setOwner(owner);
		$tempArr.add(Tile.get$map()[location.get$location()[0] - 1][location.get$location()[1] - 1]);
		Tile.get$map()[location.get$location()[0] - 1][location.get$location()[1]].setOwner(owner);
		$tempArr.add(Tile.get$map()[location.get$location()[0] - 1][location.get$location()[1]]);
		Tile.get$map()[location.get$location()[0] - 1][location.get$location()[1] + 1].setOwner(owner);
		$tempArr.add(Tile.get$map()[location.get$location()[0] - 1][location.get$location()[1] + 1]);
		Tile.get$map()[location.get$location()[0] + 1][location.get$location()[1] - 1].setOwner(owner);
		$tempArr.add(Tile.get$map()[location.get$location()[0] + 1][location.get$location()[1] - 1]);
		Tile.get$map()[location.get$location()[0] + 1][location.get$location()[1]].setOwner(owner);
		$tempArr.add(Tile.get$map()[location.get$location()[0] + 1][location.get$location()[1]]);
		Tile.get$map()[location.get$location()[0] + 1][location.get$location()[1] + 1].setOwner(owner);
		$tempArr.add(Tile.get$map()[location.get$location()[0] + 1][location.get$location()[1] + 1]);
		owner.addCity(new City(owner, Tile.get$map()[location.get$location()[0]][location.get$location()[1]]));
		owner.get$cities().get(city).set$cityTiles($tempArr);
	}
	
	public void expandCity(int city) {
		
	}
}
