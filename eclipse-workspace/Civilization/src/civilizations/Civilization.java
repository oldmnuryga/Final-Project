package civilizations;

import java.util.ArrayList;

import technology.Technology;
import units.Unit;

public class Civilization {
	protected String name;
	protected double goldReserve;
	protected double goldPerTurn;
	protected double happiness;
	protected ArrayList <Unit> $units;
	protected ArrayList <City> $cities;
	protected ArrayList <Technology> $technologies;
	protected ArrayList <Wonder> $wonders;
	protected ArrayList <Structure> $structures;
}