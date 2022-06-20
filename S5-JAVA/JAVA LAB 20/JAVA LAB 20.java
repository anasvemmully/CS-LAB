// Create an applet for displaying smiling face.

import java.applet.Applet;
import java.awt.*;

public class pg20 extends Applet{
    public void paint(Graphics g){
        g.drawOval(80, 70, 150, 150);
  
        // Ovals for eyes
        // with black color filled
        g.setColor(Color.BLACK);
        g.fillOval(120, 120, 15, 15);
        g.fillOval(170, 120, 15, 15);
  
        // Arc for the smile
        g.drawArc(130, 180, 50, 20, 180, 180);
    }   
}