package main;

import java.io.IOException;
import java.util.ArrayList;

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
		Tile.generateMap();
		sounds.musicPlay();
		Technology.importTechnologies();
		Building.instantiateBuildingArrayList();
		Wonder.instantiateWonderArrayList();
		Unit.instantiateUnitArrayList();
		CivilizationGame c = new CivilizationGame();
		c.display();
	}
}
