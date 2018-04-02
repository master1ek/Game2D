package com.lukasz.d;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

import com.lukasz.input.KeyInput;
import com.lukasz.object.Enemy;
import com.lukasz.object.Player;

public class GamePanel extends JPanel implements ActionListener{
	
	private static final long serialVersionUID = 1L;
	
	private String background = "/img/18.png";
	 
	Timer gamelooptimer;
	//Postacie
	Player p;
	Enemy e;

	public GamePanel(){
		setFocusable(true);
		
		gamelooptimer = new Timer(10,this);
		gamelooptimer.start();
		
		p = new Player(100, 100);
		e = new Enemy(200,200);
		
		addKeyListener(new KeyInput(p));
	}
	//Rysowanie grafiki
	//w tym padku: tło, gracz, przeciwnik
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.drawImage(getBackgroundImage(),0,0,null);
		p.draw(g2d);
		e.draw(g2d);
	}
	
	
	//BACKGROUND IMAGE 
	public Image getBackgroundImage(){
		ImageIcon i = new ImageIcon(getClass().getResource(background));
		return i.getImage();
	}
	//Aktualizacja zachowania 
	public void actionPerformed(ActionEvent ee) {
		p.update();
		repaint();
		e.update();
	}

}