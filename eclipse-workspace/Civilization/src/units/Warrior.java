package units;

import javax.swing.ImageIcon;

import civilizations.Player;
import map.Tile;

public class Warrior extends Unit {

	public Warrior(Player player) {
		super.unitID = 23;
		super.owner = player;
		super.hitpoints = 30;
		super.attackRating = 8;
		super.productionCost = 40;
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
		super.unitName = "Warrior";
		super.unitImageIcon = new ImageIcon(Unit.class.getClassLoader().getResource("units/resources/Warrior.png"));
	}
}
