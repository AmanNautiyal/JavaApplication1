
import java.applet.*;
import java.awt.*;
/*
<applet code="BorderLayoutDemo" width=400 height=200>
</applet>
 */
public class LayoutDemo extends Applet {
    public void init() {
        setBackground(Color.orange);
        setLayout(new BorderLayout());
        add(new Button("Top Button"),BorderLayout.NORTH);
        add(new Button("Down Button"),BorderLayout.SOUTH);
        add(new Button("Left Button"),BorderLayout.EAST);
        add(new Button("Right Button"),BorderLayout.WEST);
        add(new TextArea("The textarea is in the Center"),BorderLayout.CENTER);
    }
    public Insets geInsets()
    {
        return new Insets(10,10,10,10);
    }
}
