package civilizations;

import java.util.ArrayList;
import civilizations.buildings.SpaceshipPart;
import leaders.Leader;
import technology.Technology;
import units.Unit;

public class Player {
	protected String name;
	protected double goldReserve;
	protected double goldPerTurn;
	protected double happiness;
	protected Leader leader;
	protected double scienceExcess;
	protected double sciencePerTurn;
	protected int numCities;
	protected ArrayList<Unit> $units;
	protected ArrayList<City> $cities;
	protected ArrayList<Technology> $technologies;
	protected ArrayList<Technology> $potentialTechs;
	protected boolean[] $scienceVictory;

	public Player(Leader tLeader) {
		leader = tLeader;
		name = leader.getLeaderName(); // TODO
		goldReserve = 0;
		goldPerTurn = 0;
		happiness = 1.0;
		scienceExcess = 0.0;
		sciencePerTurn = 10.0;
		numCities = 0;
		$units = new ArrayList<Unit>();
		$cities = new ArrayList<City>();
		$technologies = new ArrayList<Technology>();
		$potentialTechs = new ArrayList<Technology>();
		$scienceVictory = new boolean[3];

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

	public boolean[] get$ScienceVictory() {
		return $scienceVictory;
	}

	public void set$ScienceVictory(boolean[] scienceVictory) {
		this.$scienceVictory = scienceVictory;
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

	public void addCity(City tCity) {
		$cities.add(tCity);
		this.setNumCities(this.getNumCities() + 1);
	}

	public void addUnit(Unit tUnit) {
		$units.add(tUnit);
		this.setGoldPerTurn(this.getGoldPerTurn() - tUnit.getMaintenance());
	}

	public void addSpaceshipPart(SpaceshipPart spaceshipPart) {
		set$ScienceVictoryArray(spaceshipPart.getSpaceshipID(), true);
		spaceshipPart.setBuilt(true);

	}

	public void set$ScienceVictoryArray(int index, boolean target) {
		get$ScienceVictory()[index] = target;
	}

	public Unit getOwnedUnitfromID(int unitID) {
		for (int i = 0; i < get$units().size(); i++)
			if (get$units().get(i).getUnitID() == unitID)
				return get$units().get(i);
		return null;
	}

	public void findPotentialTechs() {
		for (int i = 0; i < Technology.get$technologies().size(); i++) {
			Technology technology = Technology.get$technologies().get(i);
			boolean areResearched = true;
			for (int j = 0; j < technology.get$comesFrom().size(); j++)
				if (!(hasTechnology(technology.get$comesFrom().get(j))))
					areResearched = false;
			if (areResearched) {
				$potentialTechs.add(technology);
				System.out.println(technology.toString());
			}

		}
	}
}