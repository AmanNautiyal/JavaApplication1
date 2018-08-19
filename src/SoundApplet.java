/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.applet.*;
import java.awt.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
/*
<appletcode="SoundApplet" width=500 height=500>
</applet>
*/
public class SoundApplet extends Applet {
    AudioClip ad;
    Label lb;
    AppletContext app;
    @Override
    public void init(){
        app=getAppletContext();
        lb=new Label();
        try {
            URL url=new URL(this.getCodeBase(),"error.wav");
            ad=app.getAudioClip(url);
            add(lb);
        } catch (MalformedURLException ex) {
            Logger.getLogger(SoundApplet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    @Override
    public void start(){
      ad.loop();
      T t1=new T();
      t1.run();
        try {
            t1.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(SoundApplet.class.getName()).log(Level.SEVERE, null, ex);
        }
        ad.stop();
    }
    private class T extends Thread
    {
        public void run()
        {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException ex) {
                Logger.getLogger(SoundApplet.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
