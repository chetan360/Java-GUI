import java.awt.*;
import javax.swing.JFrame;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ConcentricCircle {
    public static void main(String args[]) {
        JFrame frame = new JFrame("Concentric Circle.");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // X close btn

        frame.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                int x = e.getX(); //x co-ordi where mouse pointer clicked
                int y = e.getY(); //y co-ordi where mouse pointer clicked
                int r = 150;

                Graphics g = frame.getGraphics();
                Color[] c = new Color[]{Color.red, Color.blue, Color.green};

                int  i = 0;
                //creating outer circle first
                while(r >= 120) {
                    g.setColor(c[i++]); //setting color from color arr
                    g.fillOval(x - r, y - r, 2 * r, 2 * r); // creating filled circle  
                    r -= 30; // decreasing radius
                }
                //creating last circle
                g.setColor(c[2]);
                g.fillOval(x - r, y - r, 2 * r, 2 * r);
                
            }
        });
        frame.setVisible(true); // set frame to visible
    }
}
