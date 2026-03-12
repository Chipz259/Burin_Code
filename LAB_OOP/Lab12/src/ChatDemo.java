import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.io.*;
public class ChatDemo implements ActionListener, WindowListener {
    private JFrame fr;
    private JTextArea textArea;
    private JTextField textField;
    private JButton submit, reset;
    private JPanel panel, panelBtn;
    public ChatDemo() {
        fr = new JFrame();
        textArea = new JTextArea(20, 45);
        textField = new JTextField(45);
        submit = new JButton("Submit");
        reset = new JButton("Reset");
        panel = new JPanel();
        panelBtn = new JPanel();
        
        textArea.setEditable(false);
        
        fr.setLayout(new BorderLayout());
        
        fr.add(textArea, BorderLayout.CENTER);
        
        panel.setLayout(new BorderLayout());
        panel.add(textField, BorderLayout.NORTH);

        panelBtn.setLayout(new FlowLayout());
        panelBtn.add(submit);
        panelBtn.add(reset);
        panel.add(panelBtn, BorderLayout.SOUTH);
        fr.add(panel, BorderLayout.SOUTH);
        
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(550,500);
        fr.setVisible(true);
        
        submit.addActionListener(this);
        reset.addActionListener(this);
        fr.addWindowListener(this);
        loadDataFromFile();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submit) {
            String message = textField.getText();
            
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern(("yyyy/MM/dd HH:mm:ss"));
            String timeNow = dtf.format(LocalDateTime.now());
            textArea.append(timeNow + " : " + message + "\n");
            textField.setText("");
        } else if (e.getSource() == reset) {
            textArea.setText("");
        }
    }
    public void loadDataFromFile() {
        File file = new File("ChatDemo.dat");
        if (file.exists()) {
            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    textArea.append(line + "\n");
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
    @Override
    public void windowClosing(WindowEvent e) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("ChatDemo.dat"))) {
            writer.write(textArea.getText());
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void windowOpened(WindowEvent e) {
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
