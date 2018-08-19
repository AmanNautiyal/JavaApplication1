/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*<applet code="BorderLayoutDemo" width=400 height=200>
</applet>
 */
public class DrawDemo extends Applet {
    public void paint(Graphics g) {
        Color c1 = new Color(23, 255, 190);
        Color c2 = new Color(255, 55, 90);
        Color c3 = new Color(0, 255, 0);
        g.setColor(c1);
        g.drawLine(0, 0, 100, 100);
        g.drawLine(0, 100, 100, 0);
        g.setColor(c2);
        g.draw3DRect(90, 90, 50, 50, true);
        g.setColor(c3);
        g.fillRect(200, 100, 100, 100);
    }
}
