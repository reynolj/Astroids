package com.mycompany.a2.commands;

import com.codename1.ui.Command;
import com.codename1.ui.events.ActionEvent;
import com.mycompany.a2.GameWorld;

public class NewCommand extends Command {
	private GameWorld gw;

	/**
	 * Constructor
	 * @param gw GameWorld object
	 */
	public NewCommand(GameWorld gw) {
		super("New");
		this.gw = gw;
	}
	
	/**
	 * Override action performed
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		gw._new();
	}
}
