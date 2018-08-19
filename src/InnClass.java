/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class InnClass extends Applet {
    Label label;
    @Override
    public void init() {
        setLayout(new FlowLayout());
        Button btn=new Button("Button");
        label=new Label("The event that is triggered is shown here");
        add(label);
       add(btn);
         addMouseMotionListener(new CustomMouseMotionListener());
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("Button was pressed");
            }
        });//Anonymous inner class   
    }
    private class CustomMouseMotionListener implements MouseMotionListener
    {
        //Inner Class
        @Override
        public void mouseDragged(MouseEvent e) {
          label.setText("Mouse dragged to position: x-"+e.getX()+" y-"+e.getY());
        }
        @Override
        public void mouseMoved(MouseEvent e) {
          label.setText("Mouse moved to position: x-"+e.getX()+" y-"+e.getY());
        }
    }
}
