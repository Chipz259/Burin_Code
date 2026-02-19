import javax.swing.*;
import java.awt.*;
public class CalculatorSample{
    private JFrame fr;
    private JPanel p;
    private JTextField txt;
    private JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, bc, be, bAdd, bSub, bMul, bDiv;
    
    double num1 = 0, num2 = 0;
    String operator = "";
    
    public CalculatorSample() {
        fr = new JFrame("My Calculator");
        fr.setLayout(new BorderLayout());
        
        txt = new JTextField();
        
        p = new JPanel();
        p.setLayout(new GridLayout(4,4));
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
        b0 = new JButton("0");
        bc = new JButton("c");
        be = new JButton("=");
        bAdd = new JButton("+");
        bSub = new JButton("-");
        bMul = new JButton("x");
        bDiv = new JButton("/");
        
        CalculatorHandler handler = new CalculatorHandler(this);
        JButton[] btns = {
            b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,bc,be,bAdd,bSub,bMul,bDiv
        };
        for (JButton b : btns) {
            b.addActionListener(handler);
        }
        
        p.add(b7);
        p.add(b8);
        p.add(b9);
        p.add(bAdd);
        p.add(b4);
        p.add(b5);
        p.add(b6);
        p.add(bSub);
        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.add(bMul);
        p.add(b0);
        p.add(bc);
        p.add(be);
        p.add(bDiv);
        
        fr.add(txt, BorderLayout.NORTH);
        fr.add(p, BorderLayout.CENTER);
        
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(300,275);
        fr.setVisible(true);
    }
    public String getDisplay() {
        return txt.getText();
    }
    public void setDisplay(String text) {
        txt.setText(text);
    }
    public double getNum1() {
        return num1;
    }
    public void setNum1(double num1) {
        this.num1 = num1;
    }
    public double getNum2() {
        return num2;
    }
    public void setNum2(double num2) {
        this.num2 = num2;
    }
    public String getOperator() {
        return operator;
    }
    public void setOperator(String operator) {
        this.operator = operator;
    }
}   
