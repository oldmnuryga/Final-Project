package units;

import civilizations.Player;
//UNIT AND ITS PARAMETERS
public class Knight extends Unit {

	public Knight() {
		super.unitID = 11;
		super.hitpoints = 55;
		super.attackRating = 20;
		super.productionCost = 120;
		super.location = null;
		super.ranged = false;
		super.alive = true;
		super.fortified = false;
		super.maxMovement = 4;
		super.maintenance = 2;
		super.isAir = false;
		super.isGround = true;
		super.isNaval = false;
		super.isSelected = false;
		super.unitName = "Knight";
		super.techRequired = 7;
	}

	public Knight(Player player) {
		super.unitID = 11;
		super.hitpoints = 55;
		super.attackRating = 20;
		super.productionCost = 120;
		super.location = null;
		super.ranged = false;
		super.alive = true;
		super.fortified = false;
		super.maxMovement = 4;
		super.maintenance = 2;
		super.isAir = false;
		super.isGround = true;
		super.isNaval = false;
		super.isSelected = false;
		super.unitName = "Knight";
		super.techRequired = 7;
		super.owner = player;
		owner.addUnit(this);
	}
}
