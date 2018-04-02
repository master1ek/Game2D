package com.lukasz.d;

import javax.swing.JFrame;

public class MainClass {
	
	public static final int WIDTH = 640;
	public static final int HIGHT = 480;

	public static void main(String args[]) {
		
		
		JFrame frame = new JFrame();
		frame.pack();
		frame.setSize(WIDTH, HIGHT);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(new GamePanel());
		frame.setVisible(true);	
		
	}
	
	

}