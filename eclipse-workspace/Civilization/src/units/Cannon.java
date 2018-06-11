package units;

import civilizations.Player;
//UNIT AND ITS PARAMETERS
public class Cannon extends Unit {

	public Cannon() {
		super.unitID = 5;
		super.hitpoints = 70;
		super.attackRating = 14;
		super.productionCost = 185;
		super.location = null;
		super.ranged = false;
		super.alive = true;
		super.fortified = false;
		super.maxMovement = 2;
		super.maintenance = 2;
		super.isAir = false;
		super.isGround = true;
		super.isNaval = false;
		super.isSelected = false;
		super.unitName = "Cannon";
		super.techRequired = 43;
	}

	public Cannon(Player player) {
		super.unitID = 5;
		super.hitpoints = 70;
		super.attackRating = 14;
		super.productionCost = 185;
		super.location = null;
		super.ranged = false;
		super.alive = true;
		super.fortified = false;
		super.maxMovement = 2;
		super.maintenance = 2;
		super.isAir = false;
		super.isGround = true;
		super.isNaval = false;
		super.isSelected = false;
		super.unitName = "Cannon";
		super.techRequired = 43;
		super.owner = player;
		owner.addUnit(this);
	}
}
