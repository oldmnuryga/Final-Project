package civilizations;

public abstract class Building extends Structure {
	protected String name; 
	protected String description;
	protected double productionRequirement;
	protected int goldMaintenance;
	protected int techRequired;
	protected City location;
}
