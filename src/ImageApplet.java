/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.net.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/*<applet code="ImageApplet" width=1000 height=1000></applet>
*/

public class ImageApplet extends Applet {
    Image im;
      int i=0;
      boolean flag=false;
    AppletContext app;
    public void init() {
        this.setSize(1000,1000);
        /*try {
            app=getAppletContext();
            URL url=new URL(getCodeBase(),"awt-mini-logo.jpg");
            im=app.getImage(url);
                    } catch (MalformedURLException ex) {
            Logger.getLogger(ImageApplet.class.getName()).log(Level.SEVERE, null, ex);
        }*/
        im=getImage(getCodeBase(),"awt-mini-logo.jpg");
    }
    public void paint(Graphics g)
    {
      while(true){
        g.drawImage(im,i,50, this);
          try {
              Thread.sleep(10);
          } catch (InterruptedException ex) {
              Logger.getLogger(ImageApplet.class.getName()).log(Level.SEVERE, null, ex);
          }
        if(!flag)
            i++;
        else
            i--;
        if(i==0)
            flag=false;
        else if(i==600)
            flag=true;
      }
    }
}
