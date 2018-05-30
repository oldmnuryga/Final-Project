package units;

public class AircraftCarrier extends Unit {

	public AircraftCarrier() {
		super.hitpoints = 140;
		super.attackRating = 60;
		super.productionCost = 375;
		super.location  = null;
		super.ranged = false;
		super.alive = true;
		super.fortified = false;
		super.maxMovement = 5;
		super.maintenance = 4;
		super.isAir = false;
		super.isGround = false;
		super.isNaval = true;
	}
}