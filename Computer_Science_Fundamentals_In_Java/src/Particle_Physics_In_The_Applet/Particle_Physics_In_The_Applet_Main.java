package Particle_Physics_In_The_Applet;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class Particle_Physics_In_The_Applet_Main extends Applet
{

    private ArrayList<Particle> particles;

    public void paint(Graphics g)
    {
        for(Particle p: particles)
        {
            p.draw(g);
        }
    }

    public void init()
    {
        this.setSize(750, 750);
        createTimers();
        particles = new ArrayList<>();
        
        
        double[] pos = {300, 300};
        double[] vel = {0, -.5};
        double[] acc = {0, 0};
        particles.add(new Particle(10, 1, pos, vel, acc, Color.BLUE));
        
        double[] pos1 = {400,300};
        double[] vel1= {0,.5};
        double[] acc1= {0,0};
        particles.add(new Particle(10, -1, pos1, vel1, acc1, Color.RED));
        
        
        double[] pos2 = {200,100};
        double[] vel2= {0,0};
        double[] acc2= {0,0};
        particles.add(new Particle(10, -1, pos2, vel2, acc2, Color.RED));
        
        double[] pos3 = {400,700};
        double[] vel3= {0,0};
        double[] acc3= {0,0};
        particles.add(new Particle(10, -1, pos3, vel3, acc3, Color.RED));
        
         
    }

    public void updateGame()
    {
        System.out.println();
        for(Particle p: particles)
        {
            ArrayList<Particle> newList = new ArrayList<>(particles);
            newList.remove(p);
            
            p.calcInteractions(newList);
            p.move();
        }

    }

    private void createTimers()
    {

        int fps = 40;
        Timer updateGraphicsTimer = new Timer();
        updateGraphicsTimer.scheduleAtFixedRate(new TimerTask()
        {
            public void run()
            {
                repaint();
            }
        }, 0, 1000 / fps);

        Timer updateGameTimer = new Timer();
        updateGameTimer.scheduleAtFixedRate(new TimerTask()
        {
            public void run()
            {
                updateGame();
            }
        }, 0, 20);
    }
}
