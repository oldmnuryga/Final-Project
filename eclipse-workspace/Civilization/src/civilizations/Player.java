package civilizations;

import java.awt.Color;
import java.util.ArrayList;

import technology.Technology;
import units.Unit;

public class Player {
	protected String name;
	protected double goldReserve;
	protected double goldPerTurn;
	protected double happiness;
	protected Color color;
	protected double scienceExcess;
	protected ArrayList <Unit> $units;
	protected ArrayList <City> $cities; 
	protected ArrayList <Technology> $technologies;
	protected ArrayList <Wonder> $wonders;
	protected ArrayList <Structure> $structures;  
}