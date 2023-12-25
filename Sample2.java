import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class JCDemo extends JFrame implements ItemListener {
    JTextField jtf;
    JCheckBox jcb1, jcb2;
    
    public JCDemo() {
        setLayout(new FlowLayout());
        jcb1 = new JCheckBox("Swing Demons");
        jcb1.addItemListener(this);
        add(jcb1);
        jcb2 = new JCheckBox("Java Demons");
        jcb2.addItemListener(this);
        add(jcb2);
        jtf = new JTextField(15);
        add(jtf);
        setSize(200, 200);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void itemStateChanged(ItemEvent ae) {
        String text = "";
        if(jcb1.isSelected()) {
            text = text + jcb1.getText() + " ";
        }
        if(jcb2.isSelected()) {
            text = text + jcb2.getText();
        }
        jtf.setText(text);
    }
}

public class Sample2 {
    public static void main(String[] args) {
        new JCDemo();
    }
}
