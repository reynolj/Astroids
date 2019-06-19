package com.mycompany.a2.commands;

import com.codename1.ui.Command;
import com.codename1.ui.events.ActionEvent;
import com.mycompany.a2.GameWorld;

public class SoundCommand extends Command {
	private GameWorld gw;

	/**
	 * Constructor
	 * @param gw GameWorld object
	 */
	public SoundCommand(GameWorld gw) {
		super("Sound On");
		this.gw = gw;
	}
	
	/**
	 * Override action performed
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		gw.toggleSound();
	}
}
