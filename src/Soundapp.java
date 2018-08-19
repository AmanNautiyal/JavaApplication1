/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.applet.*;
import java.net.*;
import java.awt.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Aman Nautiyal
 */
public class Soundapp extends Applet {
    Image ad;
    int i;
    public void init() {
        setSize(600, 600);
        setBackground(Color.red);
        try {
            AppletContext app=getAppletContext();
            URL url=new URL(getCodeBase(),"awt-mini-logo.jpg");
            ad=app.getImage(url);
        } catch (MalformedURLException ex) {
            Logger.getLogger(Soundapp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void start()
    {
        while(i<=300)
        {
            i++;
            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {
                Logger.getLogger(Soundapp.class.getName()).log(Level.SEVERE, null, ex);
            }
            repaint();
        }
    }
    public void update(Graphics g)
    {
        setBackground(Color.red);
        g.drawImage(ad, i, 50, this);
        try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {
                Logger.getLogger(Soundapp.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    public void paint(Graphics g)
    {
        update(g);
    }
    // TODO overwrite start(), stop() and destroy() methods
}
