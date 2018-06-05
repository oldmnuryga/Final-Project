package units;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.xml.transform.Templates;

import civilizations.City;
import civilizations.Player;
import main.CivilizationGame;
import map.Tile;

public class Settler extends Unit {

	public Settler(Player player) {
		super.owner = player;
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
		super.unitImageIcon = new ImageIcon(Unit.class.getClassLoader().getResource("units/resources/Settler.png"));
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
		System.out.println("eac");
		this.removeUnit();
		// Sets surrounding tiles to the owner
		Tile.get$map()[location.get$location()[0]][location.get$location()[1]].setOwner(owner);
		Tile.get$map()[location.get$location()[0]][location.get$location()[1] - 1].setOwner(owner);
		Tile.get$map()[location.get$location()[0] - 1][location.get$location()[1] - 1].setOwner(owner);
		Tile.get$map()[location.get$location()[0] + 1][location.get$location()[1] + 1].setOwner(owner);
		Tile.get$map()[location.get$location()[0] + 1][location.get$location()[1] - 1].setOwner(owner);
		Tile.get$map()[location.get$location()[0] - 1][location.get$location()[1] + 1].setOwner(owner);
		Tile.get$map()[location.get$location()[0]][location.get$location()[1] + 1].setOwner(owner);
		Tile.get$map()[location.get$location()[0] - 1][location.get$location()[1]].setOwner(owner);
		City.setCityGUI();
		c.updateTileGraphics();
	}
}
