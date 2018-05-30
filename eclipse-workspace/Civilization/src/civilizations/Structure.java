package civilizations;

public abstract class Structure {
	protected String name;
	protected String description;
	protected double productionRequirement;
	protected int techRequired;
	protected City location;
	protected boolean isBuilt;
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
	public void setProductionRequirement(double productionRequirement) {
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
	

}