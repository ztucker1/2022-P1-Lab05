import java.applet.Applet;
import java.awt.*;
import java.util.Random;

public class temp extends Applet {
    public void paint(Graphics g){
        Random rand = new Random();


            for (int n = 1; n<=100; n++) {
                int x1 = rand.nextInt(1000);
                int x2 = rand.nextInt(1000);
                int y1 = rand.nextInt(650);
                int y2 = rand.nextInt(650);
                g.drawLine(x1, y1, x2, y2);
            }
    }
}
