package units;

import civilizations.Player;

public class Archer extends Unit {

	public Archer() {
		super.unitID = 1;
		super.hitpoints = 30;
		super.attackRating = 11;
		super.productionCost = 40;
		super.location = null;
		super.ranged = true;
		super.alive = true;
		super.fortified = false;
		super.maxMovement = 2;
		super.maintenance = 1;
		super.isAir = false;
		super.isGround = true;
		super.isNaval = false;
		super.isSelected = false;
		super.unitName = "Archer";
	}

	public Archer(Player player) {
		super.unitID = 1;
		super.hitpoints = 30;
		super.attackRating = 11;
		super.productionCost = 40;
		super.location = null;
		super.ranged = true;
		super.alive = true;
		super.fortified = false;
		super.maxMovement = 2;
		super.maintenance = 1;
		super.isAir = false;
		super.isGround = true;
		super.isNaval = false;
		super.isSelected = false;
		super.unitName = "Archer";
		super.owner = player;
		player.addUnit(this);
	}
}
