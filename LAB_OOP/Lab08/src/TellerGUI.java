import javax.swing.*;
import java.awt.*;

public class TellerGUI {
    private JFrame fr;
    private JPanel panel,panel2,panel3;
    private JButton b1,b2,b3;
    private JTextField txt1,txt2;
    private JLabel label1, label2;
    public TellerGUI() {
        fr = new JFrame();
        panel = new JPanel();
        panel2 = new JPanel();
        panel3 = new JPanel();
        b1 = new JButton("Deposit");
        b2 = new JButton("Withdraw");
        b3 = new JButton("Exit");
        txt1 = new JTextField("6000");
        txt2 = new JTextField();
        label1 = new JLabel("Balance");
        label2 = new JLabel("Amount");
        
        panel.add(label1);
        panel.add(txt1);
        panel.setLayout(new GridLayout(1,2));
        panel2.add(label2);
        panel2.add(txt2);
        panel2.setLayout(new GridLayout(1,2));
        panel3.add(b1);
        panel3.add(b2);
        panel3.add(b3);
        panel3.setLayout(new FlowLayout());
        fr.add(panel);
        fr.add(panel2);
        fr.add(panel3);
        fr.setLayout(new GridLayout(3,1));
        
        txt1.setEditable(false);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.pack();
        fr.setVisible(true);
    }
}
