import javax.swing.*;
import java.awt.*;
import java.awt.Font;
public class CalculatorOneGUI {
    public CalculatorOneGUI() {
        Font normalFont = new Font("CordiaUPC", Font.PLAIN, 18);
        JFrame frame = new JFrame("เครื่องคิดเลข");
        JPanel panel = new JPanel();
        JPanel panel2 = new JPanel();
        JTextField txt1 = new JTextField();
        JTextField txt2 = new JTextField();
        JTextField txt3 = new JTextField();
        JButton btnAdd = new JButton("บวก");
        btnAdd.setFont(normalFont);
        JButton btnSub = new JButton("ลบ");
        btnSub.setFont(normalFont);
        JButton btnMul = new JButton("คูณ");
        btnMul.setFont(normalFont);
        JButton btnDiv = new JButton("หาร");
        btnDiv.setFont(normalFont);
        frame.setLayout(new GridLayout(4,1));

        frame.add(txt1);
        frame.add(txt2);
        panel.add(btnAdd);
        panel.add(btnSub);
        panel.add(btnMul);
        panel.add(btnDiv);
        frame.add(panel);
        frame.add(txt3);
        panel.setLayout(new FlowLayout());
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
