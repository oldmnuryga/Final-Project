package units;

import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.xml.transform.Templates;

import civilizations.City;
import civilizations.Player;
import map.Tile;

public class Settler extends Unit {

	public Settler() {
		super.hitpoints = 15;
		super.attackRating = 0;
		super.productionCost = 106;
		super.location = null;
		super.ranged = false;
		super.alive = true;
		super.fortified = false;
		super.maxMovement = 2;
		super.maintenance = 1;
		super.isAir = false;
		super.isGround = true;
		super.isNaval = false;
		super.isSelected = false;
		super.unitName = "Settler";
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
			this.foundCity();
	}

	public void foundCity() {
		Tile temp = this.getLocation();
		if (temp.isCity() == false) {
			temp.setOwner(owner);
			temp.setIsCity(true);
			this.removeUnit();
			// Sets surrounding tiles to the owner
			Tile.get$map()[location.get$location()[0]][location.get$location()[1] - 1].setOwner(owner);
			Tile.get$map()[location.get$location()[0] - 1][location.get$location()[1] - 1].setOwner(owner);
			Tile.get$map()[location.get$location()[0] + 1][location.get$location()[1] + 1].setOwner(owner);
			Tile.get$map()[location.get$location()[0] + 1][location.get$location()[1] - 1].setOwner(owner);
			Tile.get$map()[location.get$location()[0] - 1][location.get$location()[1] + 1].setOwner(owner);
			Tile.get$map()[location.get$location()[0]][location.get$location()[1] + 1].setOwner(owner);
			Tile.get$map()[location.get$location()[0] - 1][location.get$location()[1]].setOwner(owner);
			Tile.get$map()[location.get$location()[0] + 1][location.get$location()[1]].setOwner(owner);
			// Changes the image to a city
			temp.setTileImageIcon(
					new ImageIcon(Tile.class.getClassLoader().getResource("improvements/resources/americaCity.pdf")));
			temp.setTileLabel(new JLabel(temp.getTileImageIcon()));
			City tempCity = new City(Player);
			if (Player.getNumCities() == 0)
				tempCity.setCapital(true);
		}
	}
}
