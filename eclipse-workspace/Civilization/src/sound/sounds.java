 package sound;

import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

class sounds {
	protected File musicfile = new File("");
	protected File clickfile = new File("src/sound.resources/click.wav");

	public void clickPlay() throws UnsupportedAudioFileException, IOException, LineUnavailableException {	
		AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(clickfile);
		Clip clip = AudioSystem.getClip();
		clip.open(audioInputStream);
		clip.start();
	}
	public void musicPlay() throws UnsupportedAudioFileException, IOException, LineUnavailableException {	
		AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(musicfile);
		Clip clip = AudioSystem.getClip();
		clip.open(audioInputStream);
		clip.start();
		clip.loop(Clip.LOOP_CONTINUOUSLY);
	}
}
