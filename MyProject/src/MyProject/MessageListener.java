package MyProject;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.sound.sampled.Clip;
import javax.swing.JTextArea;

public class MessageListener implements ActionListener {
	Instrument im = new Instrument();
	
	File CountryMandolin = new File("CountryMandolin.wav");
	File Countrybass = new File("CountryBass.wav");
	File CountryDrums = new File("CountryDrums.wav");
	File CountryRythmguitar = new File("CountryGuitar.wav");
	File CountryBanjo = new File("CountryBanjo.wav");
	
	File PopBas = new File("PopBas.wav");
	File PopGitarr = new File("PopGitarr.wav");
	File PopPiano = new File("PopPiano.wav");
	File PopTrombon = new File("PopTrombon.wav");
	File PopTrummor = new File("PopTrummor.wav");
	
	File RockBas = new File("RockBas.wav");
	File RockLeadGuitar = new File("RockLeadGuitar.wav");
	File RockOrgel = new File("RockOrgel.wav");
	File RockRythmGuitar = new File("RockRythmGuitar.wav");
	File RockTrummor = new File("RockTrummor.wav");

	File DansbandBas = new File("DansbandBas.wav");
	File DansbandGitarr = new File("DansbandGitarr.wav");
	File DansbandSaxofon = new File("DansbandSaxofon.wav");
	File DansbandSynth = new File("DansbandSynth.wav");
	File DansbandTrummor = new File("DansbandTrummor.wav");

	File FinskFolkTrummor = new File("FinskFolkTrummor.wav");
	File FinskFolkMandolin = new File("FinskFolkMandolin.wav");
	File FinskFolkFiol = new File("FinskFolkFiol.wav");
	File FinskFolkDragspel = new File("FinskFolkDragspel.wav");
	File FinskFolkBas = new File("FinskFolkBas.wav");

	public MessageListener() {

	}

	@Override
	public void actionPerformed(ActionEvent e) { 

		if (e.getActionCommand() == "CountryMandolin") {
			im.PlaySound(CountryMandolin);
		}
		if (e.getActionCommand() == "Countrybass") {
			im.PlaySound(Countrybass);
		}
		if (e.getActionCommand() == "CountryDrums") {
			im.PlaySound(CountryDrums);
		}
		if (e.getActionCommand() == "Countryguitar") {
			im.PlaySound(CountryRythmguitar);
		}
		if (e.getActionCommand() == "CountryBanjo") {
			im.PlaySound(CountryBanjo);
		}
////////
		if (e.getActionCommand() == "PopBas") {
			im.PlaySound(PopBas);
		}
		if (e.getActionCommand() == "PopGitarr") {
			im.PlaySound(PopGitarr);
		}
		if (e.getActionCommand() == "PopPiano") {
			im.PlaySound(PopPiano);
		}
		if (e.getActionCommand() == "PopTrombon") {
			im.PlaySound(PopTrombon);
		}
		if (e.getActionCommand() == "PopTrummor") {
			im.PlaySound(PopTrummor);
		}
////////
		if (e.getActionCommand() == "RockBas") {
			im.PlaySound(RockBas);
		}
		if (e.getActionCommand() == "RockLeadGuitar") {
			im.PlaySound(RockLeadGuitar);
		}
		if (e.getActionCommand() == "RockOrgel") {
			im.PlaySound(RockOrgel);
		}
		if (e.getActionCommand() == "RockRythmGuitar") {
			im.PlaySound(RockRythmGuitar);
		}
		if (e.getActionCommand() == "RockTrummor") {
			im.PlaySound(RockTrummor);
		}
////////		
		if (e.getActionCommand() == "DansbandBas") {
			im.PlaySound(DansbandBas);
		}
		if (e.getActionCommand() == "DansbandGitarr") {
			im.PlaySound(DansbandGitarr);
		}
		if (e.getActionCommand() == "DansbandSaxofon") {
			im.PlaySound(DansbandSaxofon);
		}
		if (e.getActionCommand() == "DansbandSynth") {
			im.PlaySound(DansbandSynth);
		}
		if (e.getActionCommand() == "DansbandTrummor") {
			im.PlaySound(DansbandTrummor);
		}
///////			
		if (e.getActionCommand() == "FinskFolkMandolin") {
			im.PlaySound(FinskFolkMandolin);
		}
		if (e.getActionCommand() == "FinskFolkBas") {
			im.PlaySound(FinskFolkBas);
		}
		if (e.getActionCommand() == "FinskFolkTrummor") {
			im.PlaySound(FinskFolkTrummor);
		}
		if (e.getActionCommand() == "FinskFolkFiol") {
			im.PlaySound(FinskFolkFiol);
		}
		if (e.getActionCommand() == "FinskFolkDragspel") {
			im.PlaySound(FinskFolkDragspel);
////////			
		}
		if (e.getActionCommand() == "Stop") {
			Instrument.clip.stop();
		}
	}
}