package com.lukasz.input;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import com.lukasz.object.Player;

public class KeyInput implements KeyListener{

	Player p;
	
	public KeyInput(Player p){
		this.p = p;
	}
	
	
	public void keyPressed(KeyEvent e) {
		p.keyPressed(e);
	}

	public void keyReleased(KeyEvent e) {
		p.keyReleased(e);
	}

	public void keyTyped(KeyEvent arg0) {
		
	}

}
