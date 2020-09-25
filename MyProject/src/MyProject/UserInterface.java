package MyProject;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class UserInterface implements Runnable {

	private JFrame frame;
	Instrument im = new Instrument();

	public UserInterface() {
	}

	@Override
	public void run() {
		frame = new JFrame("Composer Jonas Eira, Project made by Patrik Axelsson");
		frame.setPreferredSize(new Dimension(505, 800)); // storlek på rutan

		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

		createComponents(frame.getContentPane());

		frame.getContentPane().setBackground(Color.ORANGE);

		frame.pack(); // packar upp panelen.
		frame.setVisible(true); // visar att panelen syns
	}

	private void createComponents(Container container) {
//Country//
		JButton CountryMandolin = new JButton(new ImageIcon("mandolin.png")); // ny knapp Mandolin
		CountryMandolin.setBounds(157, 2, 150, 150);// 157 pixlar från vänster 2 från överkant. storlek 150x150
		CountryMandolin.setActionCommand("CountryMandolin"); // knappen med värdet stringen.
		MessageListener CountryMandolinOn = new MessageListener(); //lägger till countrymandolin till messagelistener
		CountryMandolin.addActionListener(CountryMandolinOn); //
		container.add(CountryMandolin); //
		CountryMandolin.setVisible(false); //

		JButton Countrybass = new JButton(new ImageIcon("Bass.png"));
		Countrybass.setBounds(157, 154, 150, 150);
		Countrybass.setActionCommand("Countrybass");
		MessageListener CountrybassOn = new MessageListener();
		Countrybass.addActionListener(CountrybassOn);
		container.add(Countrybass);
		Countrybass.setVisible(false);

		JButton CountryDrums = new JButton(new ImageIcon("Drums.png"));
		CountryDrums.setBounds(157, 306, 150, 150);
		CountryDrums.setActionCommand("CountryDrums");
		MessageListener CountryDrumsOn = new MessageListener();
		CountryDrums.addActionListener(CountryDrumsOn);
		container.add(CountryDrums);
		CountryDrums.setVisible(false);

		JButton Countryguitar = new JButton(new ImageIcon("Guitar.png"));
		Countryguitar.setBounds(157, 458, 150, 150);
		Countryguitar.setActionCommand("Countryguitar");
		MessageListener CountryguitarOn = new MessageListener();
		Countryguitar.addActionListener(CountryguitarOn);
		container.add(Countryguitar);
		Countryguitar.setVisible(false);
		
		JButton CountryBanjo = new JButton(new ImageIcon("Banjo.png"));
		CountryBanjo.setBounds(157, 610, 150, 150);
		CountryBanjo.setActionCommand("CountryBanjo");
		MessageListener CountryBanjoOn = new MessageListener();
		CountryBanjo.addActionListener(CountryBanjoOn);
		container.add(CountryBanjo);
		CountryBanjo.setVisible(false);
//Pop///		
		JButton PopBas = new JButton(new ImageIcon("ElBas.png"));
		PopBas.setBounds(157, 2, 150, 150);
		PopBas.setActionCommand("PopBas");
		MessageListener PopBasOn = new MessageListener();
		PopBas.addActionListener(PopBasOn);
		container.add(PopBas);
		PopBas.setVisible(false);

		JButton PopGitarr = new JButton(new ImageIcon("ElGitarr.png"));
		PopGitarr.setBounds(157, 154, 150, 150);
		PopGitarr.setActionCommand("PopGitarr");
		MessageListener PopGitarrOn = new MessageListener();
		PopGitarr.addActionListener(PopGitarrOn);
		container.add(PopGitarr);
		PopGitarr.setVisible(false);

		JButton PopPiano = new JButton(new ImageIcon("Piano.png"));
		PopPiano.setBounds(157, 306, 150, 150);
		PopPiano.setActionCommand("PopPiano");
		MessageListener PopPianoOn = new MessageListener();
		PopPiano.addActionListener(PopPianoOn);
		container.add(PopPiano);
		PopPiano.setVisible(false);

		JButton PopTrombon = new JButton(new ImageIcon("Trombon.png"));
		PopTrombon.setBounds(157, 458, 150, 150);
		PopTrombon.setActionCommand("PopTrombon");
		MessageListener PopTrombonOn = new MessageListener();
		PopTrombon.addActionListener(PopTrombonOn);
		container.add(PopTrombon);
		PopTrombon.setVisible(false);

		JButton PopTrummor = new JButton(new ImageIcon("Drums.png"));
		PopTrummor.setBounds(157, 610, 150, 150);
		PopTrummor.setActionCommand("PopTrummor");
		MessageListener PopTrummorOn = new MessageListener();
		PopTrummor.addActionListener(PopTrummorOn);
		container.add(PopTrummor);
		PopTrummor.setVisible(false);
//Rock//
		JButton RockBas = new JButton(new ImageIcon("ElBas.png"));
		RockBas.setBounds(157, 2, 150, 150);
		RockBas.setActionCommand("RockBas");
		MessageListener RockBasOn = new MessageListener();
		RockBas.addActionListener(RockBasOn);
		container.add(RockBas);
		RockBas.setVisible(false);

		JButton RockLeadGuitar = new JButton(new ImageIcon("ElGitarr.png"));
		RockLeadGuitar.setBounds(157, 154, 150, 150);
		RockLeadGuitar.setActionCommand("RockLeadGuitar");
		MessageListener RockLeadGuitarOn = new MessageListener();
		RockLeadGuitar.addActionListener(RockLeadGuitarOn);
		container.add(RockLeadGuitar);
		RockLeadGuitar.setVisible(false);

		JButton RockOrgel = new JButton(new ImageIcon("Orgel.png"));
		RockOrgel.setBounds(157, 306, 150, 150);
		RockOrgel.setActionCommand("RockOrgel");
		MessageListener RockOrgelOn = new MessageListener();
		RockOrgel.addActionListener(RockOrgelOn);
		container.add(RockOrgel);
		RockOrgel.setVisible(false);

		JButton RockRythmGuitar = new JButton(new ImageIcon("ElGitarr.png"));
		RockRythmGuitar.setBounds(157, 458, 150, 150);
		RockRythmGuitar.setActionCommand("RockRythmGuitar");
		MessageListener RockRythmGuitarOn = new MessageListener();
		RockRythmGuitar.addActionListener(RockRythmGuitarOn);
		container.add(RockRythmGuitar);
		RockRythmGuitar.setVisible(false);

		JButton RockTrummor = new JButton(new ImageIcon("Drums.png"));
		RockTrummor.setBounds(157, 610, 150, 150);
		RockTrummor.setActionCommand("RockTrummor");
		MessageListener RockTrummorOn = new MessageListener();
		RockTrummor.addActionListener(RockTrummorOn);
		container.add(RockTrummor);
		RockTrummor.setVisible(false);
//Dans//		
		JButton DansbandBas = new JButton(new ImageIcon("Bass.png"));
		DansbandBas.setBounds(157, 2, 150, 150);
		DansbandBas.setActionCommand("DansbandBas");
		MessageListener DansbandBasOn = new MessageListener();
		DansbandBas.addActionListener(DansbandBasOn);
		container.add(DansbandBas);
		DansbandBas.setVisible(false);

		JButton DansbandGitarr = new JButton(new ImageIcon("Guitar.png"));
		DansbandGitarr.setBounds(157, 154, 150, 150);
		DansbandGitarr.setActionCommand("FinskFolkBas");
		MessageListener DansbandGitarrOn = new MessageListener();
		DansbandGitarr.addActionListener(DansbandGitarrOn);
		container.add(DansbandGitarr);
		DansbandGitarr.setVisible(false);

		JButton DansbandSaxofon = new JButton(new ImageIcon("Saxofon.png"));
		DansbandSaxofon.setBounds(157, 306, 150, 150);
		DansbandSaxofon.setActionCommand("DansbandSaxofon");
		MessageListener DansbandSaxofonOn = new MessageListener();
		DansbandSaxofon.addActionListener(DansbandSaxofonOn);
		container.add(DansbandSaxofon);
		DansbandSaxofon.setVisible(false);

		JButton DansbandSynth = new JButton(new ImageIcon("Synth.png"));
		DansbandSynth.setBounds(157, 458, 150, 150);
		DansbandSynth.setActionCommand("DansbandSynth");
		MessageListener DansbandSynthOn = new MessageListener();
		DansbandSynth.addActionListener(DansbandSynthOn);
		container.add(DansbandSynth);
		DansbandSynth.setVisible(false);

		JButton DansbandTrummor = new JButton(new ImageIcon("Drums.png"));
		DansbandTrummor.setBounds(157, 610, 150, 150);
		DansbandTrummor.setActionCommand("DansbandTrummor");
		MessageListener DansbandTrummorOn = new MessageListener();
		DansbandTrummor.addActionListener(DansbandTrummorOn);
		container.add(DansbandTrummor);
		DansbandTrummor.setVisible(false);
//Finsk//
		JButton FinskFolkMandolin = new JButton(new ImageIcon("mandolin.png"));
		FinskFolkMandolin.setBounds(157, 2, 150, 150);
		FinskFolkMandolin.setActionCommand("FinskFolkMandolin");
		MessageListener FinskFolkMandolinOn = new MessageListener();
		FinskFolkMandolin.addActionListener(FinskFolkMandolinOn);
		container.add(FinskFolkMandolin);
		FinskFolkMandolin.setVisible(false);

		JButton FinskFolkBas = new JButton(new ImageIcon("Bass.png"));
		FinskFolkBas.setBounds(157, 154, 150, 150);
		FinskFolkBas.setActionCommand("FinskFolkBas");
		MessageListener FinskFolkBasOn = new MessageListener();
		FinskFolkBas.addActionListener(FinskFolkBasOn);
		container.add(FinskFolkBas);
		FinskFolkBas.setVisible(false);

		JButton FinskFolkTrummor = new JButton(new ImageIcon("Drums.png"));
		FinskFolkTrummor.setBounds(157, 306, 150, 150);
		FinskFolkTrummor.setActionCommand("FinskFolkTrummor");
		MessageListener FinskFolkTrummorOn = new MessageListener();
		FinskFolkTrummor.addActionListener(FinskFolkTrummorOn);
		container.add(FinskFolkTrummor);
		FinskFolkTrummor.setVisible(false);

		JButton FinskFolkFiol = new JButton(new ImageIcon("Fiol.png"));
		FinskFolkFiol.setBounds(157, 458, 150, 150);
		FinskFolkFiol.setActionCommand("FinskFolkFiol");
		MessageListener FinskFolkFiolOn = new MessageListener();
		FinskFolkFiol.addActionListener(FinskFolkFiolOn);
		container.add(FinskFolkFiol);
		FinskFolkFiol.setVisible(false);

		JButton FinskFolkDragspel = new JButton(new ImageIcon("Dragspel.png"));
		FinskFolkDragspel.setBounds(157, 610, 150, 150);
		FinskFolkDragspel.setActionCommand("FinskFolkDragspel");
		MessageListener FinskFolkDragspelOn = new MessageListener();
		FinskFolkDragspel.addActionListener(FinskFolkDragspelOn);
		container.add(FinskFolkDragspel);
		FinskFolkDragspel.setVisible(false);
//Knapp//
		JButton Back = new JButton(new ImageIcon("Back.png"));
		Back.setBounds(348, 2, 100, 100);
		container.add(Back);
		Back.setVisible(false);
		
//		JButton Manual = new JButton(new ImageIcon("background.png"));
//		Manual.setBounds(308, 105, 90, 90);
//		container.add(Manual);
//		Manual.setVisible(true);
//		File f = new File("MusicalInstrument.docx");
		
		JButton Stop = new JButton(new ImageIcon("Stop.png"));
		Stop.setBounds(399, 105, 90, 90);
		container.add(Stop);
		Stop.setActionCommand("Stop");
		MessageListener PauseOn = new MessageListener();
		Stop.addActionListener(PauseOn);
		Stop.setVisible(false);
//Main//
		JButton Country = new JButton(new ImageIcon("Country.png"));
		Country.setBounds(5, 2, 150, 150);
		container.add(Country);

		JButton Pop = new JButton(new ImageIcon("Pop.png"));
		Pop.setBounds(5, 154, 150, 150);
		container.add(Pop);

		JButton Rock = new JButton(new ImageIcon("Rock.png"));
		Rock.setBounds(5, 306, 150, 150);
		container.add(Rock);

		JButton Dansband = new JButton(new ImageIcon("Dansband.png"));
		Dansband.setBounds(5, 458, 150, 150);
		container.add(Dansband);

		JButton FinskFolkmusik = new JButton(new ImageIcon("FinskFolkdrakt.png"));
		FinskFolkmusik.setBounds(5, 610, 150, 150);
		container.add(FinskFolkmusik);
////////
		Back.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Instrument.frame2(container);
/////Genre/////				
				Country.setVisible(true);
				Pop.setVisible(true);
				Rock.setVisible(true);
				Dansband.setVisible(true);
				FinskFolkmusik.setVisible(true);
///Instrument///
				CountryMandolin.setVisible(false);
				Countrybass.setVisible(false);
				CountryDrums.setVisible(false);
				Countryguitar.setVisible(false);
				CountryBanjo.setVisible(false);
				
				PopBas.setVisible(false);
				PopGitarr.setVisible(false);
				PopPiano.setVisible(false);
				PopTrombon.setVisible(false);
				PopTrummor.setVisible(false);
				
				RockBas.setVisible(false);
				RockLeadGuitar.setVisible(false);
				RockOrgel.setVisible(false);
				RockRythmGuitar.setVisible(false);
				RockTrummor.setVisible(false);

				DansbandBas.setVisible(false);
				DansbandGitarr.setVisible(false);
				DansbandSaxofon.setVisible(false);
				DansbandSynth.setVisible(false);
				DansbandTrummor.setVisible(false);

				FinskFolkTrummor.setVisible(false);
				FinskFolkFiol.setVisible(false);
				FinskFolkMandolin.setVisible(false);
				FinskFolkBas.setVisible(false);
				FinskFolkDragspel.setVisible(false);

				Back.setVisible(false);
				Stop.setVisible(false);
				Instrument.clip.stop();
			}
		});
