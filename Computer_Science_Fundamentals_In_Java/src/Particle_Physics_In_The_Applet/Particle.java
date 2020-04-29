package Particle_Physics_In_The_Applet;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class Particle
{

    protected int rad, charge;
    protected double[] pos, vel, acc;
    protected Color c;

    public Particle(int rad, int charge, double[] pos, double[] vel,
            double[] acc, Color c)
    {
        super();
        this.rad = rad;
        this.charge = charge;
        this.pos = pos;
        this.vel = vel;
        this.acc = acc;
        this.c = c;
    }

    public void move()
    {
        pos[0] += vel[0];
        pos[1] += vel[1];
        vel[0] += acc[0];
        vel[1] += acc[1];
    }

    public void draw(Graphics g)
    {
        g.setColor(c);
        g.fillOval((int) (pos[0] - rad), (int) (pos[1] - rad), 2 * rad, 2 * rad);
    }

    public void calcInteractions(ArrayList<Particle> others)
    {

        for(Particle p: others)
        {
            double[] otherPos = p.pos;
            int otherCharge = p.charge;
            double force = 1/calcDistanceSquared(p);
            double angle = calcAngle(p);
            
            
            
            if(pos[0] - p.pos[0] > 0)
            {
                if(charge*otherCharge == 1)
                {
                    acc[0] += force*Math.abs(Math.cos(angle));
                }
                else
                {
                    acc[0] -= force*Math.abs(Math.cos(angle));
                }
            }
            else
            {
                if(charge*otherCharge == 1)
                {
                    acc[0] -= force*Math.abs(Math.cos(angle));
                }
                else
                {
                    acc[0] += force*Math.abs(Math.cos(angle));
                    
                }
            }
            
            
            
            if(pos[1] - p.pos[1] > 0)
            {
                if(charge*otherCharge == 1)
                {
                    acc[1] += force*Math.abs(Math.sin(angle));
                }
                else
                {
                    acc[1] -= force*Math.abs(Math.sin(angle));
                }
            }
            else
            {
                if(charge*otherCharge == 1)
                {
                    acc[1] -= force*Math.abs(Math.sin(angle));
                }
                else
                {
                    acc[1] += force*Math.abs(Math.sin(angle));
                }
            }
            
            System.out.println(acc[0]);

        }
       
    }
    private double calcAngle(Particle other)
    {
        double xDistance = pos[0] - other.pos[0];
        double yDistance = pos[1] - other.pos[1];
        return Math.atan(yDistance/xDistance);
    }
    private double calcDistanceSquared(Particle other)
    {
         double hold =(Math.pow(pos[0]-other.pos[0], 2))+(Math.pow(pos[1]-other.pos[1], 2));
         if (hold < 0) {
             pos[-1] = 0;
         }
         return hold;
    }
}
