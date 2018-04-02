package com.lukasz.object;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;

import com.lukasz.d.GlobalPosition;
import com.lukasz.d.MainClass;

public class Player extends GlobalPosition{

	private String playerimg = "/img/17.png";
	
	int valX = 0;
	int valY = 0;
	
	
	public Player(int x, int y) {
		super(x, y);
	}
	
	public void update() {
		x+=valX;
		y+=valY;
		
		//Kolizje outside
		if(x<0){
			x=0;
		}
		if(y<0){
			y=0;
		}
		if(x>MainClass.WIDTH-32){
			x=MainClass.WIDTH-32;
		}
		if(y>MainClass.HIGHT-32){
			y=MainClass.HIGHT-32;
		}
	}
	//Po wciśnięciu przysicku
	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();
		
		if(key==KeyEvent.VK_RIGHT){
			valX = 5;
		}else if(key==KeyEvent.VK_LEFT){
			valX = -5;
		}else if(key==KeyEvent.VK_DOWN){
			valY = 5;
		}else if(key==KeyEvent.VK_UP){
			valY = -5;
		}
	}
	//Po puszczeniu przycisku
	public void keyReleased(KeyEvent e) {
		int key = e.getKeyCode();
		
		if(key==KeyEvent.VK_RIGHT){
			valX = 0;
		}else if(key==KeyEvent.VK_LEFT){
			valX = 0;
		}else if(key==KeyEvent.VK_DOWN){
			valY = 0;
		}else if(key==KeyEvent.VK_UP){
			valY = 0;
		}
		
	}
	
	public void draw(Graphics2D g2d) {
		g2d.drawImage(getPlayerImage(), x, y, null);
	}
	
	public Image getPlayerImage(){
		ImageIcon i = new ImageIcon(getClass().getResource(playerimg));
		return i.getImage();
	}
	
}

