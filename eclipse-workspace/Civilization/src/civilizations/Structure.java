package civilizations;

public abstract class Structure {
	protected String name;
	protected String description;
	protected int productionRequirement;
	protected int techRequired;
	protected City location;
	protected boolean isBuilt = false;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getProductionRequirement() {
		return productionRequirement;
	}

	public void setProductionRequirement(int productionRequirement) {
		this.productionRequirement = productionRequirement;
	}

	public int getTechRequired() {
		return techRequired;
	}

	public void setTechRequired(int techRequired) {
		this.techRequired = techRequired;
	}

	public City getLocation() {
		return location;
	}

	public void setLocation(City location) {
		this.location = location;
	}

	public boolean isBuilt() {
		return isBuilt;
	}

	public void setBuilt(boolean isBuilt) {
		this.isBuilt = isBuilt;
	}

	public abstract boolean canBeBuilt();

}