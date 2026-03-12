import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
public class StudentView implements ActionListener, WindowListener {
    private JFrame fr;
    private JLabel LId, LName, LMoney;
    private JTextField TFId, TFName, TFMoney;
    private JButton deposit, withdraw;
    private JPanel panel, panel2, panel3, panel4;
    public StudentView() {
        fr = new JFrame();
        LId = new JLabel("ID:");
        LName = new JLabel("Name:");
        LMoney = new JLabel("Money:");
        deposit = new JButton("Deposit");
        withdraw = new JButton("Withdraw");
        TFId = new JTextField();
        TFName = new JTextField();
        TFMoney = new JTextField("0");
        panel = new JPanel();
        panel2 = new JPanel();
        panel3 = new JPanel();
        panel4 = new JPanel();
        
        TFMoney.setEditable(false);
        
        panel.setLayout(new GridLayout(1,2));
        panel.add(LId);
        panel.add(TFId);
        
        panel2.setLayout(new GridLayout(1,2));
        panel2.add(LName);
        panel2.add(TFName);
        
        panel3.setLayout(new GridLayout(1,2));
        panel3.add(LMoney);
        panel3.add(TFMoney);
        
        panel4.add(deposit);
        panel4.add(withdraw);
        
        fr.addWindowListener(this);
        deposit.addActionListener(this);
        withdraw.addActionListener(this);
        
        fr.setLayout(new GridLayout(4,1));
        fr.add(panel);
        fr.add(panel2);
        fr.add(panel3);
        fr.add(panel4);
        
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.pack();
        
        File file = new File("StudentM.dat");
        if (file.exists()) {
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
                Student std = (Student) ois.readObject();
                TFId.setText(String.valueOf(std.getID()));
                TFName.setText(std.getName());
                TFMoney.setText(String.valueOf(std.getMoney()));
            } catch (IOException | ClassNotFoundException ex) {
                ex.printStackTrace();
            }
        }
    }
    public void actionPerformed(ActionEvent e) {
        int m = Integer.parseInt(TFMoney.getText());
        if (e.getSource() == deposit) {
            m += 100;
        }
        else if (e.getSource() == withdraw) {
            m -= 100;
        }
        TFMoney.setText(String.valueOf(m));
    }

    @Override
    public void windowOpened(WindowEvent e) {
    }

    @Override
    public void windowClosing(WindowEvent e) {
        Student std = new Student();
        String idText = TFId.getText();
        if (idText.isEmpty()) {
            std.setID(0);
        } else {
            std.setID(Integer.parseInt(idText));
        }
        
        std.setName(TFName.getText());
        std.setMoney(Integer.parseInt(TFMoney.getText()));

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("StudentM.dat"))) {
            oos.writeObject(std);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void windowClosed(WindowEvent e) {
    }

    @Override
    public void windowIconified(WindowEvent e) {
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
    }

    @Override
    public void windowActivated(WindowEvent e) {
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
    }
    
}
