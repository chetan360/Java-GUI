import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class JButtonDemo extends JFrame implements ActionListener {
    JTextField jtf;
    JButton jb;

    public JButtonDemo() {
        setLayout(new FlowLayout());
        jtf = new JTextField(15);
        add(jtf);
        jb = new JButton("Click me");
        jb.addActionListener(this);
        add(jb);
        setSize(200, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        jtf.setText(ae.getActionCommand());
    }
} 

public class Sample1 {
    public static void main(String[] args) {
        new JButtonDemo(); 
    }
}
