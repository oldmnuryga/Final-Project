package units;

import javax.swing.ImageIcon;

import civilizations.Player;
//UNIT AND ITS PARAMETERS
public class Artillery extends Unit {

	public Artillery() {
		super.unitID = 1;
		super.hitpoints = 95;
		super.attackRating = 30;
		super.productionCost = 250;
		super.location = null;
		super.ranged = true;
		super.alive = true;
		super.fortified = false;
		super.maxMovement = 2;
		super.maintenance = 3;
		super.isAir = false;
		super.isGround = true;
		super.isNaval = false;
		super.isSelected = false;
		super.unitName = "Artillery";
		super.techRequired = 52;
	}

	public Artillery(Player player) {
		super.unitID = 1;
		super.hitpoints = 95;
		super.attackRating = 30;
		super.productionCost = 250;
		super.location = null;
		super.ranged = true;
		super.alive = true;
		super.fortified = false;
		super.maxMovement = 2;
		super.maintenance = 3;
		super.isAir = false;
		super.isGround = true;
		super.isNaval = false;
		super.isSelected = false;
		super.unitName = "Artillery";
		super.techRequired = 52;
		super.owner = player;
		super.unitImageIcon = new ImageIcon(Unit.class.getClassLoader().getResource("units/resources/artillery.png"));
		owner.addUnit(this);
	}
}
