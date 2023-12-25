import java.awt.Frame;
import java.awt.Color;

/*
declaration of color class
public class Color extends Object implements Paint, Serializable {
    -------
    -------
} 
creates color by using given RGBA values
RGBA stands for RED, GREEN, BLUE, ALPHA(opacity) 

o or 0.0 for transparent
255 or 1.0 for opaque
 */

/*
constants
Color.black;
Color.BLACK;
Color.blue;
Color.BLUE;
Color.red;
Color.RED;
Color.GRAY;
Color.gray;
Color.orange;
Color.ORANGE;
Color.yellow;
Color.pink;
*/

/* 
    brighter();
    darker();
    getTransparency();
    setBackground();
*/

public class AwtColor extends Frame {
    public AwtColor() {
        this.setTitle("Red Window");
        this.setVisible(true);
        this.setSize(500, 500);
        // Color c = Color.blue;

        Color c = new Color(155, 216, 25, 255);

        this.setBackground(c);

    }
    

    public static void main(String args[]) {
        AwtColor fm = new AwtColor();
    }    
}
