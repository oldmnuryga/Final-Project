package units;

import javax.swing.ImageIcon;

import civilizations.Player;
//UNIT AND ITS PARAMETERS
public class Musketman extends Unit {

	public Musketman() {
		super.unitID = 8;
		super.hitpoints = 110;
		super.attackRating = 27;
		super.productionCost = 150;
		super.location = null;
		super.ranged = false;
		super.alive = true;
		super.fortified = false;
		super.maxMovement = 2;
		super.maintenance = 4;
		super.isAir = false;
		super.isGround = true;
		super.isNaval = false;
		super.isSelected = false;
		super.unitName = "Musketman";
		super.techRequired = 37;
	}

	public Musketman(Player player) {
		super.unitID = 8;
		super.hitpoints = 110;
		super.attackRating = 27;
		super.productionCost = 150;
		super.location = null;
		super.ranged = false;
		super.alive = true;
		super.fortified = false;
		super.maxMovement = 2;
		super.maintenance = 4;
		super.isAir = false;
		super.isGround = true;
		super.isNaval = false;
		super.isSelected = false;
		super.unitName = "Musketman";
		super.techRequired = 37;
		super.owner = player;
		super.unitImageIcon = new ImageIcon(Unit.class.getClassLoader().getResource("units/resources/Musketman.png"));
		owner.addUnit(this);
	}
}
