package leaders;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.ImageIcon;

public abstract class Leader {
	protected String civName;
	protected String leaderName;
	protected int leaderID;
	protected String abbrevLeaderName;
	protected ArrayList<String> cityNames;
	protected Color color;
	protected ImageIcon grassTile,forestTile,forest2Tile,mountainTile,sandTile,waterTile,farmImprovement,cityOnGreenImprovement,cityOnSandImprovement;

	public String getCivName() {
		return civName;
	}

	public void setCivName(String civName) {
		this.civName = civName;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public ImageIcon getGrassTile() {
		return grassTile;
	}

	public void setGrassTile(ImageIcon grassTile) {
		this.grassTile = grassTile;
	}

	public ImageIcon getForestTile() {
		return forestTile;
	}

	public void setForestTile(ImageIcon forestTile) {
		this.forestTile = forestTile;
	}

	public ImageIcon getForest2Tile() {
		return forest2Tile;
	}

	public void setForest2Tile(ImageIcon forest2Tile) {
		this.forest2Tile = forest2Tile;
	}

	public ImageIcon getMountainTile() {
		return mountainTile;
	}

	public void setMountainTile(ImageIcon mountainTile) {
		this.mountainTile = mountainTile;
	}

	public ImageIcon getSandTile() {
		return sandTile;
	}

	public void setSandTile(ImageIcon sandTile) {
		this.sandTile = sandTile;
	}

	public ImageIcon getWaterTile() {
		return waterTile;
	}

	public void setWaterTile(ImageIcon waterTile) {
		this.waterTile = waterTile;
	}

	public ImageIcon getFarmImprovement() {
		return farmImprovement;
	}

	public void setFarmImprovement(ImageIcon farmImprovement) {
		this.farmImprovement = farmImprovement;
	}

	public String getLeaderName() {
		return leaderName;
	}

	public void setLeaderName(String leaderName) {
		this.leaderName = leaderName;
	}

	public String getAbbrevLeaderName() {
		return abbrevLeaderName;
	}

	public void setAbbrevLeaderName(String abbrevLeaderName) {
		this.abbrevLeaderName = abbrevLeaderName;
	}

	public ArrayList<String> getCityNames() {
		return cityNames;
	}

	public void setCityNames(ArrayList<String> cityNames) {
		this.cityNames = cityNames;
	}

	public int getLeaderID() {
		return leaderID;
	}

	public void setLeaderID(int leaderID) {
		this.leaderID = leaderID;
	}

	public ImageIcon getCityOnGreenImprovement() {
		return cityOnGreenImprovement;
	}

	public void setCityOnGreenImprovement(ImageIcon cityOnGreenImprovement) {
		this.cityOnGreenImprovement = cityOnGreenImprovement;
	}

	public ImageIcon getCityOnSandImprovement() {
		return cityOnSandImprovement;
	}

	public void setCityOnSandImprovement(ImageIcon cityOnSandImprovement) {
		this.cityOnSandImprovement = cityOnSandImprovement;
	}

	public ImageIcon getTileIconFromID(int ID) {
		Random rand = new Random();
		if(ID == 0)
			return waterTile;
		else if(ID == 1)
			return grassTile;
		else if(ID == 2)
			return sandTile;
		else if(ID == 3)
			return mountainTile;
		else //if(rand.nextInt(100) + 1 > 50)
			return forestTile;
		//else
		//	return forest2Tile;
	}
}
