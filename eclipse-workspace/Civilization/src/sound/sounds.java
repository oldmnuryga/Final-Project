 package sound;

import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class sounds {
	protected static File musicfile = new File("src/sound/resources/civMusic.wav");
	protected static File unitdeathfile = new File("src/sound/resources/gruntLongFinal.mp3");
	protected static File clickfile = new File("src/sound/resources/click.wav");

	//Plays on click of mouse
	public static void clickPlay() throws UnsupportedAudioFileException, IOException, LineUnavailableException {	
		AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(clickfile);
		Clip clip = AudioSystem.getClip();
		clip.open(audioInputStream);
		clip.start();
	}
	//Plays on death of unit
	public void unitDeathPlay() throws UnsupportedAudioFileException, IOException, LineUnavailableException {	
		AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(unitdeathfile);
		Clip clip = AudioSystem.getClip();
		clip.open(audioInputStream);
		clip.start();
	}
	//Plays at start and loops for as long as the program runs
	public static void musicPlay() throws UnsupportedAudioFileException, IOException, LineUnavailableException {	
		AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(musicfile);
		Clip clip = AudioSystem.getClip();
		clip.open(audioInputStream);
		clip.start();
		clip.loop(Clip.LOOP_CONTINUOUSLY);
	}
}