import javax.swing.*;
import java.awt.*;
public class CalculatorTwoGUI {
    private JFrame fr;
    private JPanel panel;
    private JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16;
    private JTextField txt1;
    public CalculatorTwoGUI() {
        fr = new JFrame("My Calulator");
        panel = new JPanel();
        txt1 = new JTextField();
        b1 = new JButton("7");
        b2 = new JButton("8");
        b3 = new JButton("9");
        b4 = new JButton("+");
        b5 = new JButton("4");
        b6 = new JButton("5");
        b7 = new JButton("6");
        b8 = new JButton("-");
        b9 = new JButton("1");
        b10 = new JButton("2");
        b11 = new JButton("3");
        b12 = new JButton("x");
        b13 = new JButton("0");
        b14 = new JButton("c");
        b15 = new JButton("=");
        b16 = new JButton("/");
        
        panel.add(b1);
        panel.add(b2);
        panel.add(b3);
        panel.add(b4);
        panel.add(b5);
        panel.add(b6);
        panel.add(b7);
        panel.add(b8);
        panel.add(b9);
        panel.add(b10);
        panel.add(b11);
        panel.add(b12);
        panel.add(b13);
        panel.add(b14);
        panel.add(b15);
        panel.add(b16);
        fr.setLayout(new BorderLayout());
        fr.add(txt1, BorderLayout.NORTH);
        panel.setLayout(new GridLayout(4,4));
        fr.add(panel);
        
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(250, 250);
        fr.setVisible(true);
    }
}
