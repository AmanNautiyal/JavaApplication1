
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class EventDemo extends Applet {
    Button a,b,c,d;
    Label label;
    @Override
    public void init() {
        setLayout(new FlowLayout());
        a=new Button("ButtonA");
        b=new Button("ButtonB");
        c=new Button("ButtonC");
        d=new Button("ButtonD");
        label=new Label("The Text Appears Here");
        a.addActionListener(new customListener());
        b.addActionListener(new customListener());
        c.addActionListener(new customListener());
        d.addActionListener(new customListener());
        add(label);
        add(a);add(b);add(c);add(d);
    }
    private class customListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(a))
            label.setText("Button A clicked");
        else if(e.getSource().equals(b))
            label.setText("Button B clicked");
        else if(e.getSource().equals(c))
            label.setText("Button C clicked");
        else if(e.getSource().equals(d))
            label.setText("Button D clicked");
        }   
    }
}
