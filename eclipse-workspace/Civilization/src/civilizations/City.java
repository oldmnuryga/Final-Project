package civilizations;

import java.util.ArrayList;

import map.Tile;

public class City {
	protected String name;
	
	protected int size;
	protected Player owner;
	protected boolean capital;
	protected boolean coastal;
	protected double goldRate;
	protected double productionRate;
	protected double productionExcess;
	protected double foodRate;
	protected double foodBox;
	protected double foodCap;
	protected double scienceRate;
	protected int citizens;
	protected ArrayList <Tile> $cityTiles;
	protected ArrayList <Structure> $structures;
	  
	protected City() { 
		
	}
}