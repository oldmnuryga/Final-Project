package main;

import java.io.IOException;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

import map.Tile;
import sound.sounds;
import technology.Technology;

public class civilizationMain {
	public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
		Tile.generateMap();
		sounds.musicPlay();
		CivilizationGame c = new CivilizationGame();
		c.display();
		Technology t = new Technology();
		t.importTechnologies();
		for(Technology i : t.get$technologies()) {
			System.out.println(i);
			System.out.println();
		}
	}
}
