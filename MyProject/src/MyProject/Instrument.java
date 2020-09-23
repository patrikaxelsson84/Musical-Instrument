package MyProject;

import java.awt.Container;
import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class Instrument {
	static Clip clip;
	static JButton Back;

	public static void frame2(Container container) {
	}

	void PlaySound(File Sound) {

		try {
			if (clip != null) {
				clip.stop();
			}

			clip = AudioSystem.getClip();
			clip.open(AudioSystem.getAudioInputStream(Sound));
			clip.start();

		}

		catch (Exception e) {

		}
	}

	static void pause() {
		JOptionPane.showMessageDialog(null, "click to stop the music");
		clip.stop();
	}
}
