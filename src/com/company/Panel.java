package com.company;

import com.company.train.Carriage;
import com.company.train.Locomotive;

import javax.swing.*;
import java.awt.*;

public class Panel extends JFrame {

    public void paint(Graphics g) {
        g.setColor(Color.white);
        g.fillRect(0,0,this.getWidth(), this.getHeight());
        prepareBackground(g);
        drawTrainByParts(g);
    }

    public Panel() {
        prepareWorkspace();
        repaint();
    }

    private void prepareWorkspace() {
        this.setExtendedState(MAXIMIZED_BOTH);
        this.setResizable(false);
        this.setVisible(true);
    }

    private void drawTrainByParts(Graphics g) {
        int startPoint = 500;
        int delta = 130;
        Locomotive loc = new Locomotive(startPoint,getHeight()/2-52);
        loc.drawMe(g);
        Carriage car1 = new Carriage(startPoint-delta,getHeight()/2-52);
        car1.drawMe(g);
        Carriage car2 = new Carriage(startPoint-delta*2,getHeight()/2-52);
        car2.drawMe(g);
        Carriage car3 = new Carriage(startPoint-delta*3,getHeight()/2-52);
        car3.drawMe(g);
        Carriage car4 = new Carriage(startPoint-delta*4,getHeight()/2-52);
        car4.drawMe(g);
    }

    private void prepareBackground(Graphics g) {
        g.setColor(Color.cyan);
        g.fillRect(0,0,getWidth(),getHeight()/2);
        g.setColor(Color.green);
        g.fillRect(0,getHeight()/2,getWidth(),getHeight());
        g.setColor(Color.darkGray);
        g.fillRect(0,getHeight()/2,getWidth(),5);
    }

}
