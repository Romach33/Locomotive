package com.company.train;

import java.awt.*;

public class Locomotive {
    int x;
    int y;

    public Locomotive(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void drawMe(Graphics g) {
        g.setColor(Color.black);
        g.fillOval(x+50, y-10,50,20);
        g.fillOval(x+60, y-10,50,20);
        g.setColor(Color.gray);
        g.fillRect(x,y,125,50);
        g.fillOval(x+100,y, 50,50);
        g.setColor(Color.darkGray);
        g.fillRect(x+30,y+10,25,25);
        g.fillRect(x+70,y+10,25,25);
    }
}
