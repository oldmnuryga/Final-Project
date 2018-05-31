package units;

public class Settler extends Unit {

	public Settler() {
		super.hitpoints = 15;
		super.attackRating = 0;
		super.productionCost = 106;
		super.location  = null;
		super.ranged = false;
		super.alive = true;
		super.fortified = false;
		super.maxMovement = 2;
		super.maintenance = 1;
		super.isAir = false;		
		super.isGround = true;
		super.isNaval = false;
		super.isSelected = false;
		super.unitName = "Settler";
	}
	
	public void findCity() {
		
	}
}
