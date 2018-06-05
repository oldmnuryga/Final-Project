package units;

public class GatlingGun extends Unit {

	public GatlingGun() {
		super.hitpoints = 60;
		super.attackRating = 34;
		super.productionCost = 225;
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
		super.unitName = "Gatling Gun";
	}
}
