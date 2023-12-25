import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class CurrencyConverter extends JFrame {
    private JTextField sgdField, usdField, euroField;
    
    public CurrencyConverter() {
        setTitle("Currency Convedrter");
        setSize(250, 130);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel sgdJLabel = new JLabel("Singapore Dollars:");
        JLabel usdJLabel = new JLabel("US Dollars:");
        JLabel euroJLabel = new JLabel("Eusos Dollars:");

        sgdField = new JTextField(10);
        usdField = new JTextField(10);
        euroField = new JTextField(10);

        sgdField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                converFromSGD();
            }
        });

        usdField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                converFromUSD();
            }
        });

        euroField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                converFromEuros();
            }
        });

        JPanel panel = new JPanel();
        panel.add(sgdJLabel);
        panel.add(sgdField);
        panel.add(usdJLabel);
        panel.add(usdField);
        panel.add(euroJLabel);
        panel.add(euroField);

        add(panel);
        setVisible(true);
    }

    private void converFromSGD() {
        double sgd = Double.parseDouble(sgdField.getText());
        double usd = sgd / 1.41;
        usdField.setText(new DecimalFormat("#.##").format(usd));
        double euro = sgd * 0.65;
        euroField.setText(new DecimalFormat("#.##").format(euro));
    }

    private void converFromUSD() {
        double usd = Double.parseDouble(sgdField.getText());
        double sgd = usd * 1.41;
        sgdField.setText(new DecimalFormat("#.##").format(sgd));
        double euro = usd * 0.92;
        euroField.setText(new DecimalFormat("#.##").format(euro));
    }

    private void converFromEuros() {
        double euro = Double.parseDouble(sgdField.getText());
        double usd = euro / 0.92;
        usdField.setText(new DecimalFormat("#.##").format(usd));
        double sgd = euro / 0.65;
        sgdField.setText(new DecimalFormat("#.##").format(sgd));
    }

    public static void main(String[] args) {
        new CurrencyConverter();
    }
}
