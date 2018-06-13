package units;

import javax.swing.ImageIcon;

import civilizations.Player;
//UNIT AND ITS PARAMETERS
public class Rifleman extends Unit {

	public Rifleman() {
		super.unitID = 10;
		super.hitpoints = 90;
		super.attackRating = 30;
		super.productionCost = 225;
		super.location = null;
		super.ranged = false;
		super.alive = true;
		super.fortified = false;
		super.maxMovement = 2;
		super.maintenance = 3;
		super.isAir = false;
		super.isGround = true;
		super.isNaval = false;
		super.isSelected = false;
		super.unitName = "Rifleman";
		super.techRequired = 50;
	}

	public Rifleman(Player player) {
		super.unitID = 10;
		super.hitpoints = 90;
		super.attackRating = 30;
		super.productionCost = 225;
		super.location = null;
		super.ranged = false;
		super.alive = true;
		super.fortified = false;
		super.maxMovement = 2;
		super.maintenance = 3;
		super.isAir = false;
		super.isGround = true;
		super.isNaval = false;
		super.isSelected = false;
		super.unitName = "Rifleman";
		super.techRequired = 50;
		super.unitImageIcon = new ImageIcon(Unit.class.getClassLoader().getResource("units/resources/Rifleman.png"));
		super.owner = player;
		owner.addUnit(this);
	}
}
