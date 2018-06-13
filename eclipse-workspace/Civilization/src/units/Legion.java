package units;

import javax.swing.ImageIcon;

import civilizations.Player;
//UNIT AND ITS PARAMETERS
public class Legion extends Unit {

	public Legion() {
		super.unitID = 6;
		super.hitpoints = 40;
		super.attackRating = 17;
		super.productionCost = 75;
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
		super.unitName = "Legion";
		super.techRequired = 13;
	}

	public Legion(Player player) {
		super.unitID = 6;
		super.hitpoints = 40;
		super.attackRating = 17;
		super.productionCost = 75;
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
		super.unitName = "Legion";
		super.techRequired = 13;
		super.owner = player;
		super.unitImageIcon = new ImageIcon(Unit.class.getClassLoader().getResource("units/resources/Legion.png"));
		owner.addUnit(this);
	}
}
