package technology;

import units.Unit;
import map.Tile;

public abstract class Technology {
	protected String name;
	protected Unit unit;
	protected Tile improvement;
	protected boolean isAchievable;
	protected double rate;
	// gives you the alphabet at the beginning
	
	public String getName() {
		return name;
	}
	public Technology() {
		//y = 30*log(12x)
	}
	public Unit getTechUnit() {
		return unit;
	}
	public Tile getTechImprovement() {
		return improvement;
	}
	public void setName(String str) {
		this.name = str;
	}
	public void setTechUnit(Unit un) {
		this.unit = un;
	}
	public void setTechImprovement(Tile imp) {
		this.improvement = imp;
	}
	public boolean canAchieve() {
		return isAchievable;
	}
	public void setAchievable(boolean a) {
		this.isAchievable = a;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double r) {
		this.rate = r;
	}
	

}
