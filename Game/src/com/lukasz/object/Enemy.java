package com.lukasz.object;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;

import com.lukasz.d.GamePanel;
import com.lukasz.d.GlobalPosition;
import com.lukasz.d.MainClass;

public class Enemy extends GlobalPosition {
	public Enemy(int x, int y) {
		super(x, y);
	}

	private String enemyImage = "/img/19.png";
	
	int speed = 5;
	
	public void update(){
		x+=speed;
		if(x>MainClass.WIDTH-32){
			speed = -5;
		}
		if(x<0){
			speed = 5;
		}
	}
	
	public void draw(Graphics g2d){
		g2d.drawImage(getEnemyImage(), x, y, null);
	}
	
	public Image getEnemyImage(){
		ImageIcon i = new ImageIcon(getClass().getResource(enemyImage));
		return i.getImage();
	}

	
	

}
