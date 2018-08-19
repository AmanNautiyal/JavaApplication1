
import java.applet.*;
import java.awt.event.*;
import java.awt.*;
/*
<applet code="AppletFrame" width=300 height=50>
</applet>
 */
class FrameX extends Frame {
    FrameX(String title) {
        setTitle(title);
        addWindowListener(new MyWindowAdapter(this));
    }
    @Override
    public void paint(Graphics g) {
        g.drawString("Inside Frame Window", 10, 70);
    }
}
class MyWindowAdapter extends WindowAdapter {
    FrameX frame;
    MyWindowAdapter(FrameX ob) {
        frame = ob;
    }
    @Override
    public void windowClosing(WindowEvent e) {
        frame.setVisible(false);
    }
}
public class FrameHandling extends Applet {
    Frame f;
    public void init() {
        f = new FrameX("Frame Window");
        f.setSize(250, 250);
        f.setLocation(500, 500);
        f.setVisible(true);
    }
    @Override
    public void stop() {
        f.setVisible(false);
    }
    @Override
    public void start() {
        f.setVisible(true);
    }
    @Override
    public void paint(Graphics g) {
        g.drawString("Applet Window", 10, 10);
    }
}
