package Particle_Physics_In_The_Applet_2;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class Particle {

	protected int rad, charge;
	protected double [] pos, vel, acc;
	protected Color c;
	
	public Particle(int rad, int charge, double[] pos, double[] vel,
			double[] acc, Color c) {
		super();
		this.rad = rad;
		this.charge = charge;
		this.pos = pos;
		this.vel = vel;
		this.acc = acc;
		this.c = c;
	}
	public void move(){
		pos[0] += vel[0];
		pos[1] += vel[1];
		vel[0] += acc[0];
		vel[1] += acc[1];
	}
	
	public void draw(Graphics g){
		g.setColor(c);
		g.fillOval((int)(pos[0]-rad),(int)(pos[1]-rad),2*rad,2*rad);
	}
	public void calcInteractions(ArrayList<Particle> others){
		
		for(Particle p: others){
			
		}
		
	}
	
	
}