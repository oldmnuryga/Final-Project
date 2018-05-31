package civilizations;

import java.awt.Color;
import java.util.ArrayList;

import leaders.Leader;
import technology.Technology;
import units.Unit;

public class Player {
	protected String name;
	protected double goldReserve;
	protected double goldPerTurn;
	protected double happiness;
	protected Color color;
	protected Leader leader;
	protected double scienceExcess;
	protected double sciencePerTurn;
	protected int numCities;
	protected ArrayList<Unit> $units;
	protected ArrayList<City> $cities;
	protected ArrayList<Technology> $technologies;
	protected ArrayList<Wonder> $wonders;

	public Player() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getGoldReserve() {
		return goldReserve;
	}

	public void setGoldReserve(double goldReserve) {
		this.goldReserve = goldReserve;
	}

	public double getGoldPerTurn() {
		return goldPerTurn;
	}

	public void setGoldPerTurn(double goldPerTurn) {
		this.goldPerTurn = goldPerTurn;
	}

	public double getHappiness() {
		return happiness;
	}

	public void setHappiness(double happiness) {
		this.happiness = happiness;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public double getScienceExcess() {
		return scienceExcess;
	}

	public void setScienceExcess(double scienceExcess) {
		this.scienceExcess = scienceExcess;
	}

	public double getSciencePerTurn() {
		return sciencePerTurn;
	}

	public void setSciencePerTurn(double sciencePerTurn) {
		this.sciencePerTurn = sciencePerTurn;
	}

	public ArrayList<Unit> get$units() {
		return $units;
	}

	public void set$units(ArrayList<Unit> $units) {
		this.$units = $units;
	}

	public ArrayList<City> get$cities() {
		return $cities;
	}

	public void set$cities(ArrayList<City> $cities) {
		this.$cities = $cities;
	}

	public ArrayList<Technology> get$technologies() {
		return $technologies;
	}

	public void set$technologies(ArrayList<Technology> $technologies) {
		this.$technologies = $technologies;
	}

	public ArrayList<Wonder> get$wonders() {
		return $wonders;
	}

	public void set$wonders(ArrayList<Wonder> $wonders) {
		this.$wonders = $wonders;
	}

	public Leader getLeader() {
		return leader;
	}

	public void setLeader(Leader leader) {
		this.leader = leader;
	}

	public int getNumCities() {
		return numCities;
	}

	public void setNumCities(int numCities) {
		this.numCities = numCities;
	}

	public void addTechnology(int techID) {
		$technologies.add(Technology.get$technologies().get(techID));
	}

	public boolean hasTechnology(int techID) {
		for (int i = 0; i < $technologies.size(); i++)
			if ($technologies.get(i).getTechnologyID() == techID)
				return true;
		return false;
	}

}