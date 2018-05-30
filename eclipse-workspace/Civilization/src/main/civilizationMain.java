package main;

import java.io.IOException;
import java.util.ArrayList;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

import map.Tile;
import sound.sounds;
import technology.Technology;

public class civilizationMain {
	private static ArrayList<Technology> $allTechnologies = Technology.importTechnologies();
	public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
		Tile.generateMap();
		sounds.musicPlay();
		CivilizationGame c = new CivilizationGame();
		c.display();
		for(Technology i : $allTechnologies) {
			System.out.println(i);
			System.out.println();
		}
	}
	public static ArrayList<Technology> get$allTechnologies() {
		return $allTechnologies;
	}

}
