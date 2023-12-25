import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame implements ActionListener {
    JButton button;

    MyFrame() {
        button = new JButton();
        button.setBounds(200, 100, 200, 50);
        button.addActionListener(this);
        // button.addActionListener(e -> System.out.println("poo")); // shortcut way using lambda expression
        // it also dosent need to add action listener and actionPerformed
        button.setText("I am a button"); // add text on button
        button.setFocusable(false); // removes border around the text
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setFont(new Font("Comic Sans", Font.BOLD, 25));
        button.setForeground(Color.cyan); // set color to text
        button.setBackground(Color.black); //set background color to button
        button.setBorder(BorderFactory.createEtchedBorder()); //set border to button 

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(600, 500);
        this.setVisible(true);
        this.add(button);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button) {
            System.out.println("poo");
            // button.setEnabled(false); //disable button after clicked once
        }
    }

    public static void main(String[] args) {
        new MyFrame();
    }
}