////////
		Country.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Instrument.frame2(container);
/////Genre/////				
				Country.setVisible(true);
				Pop.setVisible(false);
				Rock.setVisible(false);
				Dansband.setVisible(false);
				FinskFolkmusik.setVisible(false);
///Instrument///
				CountryMandolin.setVisible(true);
				Countrybass.setVisible(true);
				CountryDrums.setVisible(true);
				Countryguitar.setVisible(true);
				CountryBanjo.setVisible(true);
				
				Back.setVisible(true);
				Stop.setVisible(true);

			}
		});
	////////
			Pop.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Instrument.frame2(container);
	/////Genre/////				
					Country.setVisible(false);
					Pop.setVisible(true);
					Rock.setVisible(false);
					Dansband.setVisible(false);
					FinskFolkmusik.setVisible(false);
	///Instrument///
					PopBas.setVisible(true);
					PopGitarr.setVisible(true);
					PopPiano.setVisible(true);
					PopTrombon.setVisible(true);
					PopTrummor.setVisible(true);
					
					Back.setVisible(true);
					Stop.setVisible(true);

				}
			});
////////
		Rock.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Instrument.frame2(container);
/////Genre/////				
				Country.setVisible(false);
				Pop.setVisible(false);
				Rock.setVisible(true);
				Dansband.setVisible(false);
				FinskFolkmusik.setVisible(false);
