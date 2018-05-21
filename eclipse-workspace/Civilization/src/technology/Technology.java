package technology;

import units.Unit;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import map.Tile;

public class Technology {
	private final int NUMBER_OF_TECHNOLOGIES = 67;
	private int technologyID;
	private String name;
	private Unit unit;
	private Tile improvement;
	private boolean isAchievable;
	private int scienceCost;
	private ArrayList<Integer> $leadsTo;
	private ArrayList<Integer> $comesFrom;
	private ArrayList<Technology> $technologies = new ArrayList<Technology>();

	public Technology(int ttechnologyID, String tname, int tscienceCost, ArrayList<Integer> $tleadsTo,
			ArrayList<Integer> $tcomesFrom) {
		technologyID = ttechnologyID;
		name = tname;
		scienceCost = tscienceCost;
		$leadsTo = $tleadsTo;
		$comesFrom = $tcomesFrom;
	}

	public Technology() {
		
	}
	
	public int getTechnologyID() {
		return technologyID;
	}

	public void setTechnologyID(int technologyID) {
		this.technologyID = technologyID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Unit getUnit() {
		return unit;
	}

	public void setUnit(Unit unit) {
		this.unit = unit;
	}

	public Tile getImprovement() {
		return improvement;
	}

	public void setImprovement(Tile improvement) {
		this.improvement = improvement;
	}

	public boolean isAchievable() {
		return isAchievable;
	}

	public void setAchievable(boolean isAchievable) {
		this.isAchievable = isAchievable;
	}

	public int getScienceCost() {
		return scienceCost;
	}

	public void setScienceCost(int scienceCost) {
		this.scienceCost = scienceCost;
	}

	public ArrayList<Integer> get$leadsTo() {
		return $leadsTo;
	}

	public void set$leadsTo(ArrayList<Integer> $leadsTo) {
		this.$leadsTo = $leadsTo;
	}

	public ArrayList<Integer> get$comesFrom() {
		return $comesFrom;
	}

	public void set$comesFrom(ArrayList<Integer> $comesFrom) {
		this.$comesFrom = $comesFrom;
	}

	public ArrayList<Technology> get$technologies() {
		return $technologies;
	}

	public void set$technologies(ArrayList<Technology> $technologies) {
		this.$technologies = $technologies;
	}

	public int getNUMBER_OF_TECHNOLOGIES() {
		return NUMBER_OF_TECHNOLOGIES;
	}

	public void importTechnologies() {
		try {
			FileReader f = new FileReader("src/technology/tree.txt");
			BufferedReader br = new BufferedReader(f);
			for (int i = 0; i < NUMBER_OF_TECHNOLOGIES; i++) {
				String temp = br.readLine();
				System.out.println(temp);
				Scanner s = new Scanner(temp).useDelimiter(",");
				ArrayList<Integer> $tleadsTo = new ArrayList<Integer>();
				ArrayList<Integer> $tcomesFrom = new ArrayList<Integer>();
				int tempID = s.nextInt();
				String tempName = s.next();
				int tscienceCost = s.nextInt();
				int leads = s.nextInt();
				for (int j = 0; j < leads; j++) {
					$tleadsTo.add(s.nextInt());
				}
				int comes = s.nextInt();
				for (int j = 0; j < comes; j++) {
					$tcomesFrom.add(s.nextInt());
				}
				$technologies.add(new Technology(tempID, tempName, tscienceCost, $tleadsTo, $tcomesFrom));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
