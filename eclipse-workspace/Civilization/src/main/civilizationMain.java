package main;

import java.io.IOException;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

import civilizations.Building;
import civilizations.Wonder;
import map.Tile;
import sound.sounds;
import technology.Technology;
import units.Unit;

public class civilizationMain {
	public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
		Tile.generateMap(); // makes the map
		sounds.musicPlay(); // starts to play the background music
		Technology.importTechnologies(); // makes the total technologies arraylist
		Building.instantiateBuildingArrayList(); // makes the total buildings arraylist
		Wonder.instantiateWonderArrayList(); // makes the total wonder arraylist
		Unit.instantiateUnitArrayList(); // makes the total unit arraylist
		CivilizationGame c = new CivilizationGame();
		c.display(); // displays the game
	}
}
