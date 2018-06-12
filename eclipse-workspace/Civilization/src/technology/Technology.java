package technology;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Technology {
	private final static int NUMBER_OF_TECHNOLOGIES = 67;
	private int technologyID;
	private String name;
	private boolean achievable;
	private boolean researched = false;
	private int scienceCost;
	// Array List of the indexes of the technologies that are required to make a technology
	// One of these arrays are made per technology
	private ArrayList<Integer> $comesFrom;
	// Array List of the indexes of the technologies that come after said researched technology
	private ArrayList<Integer> $leadsTo;
	// Array List of all the technologies in the game
	private static ArrayList<Technology> $technologies = new ArrayList<Technology>();

	public Technology(int ttechnologyID, String tname, int tscienceCost, ArrayList<Integer> $tleadsTo,
			ArrayList<Integer> $tcomesFrom) {
		technologyID = ttechnologyID;
		name = tname;
		achievable = false;
		researched = false;
		scienceCost = tscienceCost;
		$leadsTo = $tleadsTo;
		$comesFrom = $tcomesFrom;
	}

	public Technology() {
		// Empty constructor for access to methods
	}


	public String toString() {
		return "ID: " + technologyID + "\nName: " + name + "\nAchievable: " + achievable + "\nResearched: "
				+ "\nScience Cost: " + scienceCost + "\nComes From: " + $comesFrom + "\nLeads To: " + $leadsTo;
	}

	/*
	 * public String leadsToNames() { String out = ""; if ($leadsTo.size() > 0) for
	 * (int i : $leadsTo) { out += $technologies.get(i).getName() + ", "; } return
	 * out; }
	 * 
	 * public String comesFromNames() { String out = ""; if ($comesFrom.size() > 0)
	 * for (int i : $comesFrom) { out += $technologies.get(i).getName() + ", "; }
	 * return out; }
	 */

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
	

	// Method to find if a research is available to be researched
	public boolean isAchievable() {
		return achievable;
	}

	public void setAchievable(boolean achievable) {
		this.achievable = achievable;
	}
	// Method to call if you want to see if a research has been researched
	public boolean isResearched() {
		return researched;
	}

	public void setResearched(boolean researched) {
		this.researched = researched;
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

	public  ArrayList<Integer> get$comesFrom() {
		return $comesFrom;
	}

	public  void set$comesFrom(ArrayList<Integer> $comesFrom) {
		this.$comesFrom = $comesFrom;
	}

	public int getNUMBER_OF_TECHNOLOGIES() {
		return NUMBER_OF_TECHNOLOGIES;
	}

	public static ArrayList<Technology> get$technologies() {
		return $technologies;
	}

	public static void set$technologies(ArrayList<Technology> $technologies) {
		Technology.$technologies = $technologies;
	}

	public static int getNumberOfTechnologies() {
		return NUMBER_OF_TECHNOLOGIES;
	}

	
/*	public void setAchievable() {
		if(get$comesFrom().size() == 0) {
			this.achievable = true;
		} else {
			for(int i = 0; i < get$comesFrom().size(); i++) {
				if(get$technologies()[get$comesFrom().get(i)].isResearched() == true) {
					this.achievable = true;
				} else {
					this.achievable = false;
				}
			}
		} 
	}*/

	public static void importTechnologies() {
		try {
			FileReader f = new FileReader("src/technology/tree.txt");
			BufferedReader br = new BufferedReader(f);
			for (int i = 0; i < NUMBER_OF_TECHNOLOGIES; i++) {
				String temp = br.readLine();
				Scanner s = new Scanner(temp).useDelimiter(",");
				ArrayList<Integer> $tleadsTo = new ArrayList<Integer>();
				ArrayList<Integer> $tcomesFrom = new ArrayList<Integer>();
				int tempID = s.nextInt();
				String tempName = s.next();
				int tscienceCost = s.nextInt();
				int comes = s.nextInt();
				for (int j = 0; j < comes; j++)
					$tcomesFrom.add(s.nextInt());
				int leads = s.nextInt();
				for (int j = 0; j < leads; j++)
					$tleadsTo.add(s.nextInt());
				$technologies.add(new Technology(tempID, tempName, tscienceCost, $tleadsTo, $tcomesFrom));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
