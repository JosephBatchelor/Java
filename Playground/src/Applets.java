import java.util.*;
import java.awt.*;
import javax.swing.*;
public class Applets extends JApplet {
    //applet is using a java program through the internet

    public void paint(Graphics g){
        super.paint(g);
        g.drawString("Wow this actually worked",25,25);
    }
}
