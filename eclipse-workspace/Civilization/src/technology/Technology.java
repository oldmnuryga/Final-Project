package technology;

import units.Unit;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import map.Tile;

public class Technology {
	private String name;
	private Unit unit;
	private Tile improvement;
	private boolean isAchievable;
	private int sciCost;
	private ArrayList<Integer> comesFrom;
	private ArrayList<Integer> leadsTo;
	private ArrayList<Technology> tree;
	
	public Technology(String n, int scienceCost, ArrayList<Integer> leads, ArrayList<Integer> comes) {
		name = n;
		sciCost = scienceCost;
		leadsTo = leads;
		comesFrom = comes;
	}
	public String getName() {
		return name;
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
	public void readTxt(){
		try {
			String path = "src/technology/tree.txt";
			FileReader f = new FileReader(path);
			BufferedReader br = new BufferedReader(f);
			String temp = br.readLine();
			Scanner s = new Scanner(temp).useDelimiter(",");
			int index = s.nextInt();
			String tech = s.next();
			int precursor = s.nextInt();
			if(precursor != 0) 
				for(int i = 0;i < precursor;i++) {
					int preIndex = s.nextInt();
					comesFrom.add(preIndex);
				}
			int product = s.nextInt();
			if(product != 0) 
				for(int j = 0;j < product;j++) {
					int leadsToIndex = s.nextInt();
					leadsTo.add(leadsToIndex);
				}
			Technology egg = new Technology(temp,tech,leadsTo,comesFrom,);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
