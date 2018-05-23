package units;

public class Scout extends Unit {

	public Scout() {
		super.hitpoints = 20;
		super.attackRating = 5;
		super.productionCost = 25;
		super.location  = null;
		super.ranged = false;
		super.alive = true;
		super.fortified = false;
		super.maxMovement = 3;
		//IGNORES TERRAIN IN CIV 5 (SO I MADE IT 3 MOVEMENT INSTEAD)
	}
}
