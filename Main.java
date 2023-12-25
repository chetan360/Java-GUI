import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

class Main {
    public static void main(String[] args) {
        // JFrame frame = new JFrame(); // create a frame
        // frame.setTitle("This is title of jframe"); // sets title of frame
        // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application
        // frame.setResizable(false); // prevents from resize
        // frame.setSize(420, 420); // x, y dimention
        // frame.setVisible(true); // set visible

        // ImageIcon image = new ImageIcon("satoru-gojo.jpg"); // create an icon
        // frame.setIconImage(image.getImage()); // change icon of frame
        // frame.getContentPane().setBackground(new Color(123, 50, 250)); // change background color

        // ImageIcon image = new ImageIcon("java-logo.png");
        // Border border = BorderFactory.createLineBorder(Color.green, 3);


        // JLable
        // JLabel label = new JLabel(); // create a label
        // label.setText("How you doing?"); // set text of label
        // label.setIcon(image); // set image of label
        // label.setHorizontalTextPosition(label.CENTER); // set text center of image
        // // label.setVerticalTextPosition(label.TOP); // set text top of image
        // label.setForeground(new Color(0x00FF00)); // sets color
        // label.setFont(new Font("MV Boli", Font.PLAIN, 20)); // sets font
        // label.setIconTextGap(-25); // set gap of text to image
        // label.setBackground(Color.black); // set background color
        // label.setOpaque(true); // display background color
        // label.setBorder(border); //sets border
        // label.setVerticalAlignment(JLabel.CENTER); // set vertical pos of image + text within it
        // label.setHorizontalAlignment(JLabel.CENTER); // set horizontel pos of image + text within it
        // // label.setBounds(100, 100, 250, 250); //set x, y pos within frame as wes as dimensions

        // JFrame frame = new JFrame();
        // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // frame.setSize(500, 500);
        // frame.setVisible(true);
        // frame.add(label);
        // frame.pack();// add all components and and then use pack()


        //JPanel
        // ImageIcon icon = new ImageIcon("thumbsup.png");


        // JLabel label = new JLabel();
        // label.setText("Hii");
        // label.setIcon(icon);
        // label.setBounds(0, 0, 75, 75);

        // JPanel redPanel = new JPanel(); // creates a panel
        // redPanel.setBackground(Color.red); // sets background color of panel
        // redPanel.setBounds(0, 0, 250, 250); //set size and pos of panel

        // JPanel bluePanel = new JPanel();
        // bluePanel.setBackground(Color.blue);
        // bluePanel.setBounds(250, 0, 250, 250);

        // JPanel greenPanel = new JPanel();
        // greenPanel.setBackground(Color.green);
        // greenPanel.setBounds(0, 250, 500, 250);
        // greenPanel.setLayout(null);

        // JFrame frame = new JFrame();
        // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // frame.setLayout(null);
        // frame.setSize(750, 750);
        // frame.setVisible(true);
        // redPanel.add(label); // adds label to redpanel
        // frame.add(redPanel); 
        // frame.add(bluePanel); 
        // frame.add(greenPanel);

        new MyFrame();
    }
}