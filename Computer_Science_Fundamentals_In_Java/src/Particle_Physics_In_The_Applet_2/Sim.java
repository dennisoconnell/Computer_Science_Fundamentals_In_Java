package Particle_Physics_In_The_Applet_2;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class Sim extends Applet {

	private ArrayList<Particle> particles;

	public void paint(Graphics g) {
		for(Particle p: particles){
			p.draw(g);
		}
	}

	public void init() {
		this.setSize(750, 750);
		createTimers();
		particles = new ArrayList<>();
		double [] pos = {375, 375};
		double [] vel = {0,0};
		double [] acc = {.01,.01};
		particles.add(new Particle(10, 1, pos, vel, acc, Color.BLUE));
	}
	
	public void updateGame(){
		System.out.println();
		for(Particle p: particles){
			p.move();
			}
			
	}
	public void createTimers(){
		
		int fps=40;
		Timer updateGraphicsTimer = new Timer();
		updateGraphicsTimer.scheduleAtFixedRate(new TimerTask() 
		{
			public void run()
			{ repaint(); }
		}, 0, 1000 / fps);
		
		Timer updateGameTimer = new Timer();
		updateGameTimer.scheduleAtFixedRate(new TimerTask() 
		{
			public void run()
			{ updateGame(); }
		}, 0, 20);
	}
}


