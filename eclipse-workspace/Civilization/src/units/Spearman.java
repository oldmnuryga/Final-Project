package units;

import javax.swing.ImageIcon;

import civilizations.Player;

//UNIT AND ITS PARAMETERS
public class Spearman extends Unit {

	public Spearman() {
		super.unitID = 13;
		super.hitpoints = 45;
		super.attackRating = 16;
		super.productionCost = 56;
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
		super.unitName = "Spearman";
		super.techRequired = 6;
	}
	public Spearman(Player player) {
		super.unitID = 13;
		super.hitpoints = 45;
		super.owner = player;
		super.attackRating = 16;
		super.productionCost = 56;
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
		super.unitName = "Spearman";
		super.techRequired = 6;
		super.unitImageIcon = new ImageIcon(Unit.class.getClassLoader().getResource("units/resources/Spearman.png"));
		super.owner = player;
		owner.addUnit(this);
	}
}