///Instrument///
				RockBas.setVisible(true);
				RockLeadGuitar.setVisible(true);
				RockOrgel.setVisible(true);
				RockRythmGuitar.setVisible(true);
				RockTrummor.setVisible(true);
				
				Back.setVisible(true);
				Stop.setVisible(true);
			}
		});
////////

		Dansband.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Instrument.frame2(container);
				Country.setVisible(false);
				Pop.setVisible(false);
				Rock.setVisible(false);
				Dansband.setVisible(true);
				FinskFolkmusik.setVisible(false);

				DansbandBas.setVisible(true);
				DansbandGitarr.setVisible(true);
				DansbandSaxofon.setVisible(true);
				DansbandSynth.setVisible(true);
				DansbandTrummor.setVisible(true);
				
				Back.setVisible(true);
				Stop.setVisible(true);
			}
		});
////////		
		FinskFolkmusik.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Instrument.frame2(container);
				Country.setVisible(false);
				Pop.setVisible(false);
				Rock.setVisible(false);
				Dansband.setVisible(false);
				FinskFolkmusik.setVisible(true);

				FinskFolkMandolin.setVisible(true);
				FinskFolkBas.setVisible(true);
				FinskFolkTrummor.setVisible(true);
				FinskFolkFiol.setVisible(true);
				FinskFolkDragspel.setVisible(true);

				Back.setVisible(true);
				Stop.setVisible(true);
			}
		});

		container.setLayout(null);
		container.setVisible(true);

	}

	public JFrame getFrame() {
		return frame;
	}
}