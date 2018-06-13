package units;

import javax.swing.ImageIcon;

import civilizations.Player;
//UNIT AND ITS PARAMETERS
public class Cavalry extends Unit {

	public Cavalry() {
		super.unitID = 4;
		super.hitpoints = 45;
		super.attackRating = 25;
		super.productionCost = 225;
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
		super.unitName = "Cavalry";
		super.techRequired = 1;
	}

	public Cavalry(Player player) {
		super.unitID = 4;
		super.hitpoints = 45;
		super.attackRating = 25;
		super.productionCost = 225;
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
		super.unitName = "Cavalry";
		super.techRequired = 1;
		super.owner = player;
		super.unitImageIcon = new ImageIcon(Unit.class.getClassLoader().getResource("units/resources/Cavalry.png"));
		owner.addUnit(this);
	}
}