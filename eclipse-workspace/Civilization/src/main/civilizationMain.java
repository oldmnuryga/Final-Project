package main;

import technology.Technology;

public class civilizationMain {
	public static void main(String[] args) {
		/*CivilizationGame c = new CivilizationGame();
		c.display();*/
		Technology t = new Technology();
		t.importTechnologies();
		for(Technology i : t.get$technologies()) {
			System.out.println(i);
			System.out.println();
		}
	}
}
